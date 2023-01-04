public class Colecoes {

    public static void main(String[] args) {
        exemploListaDeNomes();
        exemploComNumeros();

    }

    private static void exemploComNumeros() {
        System.out.println("***** exemploComNumeros *****");
        int[] vet = {9, 7, 1, 3, 5};
        int aux = 0;
        int i = 0;

        System.out.println("Vetor desordenado" );
        for (i = 0; i<5; i++) {
            System.out.println(" "+vet[i]);
        }
        System.out.println(" ");

        for (i = 0; i<5; i++) {
            for (int j = 0; j<4; j++) {
                if(vet[j] > vet[j + 1]) {
                    aux =vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
        System.out.println("Vetor organizado: ");
        for (i = 0; i<5; i++) {
            System.out.println(" "+vet[i]);
        }

    }

    private static void exemploListaDeNomes() {
        System.out.println("***** exemploListaDeNomes *****");
        String texto = "Amanda, Fernando, Isael, João, Paulo";
        System.out.println(texto);
        System.out.println(" ");
        System.out.println("***** exemploListaDeNomesSeparados *****");

        String[] valoresArray = texto.split(",");
        System.out.println("nome: " + valoresArray[0]);
        System.out.println("nome: " + valoresArray[1]);
        System.out.println("nome: " + valoresArray[2]);
        System.out.println("nome: " + valoresArray[3]);
        System.out.println("nome: " + valoresArray[4]);
        System.out.println(" ");




    }
}
