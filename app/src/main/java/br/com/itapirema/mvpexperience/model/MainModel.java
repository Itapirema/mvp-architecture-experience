package br.com.itapirema.mvpexperience.model;

import com.tinmegali.mvp.mvp.GenericModel;
import com.tinmegali.mvp.mvp.ModelOps;

import br.com.itapirema.mvpexperience.interfaces.MainMVP;

/**
 * Created by marceloitapirema on 19/09/16.
 */
public class MainModel extends GenericModel<MainMVP.RequiredPresenterOps>
                       implements ModelOps<MainMVP.RequiredPresenterOps> {

    /**
     * Método que recupera referência ao layer PRESENTER
     * 1 - {@link super#onCreate(Object)} deve sempre deve ser chamado
     * @param requiredPresenterOps  interface com o Presenter
     */
    @Override
    public void onCreate(MainMVP.RequiredPresenterOps requiredPresenterOps) {
        super.onCreate(requiredPresenterOps);
    }

    /**
     * Disparado pelo layer PRESENTER quando o VIEW passa por uma
     * reconstrução/destruição. Útil como referência para parar tarefas
     * sendo realizadas em background Threads
     *
     * @param isChangingConfiguration   Informa se está ocorrendo uma
     *                                  mudança de configuração
     */
    @Override
    public void onDestroy(boolean isChangingConfiguration) {
        super.onDestroy(isChangingConfiguration);
    }
}
