import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {

        String username = System.getProperty("user.name"); //Muestra el nombre de usuario
        System.out.println("username = " + username);

        String home = System.getProperty("user.home"); //Muestra la ruta del usuario
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir"); //Muestra el directorio
        System.out.println("workspace = " + workspace);

        String java =  System.getProperty("java.version"); //Te muestra la version de java que tienes
        System.out.println("java = " + java);

        String lineSeparator =  System.getProperty("line.separator"); //Crea un salto de linea
        String lineSeparator2 =  System.lineSeparator(); //Realiza lo mismo
        System.out.println("lineSeparator:" + lineSeparator2 + "Una linea nueva ...");

        Properties p = System.getProperties(); //Muestra todas las caracteristicas
        p.list(System.out);
    }
}
