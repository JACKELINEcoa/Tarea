public class funcion1 {
    public static void main(String[] args) {
        //20 iteraciones
        int i,n=20,j=1;
        System.out.println("F(x)=sin(e^x/x^-1)");
            for(i=1;i<=n;i++){
                // obtener numero aleatorio entre -5 y 5 
                double random=(double)(Math.random()* -5)+5;
                
                System.out.print(j++);
                System.out.print(": ");
                System.out.println(funcion(random));
        }
    }
    public static double  funcion (double random){
        double funcio = Math.sin(Math.exp(random)/Math.pow(random,-1));
        return funcio;
    }    
}
