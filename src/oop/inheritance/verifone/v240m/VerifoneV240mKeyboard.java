package oop.inheritance.verifone.v240m;

public class VerifoneV240mKeyboard {

    private static VerifoneV240mKeyboard instance;

    // Constructor privado
    private VerifoneV240mKeyboard() {
    }

    public static VerifoneV240mKeyboard getInstance() {
        if (instance == null) {
            instance = new VerifoneV240mKeyboard();
        }
        return instance;
    }

    public String get(){
        return "Key pressed";
    }
}
