package SistemaDeTransito;

import java.io.*;

import javax.swing.*;

public class ClasseMetodos {

    public Estatistica[] FCadastraEstatistica(Estatistica[] estatistica) throws IOException {

        String fileName = "ArquivoEstatística.txt";

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        int i;

        for (i = 0; i < 3; i++) {
            estatistica[i].CodigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o Código da Cidade:"));
            writer.write(estatistica[i].CodigoCidade);
            writer.newLine();
            estatistica[i].NomeCidade = JOptionPane.showInputDialog("Digite o Nome da Cidade:");
            writer.write(estatistica[i].NomeCidade);
            writer.newLine();
            estatistica[i].QtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de Acidentes:"));
            writer.write(estatistica[i].QtdAcidentes);
            writer.newLine();
        }
        writer.close();
        return estatistica;
    }

    public void QtdAcidentes(Estatistica[] estatistica) {
        int i;
        System.out.println("Cidades com ocorrências entre 100 e 500 acidentes:");
        for (i = 0; i < 3; i++) {
            if (estatistica[i].QtdAcidentes > 100 & estatistica[i].QtdAcidentes < 500) {
                System.out.println("\nCódigo: " + estatistica[i].CodigoCidade + "\nCidade: " + estatistica[i].NomeCidade
                        + "\nQuantidade de Acidentes: " + estatistica[i].QtdAcidentes);
            }
        }
    }

    public void PMaiorMenor(Estatistica[] estatistica) {
        int i, Maior = 0, Menor = 0;

        for (i = 0; i < 3; i++) {
            if (i == 0) {
                Maior = estatistica[i].QtdAcidentes;
                Menor = estatistica[i].QtdAcidentes;
            }
            if (estatistica[i].QtdAcidentes > Maior) {
                Maior = estatistica[i].QtdAcidentes;
            }
            if (estatistica[i].QtdAcidentes < Menor) {
                Menor = estatistica[i].QtdAcidentes;
            }
        }
        System.out.println("\nMenor Número de Acidentes: " + Menor + "\nMaior Número de Acidentes: " + Maior);
    }

    public void PAcima(Estatistica[] estatistica) {
        int i, Media, S = 0;

        for (i = 0; i < 3; i++) {
            S = S + estatistica[i].QtdAcidentes;
        }
        Media = S / 3;
        System.out.println("\nMédia de Acidentes: " + Media + "\nCidades com Quantidade de Acidentes Acima da Média:");

        for (i = 0; i < 3; i++) {
            if (estatistica[i].QtdAcidentes > Media) {
                System.out.println("\nCidade: " + estatistica[i].NomeCidade + "\nQuantidade de Acidentes: "
                        + estatistica[i].QtdAcidentes);
            }
        }
    }
}
