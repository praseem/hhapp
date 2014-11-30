package sudosaints.com.testsample.Models;

/**
 * Created by ribbi on 29-11-2014.
 */
public class OfferPlaceListModel {

    String placeName,placeAddress;
    int placeImage;
    public OfferPlaceListModel(String placeName, String placeAddress, int placeImage)
    {
        this.placeAddress=placeAddress;
        this.placeImage=placeImage;
        this.placeName=placeName;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public int getPlaceImage() {
        return placeImage;
    }

    public void setPlaceImage(int placeImage) {
        this.placeImage = placeImage;
    }

    public String getPlaceAddress() {
        return placeAddress;
    }

    public void setPlaceAddress(String placeAddress) {
        this.placeAddress = placeAddress;
    }
}
