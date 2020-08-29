import java.util.Date;
import java.util.List;

public class Vuelo {
    private String codigoVuelo;
    private Date salida;
    private List<Billete> billetes;
    private Aeropuerto originen;
    private Aeropuerto destino;

    public Vuelo(String codigoVuelo, Date salida, List<Billete> billetes, Aeropuerto originen, Aeropuerto destino) {
        this.codigoVuelo = codigoVuelo;
        this.salida = salida;
        this.billetes = billetes;
        this.originen = originen;
        this.destino = destino;
    }

    public Vuelo(String codigoVuelo, Date salida, Aeropuerto originen, Aeropuerto destino) {
        this.codigoVuelo = codigoVuelo;
        this.salida = salida;
        this.originen = originen;
        this.destino = destino;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public List<Billete> getBilletes() {
        return billetes;
    }

    public void setBilletes(List<Billete> billetes) {
        this.billetes = billetes;
    }

    public Aeropuerto getOriginen() {
        return originen;
    }

    public void setOriginen(Aeropuerto originen) {
        this.originen = originen;
    }

    public Aeropuerto getDestino() {
        return destino;
    }

    public void setDestino(Aeropuerto destino) {
        this.destino = destino;
    }
}
