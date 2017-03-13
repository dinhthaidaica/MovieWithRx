package movie.app.android.nansolution.rxmovie.service;

import movie.app.android.nansolution.rxmovie.interfaces.KidAPIs;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ThaiPD on 3/13/2017.
 */

public class NetworkManager {

    private final String BASE_URL = "";

    private KidAPIs kidApi;

    public NetworkManager() {
        Retrofit retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build();

        kidApi = retrofit.create(KidAPIs.class);
    }

    public KidAPIs getApi() {
        return this.kidApi;
    }
}
