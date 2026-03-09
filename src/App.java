import net.salesianos.productos.Producto;

public class App {
    public static void main(String[] args) throws Exception {
      //creamos un producto
      Producto p1 = new Producto("Manzana", "2024-12-31", 95);
        //mostramos su informacion
      p1.mostrarInformacion();
    } 
}
