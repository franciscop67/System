import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        Map <String, String> varEnv = System.getenv(); //Mapeamos todas nuestras variables del ambiente
        System.out.println("Variables de ambiente del sistema = " + varEnv); //Las mostramos

        System.out.println("----- Listando variables de entorno del sistema -----");
        for (String key:varEnv.keySet()) {
            System.out.println(key + "=>" + varEnv.get(key));
        }

        String username = System.getenv("USER"); // Se solicita la variable
        System.out.println("username = " + username); // Muestra variable solicitada

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String path = System.getenv("PATH");
        System.out.println("path = " + path);

        //Otra forma
        String path2 = varEnv.get("PATH"); //La variable debe ser la misma tal y como está en el S.O
        System.out.println("path = " + path2);


        

    }
}
