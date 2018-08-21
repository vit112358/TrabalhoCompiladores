package model;

public class Linha {

    private int id;
    private String line;
    private int coluna;

    /**
     * Construtor da Classe
     */
    public Linha() {
        //Only instantiation
    }

    /**
     * get ID
     * @return id da Linha
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id id da Linha
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Pega a Linha
     * @return Linha
     */
    public String getLinha() {
        return line;
    }

    /**
     * Seta o conteúdo de uma linha
     * @param linha String a ser guardada
     */
    public void setLinha(String linha) {
        this.line = linha;
    }

    /**
     * Pega a coluna
     * @return Coluna
     */
    public int getColuna() {
        return coluna;
    }

    /**
     * seta uma Posição da coluna
     * @param coluna posição a ser setada
     */
    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
}
