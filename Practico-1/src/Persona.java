public class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;

     public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona (){
        
    }
    public String getNombre(){
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
    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        if (edad <= 16){
            throw new IllegalArgumentException("La edad debe ser mayor a 16 años");
        }
        this.edad = edad;
    }
    
}
