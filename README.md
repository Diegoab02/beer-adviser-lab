# Laboratorio 1 — Beer Adviser + Extensión Educación Virtual

Aplicación Android que implementa el laboratorio **Beer Adviser** del libro *Head First Android Development* (Griffiths & Griffiths, 2017) y la **extensión** solicitada: catálogo de servicios de un aula virtual por categoría.

## 1. Objetivo

Reconocer los fundamentos de las actividades Android y aplicarlos a una interacción concreta con el usuario (Spinner → botón → clase Java pura → TextView).

## 2. Estructura

```
BeerAdviserLab/
├── app/
│   ├── build.gradle
│   └── src/main/
│       ├── AndroidManifest.xml
│       ├── java/com/hfad/beeradviser/
│       │   ├── BeerExpert.java              (POJO base)
│       │   ├── FindBeerActivity.java        (actividad base)
│       │   └── educacion/
│       │       ├── ServiciosEducacionExpert.java  (POJO extensión)
│       │       └── EducacionVirtualActivity.java  (actividad extensión)
│       └── res/
│           ├── layout/
│           │   ├── activity_find_beer.xml
│           │   └── activity_educacion_virtual.xml
│           └── values/
│               ├── strings.xml   (arrays: beer_colors, categorias_edu)
│               └── themes.xml
├── build.gradle
├── settings.gradle
└── gradle.properties
```

## 3. Laboratorio base — Beer Adviser

1. `FindBeerActivity` muestra un `Spinner` con los colores (`light`, `amber`, `brown`, `dark`).
2. Al pulsar **Find Beer!** se invoca `onClickFindBeer()`, que llama a `BeerExpert.getBrands(color)`.
3. `BeerExpert` es una clase Java **sin dependencias de Android** que devuelve una `List<String>` con las marcas.
4. La actividad concatena la lista y la muestra en el `TextView`.

## 4. Extensión — Servicios de Educación Virtual

Aplica el mismo patrón a un catálogo de servicios de un aula virtual.

| Categoría        | Servicios asociados                                                          |
|------------------|------------------------------------------------------------------------------|
| `foro`           | Foro técnico, Foro social, Foro de aclaración de dudas                       |
| `tarea`          | Tarea individual, Tarea grupal, Tarea con rúbrica                            |
| `cuestionario`   | Cuestionario diagnóstico, Cuestionario de repaso, Cuestionario evaluativo    |
| `recurso`        | Recurso archivo PDF, Recurso enlace URL, Recurso video                       |
| `chat`           | Chat grupal, Chat de tutoría, Chat de soporte                                |

- `EducacionVirtualActivity` reutiliza el patrón Spinner + Button + TextView.
- `ServiciosEducacionExpert.getServicios(categoria)` devuelve la `List<String>` de servicios.
- Se accede desde `FindBeerActivity` con el botón **Ver Servicios de Educación Virtual** (Intent explícito).

## 5. Ejecución

1. Abrir el proyecto en **Android Studio** (Gradle sync automático).
2. Ejecutar en emulador o dispositivo (API 21+).
3. Probar Beer Adviser (color → marcas) y luego el botón de la extensión (categoría → servicios).

## 6. Entrega

1. `git init && git add . && git commit -m "feat: Lab1 Beer Adviser + extension Educacion Virtual"`.
2. `git branch -M main`.
3. `git remote add origin https://github.com/<usuario>/<repositorio>.git`.
4. `git push -u origin main`.
5. Publicar la URL del repositorio en Moodle.
