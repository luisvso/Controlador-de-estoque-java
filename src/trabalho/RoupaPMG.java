package trabalho;

import java.util.Scanner;

public class RoupaPMG implements Item {
    private String descricao;
    private int quantidadeP, quantidadeM, quantidadeG;
    private int estoqueMinimo, estoqueMaximo;

    public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo,
            int estoqueMaximo) {
        this.descricao = descricao;
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
        this.estoqueMaximo = estoqueMaximo;
        this.estoqueMinimo = estoqueMinimo;
    }

    public void venda() {

        Scanner c = new Scanner(System.in);
        System.out.println("Me diga o tamanho que deseja vender: ");
        String tamanho = c.next();

        if (tamanho.toUpperCase().equals("P")) {
            this.setQuantidadeP(this.quantidadeP - 1);
        } else {
            if (tamanho.toUpperCase().equals("M")) {
                this.setQuantidadeM(this.quantidadeM - 1);
            } else {
                if (tamanho.toUpperCase().equals("G")) {
                    this.setQuantidadeG(this.quantidadeG - 1);
                } else {
                    throw new ValorIncorretoException("Este tamanho não existe, tente outro");
                }
            }
        }

    }

    public void reposicaoEstoque() {

        if (this.quantidadeP < this.estoqueMinimo) {
            this.setQuantidadeP(this.quantidadeP + (this.estoqueMaximo - this.quantidadeP));
            System.out.println("Estoque P reposto com sucesso");
        } else {
            throw new EstoqueNoMaxException("O estoque P nao precisa de reposicao");
        }

        if (this.quantidadeM < this.estoqueMinimo) {
            this.setQuantidadeM(this.quantidadeM + (this.estoqueMaximo - this.quantidadeM));
            System.out.println("Estoque M reposto com sucesso");
        } else {
            throw new EstoqueNoMaxException("O estoque M nao precisa de reposicao");
        }

        if (this.quantidadeG < this.estoqueMinimo) {
            this.setQuantidadeG(this.quantidadeG + (this.estoqueMaximo - this.quantidadeG));
            System.out.println("Estoque G reposto com sucesso");
        } else {
            throw new EstoqueNoMaxException("O estoque G nao precisa de reposicao");
        }

    }

    public String toString() {
        return "Descrição: \n" +
                "O acessorio e: " + this.descricao + "\n" +
                "A quantidade em estoque do tamanho P e de: " + this.quantidadeP + "\n" +
                "A quantidade em estoque do tamanho M e de: " + this.quantidadeM + "\n" +
                "A quantidade em estoque do tamanho G e de: " + this.quantidadeG + "\n" +
                "O Estoque Maximo e de: " + this.estoqueMaximo + "\n" +
                "O Estoque Minimo e de: " + this.estoqueMinimo + "\n"
                + "\n";

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeP() {
        return quantidadeP;
    }

    public void setQuantidadeP(int quantidadeP) {
        this.quantidadeP = quantidadeP;
    }

    public int getQuantidadeM() {
        return quantidadeM;
    }

    public void setQuantidadeM(int quantidadeM) {
        this.quantidadeM = quantidadeM;
    }

    public int getQuantidadeG() {
        return quantidadeG;
    }

    public void setQuantidadeG(int quantidadeG) {
        this.quantidadeG = quantidadeG;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(int estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }
}
