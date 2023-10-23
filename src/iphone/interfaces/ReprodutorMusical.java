package iphone.interfaces;

import java.io.File;

public interface ReprodutorMusical {
    void tocar(File file);
    void pausar();
    void selecionarMusica();
    void aumentarVolume();
}
