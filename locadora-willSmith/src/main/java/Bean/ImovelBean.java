package Bean;

public class ImovelBean {
    private int idImovel;
    private EnderecoBean endereco;
    private AnuncianteBean anunciante;
    private String disponibilidade;
    private String tipo;
    private int area;
    private int quartos;
    private int banheiros;
    private int vagas;
    private String descricao;

    //Constructors
    public ImovelBean(int idImovel, EnderecoBean endereco, AnuncianteBean anunciante, String disponibilidade,
            String tipo, int area, int quartos, int banheiros, int vagas, String descricao) {
        this.idImovel = idImovel;
        this.endereco = endereco;
        this.anunciante = anunciante;
        this.disponibilidade = disponibilidade;
        this.tipo = tipo;
        this.area = area;
        this.quartos = quartos;
        this.banheiros = banheiros;
        this.vagas = vagas;
        this.descricao = descricao;
    }

    //Getters And Setters
    public int getIdImovel() {
        return idImovel;
    }

    public void setIdImovel(int idImovel) {
        this.idImovel = idImovel;
    }

    public EnderecoBean getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoBean endereco) {
        this.endereco = endereco;
    }

    public AnuncianteBean getAnunciante() {
        return anunciante;
    }

    public void setAnunciante(AnuncianteBean anunciante) {
        this.anunciante = anunciante;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
