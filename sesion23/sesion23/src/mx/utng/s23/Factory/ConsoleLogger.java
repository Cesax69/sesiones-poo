package mx.utng.s23.Factory;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String msg) {
        System.out.println(msg);
        
    }
    
}
