class Teste{
    public static void main(String[] args){

    int quantidade = 4;
    int[] vetor = new int[quantidade];

    /*for (int i = 0; i < vetor.length; i++) {
     vetor[i] = (int) (Math.random()*quantidade);
     System.out.println(vetor[i]);
    }*/
    vetor[0]=20;
    vetor[1]=10;
    vetor[2]=30;
    vetor[3]=50;
     long tempoInicial = System.currentTimeMillis();

     //insertionSort(vetor);
     //bubbleSort(vetor);
     quickSort(vetor,0,vetor.length-1);

     long tempoFinal = System.currentTimeMillis();

     System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

    }

    private static void quickSort(int[] vetor, int inicio, int fim) {
     if (inicio < fim) {
         int posicaoPivo = separar(vetor, inicio, fim);
         quickSort(vetor, inicio, posicaoPivo - 1);
         quickSort(vetor, posicaoPivo + 1, fim);
     }
    }
    private static int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        
        while (i <= f) {
            if (vetor[i] <= pivo)
                i++;
            else if (pivo < vetor[f])
                f--;
                else {
                    int troca = vetor[i];
                    vetor[i] = vetor[f];
                    vetor[f] = troca;
                    i++;
                    f--;
                }
            String a ="";
            for (int c=inicio;c<fim ;c++ ) {
                a = a+" "+vetor[c];
            }
            System.out.println("vetor "+a);
            System.out.println("Valor de i: "+i);
            System.out.println("Valor de f: "+f);

        }
             

             vetor[inicio] = vetor[f];
             vetor[f] = pivo;
             
            String a ="";
            for (int c=inicio;c<fim ;c++ ) {
                a = a+" "+vetor[c];
            }
            System.out.println("vetor fora do primeiro laço");
            System.out.println("vetor "+a);
            System.out.println("Valor de i: "+i);
            System.out.println("Valor de f: "+f);
            return f;       
       }    


     public static void insertionSort(int[] vetor) {
        int j;
        int key;
        int i;

        for (j = 1; j < vetor.length; j++)
        {
          key = vetor[j];
          for (i = j - 1; (i >= 0) && (vetor[i] > key); i--)
          {
             vetor[i + 1] = vetor[i];
           }
            vetor[i + 1] = key;
        }
    }

    private static void bubbleSort(int vetor[]){
               boolean troca = true;
               int aux;
               while (troca) {
                   troca = false;
                   for (int i = 0; i < vetor.length - 1; i++) {
                       if (vetor[i] > vetor[i + 1]) {
                           aux = vetor[i];
                           vetor[i] = vetor[i + 1];
                           vetor[i + 1] = aux;
                           troca = true;
                       }
                   }
               }
       }
}
