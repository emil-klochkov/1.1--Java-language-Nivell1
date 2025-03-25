# 1.1--Java-language-Nivell1
Ejercicio 1:

# 1.Instrumentos.java (Clase abstracta) 

Es la clase base para todos los instrumentos.
Tiene dos atributos: nombre y precio.
Define un método abstracto tocar(), que las clases hijas deben implementar.
Imprime un mensaje cuando se crea un instrumento.
# 2.InstrumentosViento.java (Hereda de Instrumentos)
Representa instrumentos de viento (ej. flauta).
Sobrescribe tocar() para imprimir: "Está sonando un instrumento de viento".
Tiene un bloque static {} que imprime un mensaje cuando se carga la clase.
# 3.InstrumentosCuerda.java (Hereda de Instrumentos)
Representa instrumentos de cuerda (ej. guitarra).
Sobrescribe tocar() para imprimir: "Está sonando un instrumento de cuerda".
También tiene un bloque static {} para mostrar cuándo se carga la clase.
4.InstrumentosPercusion.java (Hereda de Instrumentos)
Representa instrumentos de percusión (ej. tambor).
Sobrescribe tocar() para imprimir: "Está sonando un instrumento de percusión".
También tiene un bloque static {}.
5.Main.java (Punto de entrada del programa)
Muestra cómo se cargan las clases en memoria al acceder a un miembro estático.
Crea objetos de cada tipo de instrumento (Viento, Cuerda, Percusión).
Llama al método tocar() de cada uno, mostrando los mensajes correspondientes.

Ejercicio 2:

1.Car.java (Clase del coche):
Define un coche con la marca "Toyota", un modelo (static) y una potencia (final).
Tiene un método estático brake() (puede llamarse sin crear un coche).
Tiene un método de instancia accelerate() (requiere un objeto Car).
2️.Main.java (Punto de entrada):
Muestra la marca del coche.
Cambia el modelo (Car.model = "Corolla";).
Crea un coche con potencia 150.
Llama a brake() y accelerate().
