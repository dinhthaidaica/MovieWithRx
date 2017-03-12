package movie.app.android.nansolution.rxmovie.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ThaiPD on 3/12/2017.
 * this class is data model represents for one category, which hold many videos
 */

public class Category {

    @SerializedName("total")
    int numberOfVideos;

    @SerializedName("videos")
    List<Video> listVideo;
}
