public  enum CategoriaProduto {
    ELETRONICO ("Produto eletrônico comprado. Aproveite os novos recursos!"),
    VESTUARIO ("Produto de vestuário comprado. Aproveite os looks!"),
    ALIMENTO ("Produto alimentício comprado. Bon apéttit!");

    private String descricao;

    private CategoriaProduto(String descricao) {this.descricao = descricao;}

    public String getDescricao() {return descricao;}
}
