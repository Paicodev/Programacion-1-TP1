public class App {
    public static void main(String[] args) throws Exception {
        Universidad uni = new Universidad("UNViMe", "Villa Mercedes", 5);

        Estudiante e1 = new Estudiante("Alex", "Lopez", 23, "44333222", "Programador Universitario", 8.5, null);
        Profesor p1 = new Profesor("Pablo", "Sosa", 45, "30111222", "Programacion", 20, 5);
        Personal pl1 = new Personal("Carla", "Sanchez", 35, "35777666", "Administracion", "Secretaria", "2019-03-15");

        uni.agregarMiembro(e1);
        uni.agregarMiembro(p1);
        uni.agregarMiembro(pl1);

        Estudiante copia = new Estudiante("Alejandro","Lopez", 25, "44333222", "Medicina", 9, null);
        uni.agregarMiembro(copia);

        System.out.println("\n--Busqueda---\n");
        Persona encontrada = uni.buscarPorDocumento("44333222";
        if(encontrada != null){
            System.out.println("Persona encontrada: " + encontrada);
        }else {
            System.out.println("No se encontró la persona con ese documento.");
        }
    }

    System.out.println("Comparacion equals");
    System.out.println("Alumno y copia son iguales?" + alumno.equals(copia));
}
