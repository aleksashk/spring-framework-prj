package by.flameksandr;

public class ClassicalMusic implements Music{

    public void initialization(){
        System.out.println("Initialization");
    }

    public void destruction(){
        System.out.println("Destruction");
    }

    @Override
    public String getSong() {
        return "Playing Hungarian rhapsody";
    }
}
