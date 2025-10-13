public class Universidad {
    private String nombre;
    private String direccion;
    private Estudiante[] estudiantes;

    // Constructor con parámetros
    public Universidad(String nombre, String direccion, Estudiante estudiantes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estudiantes = estudiantes;
    }

    public String getNombre(){
    return nombre;
    }
   
   public void setNombre(String nombre){
        if (nombre == null || nombre.isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

     public String getDireccion(){
    return direccion;
    }
   
   public void setDireccion(String direccion){
        if (direccion == null || direccion.isEmpty()){
            throw new IllegalArgumentException("La direccion no puede estar vacía");
        }
        this.direccion = direccion;
    }


}
