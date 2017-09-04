package Modelo;



public class Usuario {
   private String Nombre;
   private String Apellido;
   private int DNI;

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public Usuario(String Nombre, String Apellido, int DNI) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Usuario: " + " Nombre: " + Nombre + "    Apellido: " + Apellido + "    DNI: " + DNI + '}';
    }

   
           
}
