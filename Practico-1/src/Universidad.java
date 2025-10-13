public class Universidad {
    private String nombre;
    private String direccion;
    private MiembroUniversidad[] miembros;
    private int cantidadMiembros;
    private int indice;

    // Constructor con parámetros
    public Universidad(String nombre, String direccion, int capacidadMaxima) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.miembros = new MiembroUniversidad[capacidadMaxima];
        this.cantidadMiembros = 0;
        this.indice = 0;
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

    public boolean agregarMiembro(MiembroUniversidad miembro){
        if(cantidadMiembros < miembros.length){
            miembros[cantidadMiembros] = miembro;
            cantidadMiembros++;
            return true;
        }else {
            System.out.println("No se pueden agregar mas miembros. Capacidad máxima alcanzada");
            return false;
        }
    }

    public void listarMiembros(){
        System.out.println("Miembros de la Universdiad: "+ nombre + " :");
        for(int i = 0; i < miembros.length; i++){
            System.out.println("- "+ miembros[i].obtenerInformacionCompleta());
        }
    }

    public void buscarPorRol(String rolBuscado) {
        System.out.println("Buscando miembros con el rol de: "+ rolBuscado);
        for(int i = 0; i< cantidadMiembros; i++){
            if(miembros[i].obtenerRol().equalsIgnoreCase(rolBuscado)){
                System.out.println(miembros[i].obtenerInformacionCompleta());
            }
        }
    }

    public Persona buscarPorDocumento(String documento){
        for(int i = 0; i < miembros.length; i++){
            Persona p = (Persona) miembros[i];
            if(documento.equals(p.getDocumento())){
                return p;
            }
        }
        return null;
    }
}
