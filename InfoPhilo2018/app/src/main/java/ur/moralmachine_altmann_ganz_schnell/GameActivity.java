package ur.moralmachine_altmann_ganz_schnell;

import android.app.Dialog;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {


    ViewPager viewPager;
    CustomSwipeAdapter adapter;
    Dialog myDialog;


    int counter1 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


        int i = R.drawable.scenario1_dec1;
        int x = R.drawable.scenario1_dec2;

        // for (int i = 1; i < 13; i++) {
        // for (int j = 1; i <= 2; i++){
        //

        Log.d("ID1: " + i, "ID2: " + x);


        viewPager = (ViewPager) findViewById(R.id.view_Pager);
        adapter = new CustomSwipeAdapter(this, i, x);
        viewPager.setAdapter(adapter);
        myDialog = new Dialog(this);


    }


}
