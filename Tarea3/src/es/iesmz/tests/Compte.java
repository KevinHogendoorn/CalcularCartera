package es.iesmz.tests;

import java.math.BigInteger;

public class Compte {
    private String iban;
    private String titular;
    BigInteger numIBAN = new BigInteger("0");
    BigInteger modo = new BigInteger("97");
    private boolean valido = false;
    private int resto = 0;
    private int dc = 0;
    private String  cad = "";

    public Compte(String iban, String titular) {
        this.iban = iban;
        this.titular = titular;
    }

    public Compte() {

    }

    boolean compruebaIBAN(String iban){
        if (iban.length() == 24 && iban.substring(0,1).toUpperCase().equals("E") && iban.substring(1,2).toUpperCase().equals("S")){
            if (valido){
                numIBAN = new BigInteger(iban.substring(4,24)+"142800");
                resto = numIBAN.mod(modo).intValue();
                dc = 98 - resto;
                cad = String.valueOf(dc);
            }

            if (dc < 10){
                cad = "0" + cad;
            }

            if (iban.substring(2,4).equals(cad)){
                valido = true;
            } else {
                valido = false;
            }
        }
        return valido;
    }

    String generaIBAN(String entidad, String oficina, String dc, String cuenta){
        int xx, sum;
        if (entidad.length() == 4 && oficina.length() == 4 && dc.length() == 2 && cuenta.length() == 10){
            sum = Integer.parseInt(entidad + oficina +  dc +  cuenta + 142800);
            xx = (sum/97) - 98;
            return "ES" + xx + entidad + oficina +  dc +  cuenta;
        } else{
            return null;
        }
    }

}
