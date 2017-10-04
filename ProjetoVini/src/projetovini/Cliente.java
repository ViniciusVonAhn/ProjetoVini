package projetovini;

/**
 * @author vinicius
 */
public class Cliente extends Pessoa{
    
    public Cliente(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
    }
    
    public String Reclamar(){
        return "Mimimimi";
    }
    
    public double trocarProduto(){
        
        return 0;
    }
    
}
