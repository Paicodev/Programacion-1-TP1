public class Estudiante {
    String nombre;
    String apellido;
    int edad;
    String documento;

    public void Estudiante(String nombre, String apellido, int edad, String documento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public Estudiante(){

    }

    //Metodos Getters y Setters//
    
public String setNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        if (nombre == null || nombre.isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

    //Getter y Setter de Apellido
    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String apellido){
        if (apellido == null || apellido.isEmpty()){
            throw new IllegalArgumentException("El apellido no puede estar vacío");
        }
        this.apellido = apellido;
    }
    
    //Getter y Setter de Edad
    public int setEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        if (edad <= 16){
            throw new IllegalArgumentException("La edad debe ser mayor a 16 años");
        }
        this.edad = edad;
    }
    
    public String getDocumento(){
        return this.documento;
    }

    public void serDocumento(String documento){
        if(documento == null || documento.isEmpty()){
            throw new IllegalArgumentException("");
        }
        this.documento = documento;
    }
}
