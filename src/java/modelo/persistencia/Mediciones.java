/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

/**
 *
 * @author Amaury Ortega
 */
public class Mediciones {

    private int burpeeCantidad;
    private float cooperDistancia;
    private int elasticidadCantidad;
    private int fuerzaBrazosCantidad;
    private float ruffierP1;
    private float ruffierP2;
    private float ruffierP3;
    private float saltoAltoDistancia;
    private float saltoLargoDistancia;

    public Mediciones(int burpeeCantidad, float cooperDistancia, int elasticidadCantidad, int fuerzaBrazosCantidad, float ruffierP1, float ruffierP2, float ruffierP3, float saltoAltoDistancia, float saltoLargoDistancia) {
        this.burpeeCantidad = burpeeCantidad;
        this.cooperDistancia = cooperDistancia;
        this.elasticidadCantidad = elasticidadCantidad;
        this.fuerzaBrazosCantidad = fuerzaBrazosCantidad;
        this.ruffierP1 = ruffierP1;
        this.ruffierP2 = ruffierP2;
        this.ruffierP3 = ruffierP3;
        this.saltoAltoDistancia = saltoAltoDistancia;
        this.saltoLargoDistancia = saltoLargoDistancia;
    }

    public int getBurpeeCantidad() {
        return burpeeCantidad;
    }

    public void setBurpeeCantidad(int burpeeCantidad) {
        this.burpeeCantidad = burpeeCantidad;
    }

    public float getCooperDistancia() {
        return cooperDistancia;
    }

    public void setCooperDistancia(float cooperDistancia) {
        this.cooperDistancia = cooperDistancia;
    }

    public int getElasticidadCantidad() {
        return elasticidadCantidad;
    }

    public void setElasticidadCantidad(int elasticidadCantidad) {
        this.elasticidadCantidad = elasticidadCantidad;
    }

    public int getFuerzaBrazosCantidad() {
        return fuerzaBrazosCantidad;
    }

    public void setFuerzaBrazosCantidad(int fuerzaBrazosCantidad) {
        this.fuerzaBrazosCantidad = fuerzaBrazosCantidad;
    }

    public float getRuffierP1() {
        return ruffierP1;
    }

    public void setRuffierP1(float ruffierP1) {
        this.ruffierP1 = ruffierP1;
    }

    public float getRuffierP2() {
        return ruffierP2;
    }

    public void setRuffierP2(float ruffierP2) {
        this.ruffierP2 = ruffierP2;
    }

    public float getRuffierP3() {
        return ruffierP3;
    }

    public void setRuffierP3(float ruffierP3) {
        this.ruffierP3 = ruffierP3;
    }

    public float getSaltoAltoDistancia() {
        return saltoAltoDistancia;
    }

    public void setSaltoAltoDistancia(float saltoAltoDistancia) {
        this.saltoAltoDistancia = saltoAltoDistancia;
    }

    public float getSaltoLargoDistancia() {
        return saltoLargoDistancia;
    }

    public void setSaltoLargoDistancia(float saltoLargoDistancia) {
        this.saltoLargoDistancia = saltoLargoDistancia;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public String toString() {
        return "Mediciones{" + "burpeeCantidad=" + burpeeCantidad + ", cooperDistancia=" + cooperDistancia + ", elasticidadCantidad=" + elasticidadCantidad + ", fuerzaBrazosCantidad=" + fuerzaBrazosCantidad + ", ruffierP1=" + ruffierP1 + ", ruffierP2=" + ruffierP2 + ", ruffierP3=" + ruffierP3 + ", saltoAltoDistancia=" + saltoAltoDistancia + ", saltoLargoDistancia=" + saltoLargoDistancia + '}';
    }

}
