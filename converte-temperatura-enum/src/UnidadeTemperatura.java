public enum UnidadeTemperatura {
    C, F, K;


    private UnidadeTemperatura() {
    }

    private String getString(UnidadeTemperatura unidadeTemperatura){
        return unidadeTemperatura.name();
    }

}
