import javax.swing.*;

public class TesteTamanho {

    public static void main(String[] args) {

        //Informações da primeira pessoa
        String nome1 = JOptionPane.showInputDialog("Digite o nome da primeira pessoa: ");
        float peso1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso da primeira pessoa: "));
        float altura1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura da primeira pessoa: "));

        //Informações da segunda pessoa
        String nome2 = JOptionPane.showInputDialog("Digite o nome da segunda pessoa: ");
        float peso2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso da segunda pessoa: "));
        float altura2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura da segunda pessoa: "));

        //Comparação de quem é mais pesado
        String maisPesado;

        if(peso1 > peso2){
            maisPesado = nome1;
        } else if(peso2 > peso1){
            maisPesado = nome2;
        } else {
            maisPesado = "Os dois tem o mesmo peso.";
        }

        //Comparação de quem é mais alto
        String maisAlto;

        if(altura1 > altura2){
            maisAlto = nome1;
        } else if(altura2 > altura1){
            maisAlto = nome2;
        } else {
            maisAlto = "Os dois tem o mesmo tamanho";
        }

        //Exibir resultado
        JOptionPane.showMessageDialog(null,
                "Pessoa mais pesada: " + maisPesado + "\n" +
                        "Pessoa mais alta: " + maisAlto);
    }
}
