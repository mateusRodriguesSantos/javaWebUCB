package Bean;

public class AnuncianteBean {
     //Variables
     private int idAnunciante;
     private int telefone;
     private String email;
     private int senha;
 
     //Constructors
     public AnuncianteBean(int idAnunciante, int telefone, String email, int senha) {
         this.idAnunciante = idAnunciante;
         this.telefone = telefone;
         this.email = email;
         this.senha = senha;
     }
 
     //Getters And Setters
     public int getIdAnunciante() {
         return idAnunciante;
     }
 
     public void setIdAnunciante(int idAnunciante) {
         this.idAnunciante = idAnunciante;
     }
 
     public int getTelefone() {
         return telefone;
     }
 
     public void setTelefone(int telefone) {
         this.telefone = telefone;
     }
 
     public String getEmail() {
         return email;
     }
 
     public void setEmail(String email) {
         this.email = email;
     }
 
     public int getSenha() {
         return senha;
     }
 
     public void setSenha(int senha) {
         this.senha = senha;
     }
}
