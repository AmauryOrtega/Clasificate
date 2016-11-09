/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.generarReporte;

import modelo.persistencia.Jugador;

/**
 *
 * @author Amaury Ortega
 */
public class Calculo {

    public static String calcular_burpee(Jugador jugador) {
        if (jugador.getMediciones().getBurpeeCantidad() == 0) {
            return "N/A";
        } else if (jugador.getSexo().equals("MASCULINO")) {
            //Masculino
            if (jugador.getMediciones().getBurpeeCantidad() < 25) {
                return "Malo";
            } else if (jugador.getMediciones().getBurpeeCantidad() >= 25 && jugador.getMediciones().getBurpeeCantidad() <= 35) {
                return "Normal";
            } else if (jugador.getMediciones().getBurpeeCantidad() > 35 && jugador.getMediciones().getBurpeeCantidad() <= 45) {
                return "Bueno";
            } else if (jugador.getMediciones().getBurpeeCantidad() > 45 && jugador.getMediciones().getBurpeeCantidad() <= 55) {
                return "Muy Bueno";
            } else if (jugador.getMediciones().getBurpeeCantidad() > 55) {
                return "Excelente";
            }
        } else //Femenino
        {
            if (jugador.getMediciones().getBurpeeCantidad() < 20) {
                return "Malo";
            } else if (jugador.getMediciones().getBurpeeCantidad() >= 20 && jugador.getMediciones().getBurpeeCantidad() <= 30) {
                return "Normal";
            } else if (jugador.getMediciones().getBurpeeCantidad() > 30 && jugador.getMediciones().getBurpeeCantidad() <= 40) {
                return "Bueno";
            } else if (jugador.getMediciones().getBurpeeCantidad() > 40 && jugador.getMediciones().getBurpeeCantidad() <= 50) {
                return "Muy Bueno";
            } else if (jugador.getMediciones().getBurpeeCantidad() > 50) {
                return "Excelente";
            }
        }
        return "N/A";
    }

    public static String calcular_cooper(Jugador jugador) {
        if (jugador.getMediciones().getCooperDistancia() == 0) {
            return "N/A";
        } else if (jugador.getEdad() >= 13 && jugador.getEdad() <= 15) {
            if (jugador.getSexo().equals("MASCULINO")) {
                //Masculino
                if (jugador.getMediciones().getCooperDistancia() > 2700) {
                    return "Muy Bueno";
                } else if (jugador.getMediciones().getCooperDistancia() >= 2400 && jugador.getMediciones().getCooperDistancia() <= 2700) {
                    return "Bueno";
                } else if (jugador.getMediciones().getCooperDistancia() >= 2200 && jugador.getMediciones().getCooperDistancia() < 2400) {
                    return "Normal";
                } else if (jugador.getMediciones().getCooperDistancia() >= 2100 && jugador.getMediciones().getCooperDistancia() < 2200) {
                    return "Bajo";
                } else if (jugador.getMediciones().getCooperDistancia() < 2100) {
                    return "Muy Bajo";
                }
            } else //Femenino
            {
                if (jugador.getMediciones().getCooperDistancia() > 2000) {
                    return "Muy Bueno";
                } else if (jugador.getMediciones().getCooperDistancia() >= 1900 && jugador.getMediciones().getCooperDistancia() <= 2000) {
                    return "Bueno";
                } else if (jugador.getMediciones().getCooperDistancia() >= 1600 && jugador.getMediciones().getCooperDistancia() < 1900) {
                    return "Normal";
                } else if (jugador.getMediciones().getCooperDistancia() >= 1500 && jugador.getMediciones().getCooperDistancia() < 1600) {
                    return "Bajo";
                } else if (jugador.getMediciones().getCooperDistancia() < 1500) {
                    return "Muy Bajo";
                }
            }
        } else if (jugador.getEdad() > 15 && jugador.getEdad() <= 19) {
            if (jugador.getSexo().equals("MASCULINO")) {
                //Masculino
                if (jugador.getMediciones().getCooperDistancia() > 2800) {
                    return "Muy Bueno";
                } else if (jugador.getMediciones().getCooperDistancia() >= 2500 && jugador.getMediciones().getCooperDistancia() <= 2800) {
                    return "Bueno";
                } else if (jugador.getMediciones().getCooperDistancia() >= 2300 && jugador.getMediciones().getCooperDistancia() < 2500) {
                    return "Normal";
                } else if (jugador.getMediciones().getCooperDistancia() >= 2200 && jugador.getMediciones().getCooperDistancia() < 2300) {
                    return "Bajo";
                } else if (jugador.getMediciones().getCooperDistancia() < 2200) {
                    return "Muy Bajo";
                }
            } else //Femenino
            {
                if (jugador.getMediciones().getCooperDistancia() > 2100) {
                    return "Muy Bueno";
                } else if (jugador.getMediciones().getCooperDistancia() >= 2000 && jugador.getMediciones().getCooperDistancia() <= 2100) {
                    return "Bueno";
                } else if (jugador.getMediciones().getCooperDistancia() >= 1900 && jugador.getMediciones().getCooperDistancia() < 2000) {
                    return "Normal";
                } else if (jugador.getMediciones().getCooperDistancia() >= 1600 && jugador.getMediciones().getCooperDistancia() < 1900) {
                    return "Bajo";
                } else if (jugador.getMediciones().getCooperDistancia() < 1600) {
                    return "Muy Bajo";
                }
            }
        }
        return "N/A";
    }

