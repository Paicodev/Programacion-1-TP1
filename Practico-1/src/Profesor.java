public class Profesor extends Persona {
    String especialidad;
    int añosExperiencia;
    //materiasAsignadas;

    public Profesor(String nombre, String apellido, int edad, String especialidad, int añosExperiencia){
        super(nombre, apellido, edad);
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
    }

    public String getEspecialidad(){
        return this.especialidad;
    }

    public void setEspecialidad(String espeEialidad){
        if (especialidad == null || especialidad.isEmpty()){
            throw new IllegalArgumentException("La especialidad no puede estar vacía");
       }
        this.especialidad = especialidad;
    }
    
    //Getter y Setter de Edad
    public int getAñosExperiencia(){
        return this.añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia){
        if (añosExperiencia < 0){
            throw new IllegalArgumentException("Los años de experiencia deben ser mayor a 0");
        }
        this.añosExperiencia = añosExperiencia;
    }
}
