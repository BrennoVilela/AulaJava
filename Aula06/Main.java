import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String marca = "Tesla \nCarro elétrico";
        System.out.println(marca);
        JOptionPane.showConfirmDialog(null,"CPF: \n123454985-88");

        //Comparar String
        String churros = "Chocolate";
        String churros2 = "Doce de leite";

        //Comparar se as strings são iguais, não considerando maiuscula e minuscula
        if(churros.equalsIgnoreCase(churros2))
            System.out.println("Churros iguais");
        else
            System.out.println("Churros diferentes");
    }
}
