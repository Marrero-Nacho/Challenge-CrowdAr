# Challenge-CrowdAr

Este proyecto es un framework de automatización de pruebas desarrollado en Java, utilizando Selenium, Cucumber, JUnit y ExtentReports. Además, se incluye la capacidad de interactuar con servicios web, lo que permite una cobertura de pruebas más amplia y robusta.

# Dependencias Principales
Selenium: Herramienta para la automatización de navegadores web.  
Cucumber: Framework que permite la ejecución de tests escritos en lenguaje natural.  
JUnit: Framework de pruebas unitarias utilizado como runner para Cucumber.  
ExtentReports: Biblioteca para la generación de reportes HTML detallados.  

# Ejecución de las Pruebas
Para ejecutar las pruebas, puedes utilizar los runners de JUnit que se encuentran en src/test/java/runners.  
Esta clase lo que hara es ejecutar los casos de pruebas con el tag "@Test" dentro de los archivos ".feature", y creara un reporte al finalizar la ejecucion en src/test/resources/reports/html-report.html

# Reporte HTML
Al finalizar la ejecucion del ciclo de pruebas se creara un archivo de reporte el cual incluirá capturas de pantalla cuando el caso falle.
