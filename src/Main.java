public class Main{
    public static void main(String[] args){
        double[] notas = {7.0, 8.5, 9.0, 6.0, 7.5};
        double soma =0;
        for (double nota : notas){
            soma += nota;
        }
        System.out.println("Média da turma: "+(soma/notas.length));

        int[][] matriz={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println(matriz[i][j]);
            }
        }
        for (int[] linha : matriz){
            for (int elemento : linha){
                System.out.println(elemento);
            }
        }

    }
}
