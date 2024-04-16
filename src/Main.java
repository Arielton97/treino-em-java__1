public class Main {
    public static void main(String[] args) {
        String meuNome = "Arielton ";
        String meuSobrenome = "Ribeiro ";
        int somaIdade = 20;
        int minhaIdade = 7;
        int idade = somaIdade + minhaIdade;
        String nomeInicialAtleta = "Cristiano Ronaldo";
        String nomeMeioAtleta = "Aveiro dos Santos";

        
        String nomeCompleto = nomeCompleto(nomeInicialAtleta, nomeMeioAtleta);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String meuNome, String meuSobrenome) {
        return "Resultado do metodo " + meuNome.concat(" ").concat(meuSobrenome);
    }
        
}