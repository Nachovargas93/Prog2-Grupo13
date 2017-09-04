package Modelo;

public class Cliente {

    private String Nombre;
    private String Apellido;
    private int DNI;
    private String Direccion;
    private long Telefono;
    private int CodigoPostal;
    private double Importe;
    private String Correo;

    public Cliente(String Nombre, String Apellido, int DNI, String Direccion, long Telefono, int CodigoPostal, double Importe, String Correo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DNI = DNI;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.CodigoPostal = CodigoPostal;
        this.Importe = Importe;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public long getTelefono() {
        return Telefono;
    }

    public void setTelefono(long Telefono) {
        this.Telefono = Telefono;
    }

    public int getCodigoPostal() {
        return CodigoPostal;
    }

    public void setCodigoPostal(int CodigoPostal) {
        this.CodigoPostal = CodigoPostal;
    }

    public double getImporte() {
        return Importe;
    }

    public void setImporte(double Importe) {
        this.Importe = Importe;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", DNI=" + DNI + ", Direccion=" + Direccion + ", Telefono=" + Telefono + ", CodigoPostal=" + CodigoPostal + ", Importe=" + Importe + ", Correo=" + Correo + '}';
    }

    public Cliente() {
    }

    
    
  
    
}
