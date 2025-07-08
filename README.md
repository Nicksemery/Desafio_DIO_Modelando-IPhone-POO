# Desafio_DIO_Modelando-IPhone-POO


O diagrama abaixo mostra como o iPhone herda funcionalidades de três componentes: Telefone, iPod e Navegador de Internet.

```mermaid classDiagram
    class Phone {
        +Ligar(String numero)
        +Atender()
        +IniciarCorreioVoz()
    }

    class IPod {
        +Tocar()
        +Pausar()
        +SelecionarMusica(String musica)
    }

    class Internet {
        +ExibirPagina(String pagina)
        +AdicionarNovaAba()
        +AtualizarPagina()
    }

    class iPhone

    iPhone --> Phone
    iPhone --> IPod
    iPhone --> Internet