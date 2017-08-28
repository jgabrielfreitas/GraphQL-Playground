package com.jgabrielfreitas.apollo.activities.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by JGabrielFreitas on 27/08/17.
 */

public class BaseActivity extends com.jgabrielfreitas.core.activity.BaseActivity implements BaseView {

    private BasePresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new BasePresenterImpl(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    @Override
    public void startLoad() {

    }

    @Override
    public void stopLoad() {

    }
}
