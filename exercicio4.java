import javax.swing.JOptionPane;
public class exercicio4 {
    public static void main(String[]args){
        // testeswitch()
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(" Menu de atendimento\n"
        + "1- Suporte Tecnico "
        + "\n2 - financeiro"
        + "\n3 - falar com atendente"
        + "\n4 - cancelar serviço"
        + "\n5 - encerrar atendimento"));
        
        switch (opcao){
            case 1:
             
                JOptionPane.showMessageDialog(null," suporte tecnico");
                break;
            case 2:    
            
                JOptionPane.showMessageDialog(null," Financeiro");
                break;
            case 3:    
                JOptionPane.showMessageDialog(null," Falar com atendente");
                break;
            case 4:    
                JOptionPane.showMessageDialog(null," Cancelar servico");
                break;
            case 5:    
                JOptionPane.showMessageDialog(null," Encerrar atendimento");
                break;
                
            default:
                JOptionPane.showMessageDialog(null," opcao invalida, tente novamente");
                
                        
                
                
                
                            
                    
        }
        
    }
    
    
}
