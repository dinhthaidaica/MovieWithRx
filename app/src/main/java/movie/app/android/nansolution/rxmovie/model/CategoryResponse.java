package movie.app.android.nansolution.rxmovie.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ThaiPD on 3/13/2017.
 */

public class CategoryResponse extends Category {

    @SerializedName("categories")
    List<String> categories;

    public List<String> getCategories() {
        return categories;
    }
}
