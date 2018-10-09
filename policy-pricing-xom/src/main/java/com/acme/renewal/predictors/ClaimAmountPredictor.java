package com.acme.renewal.predictors;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBException;
import javax.xml.transform.sax.SAXSource;

import org.dmg.pmml.FieldName;
import org.dmg.pmml.PMML;
import org.jpmml.evaluator.Evaluator;
import org.jpmml.evaluator.FieldValue;
import org.jpmml.evaluator.InputField;
import org.jpmml.evaluator.neural_network.NeuralNetworkEvaluator;
import org.jpmml.model.ImportFilter;
import org.jpmml.model.JAXBUtil;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class ClaimAmountPredictor {

	Evaluator evaluator;

	public static ClaimAmountPredictor CreatePredictor(
			String pmmlFileName) {
		try {
			return new ClaimAmountPredictor(pmmlFileName);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public ClaimAmountPredictor(String pmmlFileName) throws IOException,
			SAXException, JAXBException {
		PMML pmml = createPMMLfromFile(pmmlFileName);
		evaluator = new NeuralNetworkEvaluator(pmml);
	}

	/**
	 * Evaluate the model for the given input.
	 */
	public double evaluate(String gender, int numberOfClaims, String livingArea,
			double ageOfCar) {
		Object[] args = new Object[4];
		args[0] = gender;
		args[1] = (numberOfClaims <= 3) ? "" + numberOfClaims : ">3";
		args[2] = livingArea;
		args[3] = ageOfCar;
		Map<FieldName, ?> output = callPMMLEvaluate(args);

		return (double) output.get(new FieldName("amount of claims"));
	}

	protected Map<FieldName, ?> callPMMLEvaluate(Object[] arg_values) {
		Map<FieldName, Object> arguments = new LinkedHashMap<>();
		List<InputField> inputFields = evaluator.getInputFields();
		int i = 0;
		for (InputField inputField : inputFields) {
			try {
				FieldValue inputFieldValue =
						inputField.prepare(arg_values[i++]);
				arguments.put(inputField.getName(), inputFieldValue);
			} catch (Exception e) {
				System.err.println("Error while preparing "
						+ inputField.getName().getValue());
				throw e;
			}
		}

		Map<FieldName, ?> output = evaluator.evaluate(arguments);
		return output;
	}

	protected PMML createPMMLfromFile(String fileName) throws IOException,
			SAXException, JAXBException {
		try (InputStream stream =
				getClass().getClassLoader().getResourceAsStream(fileName)) {
			InputSource source = new InputSource(stream);
			source.setPublicId(fileName);
			SAXSource transformedSource = ImportFilter.apply(source);
			return JAXBUtil.unmarshalPMML(transformedSource);
		}
	}

	public static void main(String args[]) {
		try {
			final String pmmlFile = "neural_insurance.pmml";
			ClaimAmountPredictor predictor =
					CreatePredictor(pmmlFile);
			double amount = predictor.evaluate("male", 3, "urban", 10.0);
			System.out.println("Amount: " + amount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
