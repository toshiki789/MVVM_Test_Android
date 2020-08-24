package com.example.mvvm_test_android.models;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import android.text.TextUtils;
import android.util.Patterns;

import com.example.mvvm_test_android.BR;
import com.example.mvvm_test_android.views.MainActivity;

public class UserModel extends BaseObservable {
    @NonNull
    public String name;
    @NonNull
    public String password;

    public UserModel(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @NonNull
    @Bindable
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @NonNull
    @Bindable
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }

    public boolean isInputDataValid() {
        if(this.name.equals("user") && this.password.equals("pass")){
            return true;
        } else {
            return false;
        }
    }
}