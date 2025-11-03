Informe de Entrega – Herencia, Polimorfismo y Recursividad
1. Herencia y Polimorfismo
Implementación de la herencia

En el código, definiendo una clase base Persona, con sus atributos y metodos. Heredamos las subclases Estudiante, Profesor y Personal, los cuales tienen sus propios atributos y metodos.

Además, todas las clases heredan o implementan la clase/interfaz MiembroUniversidad, que unifica el comportamiento de los distintos tipos de miembros dentro de la universidad.

Implementación del polimorfismo

El polimorfismo se aplica en los métodos que trabajan con el arreglo de miembros de tipo MiembroUniversidad.
Aunque los objetos son de distintas clases (Estudiante, Profesor, Personal), se manejan mediante referencias del mismo tipo.
Cada clase redefine el método obtenerInformacionCompleta() con el Override, esto me permite que, al recorrer el arreglo, invoque automáticamente la versión correspondiente según el tipo real del objeto.

Ejemplo de uso:

for (int i = 0; i < cantidadMiembros; i++) {
    System.out.println(miembros[i].obtenerInformacionCompleta());
}


Ejemplo de salida:

Estudiante: Alex Lopez - Carrera: Programador Universitario
Profesor: Pablo Sosa - Área: Programación
Personal: Carla Alvarez - Puesto: Secretaría

2. Algoritmos Recursivos, Iterativos y Ordenamiento/Búsqueda
Implementaciones recursivas e iterativas

Se incluyeron métodos equivalentes con ambos enfoques para mostrar sus diferencias:

Promedio de notas:

calcularPromedioRecursivo(Materia[] materias, int indice)

calcularPromedioIterativo()

Búsqueda de estudiante por documento:

buscarEstudianteRecursivo(Estudiante[] estudiantes, String documento, int indice)

buscarEstudianteIterativo(Estudiante[] estudiantes, String documento)

Iteratividad vs Recursividad:
En el enfoque recursivo tengo un código más claro y legible, pero este me consume más memoria y hago uso de llamadas anidadas, lo cual reduce la velocidad.
En el enfoque iterativo, tengo más eficiencia en tiempo y memoria, aunque el código es más extenso y menos legible.

También hice uso del ordenamiento burbuja, ordenando a los estudiantes por apellido, y luego una busqueda binaria para encontrar segun la clave que yo elija.

Ejemplo de ejecución:

Estudiantes sin ordenar:
- Alex Lopez
- Maria Gomez

Estudiantes ordenados por apellido:
- Maria Gomez
- Alex Lopez