package es.iesmz.tests;

import java.util.Arrays;

public class DiasLluvia {
    boolean[][] calendario = new boolean[12][31];

    boolean registroDia(int dia, int mes, boolean lluvia){
        if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12){
            calendario [mes][dia] = lluvia;
            return true;
        } else {
            return false;
        }
    }

    boolean consultarDia (int dia, int mes){
        return calendario[mes][dia];
    }

    int contarDiasLluvios(){
        int cantidad = 0;

        for (int i = 0; i < calendario.length; i++) {
            for (int k = 0; k < calendario.length; k++) {
                if (calendario[i][k]){
                    cantidad++;
                }
            }
        }
        return cantidad;
    }

    int trimestreLluvioso(){
        int tri1 = 0;
        int tri2 = 0;
        int tri3 = 0;
        int tri4 = 0;

        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario.length; j++) {
                if (i < 3){
                    if (calendario[i][j]){
                        tri1++;
                    }
                } else if (i < 6){
                    if (calendario[i][j]){
                        tri2++;
                    }
                } else if (i < 9){
                    if (calendario[i][j]){
                        tri3++;
                    }
                } else if (i < 12){
                    if (calendario[i][j]){
                        tri4++;
                    }
                }
            }
        }

        if (tri1 > tri2 && tri1 > tri3 && tri1 > tri4){
            return tri1;
        } else if (tri2 > tri1 && tri2 > tri3 && tri2 > tri4){
            return tri2;
        } else if (tri3 > tri1 && tri3 > tri2 && tri3 > tri4){
            return tri3;
        } else {
            return tri4;
        }
    }

    int primerDiaLluvia() {
        int cont = 0;
        int dia = 0;

        do {
            for (int i = 0; i < calendario.length; i++) {
                for (int j = 0; j < calendario.length; j++) {
                    if (calendario[i][j]){
                        dia = (i+1) * (j+1);
                        System.out.println("El primer dia de lluvia es: " + dia);
                        cont++;
                    }
                }
        }
        } while (cont != 1);

        return dia;
    }
}
