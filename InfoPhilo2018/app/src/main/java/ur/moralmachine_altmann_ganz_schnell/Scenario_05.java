package ur.moralmachine_altmann_ganz_schnell;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class Scenario_05 extends AppCompatActivity {

    ViewPager viewPager;
    CustomSwipeAdapter adapter;
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenario_x);


        viewPager = (ViewPager) findViewById(R.id.view_Pager);
        adapter = new CustomSwipeAdapter(this, R.drawable.scenario5_dec1, R.drawable.scenario5_dec2);
        viewPager.setAdapter(adapter);
        myDialog = new Dialog(this);


    }
}
