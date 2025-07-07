package solution;


public class NLinhas {


    public NLinhas() {

    }

    public String gerarLinhas(int n) {

        if (n < 0) {
            return "";
        }

        String resultado = "";

//.
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {

                resultado += i;
            }

            if (i < n) {
                resultado += "\n";
            }
        }

        return resultado;
    }
}