package response;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.net.http.HttpClient;
import java.util.concurrent.TimeUnit;

public class Weather {

    private Retrofit retrofit;
    private static  Weather instance;
    private static final String BASE_URL = "https://api.weatherapi.com";

    private Weather(){
        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(30, TimeUnit.SECONDS)
                .connectTimeout(30,TimeUnit.SECONDS)
                .build();


        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static Weather getInstance(){
        if (instance == null){
            instance = new Weather();
        }
        return instance;
    }

    public WeatherAPI api(){
        return retrofit.create(WeatherAPI.class);
    }

}
