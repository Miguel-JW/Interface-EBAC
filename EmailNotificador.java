public class EmailNotificador implements Notificador {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("📧 [EMAIL] Mensagem enviada: " + mensagem);
    }
}
