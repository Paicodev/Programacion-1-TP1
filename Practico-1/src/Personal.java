public class Personal extends Persona {
    String departamento;
    String puesto;
    String fechaIngreso;

    public Personal (String nombre, String apellido, int edad, String departamento, String puesto, String fechaIngreso){
        super(nombre, apellido, edad);
        this.departamento = departamento;
        this.puesto = puesto;
        this. fechaIngreso = fechaIngreso;
    }

    public Personal (){
        
    }
    public String getDepartamento(){
        return this.departamento;
    }

    public void setDepartamento(String departamento){
        if (departamento == null || departamento.isEmpty()){
            throw new IllegalArgumentException("El departamento no puede estar vacío");
        }
        this.departamento = departamento;
    }

    public String getPuesto(){
        return this.departamento;
    }

    public void setPuesto(String puesto){
        if (puesto == null || puesto.isEmpty()){
            throw new IllegalArgumentException("El puesto no puede estar vacío");
        }
        this.puesto = puesto;
    }

    public String getFechaIngreso(){
        return this.fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso){
        if (fechaIngreso == null || fechaIngreso.isEmpty()){
            throw new IllegalArgumentException("La fecha de ingreso no puede estar vacía");
        }
        this.fechaIngreso = fechaIngreso;
    }

}

