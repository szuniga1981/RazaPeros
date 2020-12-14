package cl.sebastian.razaperos.presenterimage;


import java.util.List;

import cl.sebastian.razaperos.model.PresenterRepositorio;
import cl.sebastian.razaperos.model.Repositorio;

public class PresenterImage implements PresenterRepositorio {
    PresenterviewImage viewImage;
    Repositorio repositorio;

    public PresenterImage(PresenterviewImage viewImage, Repositorio repositorio, String imgraza) {
        this.viewImage = viewImage;
        this.repositorio = repositorio;
        this.imgraza = imgraza;
        repositorio.loadInfoImage(imgraza);
    }

    String imgraza;

    @Override
    public void showInfo(List<String> listaPerros) {
        this.viewImage= viewImage;
        this.repositorio=repositorio;
        repositorio.setPr(this);


    }

    @Override
    public void showInfoImage(List<String> listaImagenes) {

    }
}

