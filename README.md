# 🌐 SeleniumBeginnerTests

Bu repository, *Java* dili kullanılarak geliştirilmiş, *Selenium WebDriver* kullanımı üzerine odaklanan *başlangıç seviyesi (beginner)* otomasyon test örneklerini içermektedir. Proje, herhangi bir test framework’ü (*JUnit, TestNG, Maven vb.) kullanılmadan, doğrudan **Java + Selenium* mantığını öğretmeyi amaçlayan örneklerden oluşur.

Testler, Selenium’un temel kavramlarını adım adım öğrenmeye yönelik olacak şekilde paketlenmiş ve sınıflandırılmıştır.

---

## 🎯 Projenin Amacı

•⁠  ⁠Selenium WebDriver’ın *temel kullanımını* öğrenmek  
•⁠  ⁠Java ile tarayıcı otomasyonu mantığını kavramak  
•⁠  ⁠Web elementleri ile etkileşim kurmayı öğretmek  
•⁠  ⁠Locator stratejilerini uygulamalı göstermek  
•⁠  ⁠Test otomasyonuna yeni başlayanlar için sade ve anlaşılır örnekler sunmak  

---

## 🛠️ Kullanılan Teknolojiler ve Araçlar

| Teknoloji | Açıklama |
|----------|----------|
| *Java* | Otomasyon test dili |
| *Selenium WebDriver* | Web tarayıcı otomasyonu |
| *ChromeDriver* | Google Chrome için WebDriver |
| *IntelliJ IDEA* | Geliştirme ortamı (IDE) |

	⁠⚠️ Bu projede *Maven, JUnit veya TestNG kullanılmamaktadır.*  
	⁠Testler ⁠ main ⁠ metodu üzerinden, doğrudan Java classları çalıştırılarak yürütülür.

---

 📁 Proje Yapısı

```SeleniumBeginnerTests/
├── .idea/ # IntelliJ IDEA proje ayarları
├── kurulumDosyalari/ # Gerekli kurulum dosyaları
│ ├── selenium-java-4.26.0/ # Selenium kütüphaneleri
│ └── chromedriver.exe # ChromeDriver ├── src/
│ ├── day01_WebDriverKullanma/ # WebDriver temel kullanımı
│ │ ├── C01_IlkOtomasyon.java
│ │ └── C02_WebDriverMethodlari.java
│ ├── day02_driverMethodlari_webElementKullanimi/ # Driver ve navigasyon metodları
│ │ ├── C01_IlkTestOtomasyonu.java
│ │ ├── C02_DriverNavigateMethodlari.java
│ │ ├── C03_DriverManageMethodlari.java
│ │ ├── C04_DriverManageMethodlari.java
│ │ ├── C05_WebElementKullanma.java
│ │ └── C06_ByClassName.java
│ │ └── TestPractice_1.java
│ │ └── TestPractice_2.java
│ │ └── TestPractice_3.java
│ │ └── TestPractice_4.java
│ ├── day03_locators/ # Locator kullanımları
│ │ ├── C01_ByClassName.java
│ │ ├── C02_Locators.java
│ │ ├── C03_ByLinkText.java
│ │ ├── C04_Xpath.java
│ │ ├── C05_Xpath_TextKullanimi.java
│ │ └── C06_Locators.java
│ ├── day04_relativeLocators/ # Relative Locator örnekleri
│ │ └── C01_RelativeLocators.java
├── .gitignore
└── SeleniumBeginnerTests.iml
```⁠

---

## 🧪 Test Yapısı ve Mantığı

•⁠  ⁠Her class *bağımsızdır* ve kendi ⁠ main ⁠ metoduna sahiptir  
•⁠  ⁠Testler doğrudan çalıştırılarak sonuç gözlemlenir  
•⁠  ⁠Selenium WebDriver kullanılarak:
  - Tarayıcı açma
  - URL'e gitme
  - Element bulma
  - Tıklama
  - Yazı gönderme
  - Sayfa bilgilerini alma  
  gibi temel işlemler uygulanır

Bu yapı, test framework karmaşasına girmeden Selenium mantığını öğrenmeyi hedefler.

---


### 📌 Çalıştırma Adımları

1.⁠ ⁠Repository'i klonlayın:

git clone https://github.com/IpekSozbir/SeleniumBeginnerTests.git


2.⁠ ⁠IntelliJ IDEA ile projeyi açın

