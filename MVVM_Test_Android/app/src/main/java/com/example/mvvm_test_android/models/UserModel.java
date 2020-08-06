package com.example.mvvm_test_android.models;

import androidx.annotation.NonNull;
import android.text.TextUtils;
import android.util.Patterns;
import com.example.mvvm_test_android.views.MainActivity;

public class UserModel{
    @NonNull
    private String mName;
    @NonNull
    private String mPassword;
    private static int failedAttempt = 0;
    private static int MAX_ATTEMPT = 5;

    public UserModel(@NonNull final String name, @NonNull final String password) {
        mName = name;
        mPassword = password;
        failedAttempt = 0;
    }

    public static void setFailedAttempt() {
        failedAttempt++;
        if ( failedAttempt == MAX_ATTEMPT ) {
            MainActivity.DisableLogin();
        }
    }

    @NonNull
    public String getName() { return mName; }
    public void setName(@NonNull final String Name) { mName = Name; }

    @NonNull
    public String getPassword() { return mPassword; }
    public void setPassword(@NonNull final String password) { mPassword = password; }

    public boolean isInputDataValid() {
        return true;
    }
}
