import javax.swing.JOptionPane;
public class exercicio3 {
    public static void main(String[]args){
        int nota1, nota2, nota3;
        double media;
        nota1 = Integer.parseInt(JOptionPane.showInputDialog(" Qual a sua primeira nota"));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog(" Qual a sua segunda nota"));
        nota3 = Integer.parseInt(JOptionPane.showInputDialog(" Qual a sua terceira nota"));
        media = ( nota1 + nota2 + nota3)/3.0;
        String situacao = ( media>7)? " Aprovado" : ( media<6.9 && media >5 )?" Recuperacao" : " Reprovado";
        JOptionPane.showMessageDialog(null, " sua media é" + media + " ." + situacao);
        
        
    }
    
}
