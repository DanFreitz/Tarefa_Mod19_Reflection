package br.com.daniel.reflections.anotacao.cadastro;

/**
 * @author Daniel
 */

public class Produto {

    private Long codigo;

    private String descricao;

    private Double preco;

    public Produto() {

    }

    public Long getCodigo() { return codigo; }

    public void setCodigo(Long codigo) { this.codigo = codigo; }

    public String getDescricao() { return descricao; }

    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Double getPreco() { return preco; }

    public void setPreco(Double preco) { this.preco = preco; }
}
