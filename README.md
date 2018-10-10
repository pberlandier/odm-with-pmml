# ODM / PPML integration
This sample is derived from the developerWorks article (Make informed automated decisions with business rules and Predictive Model Markup Language)[https://www.ibm.com/developerworks/library/mw-1708-ardoint-bluemix/1708-ardoit.html]. 
It shows a simple auto insurance pricing process using a simple tiering rule to create a base price and uses a predictive model, which estimates the claim cost for the driver, to adjust the base price.
The predictive model is a simple Neural Network that is defined using (PMML)[http://dmg.org/pmml/v4-3/GeneralStructure.html], and integrated in the ODM project XOM via the (JPMML)[https://github.com/jpmml] library.
