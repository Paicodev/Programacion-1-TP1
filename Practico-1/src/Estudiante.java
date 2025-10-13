public class Estudiante extends Persona implements MiembroUniversidad{
    String carrera;
    double promedio;
    Materia[] materias;

    public Estudiante(String nombre, String apellido, int edad, String documento, String carrera, double promedio, Materia materias []){
        super(nombre, apellido, edad, documento);    
        this.carrera = carrera;
        this.promedio = promedio;
        this.materias = materias;
    }

    public Estudiante(){

    }

    //Metodos Getters y Setters//

    public String getCarrera(){
        return this.carrera;
    }

    public void setCarrera(String carrera){
        if(carrera == null || carrera.isEmpty()){
            throw new IllegalArgumentException("");
        }
        this.carrera = carrera;
    }

    public double getPromedio(){
        return this.edad;
    }

    public void setPromedio(double promedio){
        if (promedio < 1 || promedio > 10){
            throw new IllegalArgumentException("El promedio debe ser de entre 1 y 10");
        }
        this.promedio = promedio;
    }

    public Materia [] getMaterias(){
        return materias;
    }

    public void setMaterias(Materia[] materias){
        this.materias = materias;
    }

    @Override
    public String obtenerRol(){
        return "Estudiante";
    }

    @Override
    public String obtenerInformacionCompleta(){
        return toString();
    }

    @Override
    public String toString(){
        return super.toString() + "- Carrera:"+ carrera + "- Promedio: "+ promedio;
    }
}
