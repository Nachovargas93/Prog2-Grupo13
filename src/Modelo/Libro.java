package Modelo;



public class Libro {
    
    private String Editorial;
    private String Titulo;
    private float Precio;

    public Libro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEditorial() {
        return Editorial;
    }

    public String getTitulo() {
        return Titulo;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Libro{" + "Editorial=" + Editorial + ", Titulo=" + Titulo + ", Precio=" + Precio + '}';
    }

    public Libro(String Editorial, String Titulo, float Precio) {
        this.Editorial = Editorial;
        this.Titulo = Titulo;
        this.Precio = Precio;
    }
    
    
    
    
}
