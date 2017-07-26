package br.com.itapirema.mvpexperience.interfaces;

import com.tinmegali.mvp.mvp.ActivityView;
import com.tinmegali.mvp.mvp.ModelOps;
import com.tinmegali.mvp.mvp.PresenterOps;

/**
 * Interface guarda-chuva do padrão MVP, agrega todas as operações de
 * comunicação entre os diferentes layer do padrão: MODEL, VIEW, PRESENTER
 *
 * Created by marceloitapirema on 09/09/16.
 * Reference https://github.com/tinmegali/simple-mvp
 */
public interface MainMVP {

    /**
     * Métodos obrigatórios em View, disponíveis para Presenter
     * Presenter -> View
     */
    interface RequiredViewOps extends ActivityView {

    }

    /**
     * Operações oferecidas pelo layer Fragment para comunicações com Activity
     * Fragment -> Activity
     */
    interface RequiredActivityOps{

    }

    /**
     * Operações oferecidas ao layer View para comunicação com Presenter
     * View -> Presenter
     */
    interface ProvidedPresenterOps extends PresenterOps<RequiredViewOps> {

    }

    /**
     * Operações oferecidas pelo layer Presenter para comunicações com Model
     * Model -> Presenter
     */
    interface RequiredPresenterOps{

    }

    /**
     * Operações oferecidos pelo layer Model para comunicações com Presenter
     * Presenter -> Model
     */
    interface ProvidedModelOps extends ModelOps<RequiredPresenterOps> {

    }
}
