package oop.inheritance.verifone.vx520;

public class VerifoneVx520Keyboard {

    private static VerifoneVx520Keyboard instance;

    // Constructor privado
    private VerifoneVx520Keyboard() {
    }

    public static VerifoneVx520Keyboard getInstance() {
        if (instance == null) {
            instance = new VerifoneVx520Keyboard();
        }
        return instance;
    }

    public String get(){
        return "Key pressed";
    }
}
