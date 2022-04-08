package def;

public class login {

	private String usuario;
	private String senha;
	
	
	
	public String useUsuario(String param) {
		if (this.usuario == param){
			System.out.println("Login correto!");
			return null;
		}
		System.out.println("Login incorreto!");
		return param;
	}
	public String setUsuario(String param) {
		return this.usuario = param;
		
		
	}
	public String useSenha(String param) {
		if (this.senha == param){
			System.out.println("Senha correta!");
			return null;
		}
		System.out.println("Senha incorreta!");
		return param;
	}
	public String setSenha (String senha) {
		this.senha = senha;
		return null;
	}
	
	public String Login (String usuario, String senha) {
		if (this.usuario == usuario && this.senha == senha) {	
			System.out.println("Login efetuado com sucesso!");
			return null;
			}
		System.out.println("Usuario ou senha incorretos!");
		return null;

	}
}