3.⁠ ⁠⁠ kurulumDosyalari ⁠ içindeki:
   - ⁠ selenium-java-4.26.0 ⁠ kütüphanelerini
   - ⁠ chromedriver.exe ⁠ dosyasını
   
   projeye ekleyin

4.⁠ ⁠İstediğiniz test classını açın ve *main metodunu çalıştırın*

---

## 📌 Öğrenilen Konular

•⁠  ⁠WebDriver oluşturma
•⁠  ⁠⁠ get() ⁠, ⁠ navigate() ⁠, ⁠ manage() ⁠ metodları
•⁠  ⁠⁠ WebElement ⁠ kullanımı
•⁠  ⁠⁠ By.id ⁠, ⁠ By.className ⁠, ⁠ By.linkText ⁠
•⁠  ⁠⁠ XPath ⁠ ile element bulma
•⁠  ⁠Relative Locators
•⁠  ⁠Temel test senaryosu yazımı
```
---
 
 ## 📎 Notlar
 
 - Bu proje *tamamen eğitim ve pratik amaçlıdır*
 - İleri seviyede:
   - Page Object Model
   - Test framework'leri
   - Maven yapısı  
   eklenerek geliştirilebilir
 - Kodlar bilinçli olarak sade tutulmuştur
 
 ---
 
 ## 📝 Lisans
 
 Bu proje *kişisel eğitim ve portföy* amaçlıdır.

 ---

 ## 🌐 SeleniumBeginnerTests
  
  This repository contains *beginner-level* automation test examples focused on the use of *Selenium WebDriver, developed using the **Java* programming language. The project consists of examples that aim to teach the *Java + Selenium* logic directly, without using any test framework (*JUnit, TestNG, Maven, etc.*).
  
  The tests are packaged and categorized in a way that teaches Selenium's core concepts step by step.
  
  ---
  
  ## 🎯 Project Purpose
  
  - Learn the *basic usage* of Selenium WebDriver  
  - Understand browser automation logic with Java  
  - Teach interaction with web elements  
  - Demonstrate locator strategies in practice  
  - Provide simple and understandable examples for beginners in test automation  
  
  ---
  
  ## 🛠️ Technologies and Tools Used
  
  | Technology | Description |
  |----------|----------|
  | *Java* | Automation test language |
  | *Selenium WebDriver* | Web browser automation |
  | *ChromeDriver* | WebDriver for Google Chrome |
  | *IntelliJ IDEA* | Development environment (IDE) |
  
  > ⚠️ In this project, *Maven, JUnit or TestNG are NOT used.*  
  > Tests are executed directly by running Java classes through the ⁠ main ⁠ method.
  
  ---

## :file_folder: Project Structure

## 📁 Project Structure

```
SeleniumBeginnerTests/
├── .idea/
├── kurulumDosyalari/
│   ├── selenium-java-4.26.0/
│   └── chromedriver.exe
├── src/
│   ├── day01_WebDriverKullanma/
│   │   ├── C01_IlkOtomasyon.java
│   │   └── C02_WebDriverMethodlari.java
│   ├── day02_driverMethodlari_webElementKullanimi/
│   │   ├── C01_IlkTestOtomasyonu.java
│   │   ├── C02_DriverNavigateMethodlari.java
│   │   ├── C03_DriverManageMethodlari.java
│   │   ├── C04_DriverManageMethodlari.java
│   │   ├── C05_WebElementKullanma.java
│   │   ├── C06_ByClassName.java
│   │   ├── TestPractice_1.java
│   │   ├── TestPractice_2.java
│   │   ├── TestPractice_3.java
│   │   └── TestPractice_4.java
│   ├── day03_locators/
│   │   ├── C01_ByClassName.java
│   │   ├── C02_Locators.java
│   │   ├── C03_ByLinkText.java
│   │   ├── C04_Xpath.java
│   │   ├── C05_Xpath_TextKullanimi.java
│   │   └── C06_Locators.java
│   └── day04_relativeLocators/
│       └── C01_RelativeLocators.java
├── .gitignore
└── SeleniumBeginnerTests.iml
```

---
## :test_tube: Test Structure and Logic
* Each class is independent and has its own main method
* Tests are executed directly and results are observed
* Using Selenium WebDriver:
     - Opening the browser
     - Navigating to a URL
     - Finding elements
     - Clicking
     - Sending text input
     - Retrieving page information
     basic operations are implemented
* This structure aims to teach Selenium logic without the complexity of test frameworks.