    public static String calcular_elasticidad(Jugador jugador) {
        if (jugador.getMediciones().getElasticidadCantidad() == -100) {
            return "N/A";
        } else if (jugador.getSexo().equals("MASCULINO")) {
            //Masculino
            if (jugador.getMediciones().getElasticidadCantidad() > 27) {
                return "Superior";
            } else if (jugador.getMediciones().getElasticidadCantidad() >= 17 && jugador.getMediciones().getElasticidadCantidad() <= 27) {
                return "Excelente";
            } else if (jugador.getMediciones().getElasticidadCantidad() >= 6 && jugador.getMediciones().getElasticidadCantidad() <= 16) {
                return "Buena";
            } else if (jugador.getMediciones().getElasticidadCantidad() >= 0 && jugador.getMediciones().getElasticidadCantidad() <= 5) {
                return "Promedio";
            } else if (jugador.getMediciones().getElasticidadCantidad() >= -8 && jugador.getMediciones().getElasticidadCantidad() <= -1) {
                return "Deficiente";
            } else if (jugador.getMediciones().getElasticidadCantidad() >= -19 && jugador.getMediciones().getElasticidadCantidad() <= -9) {
                return "Pobre";
            } else if (jugador.getMediciones().getElasticidadCantidad() <= 20) {
                return "Muy Pobre";
            }
        } else //Femenino
         if (jugador.getMediciones().getElasticidadCantidad() > 30) {
                return "Superior";
            } else if (jugador.getMediciones().getElasticidadCantidad() >= 21 && jugador.getMediciones().getElasticidadCantidad() <= 30) {
                return "Excelente";
            } else if (jugador.getMediciones().getElasticidadCantidad() >= 11 && jugador.getMediciones().getElasticidadCantidad() <= 20) {
                return "Buena";
            } else if (jugador.getMediciones().getElasticidadCantidad() >= 1 && jugador.getMediciones().getElasticidadCantidad() <= 10) {
                return "Promedio";
            } else if (jugador.getMediciones().getElasticidadCantidad() >= -7 && jugador.getMediciones().getElasticidadCantidad() <= 0) {
                return "Deficiente";
            } else if (jugador.getMediciones().getElasticidadCantidad() >= -14 && jugador.getMediciones().getElasticidadCantidad() <= -8) {
                return "Pobre";
            } else if (jugador.getMediciones().getElasticidadCantidad() <= 15) {
                return "Muy Pobre";
            }
        return "N/A";
    }

