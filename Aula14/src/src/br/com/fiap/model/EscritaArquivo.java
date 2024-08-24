package br.com.fiap.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscritaArquivo {
    public static void main(String[] args) {
        try {
            FileWriter outputStream = new FileWriter("Exemplo.txt");
            PrintWriter arquivoSaida = new PrintWriter(outputStream);

            arquivoSaida.print("Teste");
            arquivoSaida.print("Conteúdo do arquivo");

            arquivoSaida.close();
            outputStream.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
