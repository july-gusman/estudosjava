import java.text.NumberFormat;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor;
        try{

        valor = NumberFormat.getInstance().parse("a1.75");
        System.out.println(valor);
        } catch (ParceException e) {
            e.printStackTrace();
        }

    }
}
