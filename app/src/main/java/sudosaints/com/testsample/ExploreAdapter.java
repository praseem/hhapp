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

/**
 * Created by poorva on 23/11/14.
 */
public class ExploreAdapter extends BaseAdapter {
    Activity activity;
    ViewHolder viewHolder;
    LayoutInflater layoutInflater;
    List<ExploreModel> exploreModel;

    ExploreAdapter(Activity activity,List<ExploreModel> exploreModel)
    {
        this.activity=activity;
        this.exploreModel=exploreModel;
        layoutInflater=activity.getLayoutInflater();
    }

    public int getCount() {
        return exploreModel.size();
    }

    @Override
    public Object getItem(int i) {
        return exploreModel.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }




    public View getView(int i, View view, ViewGroup viewGroup) {

        view = layoutInflater.inflate(R.layout.explore_list_row, null);
        viewHolder = new ViewHolder();
        viewHolder.textPlaceName = (TextView) view.findViewById(R.id.text_placename);
        viewHolder.imagePlace=(ImageView)view.findViewById(R.id.image_hhlist);
        viewHolder.linearLayout=(LinearLayout)view.findViewById(R.id.layout);
        viewHolder.imageicon=(ImageView)view.findViewById(R.id.image);
        view.setTag(viewHolder);

      final ExploreModel exploreModel = (ExploreModel) getItem(i);
        final ViewHolder viewHolder = (ViewHolder) view.getTag();
       viewHolder.imageicon.setBackgroundResource(exploreModel.getImage());
        viewHolder.imagePlace.setBackgroundColor(activity.getResources().getColor(exploreModel.getColor()));
        viewHolder.textPlaceName.setText(exploreModel.getPlaceName());
viewHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i = new Intent(activity,OfferPlaceListActivity.class);
        i.putExtra("color",exploreModel.getColor());
        i.putExtra("offername",exploreModel.getPlaceName());
       activity.startActivity(i);
    }
});



        return view;
    }

    private static class ViewHolder {

        TextView textPlaceName;
        LinearLayout linearLayout;
        ImageView imagePlace,imageicon;

    }
}



