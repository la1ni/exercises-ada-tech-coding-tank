public enum DiasMes {
    JANEIRO(31),
    FEVEREIRO_COMUM(28),
    FEVEREIRO_BISSEXTO(29),
    MARCO(31),
    ABRIL(30),
    MAIO(31),
    JUNHO(30),
    JULHO(31),
    AGOSTO(31),
    SETEMBRO(30),
    OUTUBRO(31),
    NOVEMBRO(30),
    DEZEMBRO(31);

    private final int diasMes;

    DiasMes(int diasMes ) {
        this.diasMes = diasMes;
    }

    public  int getDiasMes(){
        return diasMes;
    }
}
