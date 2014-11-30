package sudosaints.com.testsample;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import sudosaints.com.testsample.Models.ExploreModel;
import sudosaints.com.testsample.Models.OfferPlaceListModel;


public class OfferPlaceListActivity extends ActionBarActivity {
Toolbar toolbar;
    int color;
    RelativeLayout relativeLayout;
    ListView list;
    TextView textoffer;
    List<OfferPlaceListModel> offerPlaceListModel ;
    OfferPlaceListAdapter offerPlaceListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_offer_place_list);
        list=(ListView)findViewById(R.id.list);
        textoffer=(TextView)findViewById(R.id.textoffer);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
relativeLayout=(RelativeLayout)findViewById(R.id.layout);
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(R.drawable.backback);

        Intent i = getIntent();
        color=i.getIntExtra("color",1);
        String offername=i.getStringExtra("offername");
        textoffer.setText(offername);
        relativeLayout.setBackgroundColor(getResources().getColor(color));
offerPlaceListModel= new ArrayList<OfferPlaceListModel>();

        offerPlaceListModel.add(0,new OfferPlaceListModel("high spirits cafe","koregaon park",R.drawable.exploreplace1));
        offerPlaceListModel.add(1,new OfferPlaceListModel("high spirits cafe","koregaon park",R.drawable.exploreplace2));
        offerPlaceListModel.add(2,new OfferPlaceListModel("high spirits cafe","koregaon park",R.drawable.exploreplace3));
        offerPlaceListModel.add(3,new OfferPlaceListModel("high spirits cafe","koregaon park",R.drawable.exploreplace4));
        offerPlaceListModel.add(4,new OfferPlaceListModel("high spirits cafe","koregaon park",R.drawable.exploreplace5));
        offerPlaceListModel.add(5,new OfferPlaceListModel("high spirits cafe","koregaon park",R.drawable.exploreplace6));
        offerPlaceListModel.add(6,new OfferPlaceListModel("high spirits cafe","koregaon park",R.drawable.exploreplace7));
        offerPlaceListModel.add(7,new OfferPlaceListModel("high spirits cafe","koregaon park",R.drawable.exploreplace3));
        offerPlaceListModel.add(8,new OfferPlaceListModel("high spirits cafe","koregaon park",R.drawable.exploreplace2));
        offerPlaceListModel.add(9,new OfferPlaceListModel("high spirits cafe","koregaon park",R.drawable.exploreplace1));
        offerPlaceListAdapter = new OfferPlaceListAdapter(OfferPlaceListActivity.this,offerPlaceListModel);
        list.setAdapter(offerPlaceListAdapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.offer_place_list, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:

                super.onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
