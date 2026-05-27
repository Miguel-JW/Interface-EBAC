public class Main {
    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("     🔔  Sistema de Notificações       ");
        System.out.println("╚══════════════════════════════════════╝\n");

        // Testando com Email
        System.out.println("── Registro via Email ────────────────");
        new UsuarioService(new EmailNotificador()).registrar("João");

        System.out.println();

        // Testando com SMS
        System.out.println("── Registro via SMS ──────────────────");
        new UsuarioService(new SmsNotificador()).registrar("Carlos");

        System.out.println();

        // Testando com WhatsApp
        System.out.println("── Registro via WhatsApp ─────────────");
        new UsuarioService(new WhatsappNotificador()).registrar("Maria");

        System.out.println("\n──────────────────────────────────────");
        System.out.println("  ✔  Todos os usuários registrados!");
    }
}
