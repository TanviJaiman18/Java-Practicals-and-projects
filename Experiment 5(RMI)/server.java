import java.rmi.Naming;
public class server {
    public static void main(String[]args) {
        try {
        Calculatorimpl obj = new Calculatorimpl();
        Naming.rebind("rmi://localhost/Calculator",obj);
        System.out.println("RMI server started...");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}

