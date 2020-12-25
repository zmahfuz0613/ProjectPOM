# ProjectPOM
In my selenium project I have used Java language. 
In my project I have used data driven framework by using POM design pattern with page factory.
I have maintained a class for every web page. Each webpage has a separate class and that class hold the functionality and members of that webpage. I made separate classes for every individual test. 
I made separate packages for pages and test scripts. All webpage related classes come under page package and all test related classes comes under test package. All the “tests” are kept under src/main/java.
TestBase class deals with all the common functions used by all the pages. This class is responsible loading the configuration from property files initializing the WeDrivers.
Utility class stores and handles the functions. I used functions for repetitive task e.g. waits, actions such as sending texts, clicking elements.
