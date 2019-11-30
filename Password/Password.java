import java.util.Scanner;
/**
 * Contrasena Class
 *
 * @author Chávez Sánchez Kevin Edilberto
 * @version 2019 11 29 
 */
public class Password
{
    // instance variables 
    static String pass;
    /**
     * Constructor for objects of class Password
     */
    public Password()
    {
        // initialise instance variables
        
    }

    /**
     * Este metodo compara las contraseñas
     *
     * @param
     * @return comparacion entre pass y otro String
     */
    public String verif()
    {
        // put your code here
        int intentos = 0;
        Scanner leer = new Scanner(System.in);
        String Password ="";
        String pass = "Mis creditos";
        do{
            System.out.println("Introduce tu contraseña");
            Password = leer.nextLine();
            if(pass.equals(Password)){
                System.out.println("Contraseña chingona");
                return "";
                }
                else
            intentos++;
        }while(intentos < 3);
        
        System.out.println("No vuelvas a intentarlo");
        return "";
    }

}
