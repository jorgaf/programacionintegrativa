package ec.edu.utpl.pintegrativa.semistructured.json.read.model;

public class Direccion {
    private String ciudad;
    private String caller;
    private String numero;

    public Direccion() {
    }

    public Direccion(String ciudad, String caller, String numero) {
        this.ciudad = ciudad;
        this.caller = caller;
        this.numero = numero;
    }
    //Get y set de todos los atributos.

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
