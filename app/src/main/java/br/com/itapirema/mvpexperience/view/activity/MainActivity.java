package br.com.itapirema.mvpexperience.view.activity;

import android.os.Bundle;

import com.tinmegali.mvp.mvp.GenericMVPActivity;

import br.com.itapirema.mvpexperience.R;
import br.com.itapirema.mvpexperience.interfaces.MainMVP;
import br.com.itapirema.mvpexperience.presenter.MainPresenter;

public class MainActivity extends GenericMVPActivity<MainMVP.RequiredViewOps, MainPresenter,
                                  MainPresenter> implements MainMVP.RequiredViewOps{

    /**
     * Método padrão de criação de Atividades
     * 1 - {@link super#onCreate(Class, Object)} deve obrigatóriamente
     *     ser chamado na sequência ao método {@link super#onCreate(Bundle)}
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //super método obrigatório
        super.onCreate(MainPresenter.class,this);
        setContentView(R.layout.activity_main);
    }
}