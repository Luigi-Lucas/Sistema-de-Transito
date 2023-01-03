package SistemaDeTransito;

class Estatistica {

    int CodigoCidade;
    String NomeCidade;
    int QtdAcidentes;

    Estatistica() {
        this(0, "", 0);
    }

    Estatistica(int CdgCidade, String Cidade, int Acidentes) {
        CodigoCidade = CdgCidade;
        NomeCidade = Cidade;
        QtdAcidentes = Acidentes;
    }

}
