# tiendao-media-wiki-web-cucumber
- Selenium skeleton with Page object model and Page Factory
- Cucumber BDD
- Dependency Java Maven
- Running on chrome driver 114

# Prerequisites
1. Java JDK 8+
2. Maven
3. Eclipse IDE 
4. Eclipse plug-in: Cucumber

# How to run
- git clone from https://github.com/hatien85212/TienDaoSeleniumDemo.git
Way1: run tests by command is sometime not working (not have time to investigage more)
- cd to project folder
- run command: mvn clean test
Way2: run Feature file in Eclipse
- Import project to Eclipse (installed Cucumber Eclipse pluggin)
- Open feature file at path: /media-wiki-web/src/test/resources/features/SearchWikiPediaUI.feature (right click > Run As > Cucumber Feature)
- ![image](https://github.com/hatien85212/td-media-wiki-web-cucumber/assets/39360035/9cb0e316-ddaf-4a47-a4e3-17f3476ec9e9)
  Result: ![image](https://github.com/hatien85212/td-media-wiki-web-cucumber/assets/39360035/1a5a72d0-b68d-4d59-a71f-58f530e836f6)
- 
- **Note**: In case of error due to the chrome driver. please update the new one at current path /media-wiki-web/src/test/resources/drivers
- ![image](https://github.com/hatien85212/td-media-wiki-web-cucumber/assets/39360035/8f29cde4-144b-4133-9d42-63ce41aeb057)

