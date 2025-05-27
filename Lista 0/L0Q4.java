import javax.swing.JOptionPane;
public class L0Q4 { 
    public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
    String dataNascInput = JOptionPane.showInputDialog(null, "Digite ano de nascimento: ");
    int anoNasc = Integer.parseInt(dataNascInput);
    int anoAtual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
    int idade = anoAtual - anoNasc;
    String mensagem = String.format("Voce se chama %s e possui %d anos", nome, idade);
    JOptionPane.showMessageDialog(null, mensagem);
}

}
