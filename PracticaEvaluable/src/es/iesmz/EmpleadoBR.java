package es.iesmz;

public class EmpleadoBR {
    static int salarioBase;
    public static float calcularSalarioBruto(TipoEmpleado tipo, float ventasMes, float horasExtra){
        if (tipo == TipoEmpleado.vendedor){
            salarioBase = 1000;

            if (ventasMes >= 1500){
                salarioBase += 200;
            } else {
                if (ventasMes >= 1000){
                    salarioBase += 100;
                }
            }

            if (horasExtra > 0){
                salarioBase += (horasExtra * 20);
            }
        } else if (tipo == TipoEmpleado.encarregat){
            salarioBase = 1500;

            if (ventasMes >= 1500){
                salarioBase += 200;
            } else {
                if (ventasMes >= 1000){
                    salarioBase += 100;
                }
            }

            if (horasExtra > 0){
                salarioBase += (horasExtra * 20);
            }
        } else if (tipo == null || ventasMes < 0 || horasExtra < 0){
            return -1;
        }
        return salarioBase;
    }

    public static float calcularSalarioNeto(float salarioBruto){
        if (salarioBruto < 1000 && salarioBruto > 0){
            return salarioBruto;
        } else if (salarioBruto >= 1000 && salarioBruto < 1500){
            return (salarioBruto * (1.0f - (16.0f/100.0f)));
        } else if (salarioBruto >= 1500){
            return (salarioBruto * (1.0f - (18.0f/100.0f)));
        } else {
            return -1;
        }
    }
}
