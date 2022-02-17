package ejemploMockStatic;

public class CalculadoraMockStatic {

    private MultiplicarServicioStatic mul;

    public CalculadoraMockStatic(MultiplicarServicioStatic multiplicarServicio){
        this.mul = multiplicarServicio;
    }

    public int getFactorial(int number){
        int fact=1;
        for (int i = 1; i <=number ; i++) {
            fact=  mul.mult(fact,i);
        }
        return fact;
    }

}

