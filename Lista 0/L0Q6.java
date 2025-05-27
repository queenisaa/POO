import javax.swing.JOptionPane;
public class L0Q6 {
    public static void main(String[] args) {
        String salarioInput = JOptionPane.showInputDialog(null, "Digite salario do funcionario: ");
        double salario = Double.parseDouble(salarioInput);
        double aumento = salario * 0.15;
        double salarioAjustado = salario + aumento;
        String salarioFormatado = String.format("%.2f", salario);
        String salarioAjustadoFormatado = String.format("%.2f", salarioAjustado);
        String menssagem = String.format("Salario antigo: %s\n Salario Ajustado: %s", salarioFormatado, salarioAjustadoFormatado);
        JOptionPane.showMessageDialog(null, menssagem);
    }

}
