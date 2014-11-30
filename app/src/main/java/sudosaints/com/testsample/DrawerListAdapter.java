package sudosaints.com.testsample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;



/**
 * Created by ribbi on 14-11-2014.
 */
public class DrawerListAdapter extends BaseAdapter {
    LayoutInflater inflater;
    Context context;
    DrawerListAdapter(Context context)
    {
        this.context=context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }
    public int getCount() {
        return 5;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        CompleteListViewHolder viewHolder;
        if (view == null) {
            v = inflater.inflate(R.layout.drawer_row, null);
            viewHolder = new CompleteListViewHolder(v);
            v.setTag(viewHolder);
        } else {
            viewHolder = (CompleteListViewHolder) v.getTag();

        }
        if(i==0) {
           viewHolder.imagetitle.setBackgroundResource(R.drawable.homeicon);
        }
        if(i==1) {

            viewHolder.imagetitle.setBackgroundResource(R.drawable.favouriteicon);


        }
        if(i==2) {


            viewHolder.imagetitle.setBackgroundResource(R.drawable.feedbackicon);
        }
        if(i==3) {


            viewHolder.imagetitle.setBackgroundResource(R.drawable.settingsicon);
        }
        if(i==4) {
            viewHolder.imagetitle.setMaxHeight(200);
            viewHolder.imagetitle.setBackgroundResource(R.drawable.signouticon);
        }return v;
    }
    class CompleteListViewHolder {
        public TextView title;
 public ImageView imagetitle;
        public CompleteListViewHolder(View base) {
            title = (TextView) base.findViewById(R.id.text_title);
imagetitle=(ImageView)base.findViewById(R.id.image_title);
        }
    }}
