public class App {
    public static void main(String[] args) throws Exception {
        Universidad uni = new Universidad("UNViMe", "Villa Mercedes", 5);

        Profesor profesor1 = new Profesor("Pablo", "Sosa", 45, "30111222", "Programacion", 20, 5);
        Personal personal1 = new Personal("Carla", "Sanchez", 35, "35777666", "Administracion", "Secretaria", "2019-03-15");
        Materia materia1 = new Materia(1,"Programacion 1", "PROG1", 4, 9.5, profesor1);
        Materia materia2 = new Materia(2,"Matematica 1", "MAT1", 4, 8.5, profesor1);

        Materia[] materias = {materia1, materia2};
       
        Estudiante estudiante1 = new Estudiante("Alex", "Lopez", 23, "44333222", "Programador Universitario", 8.5, materias);


        double sumaRecursiva = estudiante1.calcularPromedioRecursivo(materias, 0);
        double promedioRecursivo = sumaRecursiva / materias.length;

        double promedioIterativo = estudiante1.calcularPromedioIterativo();

        System.out.println("Promedio (recursivo): " + promedioRecursivo);
        System.out.println("Promedio (iterativo): " + promedioIterativo);

        uni.agregarMiembro(estudiante1);
        uni.agregarMiembro(profesor1);
        uni.agregarMiembro(personal1);

        Estudiante copia = new Estudiante("Alejandro","Lopez", 25, "44333222", "Medicina", 9, null);
        uni.agregarMiembro(copia);

        System.out.println("\n--Busqueda---\n");
        Persona encontrada = uni.buscarPorDocumento("44333222");
        if(encontrada != null){
            System.out.println("Persona encontrada: " + encontrada);
        }else {
            System.out.println("No se encontró la persona con ese documento.");
        }

         System.out.println("Comparacion equals");
         System.out.println("Alumno y copia son iguales?" + estudiante1.equals(copia));
    }

   
}
