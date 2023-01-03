package SistemaDeTransito;

import java.io.*;

import javax.swing.*;

public class ClassePrincipal {
    public static void main(String[] args) throws IOException{
        // INSTÂNCIA DA CLASSE ABSTRATA COM 3 REGISTROS TIPO VETOR
        Estatistica[] estatistica = new Estatistica[3];

        // INSTÂNCIA DA CLASSE MÉTODOS
        ClasseMetodos m = new ClasseMetodos();

        int i;

        // EXECUÇÃO DO MÉTODO CONSTRUTOR
        for (i = 0; i < 3; i++) {
            estatistica[i] = new Estatistica();
        }

        int opc = 0;
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("                     MENU ESTATÍSTICA\n 1 - Cadastro Estatística \n " +
                    "2 - Consulta por Quantidade de Acidentes\n 3 - Consulta por Estatísticas de Acidentes\n " +
                    "4 - Acidentes acima da média das 10 cidades\n 9 - Finaliza "));
            switch (opc) {
                case 1:
                    estatistica = m.FCadastraEstatistica(estatistica);
                    break;
                case 2:
                    m.QtdAcidentes(estatistica);
                    break;
                case 3:
                    m.PMaiorMenor(estatistica);
                    break;
                case 4:
                    m.PAcima(estatistica);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
        }
    }
}