    public static String calcular_fuerzaBrazos(Jugador jugador) {
        if (jugador.getMediciones().getFuerzaBrazosCantidad() == 0) {
            return "N/A";
        } else if (jugador.getEdad() >= 15 && jugador.getEdad() <= 16) {
            if (jugador.getSexo().equals("MASCULINO")) {
                //Masculino
                if (jugador.getMediciones().getFuerzaBrazosCantidad() > 35) {
                    return "Muy Bueno";
                } else if (jugador.getMediciones().getFuerzaBrazosCantidad() >= 25 && jugador.getMediciones().getFuerzaBrazosCantidad() <= 35) {
                    return "Bueno";
                } else if (jugador.getMediciones().getFuerzaBrazosCantidad() >= 15 && jugador.getMediciones().getFuerzaBrazosCantidad() < 24) {
                    return "Normal";
                } else if (jugador.getMediciones().getFuerzaBrazosCantidad() >= 5 && jugador.getMediciones().getFuerzaBrazosCantidad() < 14) {
                    return "Bajo";
                } else if (jugador.getMediciones().getFuerzaBrazosCantidad() < 5) {
                    return "Muy Bajo";
                }
            } else //Femenino
            {
                if (jugador.getMediciones().getFuerzaBrazosCantidad() > 25) {
                    return "Muy Bueno";
                } else if (jugador.getMediciones().getFuerzaBrazosCantidad() >= 18 && jugador.getMediciones().getFuerzaBrazosCantidad() <= 25) {
                    return "Bueno";
                } else if (jugador.getMediciones().getFuerzaBrazosCantidad() >= 12 && jugador.getMediciones().getFuerzaBrazosCantidad() < 17) {
                    return "Normal";
                } else if (jugador.getMediciones().getFuerzaBrazosCantidad() >= 4 && jugador.getMediciones().getFuerzaBrazosCantidad() < 11) {
                    return "Bajo";
                } else if (jugador.getMediciones().getFuerzaBrazosCantidad() < 4) {
                    return "Muy Bajo";
                }
            }
        } else if (jugador.getEdad() > 17 && jugador.getEdad() <= 20) {
            if (jugador.getSexo().equals("MASCULINO")) {
                //Masculino
                if (jugador.getMediciones().getFuerzaBrazosCantidad() > 40) {
                    return "Muy Bueno";
                } else if (jugador.getMediciones().getFuerzaBrazosCantidad() >= 25 && jugador.getMediciones().getFuerzaBrazosCantidad() <= 40) {
                    return "Bueno";
                } else if (jugador.getMediciones().getFuerzaBrazosCantidad() >= 15 && jugador.getMediciones().getFuerzaBrazosCantidad() < 24) {
                    return "Normal";
                } else if (jugador.getMediciones().getFuerzaBrazosCantidad() >= 5 && jugador.getMediciones().getFuerzaBrazosCantidad() < 14) {
                    return "Bajo";
                } else if (jugador.getMediciones().getFuerzaBrazosCantidad() < 5) {
                    return "Muy Bajo";
                }
            } else //Femenino
            {
                if (jugador.getMediciones().getFuerzaBrazosCantidad() > 30) {
                    return "Muy Bueno";
                } else if (jugador.getMediciones().getFuerzaBrazosCantidad() >= 20 && jugador.getMediciones().getFuerzaBrazosCantidad() <= 30) {
                    return "Bueno";
                } else if (jugador.getMediciones().getFuerzaBrazosCantidad() >= 12 && jugador.getMediciones().getFuerzaBrazosCantidad() < 19) {
                    return "Normal";
                } else if (jugador.getMediciones().getFuerzaBrazosCantidad() >= 5 && jugador.getMediciones().getFuerzaBrazosCantidad() < 11) {
                    return "Bajo";
                } else if (jugador.getMediciones().getFuerzaBrazosCantidad() < 5) {
                    return "Muy Bajo";
                }
            }
        }
        return "N/A";
    }

    public static String calcular_ruffier(Jugador jugador) {
        if (jugador.getMediciones().getRuffierP1() == 0 || jugador.getMediciones().getRuffierP2() == 0 || jugador.getMediciones().getRuffierP3() == 0) {
            return "N/A";
        } else {
            float ruffier = ((jugador.getMediciones().getRuffierP1() + jugador.getMediciones().getRuffierP2() + jugador.getMediciones().getRuffierP3()) - (200)) / 10;
            if (ruffier >= 1 && ruffier <= 5) {
                return "Resistencia Buena";
            } else if (ruffier > 5 && ruffier <= 10) {
                return "Resistencia Mediana";
            } else if (ruffier > 10 && ruffier <= 20) {
                return "Resistencia Mala";
            } else {
                return "N/A";
            }
        }
    }

    public static String calcular_saltoAlto(Jugador jugador) {
        if (jugador.getMediciones().getSaltoAltoDistancia() != 0) {
            if (jugador.getSexo().equals("MASCULINO")) {
                //Masculino
                if (jugador.getMediciones().getSaltoAltoDistancia() > 65) {
                    return "Excelente";
                } else if (jugador.getMediciones().getSaltoAltoDistancia() >= 56 && jugador.getMediciones().getSaltoAltoDistancia() <= 65) {
                    return "Bueno";
                } else if (jugador.getMediciones().getSaltoAltoDistancia() >= 41 && jugador.getMediciones().getSaltoAltoDistancia() <= 55) {
                    return "Mediano";
                } else if (jugador.getMediciones().getSaltoAltoDistancia() >= 30 && jugador.getMediciones().getSaltoAltoDistancia() <= 40) {
                    return "Bajo";
                } else if (jugador.getMediciones().getSaltoAltoDistancia() < 30) {
                    return "Pobre";
                }
            } else //Femenino
             if (jugador.getMediciones().getSaltoAltoDistancia() > 55) {
                    return "Excelente";
                } else if (jugador.getMediciones().getSaltoAltoDistancia() >= 41 && jugador.getMediciones().getSaltoAltoDistancia() <= 55) {
                    return "Bueno";
                } else if (jugador.getMediciones().getSaltoAltoDistancia() >= 33 && jugador.getMediciones().getSaltoAltoDistancia() <= 40) {
                    return "Mediano";
                } else if (jugador.getMediciones().getSaltoAltoDistancia() >= 26 && jugador.getMediciones().getSaltoAltoDistancia() <= 32) {
                    return "Bajo";
                } else if (jugador.getMediciones().getSaltoAltoDistancia() <= 25) {
                    return "Pobre";
                }
        }
        return "N/A";
    }

