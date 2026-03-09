package net.salesianos.productos;

public class Producto {
    private String nombre;
    private String fechaCaducidad;
    private int numCalorias;

    protected static int caloriasTotales = 0;

    public Producto(String nombre, String fechaCaducidad, int numCalorias) {
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
        this.numCalorias = numCalorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumCalorias() {
        return numCalorias;
    }

    public void setNumCalorias(int numCalorias) {
        this.numCalorias = numCalorias;
    }

    public static int getCaloriasTotales() {
        return caloriasTotales;
    }

    public static void sumarCalorias(int calorias) {
        caloriasTotales += calorias;
    }

    public static void mostrarCaloriasTotales() {
        System.out.println("Calorías totales acumuladas en la dieta: " + caloriasTotales);
    }

    public void mostrarInformacion() {
        System.out.println("Producto");
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
        System.out.println("Número de calorías: " + numCalorias);
    }

    public boolean esAptoParaDieta() {
        return numCalorias < 300;
    }
}
