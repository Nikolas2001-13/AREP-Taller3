# HTTP SERVER

En este laboratorio se relaizará un servidor web, el cual soportará multiples
solicitudes seguidas no concurrentes. Para esto solo se podrá utilizar Java y
las diferentes librerías para manejo de la red, no estan permitidos frameworks
web.

## Empezando e Instalando

Entramos a la carpeta donde queremos guardar nuestro repositorio, en este caso Desktop

`$ cd Desktop`

Clonamos el repositorio en la carpeta

`$ git clone https://github.com/Nikolas2001-13/AREP-Taller3`

Nos dirigimos a la carpeta que contiene el proyecto

`$ cd AREP-Taller3`

Compilamos con maven

`$ mvn package`

Y por último corremos el programa

`$ mvn exec:java -Dexec.mainClass=""`

### Prerrequisitos
Java SE Development Kit 8 -Java SE Runtime Environment 8 -Apache Maven.
Tener conocimiento sobre Maven, HEROKU, GIT, Spark y GITHUB. 

## Despliegue en Heroku

[![Heroku App](http://heroku-shields.herokuapp.com/shrouded-sea-44498)](https://shrouded-sea-44498.herokuapp.com/ )

## Integración Continua CircleCi


## Correr las Pruebas

Para correr las pruebas del programa habrá que ejecutar el comando

`$ mvn test`

## Documentacion

Para generar la documentación habrá que ejecutar el siguiente comando

`$ mvn javadoc:javadoc`

## Construido Con

* [JUnit](https://mvnrepository.com/artifact/junit/junit) - Test framework
* [Maven](https://maven.apache.org/) - Dependency Management
* [IntelliJ](https://www.jetbrains.com/es-es/idea/) - IDE

## Autor

* **Nikolás Bernal Giraldo** - [Nikolas2001-13](https://github.com/Nikolas2001-13) - Estudiante de la Escuela Colombiana de Ingeniería Julio Gravito

## Licencia

[LICENSE.md](http://www.gnu.org/licenses/gpl.html) 
