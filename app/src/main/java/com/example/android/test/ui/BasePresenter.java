package com.example.android.test.ui;

/**
 * Created by Siris on 2/26/2017.
 */

public interface BasePresenter <V extends BaseView> {

    void attachView(V view);

    void detachView();
}
