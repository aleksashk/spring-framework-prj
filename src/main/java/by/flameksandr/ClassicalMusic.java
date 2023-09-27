package by.flameksandr;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("factory-method running");
        return new ClassicalMusic();
    }

    public void initialization() {
        System.out.println("Initialization");
    }

    public void destruction() {
        System.out.println("Destruction");
    }

    @Override
    public String getSong() {
        return "Playing Hungarian rhapsody";
    }
}
