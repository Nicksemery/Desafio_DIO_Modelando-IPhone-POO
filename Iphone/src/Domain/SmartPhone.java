package Domain;

public class SmartPhone implements IPod, Phone, Internet {
    @Override
    public void Tocar() {
        System.out.println("Tocando: ");
    }

    @Override
    public void Pausar() {
        System.out.println("Música Pausada");
    }

    @Override
    public void SelecionarMusica(String musica) {
        System.out.println("Tocando: " + musica);
    }

    @Override
    public void ExibirPagina(String pagina) {
        System.out.println("Site atual: " + pagina);
    }

    @Override
    public void AdicionarNovaAba() {
        System.out.println("Nova Aba aberta");
    }

    @Override
    public void AtualizarPagina() {
        System.out.println("Página Atualizada");
    }


    @Override
    public void Ligar(String numero) {
        System.out.println("Ligado para: " + numero);
    }

    @Override
    public void Atender() {
        System.out.println("Atendeu!");
    }

    @Override
    public void IniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz");
    }
}
