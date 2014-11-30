package sudosaints.com.testsample;

import android.app.ActionBar;
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
import sudosaints.com.testsample.Models.HappyHourModel;

/**
 * Created by ribbi on 30-11-2014.
 */
public class HappyHourAdapter extends BaseAdapter {
    LayoutInflater layoutInflater;
    View view;
    ViewHolder viewHolder;
    Activity activity;
    List<HappyHourModel> happyHourModel;

    HappyHourAdapter(Activity activity,List<HappyHourModel> happyHourModel)
    {
        this.activity=activity;
        this.happyHourModel=happyHourModel;
        layoutInflater=activity.getLayoutInflater();
    }

    public int getCount() {
        return  happyHourModel.size();
    }

    @Override
    public Object getItem(int i) {
        return happyHourModel.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        view = layoutInflater.inflate(R.layout.happy_hour_fragment_row, null);
        viewHolder = new ViewHolder();
        viewHolder.textPlace = (TextView) view.findViewById(R.id.text_place);
        viewHolder.textTime=(TextView)view.findViewById(R.id.text_time);
        viewHolder.imagePlace=(ImageView)view.findViewById(R.id.image_place);
        view.setTag(viewHolder);

        final HappyHourModel happyHourModel = (HappyHourModel) getItem(i);
        final ViewHolder viewHolder = (ViewHolder) view.getTag();
        viewHolder.imagePlace.setBackgroundResource(happyHourModel.getImagePlace());
        viewHolder.textPlace.setText(happyHourModel.getTextPlace());
        viewHolder.textTime.setText(happyHourModel.getTextTime());
       viewHolder.imagePlace.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i = new Intent(activity,PlaceDetailActivity.class);
               activity.startActivity(i);
           }
       });



        return view;
    }
    private static class ViewHolder {

        TextView textPlace,textTime;
        ImageView imagePlace;

    }
}
