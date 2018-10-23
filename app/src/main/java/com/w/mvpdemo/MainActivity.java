package com.w.mvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.w.mvpdemo.adapter.GirlAdapter;
import com.w.mvpdemo.bean.Girl;
import com.w.mvpdemo.presenter.GirlPresenter;
import com.w.mvpdemo.view.IGirlView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IGirlView {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
        new GirlPresenter(this).fetch();
    }

    @Override
    public void showGirls(List<Girl> girls) {
        listView.setAdapter(new GirlAdapter(this, girls));
    }
}
