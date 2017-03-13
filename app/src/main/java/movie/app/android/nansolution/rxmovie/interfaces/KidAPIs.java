package movie.app.android.nansolution.rxmovie.interfaces;

import io.reactivex.Observable;
import movie.app.android.nansolution.rxmovie.model.CategoryResponse;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ThaiPD on 3/13/2017.
 */

public interface KidAPIs {

    @GET("home")
    Observable<CategoryResponse> getDataForHomePage(@Query("page") int page, @Query("limit") int limit);
}
