# tiendao-media-wiki-web-cucumber
- Selenium skeleton with Page object model and Page Factory
- Cucumber BDD
- Dependency Java Maven
- Running on chrome driver 114 - Windows

# Prerequisites
1. Java JDK 8+
2. Maven
3. Eclipse IDE 
4. Eclipse plug-in: Cucumber

# How to run
- git clone from https://github.com/hatien85212/TienDaoSeleniumDemo.git
Way1: run tests by command is sometimes not working (not have time to investigate more)
- cd to the project folder
- run command: mvn clean test
Way2: run Feature file in Eclipse
- Import project to Eclipse (installed Cucumber Eclipse plugin)
- Open the feature file at path: /media-wiki-web/src/test/resources/features/SearchWikiPediaUI.feature (right click > Run As > Cucumber Feature)
-  **Note**: In case of an error due to the Chrome driver. please update the new one to the current path /media-wiki-web/src/test/resources/drivers
![image](https://github.com/hatien85212/tiendao-media-wiki-web-cucumber/assets/39360035/f691ad50-d78d-438a-aac0-d44f210e9cbe)


