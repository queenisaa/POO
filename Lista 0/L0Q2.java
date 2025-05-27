import javax.swing.JOptionPane;
public class L0Q2 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null,"Digite valor do raio do circulo:");
        double raio = Double.parseDouble(input);
        double area = Math.PI * Math.pow(raio, 2);
        String areaFormatada = String.format("%.2f", area);
        JOptionPane.showMessageDialog(null, "Area do circulo com raio " + raio + areaFormatada);
    }
}
