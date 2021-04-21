package oop.inheritance.verifone.vx690;

public class VerifoneVx690GPS {

    private static VerifoneVx690GPS instance;

    // Constructor privado
    private VerifoneVx690GPS(){}

    public static VerifoneVx690GPS getInstance(){
        if(instance == null){
            instance = new VerifoneVx690GPS();
        }
        return instance;
    }

    /**
     * Opens a connection using the GPS device
     *
     * @return true if the connection was successfully opened
     */
    public boolean open() {

        return true;
    }

    /**
     * Sends a message to the server
     *
     * @param message message to be sent to the server
     * @return true if the message was sent successfully, false otherwise
     */
    public boolean send(byte[] message) {
        return true;
    }

    /**
     * Method blocks until host send a response or until a timeout is reached.
     *
     * @return Message received from the host. In case of timeout it returns null
     */
    public byte[] receive() {
        return "response".getBytes();
    }

    /**
     * Closes the channel releasing every used resources
     */
    public void close() {

    }
}
