package Modelo;

public class Libro {
    
    private String Editorial;
    private String Titulo;
    private double Precio;
    private int Unidad;

    public Libro(String Editorial, String Titulo, double Precio, int Unidad) {
        this.Editorial = Editorial;
        this.Titulo = Titulo;
        this.Precio = Precio;
        this.Unidad = Unidad;
    }


    public String getEditorial() {
        return Editorial;
    }

    public String getTitulo() {
        return Titulo;
    }

    public double getPrecio() {
        return Precio;
    }

    public int getUnidad() {
        return Unidad;
    }

    public void setUnidad(int Unidad) {
        this.Unidad = Unidad;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Libro{" + "Editorial=" + Editorial + ", Titulo=" + Titulo + ", Precio=" + Precio + ", Unidad=" + Unidad + '}';
    }

  
    
}
