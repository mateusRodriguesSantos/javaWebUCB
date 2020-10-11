package Bean;

public class FotoBean {
          //Variables
          private int idFoto;
          private ImovelBean imovel;
          private String path;

        //Constructor
        public FotoBean(int idFoto, ImovelBean imovel, String path) {
            this.idFoto = idFoto;
            this.imovel = imovel;
            this.path = path;
        }

        //Getters and Setters
          public int getIdFoto() {
              return idFoto;
          }

          public void setIdFoto(int idFoto) {
              this.idFoto = idFoto;
          }

          public ImovelBean getImovel() {
              return imovel;
          }

          public void setImovel(ImovelBean imovel) {
              this.imovel = imovel;
          }

          public String getPath() {
              return path;
          }

          public void setPath(String path) {
              this.path = path;
          }


    
          
}
