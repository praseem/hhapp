package sudosaints.com.testsample;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import sudosaints.com.testsample.Models.ExploreModel;
import sudosaints.com.testsample.Models.OfferPlaceListModel;

/**
 * Created by ribbi on 29-11-2014.
 */
public class OfferPlaceListAdapter extends BaseAdapter {

    LayoutInflater layoutInflater;
    List<OfferPlaceListModel> offerPlaceListModel;
    Activity activity;
    View view;
    ViewHolder viewHolder;

    OfferPlaceListAdapter(Activity activity,List<OfferPlaceListModel> offerPlaceListModel)
    {
        this.activity=activity;
        this.offerPlaceListModel=offerPlaceListModel;
        layoutInflater=activity.getLayoutInflater();
    }
    public int getCount() {
        return offerPlaceListModel.size();
    }

    @Override
    public Object getItem(int i) {
        return offerPlaceListModel.get(i);
    }

    @Override
    public long getItemId(int i) {

       return  i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = layoutInflater.inflate(R.layout.offer_place_list_item, null);
        viewHolder = new ViewHolder();
        viewHolder.textPlace = (TextView) view.findViewById(R.id.text_place);
        viewHolder.imagePlace=(ImageView)view.findViewById(R.id.imageView);
        viewHolder.textAddress=(TextView)view.findViewById(R.id.text_address);
        view.setTag(viewHolder);

        final OfferPlaceListModel offerPlaceListModel = (OfferPlaceListModel) getItem(i);
        final ViewHolder viewHolder = (ViewHolder) view.getTag();
        viewHolder.textPlace.setText(offerPlaceListModel.getPlaceName());
        viewHolder.textAddress.setText(offerPlaceListModel.getPlaceAddress());
        viewHolder.imagePlace.setBackgroundResource(offerPlaceListModel.getPlaceImage());



        return view;
    }
    private static class ViewHolder {

        TextView textPlace,textAddress;

        ImageView imagePlace;

    }
}
