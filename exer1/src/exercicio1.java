import javax.swing.JOptionPane;
public class exercicio1 {
    public static void main(String[]args){
        double peso, altura, imc;
        peso = Double.parseDouble(JOptionPane.showInputDialog(" Qual seu peso em kg"));
        altura= Double.parseDouble(JOptionPane.showInputDialog(" qual a sua altura"));
        imc= peso/ (altura*altura);
        if(imc>=30){
            JOptionPane.showMessageDialog(null," Seu Imc é:" + Math.round(imc)+ " - obesidade");
            
        }
        else if (imc >=25&&imc<= 29.9){
             JOptionPane.showMessageDialog(null," Seu Imc é:" + Math.round(imc)+ " - Sobrepeso");
        }
        else if( imc >= 18.5 && imc <= 24.9){
            JOptionPane.showMessageDialog(null," Seu Imc é:" + Math.round(imc)+ " - peso normal");
        }
        else if (imc< 18.9){
            JOptionPane.showMessageDialog(null," Seu Imc é:" + Math.round(imc)+ " - abaixo do peso");
        }
            
        
            
            
        }
             
            
        
        
       
        
        
        
    }
    
    
}
