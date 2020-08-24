package com.example.mvvm_test_android.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import com.example.mvvm_test_android.utility.*;
import com.example.mvvm_test_android.models.UserModel;
import com.example.mvvm_test_android.R;
import com.example.mvvm_test_android.viewmodels.MainActivityVM;
import com.example.mvvm_test_android.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(new MainActivityVM());
        activityMainBinding.executePendingBindings();

        new Handler().postDelayed(new Runnable() {
            public void run() {
                // do something..
            }
        }, 100);

    }

    @BindingAdapter({"toastMessage"})
    public static void runMe(View view, String message) {
        if (message != null) {
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
        }
    }
}
