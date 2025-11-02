# Proyecto de Gestión Audiovisual (POO)

Proyecto para la materia de Programación Orientada a Objetos de la Universidad Politécnica Salesiana.

## 1. Objetivos y Propósito

El objetivo de este proyecto es ampliar un sistema base de contenido audiovisual, aplicando conceptos avanzados de Programación Orientada a Objetos (POO) para mejorar su estructura y funcionalidad. Se implementan relaciones de **Herencia**, **Composición** y **Agregación**.

## 2. Clases y Funcionalidades Añadidas

### Clases Base (Herencia)
El proyecto se expandió creando dos nuevas subclases que heredan de `ContenidoAudiovisual`:
* `VideoYouTube`: Añade atributos como `canal` y `likes`.
* `Cortometraje`: Añade un atributo para el `director`.

### Clases Relacionadas (Agregación y Composición)
Se crearon 3 clases para establecer relaciones con las clases existentes:
* **`Actor`**: Se relaciona con `Pelicula` mediante **Agregación** (una película tiene actores).
* **`Temporada`**: Se relaciona con `SerieDeTV` mediante **Composición** (una serie se compone de temporadas).
* **`Investigador`**: Se relaciona con `Documental` mediante **Agregación** (un documental tiene investigadores).

### Funcionalidad
Se creó una clase `PruebaAudiovisual.java` que demuestra la creación y manipulación de objetos de todas las clases, probando que el sistema es completamente funcional.

## 3. Instrucciones de Instalación y Uso

1.  **Clonar el repositorio:**
    ```bash
    git clone [https://github.com/adrielochoa/Adriel_proyecto-poo-ups.git](https://github.com/adrielochoa/Adriel_proyecto-poo-ups.git)
    ```
2.  **Importar en Eclipse:**
    * Abrir Eclipse.
    * Ir a `File > Import...`.
    * Seleccionar `Git > Projects from Git`.
    * Seleccionar `Clone URI` y pegar la URL. (O seleccionar `Existing local repository` si ya se clonó).
3.  **Ejecutar la aplicación:**
    * En el "Package Explorer", navegar a `src/poo/PruebaAudiovisual.java`.
    * Hacer clic derecho en el archivo.
    * Seleccionar `Run As > Java Application`.
    * Ver los resultados en la pestaña "Console".

## 4. Mejoras Adicionales
* Se implementó un contador estático en `ContenidoAudiovisual` para asignar un ID único a cada objeto creado (aunque se dejó en 0 por simplicidad en la prueba final).
* Todas las clases de herencia implementan el método `@Override mostrarDetalles()` para demostrar el polimorfismo.