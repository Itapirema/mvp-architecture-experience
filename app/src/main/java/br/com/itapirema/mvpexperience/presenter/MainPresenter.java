package br.com.itapirema.mvpexperience.presenter;

import com.tinmegali.mvp.mvp.GenericMVPActivity;
import com.tinmegali.mvp.mvp.GenericPresenter;

import br.com.itapirema.mvpexperience.interfaces.MainMVP;
import br.com.itapirema.mvpexperience.model.MainModel;

/**
 * Created by marceloitapirema on 19/09/16.
 */
public class MainPresenter extends GenericPresenter<MainMVP.RequiredPresenterOps,
                                   MainMVP.ProvidedModelOps,
                                   MainMVP.RequiredViewOps,
                                   MainModel> implements
                                   MainMVP.RequiredPresenterOps,
                                   MainMVP.ProvidedPresenterOps {

    /**
     * Operação invocada durante a criação de View em
     * {@link GenericMVPActivity#onCreate(Class, Object)}
     * Responsável por inicializar Model e armazenar referência das
     * opeações em View.
     *
     * 1 - é obrigatório invocar {@link GenericPresenter#onCreate(Class, Object)}
     * antes de qualquer atividade
     * 2 - é obrigatório invocar GenericPresenter#setView(Object)
     * passando {@param view}
     *
     * @param view  A instância atual
     */
    @Override
    public void onCreate(MainMVP.RequiredViewOps view) {
        super.onCreate(MainModel.class, this);
        setView(view);

    }

    /**
     * Operação invocada após a reconstrução da View
     *
     * 1 - é obrigatório invocar GenericPresenter#setView(Object)
     * passando {@param view}
     * @param view  A instância View atual
     */
    @Override
    public void onConfigurationChanged(MainMVP.RequiredViewOps view) {
        setView(view);
    }

    /**
     * Disparado pela {@link GenericMVPActivity} para informar um evento onBackPressed
     */
    @Override
    public void onBackPressed() {

    }
}
