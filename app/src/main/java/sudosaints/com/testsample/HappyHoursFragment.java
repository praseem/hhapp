package sudosaints.com.testsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SlidingDrawer;

import java.util.ArrayList;
import java.util.List;

import sudosaints.com.testsample.Models.ExploreModel;
import sudosaints.com.testsample.Models.HappyHourModel;


public class HappyHoursFragment extends Fragment {

    View view;
    ListView list;
    FloatingActionButton fab ;

    HappyHourAdapter happyHourAdapter;
    RelativeLayout slideButton;
    List<HappyHourModel> happyHourModel;
    SlidingDrawer slidingDrawer;
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.happyhoursfragment,container,false);
    return  view;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
       list=(ListView)view.findViewById(R.id.list);
        slideButton = (RelativeLayout)getActivity().findViewById(R.id.slideButton);
        slidingDrawer = (SlidingDrawer)getActivity().findViewById(R.id.SlidingDrawer);
       fab = (FloatingActionButton) getActivity().findViewById(R.id.fabButton);
        fab.setBackgroundColor(getActivity().getResources().getColor(R.color.orange2));
        fab.setDrawableIcon(getResources().getDrawable(R.drawable.mycalender));

        happyHourModel= new ArrayList<HappyHourModel>();
        happyHourModel.add(0, new HappyHourModel( "4:00 to 8:00","High spirits ", R.drawable.hhplace1));
        happyHourModel.add(1, new HappyHourModel( "4:00 to 5:00","Hard Rock Cafe", R.drawable.hhplace2));
        happyHourModel.add(2, new HappyHourModel("4:00 to 10:00","Hoppi Pola" ,R.drawable.hhplace3));
        happyHourModel.add(3, new HappyHourModel( "4:00 to 3:00","Swig",R.drawable.hhplace4));
        happyHourModel.add(4, new HappyHourModel("4:00 to 4:00","Cafe !730",  R.drawable.hhplace5));
        happyHourModel.add(5, new HappyHourModel("4:00 to 5:00","Cafe India", R.drawable.hhplace6));
        happyHourModel.add(6, new HappyHourModel("4:00 to 6:00","Chillies", R.drawable.hhplace5));
        happyHourModel.add(7, new HappyHourModel("4:00 to 8:00", "Que bar", R.drawable.hhplace3));
        happyHourModel.add(8, new HappyHourModel("4:00 to 3:00", "Some Place", R.drawable.hhplace5));
        happyHourModel.add(9, new HappyHourModel("4:00 to 1:00", "Some Other Place", R.drawable.hhplace1));
        happyHourAdapter = new HappyHourAdapter(getActivity(),happyHourModel);
        list.setAdapter(happyHourAdapter);

        slidingDrawer.setOnDrawerOpenListener(new SlidingDrawer.OnDrawerOpenListener() {
            @Override
            public void onDrawerOpened() {




            }
        });
        slidingDrawer.setOnDrawerCloseListener(new SlidingDrawer.OnDrawerCloseListener() {
            @Override
            public void onDrawerClosed() {

            }
        });
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if (slidingDrawer.isOpened()) {
                    slidingDrawer.animateClose();
                } else {
                    slidingDrawer.animateOpen();
                }

            }
        });


    }




}
