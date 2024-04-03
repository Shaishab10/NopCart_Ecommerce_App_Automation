# <div align=center> NopCart_Ecommerce_App_Automation </div>

### <div align=center>In this repository, Selenium WebDriver & Appium  are used to automate the NopCart Ecommerce App. Here, I have covered folowing tasks:

- Customer add Products in his shopping cart.
- Customer successfully place order as a guest user.

</div>

### Tools & Technology used:
- Selenium Webdriver
- Appium
- Android Studio
- Appium Inspector
- TestNG Framework
- Java
- Intellij idea
- Gradle
- Allure

### Prerequisites

- jdk
- gradle
- appium

### How to run this project:
- Clone this project
- Give this following command for checking the connectivity with emulator : ```adb devices```
- Open Appium Server with this following command: ```appium```
- Open Appium Inspector
- Set desired capabilites in json format & click Start Session:
``` 
{
  "platformName": "Android",
  "platformVersion": "11",
  "appPackage": "com.nopstation.nopcommerce.nopstationcart",
  "appActivity": "com.bs.ecommerce.main.SplashScreenActivity",
  "app": "e:\\apk\\ecom.apk",
  "automationName": "UiAutomator2"
}
```
> ```"appium:app"``` apk location in user pc & ```"appium:platformVersion"``` user emulator android version.
- Open ```build.gradle``` file as a project with Intellij IDEA
- Open ```terminal```
- Give this following command: ```gradle clean test```
- For generating Allure Report use these commands: ```allure generate allure-results --clean -output``` & ```allure serve allure-results```

### Allure Report

![Screenshot 2024-04-03 134123](https://github.com/Shaishab10/NopCart_Ecommerce_App_Automation/assets/54171379/8f4f1490-7edb-459a-8490-d1fee5244fc0)

### Output Video

https://github.com/Shaishab10/NopCart_Ecommerce_App_Automation/assets/54171379/b1e1d079-dcb1-4d3b-bd79-0ab181f68d06





