`04/07/2022 7:45pm`

## Bienvenidos
Este programa fue realizado en Visual Studio Code, con el conjunto de extensiones *Debugger for Java*, *Extension Pack for Java*, *Maven for Java*, *Projecto Manager for Java* y *Test Runner for Java*.
## Estructura de la carpeta
Esta carpeta contiene dos subfolders, los cuales son:
- `src`: contiene los archivos *.java*.
- `lib`: mantiene dependencias y otros archivos.
- `bin`: aquí se guardan, por defecto, los archivos compilados generados.
## Descripción del programa
El objetivo de este programa es practicar y realizar una idea que me resulta bastante divertida: pasar un número a su nombre escrito, es decir, pasar de 1 a "Uno", 22 a "Veinti dos" o 967 a "Novecientos sesenta y siete", para ello, se utilizaron arreglos bidimensionales estáticos finales que son la referencia del número y su nombre escrito (ambos campos del arreglo tipo String).

Este programa contempla los números 01, 02, 03, ..., 09 como "Uno", "Dos", "Tres", ..., "Nueve" como unidades, ignorando el cero con el que comienza dicho número, al igual que 101, 102, ..., 109 como "Ciento uno", "Ciento dos", ..., "Ciento nueve" y 21, 21, ..., 29 como "Veinti uno", "Veinti dos", ..., "Veinti nueve", ya que estas decenas suelen decirse de esa manera, y no "Ciento y" o "Veinte y".

El alcance de este programa se reduce a números de tres digitos sin punto decimal.