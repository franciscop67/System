import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try { // Necesitamos esto parea validar que el archivo exista
            FileInputStream archivo = new FileInputStream("src/config.properties"); //Permite la lectura del archivo
            Properties p = new Properties(System.getProperties());// Agregamos todas las configuraciones
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties"); //Otra manera en lugar del archivo config.properties
            System.setProperties(p); //Se obtienen las configuraciones actualizadas

            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(...) = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));//Obtenemos las configuraciones
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));


            ps.list(System.out); //Listamos las configuraciones
        }catch (Exception e){
            System.err.println("No existe el archivo = " + e); //err para errores
            System.exit(1); //Si ocurre un error sale
        }


    }
}
