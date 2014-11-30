package sudosaints.com.testsample;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import sudosaints.com.testsample.Models.ExploreModel;


/**
 * Created by ribbi on 14-11-2014.
 */
public class ExploreFragment extends Fragment {
    ListView list;
    List<ExploreModel> exploreModel;
   ExploreAdapter exploreAdapter;


    View view;
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.explorefragment,container,false);
        return  view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        list=(ListView)view.findViewById(R.id.hhlist);
        exploreModel= new ArrayList<ExploreModel>();
        exploreModel.add(0, new ExploreModel("BUY ONE GET ONE ", "4:00 to 9:00", R.color.explorecolor1,R.drawable.tequilalllol));
        exploreModel.add(1, new ExploreModel("EXTENDED OFFERS ", "4:00 to 9:00", R.color.explorecolor2,R.drawable.beer1));
        exploreModel.add(2, new ExploreModel("OFFERS FOR WORKING CLASS", "4:00 to 9:00", R.color.explorecolor3,R.drawable.beer));
        exploreModel.add(3, new ExploreModel("WHATS GOOD TONIGHT", "4:00 to 9:00", R.color.explorecolor4,R.drawable.opener));
        exploreModel.add(4, new ExploreModel("HAPPY TIMES", "4:00 to 9:00", R.color.explorecolor5,R.drawable.mug));
        exploreModel.add(5, new ExploreModel("HARD ROCK CAFE", "4:00 to 9:00", R.color.explorecolor6,R.drawable.monday));
        exploreModel.add(6, new ExploreModel("HOPPI POLA", "4:00 to 9:00", R.color.basecolor5,R.drawable.cheers_yall));
        exploreModel.add(7, new ExploreModel("JUST CHILL OUT", "4:00 to 9:00", R.color.basecolor6,R.drawable.friday));
        exploreModel.add(8, new ExploreModel("OFFS ON KARIOKE", "4:00 to 9:00", R.color.pink,R.drawable.glass));
        exploreModel.add(9, new ExploreModel("DESI CHILL OUTS", "4:00 to 9:00", R.color.purple,R.drawable.chief ));
        exploreAdapter = new ExploreAdapter(getActivity(),exploreModel);
        list.setAdapter(exploreAdapter);


    }


}

