package com.example.mvvm_test_android.viewmodels;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.mvvm_test_android.models.UserModel;
import com.example.mvvm_test_android.BR;

public class MainActivityVM extends BaseObservable {

    private String successMessage = "Login was successful";
    private String errorMessage = "Email or Password not valid";

    @Bindable
    public String toastMessage = null;
    public String getToastMessage() {
        return toastMessage;
    }
    private void setToastMessage(String toastMessage) {
        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    @Bindable
    public UserModel user = null;
    public UserModel getUser() { return user; }
    private void setUser(UserModel user){
        this.user = user;
        notifyPropertyChanged(BR.user);
    }

    public MainActivityVM() {

        user = new UserModel("", "");
    }

    public void onLoginClicked() {
        if (user.isInputDataValid())
            setToastMessage(successMessage);
        else
            setToastMessage(errorMessage);
    }
}
