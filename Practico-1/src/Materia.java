public class Materia {
    private int id;
    private String nombre;
    private String codigo;
    private int creditos;
    private double calificacion;

// Constructor con parámetros
    public Materia(String nombre, String codigo, int creditos, double calificacion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.calificacion = calificacion;
    }

    public Materia(){

    }
    //Getters y Setters//
    //Getters y Setters de nombre
    public String getNombre() { 
        return nombre;
     }
    public void setNombre(String nombre) {
         this.nombre = nombre; 
        }
    //Getters y Setters de codigo
    public String getCodigo() { 
        return codigo; 
    }
    public void setCodigo(String codigo) {
         this.codigo = codigo; 
        }
    //Getters y Setters de creditos
    public int getCreditos() {
         return creditos; 
    }
    public void setCreditos(int creditos) { 
        this.creditos = creditos;
     }
    //Getters y Setters de calificacion
    public double getCalificacion() { 
        return calificacion;
     }
    public void setCalificacion(double calificacion) {
         this.calificacion = calificacion; 
        }

    }
