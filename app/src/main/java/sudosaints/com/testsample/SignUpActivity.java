package sudosaints.com.testsample;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.text.method.CharacterPickerDialog;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;


public class SignUpActivity extends ActionBarActivity
{

    ViewPager viewPager;
    android.widget.Button fbSignUp;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        viewPager=(ViewPager)findViewById(R.id.viewpager);
        FragmentManager fm= getSupportFragmentManager();
        viewPager.setAdapter(new SignUpPageAdapter(fm));
        fbSignUp=(android.widget.Button)findViewById(R.id.fbsignup);
        fbSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
Intent i = new Intent(SignUpActivity.this,SampleActivity.class);
                startActivity(i);
            }
        });


    }





}
