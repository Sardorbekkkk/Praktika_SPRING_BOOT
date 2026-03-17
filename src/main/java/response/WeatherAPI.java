package response;

import com.example.demo.request.CurrentResponse;
import com.example.demo.request.NewCurrentResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface WeatherAPI {

    @GET("/v1/current.json?key=03ea573c8cdd4c3a8a0223740261503")
    Call<NewCurrentResponse> Post(@Query("q") String q);
}
