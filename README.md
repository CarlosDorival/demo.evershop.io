# Proyecto de Automatización de Pruebas para Evershop

Este repositorio contiene un proyecto de automatización de pruebas para la página web [Evershop Demo](https://demo.evershop.io) utilizando Java y Selenium. El objetivo es automatizar casos de prueba end-to-end para garantizar el correcto funcionamiento del sitio web.

## Tecnologías Utilizadas

- **Lenguaje**: Java
- **Framework de Pruebas**: JUnit
- **Automatización**: Selenium WebDriver
- **Gestor de Dependencias**: Maven

## Estructura del Proyecto


├── src
│   ├── main
│   │   └── java
│   └── test
│       └── java
│           └── com
│               └── challenge
│                   └── pom
│                       ├── Driver.java
│                       └── endtoendBuy_Test.java
└── pom.xml

Driver.java: Clase que maneja la configuración del WebDriver.
endtoendBuy_Test.java: Clase de prueba que contiene los casos de prueba end-to-end.
-------------------------------------------------------------------------------------

Prerrequisitos
Antes de ejecutar las pruebas, asegúrate de tener instalados los siguientes componentes:

- Java JDK 8 o superior
-Maven
- Google Chrome (o el navegador de tu preferencia)
- IntelliJ IDEA u otro IDE compatible con Java


------------------------------------------------------------------------------------
Configuración

Clona este repositorio en tu máquina local:


- git clone https://github.com/CarlosDorival/demo.evershop.io.git
- cd tu-repositorio

------------------------------------------------------------------------------------
Importa el proyecto en tu IDE de preferencia como un proyecto Maven.

Actualiza las dependencias ejecutando:

mvn clean install
Configura el WebDriver en la clase Driver.java.
------------------------------------------------------------------------------------
Ejecución de Pruebas
Para ejecutar las pruebas, sigue estos pasos:
------------------------------------------------------------------------------------
Abre el proyecto en tu IDE.
Ejecuta las pruebas desde la clase endtoendBuy_Test.java como una prueba de JUnit.
Casos de Prueba Automatizados
Comprar Producto
Navega al sitio web.
Agrega un producto al carrito.
Procede al pago y completa la compra.
Verifica que la compra se haya realizado correctamente.
Contribuciones

------------------------------------------------------------------------------------
Si deseas contribuir a este proyecto, sigue estos pasos:

Haz un fork del repositorio.
Crea una nueva rama (git checkout -b feature/nueva-funcionalidad).
Realiza los cambios y haz un commit (git commit -m 'Añadir nueva funcionalidad').
Haz un push a la rama (git push origin feature/nueva-funcionalidad).
Crea un Pull Request.
Licencia
Este proyecto está licenciado bajo la MIT License.

Contacto
Si tienes alguna pregunta o sugerencia, no dudes en abrir un issue o contactarme a través de carlos.dorival.esquivel@gmail.com.

