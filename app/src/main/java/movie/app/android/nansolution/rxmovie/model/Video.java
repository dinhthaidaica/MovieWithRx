package movie.app.android.nansolution.rxmovie.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ThaiPD on 3/12/2017.
 */

public class Video {

    @SerializedName("category_name")
    String categoryName;

    @SerializedName("id")
    String id;

    @SerializedName("image")
    String image;

    @SerializedName("name")
    String videoName;

    @SerializedName("video_urls")
    List<String> videos;

    public String getCategoryName() {
        return categoryName;
    }

    public String getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public String getVideoName() {
        return videoName;
    }

    public List<String> getVideos() {
        return videos;
    }

}
