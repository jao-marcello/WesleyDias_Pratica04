import javax.swing.JOptionPane;

public class App {
   
    public static void main (String args[]) {
        String entrada;
        int nota, salario, idade, valido, exit;
    do{
        do {
            valido = 0;
            entrada = JOptionPane.showInputDialog("Informe uma nota de 0 a 10: ");
            nota = Integer.parseInt(entrada);
            if(nota < 0 || nota > 10){
                JOptionPane.showMessageDialog(null,"Por favor, selecione uma nota válida!");
            }else {
                valido = 1;
            }
        } while(valido != 1);

        do {
            valido = 0;
            entrada = JOptionPane.showInputDialog("Informe o salario: ");
            salario = Integer.parseInt(entrada);
            if(salario < 0 ){
                JOptionPane.showMessageDialog(null,"Por favor, selecione um salario válido!");
            }else {
                valido = 1;
            }
        } while(valido != 1);

        do {
            valido = 0;
            entrada = JOptionPane.showInputDialog("Informe seu sexo (m ou f): ");
            if(entrada.equalsIgnoreCase("f") || entrada.equalsIgnoreCase("m")){
                valido = 1;
            }else{
                JOptionPane.showMessageDialog(null,"Por favor, informe um gênero válido!");
            }
        } while(valido != 1);

        do {
            valido = 0;
            entrada = JOptionPane.showInputDialog("Informe sua idade: ");
            idade = Integer.parseInt(entrada);
            if(idade < 0 || idade > 150){
                JOptionPane.showMessageDialog(null,"Por favor, informe uma idade válida!");
            }else {
                valido = 1;
            }
        } while(valido != 1);

        JOptionPane.showMessageDialog(null,"Obrigado pelas informações!!");

        
        int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?"); if (resp == JOptionPane.YES_OPTION)
        entrada = "sim";
        else if (resp == JOptionPane.NO_OPTION)
        entrada = "não";
        } while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
        
        System.exit(0);
    }
}