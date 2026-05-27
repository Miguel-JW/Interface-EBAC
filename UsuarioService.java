public class UsuarioService {

    // Injeção de dependência via construtor
    private Notificador notificador;

    public UsuarioService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void registrar(String nome) {
        System.out.println("Usuário " + nome + " registrado.");
        notificador.enviarMensagem("Bem-vindo " + nome + "!");
    }
}
