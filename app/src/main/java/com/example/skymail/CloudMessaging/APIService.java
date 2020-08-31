package com.example.skymail.CloudMessaging;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAHMnkxgs:APA91bH63LV9_X1z8PuuLJHYdWb6QQ7W08pefxb0SFX76l19x6rXgOAhos2N1ZMxkFztWzzzzDBhAeUmxmghkxOnvuRGqmwY7uUlRE7TT72Ga9_K3dg0Uodbld-e0wQS5VU37H1Lflez" // Your server key refer to video for finding your server key
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotifcation(@Body NotificationSender body);
}

