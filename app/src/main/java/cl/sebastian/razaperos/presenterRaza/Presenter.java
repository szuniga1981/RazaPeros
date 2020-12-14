package cl.sebastian.razaperos.presenterRaza;

import java.util.List;

import cl.sebastian.razaperos.model.PresenterRepositorio;
import cl.sebastian.razaperos.model.Repositorio;

public class  Presenter implements PresenterRepositorio {
    PresenterView view;
    Repositorio repositorio;

    public Presenter(PresenterView view, Repositorio repositorio) {

        this.view = view;
        this.repositorio = repositorio;
        repositorio.setPr(this);
        repositorio.loadinfo();

    }

    @Override
    public void showInfo(List<String> listaPerros) {
        view.showInfo(listaPerros);//aca cargamos la info que viene del Prsenterrepositorio
    }

    @Override
    public void showInfoImage(List<String> listaImagenes) {

    }
}
