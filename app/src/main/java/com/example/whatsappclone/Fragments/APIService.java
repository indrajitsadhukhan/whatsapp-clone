package com.example.whatsappclone.Fragments;


import com.example.whatsappclone.Notifications.MyResponse;
import com.example.whatsappclone.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAj-Gt6sk:APA91bHF4S7QrYi4_flssbiOKLKBv3LEvqW2EdE3SkBGlzJdu4IW4frUNZEVmK0Hh_swR5eut01GS666AqJMAg67U0MNyPb0J8A_DjGG55SvNhSWwt0XZdsP1Ny-CqKBEDh2SDDGA5H5"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
