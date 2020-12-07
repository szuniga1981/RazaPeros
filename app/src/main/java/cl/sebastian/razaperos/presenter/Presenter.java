package cl.sebastian.razaperos.presenter;

import cl.sebastian.razaperos.model.Repositorio;

public class Presenter {
    PresenterView view;
    Repositorio repositorio;

    public Presenter(PresenterView view, Repositorio repositorio) {
        this.view = view;
        this.repositorio = repositorio;
    }

}
