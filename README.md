# BackBaseTestAutomationProject
This project is build with `Java`+`Maven` + `Selenium` BDD framework; As well as a cool maven-cucumber-reporting plugin

# Structure
I created 4 packages using Page Object Model(POM) design: pages, runners, step_definitions, utilities. Also a resources directory.

•I created singleton Driver design pattern.

•All the data related to all the pages will go under the pages package.

•All runner classes will go under the runners package.

•All the test cases/scenarios will go under the resources/features directory.

•All logics will go under the utilities package.

# How to run ?
 Run CukesRunner class under the runners package

Or using the command line, following two steps below(this will generate JSON report)
1. `mvn clean` 
2.  `mvn verify -Dcucumber.options="–tags @smoke"`


# Maven-Cucumber_reporting, How to open from different IDEs ?
In order to see this beautiful report, please follow below steps:
If you use intellij idea, then click maven from top right of the IDE
Under the maven life cycle

1.double click the clean option, wait until it finishes the execution
2. double click the verify option, wait until it finished the execution
3. open cucumber-html-reports under the target folder
5. right click overview-features.html, open in -> Browser -> Chrome(for example)
  
   ![how to open report](https://github.com/UmitUmit/FatorialCalulator/blob/master/image%20copy%203.png)

6. you will see a colorful pie chart, the report will be in front of you on the browser page, you can click all the clickables to see the report however you want
   
![Cucumber-mvn-report](https://github.com/UmitUmit/FatorialCalulator/blob/master/image%20(1).png)

If you are using other IDEs that doesn't has the maven life cycle option on it

1. from command line / terminal go into  this project
2. type `mvn clean` , press enter
3. type `mvn verify -Dcucumber.options="–tags @smoke"`, press enter
4. open cucumber-html-reports under the target folder
5. right click overview-features.html, open in -> Browser -> Chrome(for example)
6. you will see a colorful pie chart, the report will be in front of you on the browser page, you can click all the clickables to see the report however you want 