    public static String calcular_saltoLargo(Jugador jugador) {
        if (jugador.getMediciones().getSaltoLargoDistancia() == 0) {
            return "N/A";
        } else if (jugador.getEdad() == 15 || jugador.getEdad() == 16) {
            if (jugador.getSexo().equals("MASCULINO")) {
                //Masculino
                if (jugador.getMediciones().getSaltoLargoDistancia() >= 2.3) {
                    return "Muy Bueno";
                } else if (jugador.getMediciones().getSaltoLargoDistancia() >= 2.10 && jugador.getMediciones().getSaltoLargoDistancia() < 2.3) {
                    return "Bueno";
                } else if (jugador.getMediciones().getSaltoLargoDistancia() >= 2.0 && jugador.getMediciones().getSaltoLargoDistancia() < 2.1) {
                    return "Normal";
                } else if (jugador.getMediciones().getSaltoLargoDistancia() >= 1.9 && jugador.getMediciones().getSaltoLargoDistancia() < 2.0) {
                    return "Bajo";
                } else if (jugador.getMediciones().getSaltoLargoDistancia() < 1.9) {
                    return "Muy Bajo";
                }
            } else //Femenino
             if (jugador.getMediciones().getSaltoLargoDistancia() >= 1.8) {
                    return "Muy Bueno";
                } else if (jugador.getMediciones().getSaltoLargoDistancia() >= 1.7 && jugador.getMediciones().getSaltoLargoDistancia() < 1.8) {
                    return "Bueno";
                } else if (jugador.getMediciones().getSaltoLargoDistancia() >= 1.6 && jugador.getMediciones().getSaltoLargoDistancia() < 1.7) {
                    return "Normal";
                } else if (jugador.getMediciones().getSaltoLargoDistancia() >= 1.5 && jugador.getMediciones().getSaltoLargoDistancia() < 1.6) {
                    return "Bajo";
                } else if (jugador.getMediciones().getSaltoLargoDistancia() < 1.5) {
                    return "Muy Bajo";
                }
        } else if (jugador.getEdad() >= 17 && jugador.getEdad() <= 20) {
            if (jugador.getSexo().equals("MASCULINO")) {
                //Masculino
                if (jugador.getMediciones().getSaltoLargoDistancia() >= 2.4) {
                    return "Muy Bueno";
                } else if (jugador.getMediciones().getSaltoLargoDistancia() >= 2.20 && jugador.getMediciones().getSaltoLargoDistancia() < 2.4) {
                    return "Bueno";
                } else if (jugador.getMediciones().getSaltoLargoDistancia() >= 2.1 && jugador.getMediciones().getSaltoLargoDistancia() < 2.2) {
                    return "Normal";
                } else if (jugador.getMediciones().getSaltoLargoDistancia() >= 2.0 && jugador.getMediciones().getSaltoLargoDistancia() < 2.1) {
                    return "Bajo";
                } else if (jugador.getMediciones().getSaltoLargoDistancia() < 2) {
                    return "Muy Bajo";
                }
            } else //Femenino
             if (jugador.getMediciones().getSaltoLargoDistancia() >= 1.9) {
                    return "Muy Bueno";
                } else if (jugador.getMediciones().getSaltoLargoDistancia() >= 1.8 && jugador.getMediciones().getSaltoLargoDistancia() < 1.9) {
                    return "Bueno";
                } else if (jugador.getMediciones().getSaltoLargoDistancia() >= 1.7 && jugador.getMediciones().getSaltoLargoDistancia() < 1.8) {
                    return "Normal";
                } else if (jugador.getMediciones().getSaltoLargoDistancia() >= 1.6 && jugador.getMediciones().getSaltoLargoDistancia() < 1.7) {
                    return "Bajo";
                } else if (jugador.getMediciones().getSaltoLargoDistancia() < 1.6) {
                    return "Muy Bajo";
                }
        }
        return "N/A";
    }

    static String calcular_IMC(Jugador jugador) {
        float imc = jugador.getPeso() / (jugador.getAltura() * jugador.getAltura());
        if (imc >= 0 && imc <= 5) {
            return "Delgadez III";
        } else if (imc > 5 && imc <= 10) {
            return "Delgadez II";
        } else if (imc > 10 && imc <= 18.5) {
            return "Delgadez I";
        } else if (imc > 18.5 && imc <= 24.9) {
            return "Peso Normal";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            return "Obesidad I";
        } else if (imc >= 35 && imc <= 39.9) {
            return "Obesidad II";
        } else if (imc >= 40) {
            return "Obesidad II";
        }
        return "N/A";
    }
}
