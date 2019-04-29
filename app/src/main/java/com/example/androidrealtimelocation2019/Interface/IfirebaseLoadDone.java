package com.example.androidrealtimelocation2019.Interface;

import java.util.List;

public interface IfirebaseLoadDone {
    void onFirebaseLoadUserNameDone(List<String> lstEmail);
    void onFirebaseLoadFailed(String message);
}
