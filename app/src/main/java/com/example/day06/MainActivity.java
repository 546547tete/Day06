package com.example.day06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.day06.bean.Cid294Bean;
import com.example.day06.mvp.MainPresenter;
import com.example.day06.mvp.MainView;
import com.example.mvplibrary.base.BaseMvpActivity;

public class MainActivity extends BaseMvpActivity<MainView, MainPresenter> implements MainView {

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }*/

    @Override
    protected int initLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected MainPresenter initPresenter() {
        mPresenter=new MainPresenter();
        return mPresenter;
    }

    @Override
    protected void initData() {
        mPresenter.getDatap();
    }

    @Override
    public void setData(Cid294Bean bean) {
        Log.e("TRG","成功："+bean.toString());
    }

    @Override
    public void showToast(String s) {
        Log.e("TRG","onError："+s);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
