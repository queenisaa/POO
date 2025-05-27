import javax.swing.JOptionPane;
public class L0Q5 { 
    public static void main(String[] args) {
        String nomeProduto = JOptionPane.showInputDialog(null, "Digite nome do Produto: ");
        String valorProdutoInput = JOptionPane.showInputDialog(null, "Digite valor do Produto: ");
        double valorProduto = Double.parseDouble(valorProdutoInput);
        String descontoInput = JOptionPane.showInputDialog(null, "Digite o desconto: ");
        double Perdesconto = Double.parseDouble(descontoInput);
        double desconto = valorProduto * (Perdesconto / 100);
        double valorComDesconto = valorProduto - desconto;
        String valorProdutoFormatado = String.format("%.3f", valorProduto);
        String valorDescontoFormatado = String.format("%.3f", valorComDesconto);
        System.out.printf("Produto: %s\n valor original: %s\n Valor com desconto: %s", nomeProduto,valorProdutoFormatado,valorDescontoFormatado);
    }

}
