# Proyecto de Automatización - demo

Este proyecto es un framework de automatización de pruebas para aplicaciones web, construido en Java con Maven, utilizando Selenium, TestNG, Allure y otras herramientas para facilitar pruebas robustas y reportes profesionales.

---

## 📁 Estructura del proyecto

```plaintext
src/
├── main/
│   └── java/
│       ├── actions/      # Lógica reutilizable para interactuar con la aplicación (login, navegación, etc.)
│       ├── utils/        # Funciones auxiliares (esperas, strings, fechas, etc.)
│       └── reports/      # Clases para manejo de reportes personalizados (ej. ExtentReports)
└── test/
    ├── java/            # Clases de pruebas TestNG/JUnit
    └── resources/
        ├── config/      # Archivos de configuración, variables de entorno
        └── testdata/    # Datos para pruebas (JSON, CSV, etc.)

```
---

## ⚙️ Tecnologías y dependencias

- **Java 21**  
- **Maven**: Gestión de dependencias y ejecución  
- **Selenium WebDriver**: Automatización de navegador  
- **TestNG**: Framework de pruebas  
- **Allure TestNG**: Reportes visuales de pruebas  
- **WebDriverManager**: Manejo automático de drivers de navegador  
- **Dotenv-java**: Carga variables de entorno desde `.env`  
- **SLF4J-simple**: Logging básico  

---

## 📦 Dependencias clave en `pom.xml`

| Dependencia                | Versión  | Propósito                              |
|---------------------------|----------|--------------------------------------|
| selenium-java             | 4.33.0   | Automatización de navegador           |
| testng                    | 7.10.2   | Framework de pruebas                   |
| allure-testng             | 2.21.0   | Reportes con Allure                    |
| webdrivermanager          | 6.1.1    | Gestión automática de drivers          |
| dotenv-java               | 3.0.0    | Variables de entorno desde `.env`      |
| slf4j-simple              | 2.0.13   | Logging sencillo                      |

---

## 🚀 Instalación y configuración

### 1. Pre-requisitos

- Instalar [Java 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html) o superior  
- Instalar [Maven](https://maven.apache.org/install.html)  
- Windows: Instalar Scoop para manejar paquetes (opcional pero recomendado para Allure)

### 2. Instalar Allure en Windows con Scoop

```powershell
iwr -useb get.scoop.sh | iex
scoop install allure
```

3. Configurar variables de entorno
USER_NAME=usuario
PASSWORD=secreto

Generar y visualizar reportes Allure
```
allure generate allure-results --clean -o allure-report
allure open allure-report
```

# Buenas prácticas en el proyecto
actions/: Colocar aquí funciones que interactúan con la aplicación (login, navegación, formularios). Evitar poner lógica de tests o aserciones aquí.

reports/: Clases para configurar y generar reportes (e.g., ExtentReports). No debe contener setup/teardown de WebDriver.

utils/: Funciones auxiliares genéricas reutilizables, como esperas explícitas, conversiones, utilidades de strings, fechas, etc.

Separar bien la lógica de pruebas (clases en test/) de la lógica de interacción (clases en main/java/actions).
