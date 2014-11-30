package sudosaints.com.testsample.Models;

/**
 * Created by ribbi on 30-11-2014.
 */
public class HappyHourModel {
    String textPlace,textTime;
    int imagePlace;
    public HappyHourModel(String textTime, String textPlace, int imagePlace)
    {
        this.textPlace=textPlace;
        this.textTime=textTime;
        this.imagePlace=imagePlace;
    }

    public String getTextPlace() {
        return textPlace;
    }

    public void setTextPlace(String textPlace) {
        this.textPlace = textPlace;
    }

    public int getImagePlace() {
        return imagePlace;
    }

    public void setImagePlace(int imagePlace) {
        this.imagePlace = imagePlace;
    }

    public String getTextTime() {
        return textTime;
    }

    public void setTextTime(String textTime) {
        this.textTime = textTime;
    }
}
