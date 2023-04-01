package producto;

public class Envio {
    private String direccion;

    public Envio(String direccion) {
        this.direccion = direccion;
    }

    public double calcularCostoEnvio(double distancia) {
        //Supongamos que el costo de envío es de $5 por kilómetro
        return distancia * 5;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}