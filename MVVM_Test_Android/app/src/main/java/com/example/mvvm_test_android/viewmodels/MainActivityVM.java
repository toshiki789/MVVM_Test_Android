package com.example.mvvm_test_android.viewmodels;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.mvvm_test_android.utility.*;
import com.example.mvvm_test_android.models.UserModel;
import com.example.mvvm_test_android.BR;

public class MainActivityVM extends BaseObservable {

    public UserModel user;

    public String toastMessage = "";

    @Bindable
    public String getToastMessage() {
        return this.toastMessage;
    }
    public void setToastMessage(String toastMessage) {
        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    public MainActivityVM() {

        user = new UserModel("user", "pass");
    }

    public void onLoginClicked() {
        if (user.isInputDataValid())
            setToastMessage(Message.SUCCESS_M);
        else
            setToastMessage(Message.ERROR_M);
    }
}
