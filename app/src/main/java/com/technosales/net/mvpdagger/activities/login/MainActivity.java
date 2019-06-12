package com.technosales.net.mvpdagger.activities.login;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.technosales.net.mvpdagger.R;
import com.technosales.net.mvpdagger.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, LoginContract.LoginView {
    ActivityMainBinding mainBinding;

    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mainBinding.btnLogin.setOnClickListener(this);

        loginPresenter = new LoginPresenter(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnLogin) {
        }
    }


}
