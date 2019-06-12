package com.technosales.net.mvpdagger.activities.login;

public class LoginPresenter implements LoginContract.Presenter {

    private LoginContract.LoginView loginView;

    LoginPresenter(LoginContract.LoginView view) {
        loginView = view;
    }
}
