# Juego del Ahorcado

Este es un juego simple del Ahorcado implementado en Java sin interfaz gráfica de usuario.

## Descripción

El juego del Ahorcado consiste en adivinar una palabra secreta, letra por letra, antes de que se agoten los intentos.

## Instrucciones

1. Ejecuta el programa.
2. Se te mostrará la palabra secreta con guiones bajos representando las letras aún no adivinadas.
3. Ingresa una letra por teclado y presiona Enter.
4. Si la letra ingresada está en la palabra secreta, se revelará su posición.
5. Si la letra no está en la palabra secreta, se contará como un intento fallido.
6. El juego termina cuando adivines la palabra secreta o se agoten los intentos.

## Requisitos

- Java Development Kit (JDK) instalado en tu sistema.

## Ejecución

1. Abre una terminal o línea de comandos.
2. Navega hasta la ubicación del archivo `Ahorcado.java`.
3. Compila el archivo Java ejecutando el siguiente comando:
    ```bash
    javac Ahorcado.java
    ```
4. Ejecuta el programa compilado con el siguiente comando:
    ```bash
    java Ahorcado
    ```

## Notas adicionales

- La palabra secreta se encuentra codificada en el código fuente (`palabraSecreta = "andresgato"`) y puede ser modificada según se desee.
- El número máximo de intentos también se puede ajustar cambiando el valor de `intentosMaximos`.
- El programa utiliza la entrada estándar para que el usuario ingrese las letras.

¡Diviértete jugando al Ahorcado!