import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int op = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha uma  opções:  \n 1 Abrir conta \n 2 Fechar conta  \n 3 Depósito  \n 4 Saque   \n 5 transferência\n 6 sair    "));

        switch (op){
            case 1: JOptionPane.showMessageDialog(null, "Você abriu conta"); 

break;
case 2: JOptionPane.showMessageDialog(null,"Fechou conta"); 

break;
        }
    }
}
//como o ser humano pensa de forma oriental