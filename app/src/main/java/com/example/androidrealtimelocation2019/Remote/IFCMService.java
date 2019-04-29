package com.example.androidrealtimelocation2019.Remote;

import com.example.androidrealtimelocation2019.Model.MyResponse;
import com.example.androidrealtimelocation2019.Model.Request;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
        "Content-Type:application/json",
            "Authorization:key=AAAA4chNAjg:APA91bElnyLi4h6c3EWqL1aaOCqr902CaJFLJbqWDacJY47g3UBIl0PmG19NE_MS5J_nved9ILO2Ixt_Cj8RzU-Wh_C64q62QbckvvRcUkMtNCnLqt45h_IMIUbGnum5clYdTxTA-BAj"
    })
    @POST("fcm/send")
    Observable<MyResponse> sendFriendRequestToUser(@Body Request body);
}
