import net.salesianos.productos.Producto;

public class App {
    public static void main(String[] args) throws Exception {
      //creamos un producto
      Producto p1 = new Producto("Manzana", "2024-12-31", 95);
        //mostramos su informacion
      p1.mostrarInformacion();
        //comprobamos si es apto para dieta
        if (p1.esAptoParaDieta()) {
            System.out.println("El producto es apto para dieta.");
        } else {
            System.out.println("El producto no es apto para dieta.");
        }
    } 
}
