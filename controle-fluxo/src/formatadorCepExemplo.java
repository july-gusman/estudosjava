
public class formatadorCepExemplo {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765006");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde com as regras de negócio" );
        }
        
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }

        //simulando um cep formatado
        return "23.765-088";
    }

    @Override
    public String toString() {
        return "formatadorCepExemplo []";
    }
}
