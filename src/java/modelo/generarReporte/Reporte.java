package modelo.generarReporte;

import modelo.persistencia.Jugador;

public class Reporte {

    private String resultado_burpee;
    private String resultado_cooper;
    private String resultado_elasticidad;
    private String resultado_fuerzaBrazos;
    private String resultado_ruffier;
    private String resultado_salgoLargo;
    private String resultado_saltoAlto;
    private String resultado_IMC;

    public Reporte(Jugador jugador) {
        resultado_burpee = Calculo.calcular_burpee(jugador);
        resultado_cooper = Calculo.calcular_cooper(jugador);
        resultado_elasticidad = Calculo.calcular_elasticidad(jugador);
        resultado_fuerzaBrazos = Calculo.calcular_fuerzaBrazos(jugador);
        resultado_ruffier = Calculo.calcular_ruffier(jugador);
        resultado_salgoLargo = Calculo.calcular_saltoLargo(jugador);
        resultado_saltoAlto = Calculo.calcular_saltoAlto(jugador);
        resultado_IMC = Calculo.calcular_IMC(jugador);
    }

    public String getResultado_burpee() {
        return resultado_burpee;
    }

    public void setResultado_burpee(String resultado_burpee) {
        this.resultado_burpee = resultado_burpee;
    }

    public String getResultado_cooper() {
        return resultado_cooper;
    }

    public void setResultado_cooper(String resultado_cooper) {
        this.resultado_cooper = resultado_cooper;
    }

    public String getResultado_elasticidad() {
        return resultado_elasticidad;
    }

    public void setResultado_elasticidad(String resultado_elasticidad) {
        this.resultado_elasticidad = resultado_elasticidad;
    }

    public String getResultado_fuerzaBrazos() {
        return resultado_fuerzaBrazos;
    }

    public void setResultado_fuerzaBrazos(String resultado_fuerzaBrazos) {
        this.resultado_fuerzaBrazos = resultado_fuerzaBrazos;
    }

    public String getResultado_ruffier() {
        return resultado_ruffier;
    }

    public void setResultado_ruffier(String resultado_ruffier) {
        this.resultado_ruffier = resultado_ruffier;
    }

    public String getResultado_salgoLargo() {
        return resultado_salgoLargo;
    }

    public void setResultado_salgoLargo(String resultado_salgoLargo) {
        this.resultado_salgoLargo = resultado_salgoLargo;
    }

    public String getResultado_saltoAlto() {
        return resultado_saltoAlto;
    }

    public void setResultado_saltoAlto(String resultado_saltoAlto) {
        this.resultado_saltoAlto = resultado_saltoAlto;
    }

    public String getResultado_IMC() {
        return resultado_IMC;
    }

    public void setResultado_IMC(String resultado_IMC) {
        this.resultado_IMC = resultado_IMC;
    }

    @Override
    public String toString() {
        return "Reporte{" + "resultado_burpee=" + resultado_burpee + ", resultado_cooper=" + resultado_cooper + ", resultado_elasticidad=" + resultado_elasticidad + ", resultado_fuerzaBrazos=" + resultado_fuerzaBrazos + ", resultado_ruffier=" + resultado_ruffier + ", resultado_salgoLargo=" + resultado_salgoLargo + ", resultado_saltoAlto=" + resultado_saltoAlto + ", resultado_IMC=" + resultado_IMC + '}';
    }

}
