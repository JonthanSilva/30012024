package padoka.src.View.Controller;
import model.*;
import view.*;

public class CardapioControl {
    public static void exibirCardapio() {
        CardapioModel.atualizarCardapio();
        CardapioView.mostrarReceitas();
    }
}
