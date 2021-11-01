package OneDigitalInnovation.classes.usuario;

public class SuperUsuario {
    private String Login;
    private String Senha;
    String nome;

    public SuperUsuario(String login,String senha){
        this.Login = login;
        this.Senha = senha;
    }

    public String getLogin(){return Login;}

    public String getSenha(){return Senha;}

}
