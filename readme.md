# Book Cover Application

Esta es una aplicación básica desarrollada con **Spring Boot** y **Thymeleaf**, que utiliza el patrón **MVC** (Modelo-Vista-Controlador). La aplicación muestra una portada de libro simple basada en los detalles proporcionados a través de los parámetros en la URL.

## Requisitos

- **Java 17** o superior
- **Gradle** (opcional, pero recomendado)
- **Git**

## Clonar el Repositorio

Para clonar el repositorio, utiliza el siguiente comando:

```bash
git clone https://github.com/tu-usuario/book-cover-application.git
```

## Ejecutar la Aplicación

1. Accede al directorio del proyecto:

   ```bash
   cd book-cover-application
   ```

2. Ejecuta el proyecto usando Gradle:

   ```bash
   ./gradlew bootRun
   ```

   Si prefieres ejecutar la aplicación con un IDE como **IntelliJ IDEA** o **Eclipse**, asegúrate de importar el proyecto como un proyecto Gradle y luego ejecuta la clase principal `DemoApplication.java`.

## Probar la Aplicación

Para probar la aplicación, debes acceder a la siguiente URL en tu navegador, proporcionando los parámetros `title` (título del libro), `author` (autor), y `year` (año de publicación):

```bash
http://localhost:8080/book?title=<titulo>&author=<autor>&year=<año>
```

### Ejemplo de URL

Si deseas ver la portada del libro *El Principito* de Antoine de Saint-Exupéry, publicado en 1943, la URL sería:

```bash
http://localhost:8080/book?title=El%20Principito&author=Antoine%20de%20Saint-Exupéry&year=1943
```

Esto mostrará una portada de libro con el título, el autor y el año especificados.

## Estructura del Proyecto

El proyecto sigue el patrón MVC (Modelo-Vista-Controlador) y está organizado de la siguiente manera:

```
src/
├── main/
│   ├── java/com/example/demo/
│   │   ├── DemoApplication.java  # Clase principal de Spring Boot
│   │   ├── controller/
│   │   │   └── BookController.java  # Controlador que maneja las solicitudes
│   │   └── model/
│   │       └── Book.java  # Modelo del libro con título, autor y año
│   └── resources/
│       └── templates/
│           └── bookDetails.html  # Plantilla HTML que renderiza la portada
```

## Dependencias Utilizadas

El archivo `build.gradle` contiene las siguientes dependencias clave:

- **Spring Boot Starter Web**: Para el manejo de solicitudes HTTP y la creación del controlador.
- **Spring Boot Starter Thymeleaf**: Para la renderización de las vistas HTML.
- **Spring Boot Starter Test**: Para pruebas automatizadas (incluidas por defecto).

## Personalización

Si deseas personalizar el diseño de la portada del libro, puedes modificar el archivo `bookDetails.html` que se encuentra en `src/main/resources/templates/`. Allí también se puede cambiar el estilo utilizando el CSS embebido.

## Autor

- **Lued Beltrán Colón**
- [GitHub](https://github.com/ludekabeko)

---

¡Gracias por probar esta aplicación! Si tienes algún problema o sugerencia, no dudes en abrir un **issue** en el repositorio.
