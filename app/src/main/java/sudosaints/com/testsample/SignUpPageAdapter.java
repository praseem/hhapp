package sudosaints.com.testsample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ribbi on 14-11-2014.
 */
public class SignUpPageAdapter extends FragmentPagerAdapter {
    Fragment fragment;
    SignUpPageAdapter(FragmentManager fm)
    {
        super(fm);
    }
    @Override
    public Fragment getItem(int i) {
       if(i==0)
       {
           fragment= new WalkthroughFragment1();

       }
        if(i==1)
        {
            fragment= new WalkthroughFragment2();

        }
        return  fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
