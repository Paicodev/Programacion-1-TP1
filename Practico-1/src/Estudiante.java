public class Estudiante extends Persona{
    String documento;
    String carrera;
    double promedio;
    Materia[] materias;

    public Estudiante(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
        this.documento = documento;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public Estudiante(){

    }

    //Metodos Getters y Setters//
    
    public String getDocumento(){
        return this.documento;
    }

    public void setDocumento(String documento){
        if(documento == null || documento.isEmpty()){
            throw new IllegalArgumentException("");
        }
        this.documento = documento;
    }

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
}
