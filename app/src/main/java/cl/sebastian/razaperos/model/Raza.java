package cl.sebastian.razaperos.model;



import java.util.List;

public class Raza {

    private String status;
    private List<String> message;

    public Raza(String status, List<String> message) {
        this.status = status;
        this.message = message;
    }

    public Raza getStatus() {
        return null;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Raza{" +
                "status='" + status + '\'' +
                ", message=" + message +
                '}';
    }
}
