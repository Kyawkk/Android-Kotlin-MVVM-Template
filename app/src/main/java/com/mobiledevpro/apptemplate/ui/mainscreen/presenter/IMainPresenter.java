package com.mobiledevpro.apptemplate.ui.mainscreen.presenter;

import android.app.Activity;

/**
 * Interface for main screen
 * <p>
 * Created by Dmitriy V. Chernysh on 20.10.17.
 * dmitriy.chernysh@gmail.com
 * <p>
 * https://fb.me/mobiledevpro/
 * <p>
 * #MobileDevPro
 */

public interface IMainPresenter {
    interface View {
        Activity getActivity();
    }

    interface Presenter {
        void onStartView();

        void onStopView();
    }
}
