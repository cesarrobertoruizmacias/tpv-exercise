package oop.inheritance.verifone.vx690;

public class VerifoneVx690Keyboard {

    private static VerifoneVx690Keyboard instance;

    // Constructor privado
    private VerifoneVx690Keyboard() {
    }

    public static VerifoneVx690Keyboard getInstance() {
        if (instance == null) {
            instance = new VerifoneVx690Keyboard();
        }
        return instance;
    }

    public String get(){
        return "Key pressed";
    }
}
