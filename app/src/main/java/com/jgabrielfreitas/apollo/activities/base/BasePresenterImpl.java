package com.jgabrielfreitas.apollo.activities.base;

/**
 * Created by JGabrielFreitas on 27/08/17.
 */

public class BasePresenterImpl implements BasePresenter {

    private BaseView view;

    public BasePresenterImpl(BaseView view) {
        this.view = view;
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }

}
