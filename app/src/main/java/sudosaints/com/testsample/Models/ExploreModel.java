package sudosaints.com.testsample.Models;

/**
 * Created by poorva on 23/11/14.
 */
public class ExploreModel {

    int color,image;
    String placeName,placeTime;
    ExploreModel()
    {

    }

    public ExploreModel(String placeName, String placeTime, int color,int image)
    {
        this.color = color;
        this.placeName=placeName;
        this.placeTime=placeTime;
        this.image=image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getPlaceTime() {
        return placeTime;
    }

    public void setPlaceTime(String placeTime) {
        this.placeTime = placeTime;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }
}