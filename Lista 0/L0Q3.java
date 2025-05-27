import javax.swing.JOptionPane;
public class L0Q3 {
    public static void main(String[] args) {
        String horasInput = JOptionPane.showInputDialog(null, "Digite as horas trabalhadas: ");
        String valorHorasInput = JOptionPane.showInputDialog(null, "Digite quanto o funcionario recebe por hora: ");
        double horasTrabalhadas = Double.parseDouble(horasInput);
        double valorPorHoras = Double.parseDouble(valorHorasInput);
        double salario = horasTrabalhadas * valorPorHoras;
        String salarioFormatado = String.format("%.2f", salario);
        JOptionPane.showMessageDialog(null, "O salario do funcionario é: R$ " + salarioFormatado);
    }
}
