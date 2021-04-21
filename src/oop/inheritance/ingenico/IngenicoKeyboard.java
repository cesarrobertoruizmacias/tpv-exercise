package oop.inheritance.ingenico;

public class IngenicoKeyboard {

    private static IngenicoKeyboard instance;

    // Constructor privado
    private IngenicoKeyboard() {
    }

    public static IngenicoKeyboard getInstance() {
        if (instance == null) {
            instance = new IngenicoKeyboard();
        }
        return instance;
    }

    /**
     * @return key pressed
     */
    public String get() {
        return "Key pressed";
    }
}
