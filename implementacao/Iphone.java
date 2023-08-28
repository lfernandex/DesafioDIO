package implementacao;

import interfaces.Internet;
import interfaces.Musica;
import interfaces.Telefone;

public class Iphone implements Musica, Telefone, Internet {

    @Override
    public void tocar() {
        throw new UnsupportedOperationException("Tocando musica");
    }

    @Override
    public void pausar() {
        throw new UnsupportedOperationException("Musica pausada");
    }

    @Override
    public void selecionar() {
        throw new UnsupportedOperationException("Selecionando musica");
    }

    @Override
    public void ligar() {
        throw new UnsupportedOperationException("Ligando");
    }

    @Override
    public void atender() {
        throw new UnsupportedOperationException("Atender ligação");
    }

    @Override
    public void correioVoz() {
        throw new UnsupportedOperationException("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina() {
        throw new UnsupportedOperationException("Exibindo pagina");
    }

    @Override
    public void novaAba() {
        throw new UnsupportedOperationException("Adicionar nova aba");
    }

    @Override
    public void atualizarPagina() {
        throw new UnsupportedOperationException("Atualizar pagina");
    }

}
