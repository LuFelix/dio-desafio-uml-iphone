package iphone.interfaces;
import java.net.URL;

public interface NavegadorInternet {

void exibirPagina(URL url);
void adicionarNovaAba();
void atualizarPagina();
void adicionarFavorito(URL url);

}
