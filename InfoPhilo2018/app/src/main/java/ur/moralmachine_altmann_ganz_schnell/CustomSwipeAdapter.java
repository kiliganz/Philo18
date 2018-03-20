package ur.moralmachine_altmann_ganz_schnell;


import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomSwipeAdapter extends PagerAdapter {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();

    Dialog myDialog;


    private Context ctx;
    private int id1;
    private int id2;
    public boolean b = false;
    private LayoutInflater layoutInflater;
    SubmissionClass SubClass = new SubmissionClass();
    private int[] imageResource;


    public CustomSwipeAdapter(Context ctx, int id1, int id2) {

        this.id1 = id1;
        this.id2 = id2;
        this.ctx = ctx;
        Log.d("Resource ID1: " + id1, "Resource ID 2: " + id2);
        imageResource = new int[]{id1, id2};

    }


    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (RelativeLayout) object);
    }


    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {


        final int nameOfResourceOne = imageResource[0];
        final int nameOfResourceTwo = imageResource[1];

        //final ArrayList<String> idChecker = new ArrayList<String>();


        Log.d("ID Scen1", "" + R.drawable.scenario1_dec1);
        final int scen1 = R.drawable.scenario1_dec1;


        Log.d("ID Scen2", "" + R.drawable.scenario2_dec1);
        final int scen2 = R.drawable.scenario2_dec1;


        Log.d("ID Scen3", "" + R.drawable.scenario3_dec1);
        final int scen3 = R.drawable.scenario3_dec1;


        Log.d("ID Scen4", "" + R.drawable.scenario4_dec1);
        final int scen4 = R.drawable.scenario4_dec1;


        Log.d("ID Scen5", "" + R.drawable.scenario5_dec1);
        final int scen5 = R.drawable.scenario5_dec1;


        Log.d("ID Scen6", "" + R.drawable.scenario6_dec1);
        final int scen6 = R.drawable.scenario6_dec1;


        Log.d("ID Scen7", "" + R.drawable.scenario7_dec1);
        final int scen7 = R.drawable.scenario7_dec1;


        Log.d("ID Scen8", "" + R.drawable.scenario8_dec1);
        final int scen8 = R.drawable.scenario8_dec1;


        Log.d("ID Scen9", "" + R.drawable.scenario9_dec1);
        final int scen9 = R.drawable.scenario9_dec1;


        Log.d("ID Scen10", "" + R.drawable.scenario10_dec1);
        final int scen10 = R.drawable.scenario10_dec1;


        Log.d("ID Scen11", "" + R.drawable.scenario11_dec1);
        final int scen11 = R.drawable.scenario11_dec1;


        Log.d("ID Scen12", "" + R.drawable.scenario12_dec1);
        final int scen12 = R.drawable.scenario12_dec1;


        Log.d("ID Scen13", "" + R.drawable.scenario13_dec1);
        final int scen13 = R.drawable.scenario13_dec1;


        Log.d("UD ", "" + R.drawable.scenario1_dec2);
        final int dec1 = R.drawable.scenario1_dec2;


        Log.d("UD ", "" + R.drawable.scenario2_dec2);
        final int dec2 = R.drawable.scenario2_dec2;


        Log.d("UD ", "" + R.drawable.scenario3_dec2);
        final int dec3 = R.drawable.scenario3_dec2;


        Log.d("UD ", "" + R.drawable.scenario4_dec2);
        final int dec4 = R.drawable.scenario4_dec2;


        Log.d("UD ", "" + R.drawable.scenario5_dec2);
        final int dec5 = R.drawable.scenario5_dec2;


        Log.d("UD ", "" + R.drawable.scenario6_dec2);
        final int dec6 = R.drawable.scenario6_dec2;


        Log.d("UD ", "" + R.drawable.scenario7_dec2);
        final int dec7 = R.drawable.scenario7_dec2;


        Log.d("UD ", "" + R.drawable.scenario8_dec2);
        final int dec8 = R.drawable.scenario8_dec2;


        Log.d("UD ", "" + R.drawable.scenario9_dec2);
        final int dec9 = R.drawable.scenario9_dec2;


        Log.d("UD ", "" + R.drawable.scenario10_dec2);
        final int dec10 = R.drawable.scenario10_dec2;


        Log.d("UD ", "" + R.drawable.scenario11_dec2);
        final int dec11 = R.drawable.scenario11_dec2;


        Log.d("UD ", "" + R.drawable.scenario12_dec2);
        final int dec12 = R.drawable.scenario12_dec2;


        Log.d("UD ", "" + R.drawable.scenario13_dec2);
        final int dec13 = R.drawable.scenario13_dec2;


        Log.d("StringID Scenario_1: ", "" + nameOfResourceOne);
        Log.d("StringID Scenario_2: ", "" + nameOfResourceTwo);


        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final int imageCount = position + 1;
        View item_view;
        item_view = layoutInflater.inflate(R.layout.swipe_layout, container, false);


        Button confirmButton = (Button) item_view.findViewById(R.id.confirmButton);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (position) {


                    case 0:


                        switch (nameOfResourceOne) {
                            case scen1:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration = Toast.LENGTH_LONG;
                                Toast toast = Toast.makeText(ctx, text, duration);
                                toast.show();
                                SubClass.submitValues(1, 0, 1, 0);
                                ctx.startActivity(new Intent(ctx, Scenario_02.class));


                                myRef.child("Nutzer").child("Intervein").addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        int intervein = Integer.valueOf(dataSnapshot.getValue().toString());
                                        intervein += 1;
                                        myRef.child("Nutzer").child("Intervein").setValue(intervein);

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {
                                        Log.d("Fehler: ", "Database Error");

                                    }
                                });

                                myRef.child("Nutzer").child("Prodriver").addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {
                                        int prodriver = Integer.valueOf(dataSnapshot.getValue().toString());
                                        prodriver += 0;
                                        myRef.child("Nutzer").child("Intervein").setValue(prodriver);

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {
                                        Log.d("Fehler: ", "Database Error");


                                    }
                                });
                                myRef.child("Nutzer").child("Rules").addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {
                                        int rules = Integer.valueOf(dataSnapshot.getValue().toString());
                                        rules += 1;
                                        myRef.child("Nutzer").child("Rules").setValue(rules);

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {
                                        Log.d("Fehler: ", "Database Error");


                                    }
                                });

                                myRef.child("Nutzer").child("Util").addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {
                                        int util = Integer.valueOf(dataSnapshot.getValue().toString());
                                        util += 1;
                                        myRef.child("Nutzer").child("Util").setValue(util);

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {
                                        Log.d("Fehler: ", "Database Error");


                                    }
                                });


                                break;
                            case scen2:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text2 = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration2 = Toast.LENGTH_LONG;
                                Toast toast2 = Toast.makeText(ctx, text2, duration2);
                                toast2.show();
                                SubClass.submitValues(1, 0, 1, 0);
                                ctx.startActivity(new Intent(ctx, Scenario_03.class));

                                break;
                            case scen3:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text3 = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration3 = Toast.LENGTH_LONG;
                                Toast toast3 = Toast.makeText(ctx, text3, duration3);
                                toast3.show();
                                SubClass.submitValues(1, 0, 1, 0);
                                ctx.startActivity(new Intent(ctx, Scenario_04.class));

                                break;
                            case scen4:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text4 = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration4 = Toast.LENGTH_LONG;
                                Toast toast4 = Toast.makeText(ctx, text4, duration4);
                                toast4.show();
                                SubClass.submitValues(1, 0, 1, 0);
                                ctx.startActivity(new Intent(ctx, Scenario_05.class));

                                break;
                            case scen5:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text5 = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration5 = Toast.LENGTH_LONG;
                                Toast toast5 = Toast.makeText(ctx, text5, duration5);
                                toast5.show();
                                SubClass.submitValues(1, 0, 1, 0);
                                ctx.startActivity(new Intent(ctx, Scenario_06.class));

                                break;
                            case scen6:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text6 = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration6 = Toast.LENGTH_LONG;
                                Toast toast6 = Toast.makeText(ctx, text6, duration6);
                                toast6.show();
                                SubClass.submitValues(1, 0, 1, 0);
                                ctx.startActivity(new Intent(ctx, Scenario_07.class));

                                break;
                            case scen7:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text7 = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration7 = Toast.LENGTH_LONG;
                                Toast toast7 = Toast.makeText(ctx, text7, duration7);
                                toast7.show();
                                SubClass.submitValues(1, 0, 1, 0);
                                ctx.startActivity(new Intent(ctx, Scenario_08.class));

                                break;
                            case scen8:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text8 = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration8 = Toast.LENGTH_LONG;
                                Toast toast8 = Toast.makeText(ctx, text8, duration8);
                                toast8.show();
                                SubClass.submitValues(1, 0, 1, 0);
                                ctx.startActivity(new Intent(ctx, Scenario_09.class));

                                break;
                            case scen9:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text9 = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration9 = Toast.LENGTH_LONG;
                                Toast toast9 = Toast.makeText(ctx, text9, duration9);
                                toast9.show();
                                SubClass.submitValues(1, 0, 1, 0);
                                ctx.startActivity(new Intent(ctx, Scenario_10.class));

                                break;
                            case scen10:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text10 = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration10 = Toast.LENGTH_LONG;
                                Toast toast10 = Toast.makeText(ctx, text10, duration10);
                                toast10.show();
                                SubClass.submitValues(1, 0, 1, 0);
                                ctx.startActivity(new Intent(ctx, Scenario_11.class));

                                break;
                            case scen11:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text11 = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration11 = Toast.LENGTH_LONG;
                                Toast toast11 = Toast.makeText(ctx, text11, duration11);
                                toast11.show();
                                SubClass.submitValues(1, 0, 1, 0);
                                ctx.startActivity(new Intent(ctx, Scenario_12.class));

                                break;
                            case scen12:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text12 = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration12 = Toast.LENGTH_LONG;
                                Toast toast12 = Toast.makeText(ctx, text12, duration12);
                                toast12.show();
                                SubClass.submitValues(1, 0, 1, 0);
                                ctx.startActivity(new Intent(ctx, Scenario_13.class));

                                break;
                            case scen13:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text13 = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration13 = Toast.LENGTH_LONG;
                                Toast toast13 = Toast.makeText(ctx, text13, duration13);
                                toast13.show();
                                SubClass.submitValues(1, 0, 1, 0);
                                ctx.startActivity(new Intent(ctx, MainActivity.class));

                                break;

                        }
                        break;

                    case 1:
                        switch (nameOfResourceTwo) {
                            case dec1:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration = Toast.LENGTH_LONG;
                                Toast toast = Toast.makeText(ctx, text, duration);
                                toast.show();
                                SubClass.submitValues(22, 0, 22, 0);
                                ctx.startActivity(new Intent(ctx, Scenario_02.class));
                                break;
                            case dec2:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text2 = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration2 = Toast.LENGTH_LONG;
                                Toast toast2 = Toast.makeText(ctx, text2, duration2);
                                toast2.show();
                                SubClass.submitValues(1, 0, 1, 0);
                                ctx.startActivity(new Intent(ctx, Scenario_03.class));

                                break;
                            case dec3:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text3 = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration3 = Toast.LENGTH_LONG;
                                Toast toast3 = Toast.makeText(ctx, text3, duration3);
                                toast3.show();
                                SubClass.submitValues(1, 0, 1, 0);
                                ctx.startActivity(new Intent(ctx, Scenario_04.class));

                                break;
                            case dec4:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text4 = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration4 = Toast.LENGTH_LONG;
                                Toast toast4 = Toast.makeText(ctx, text4, duration4);
                                toast4.show();
                                SubClass.submitValues(1, 0, 1, 0);
                                ctx.startActivity(new Intent(ctx, Scenario_05.class));

                                break;
                            case dec5:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text5 = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration5 = Toast.LENGTH_LONG;
                                Toast toast5 = Toast.makeText(ctx, text5, duration5);
                                toast5.show();
                                SubClass.submitValues(1, 0, 1, 0);
                                ctx.startActivity(new Intent(ctx, Scenario_06.class));

                                break;
                            case dec6:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text6 = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration6 = Toast.LENGTH_LONG;
                                Toast toast6 = Toast.makeText(ctx, text6, duration6);
                                toast6.show();
                                SubClass.submitValues(1, 0, 1, 0);
                                ctx.startActivity(new Intent(ctx, Scenario_07.class));

                                break;
                            case dec7:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text7 = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration7 = Toast.LENGTH_LONG;
                                Toast toast7 = Toast.makeText(ctx, text7, duration7);
                                toast7.show();
                                SubClass.submitValues(1, 0, 1, 0);
                                ctx.startActivity(new Intent(ctx, Scenario_08.class));

                                break;
                            case dec8:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text8 = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration8 = Toast.LENGTH_LONG;
                                Toast toast8 = Toast.makeText(ctx, text8, duration8);
                                toast8.show();
                                SubClass.submitValues(1, 0, 1, 0);
                                ctx.startActivity(new Intent(ctx, Scenario_09.class));

                                break;
                            case dec9:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text9 = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration9 = Toast.LENGTH_LONG;
                                Toast toast9 = Toast.makeText(ctx, text9, duration9);
                                toast9.show();
                                SubClass.submitValues(1, 0, 1, 0);
                                ctx.startActivity(new Intent(ctx, Scenario_10.class));

                                break;
                            case dec10:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text10 = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration10 = Toast.LENGTH_LONG;
                                Toast toast10 = Toast.makeText(ctx, text10, duration10);
                                toast10.show();
                                SubClass.submitValues(1, 0, 1, 0);
                                ctx.startActivity(new Intent(ctx, Scenario_11.class));

                                break;
                            case dec11:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text11 = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration11 = Toast.LENGTH_LONG;
                                Toast toast11 = Toast.makeText(ctx, text11, duration11);
                                toast11.show();
                                SubClass.submitValues(1, 0, 1, 0);
                                ctx.startActivity(new Intent(ctx, Scenario_12.class));

                                break;
                            case dec12:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text12 = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration12 = Toast.LENGTH_LONG;
                                Toast toast12 = Toast.makeText(ctx, text12, duration12);
                                toast12.show();
                                SubClass.submitValues(1, 0, 1, 0);
                                ctx.startActivity(new Intent(ctx, Scenario_13.class));

                                break;
                            case dec13:
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text13 = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration13 = Toast.LENGTH_LONG;
                                Toast toast13 = Toast.makeText(ctx, text13, duration13);
                                toast13.show();
                                SubClass.submitValues(1, 0, 1, 0);
                                ctx.startActivity(new Intent(ctx, MainActivity.class));

                                break;
                        }
                        break;
                }
            }


        });


        ImageView imageView = (ImageView) item_view.findViewById(R.id.image_view);
        imageView.setOnClickListener(new View.OnClickListener()

        {
            @NonNull
            @Override
            public void onClick(View v) {

                switch (imageCount) {
                    case 1:
                        TextView txtClose;

                        switch (nameOfResourceOne) {


                            case scen1:
                                Log.d("Testmessage", "Bild 1 wurde angeklickt");
                                myDialog = new Dialog(ctx);
                                myDialog.setContentView(R.layout.popup_case_one_dec_one);
                                txtClose = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();

                                break;
                            case scen2:
                                Log.d("Testmessage", "Bild 1 wurde angeklickt");
                                myDialog = new Dialog(ctx);
                                myDialog.setContentView(R.layout.popup_case_two_dec_one);
                                txtClose = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();

                                break;
                            case scen3:
                                Log.d("Testmessage", "Bild 1 wurde angeklickt");
                                myDialog = new Dialog(ctx);
                                myDialog.setContentView(R.layout.popup_case_three_dec_one);
                                txtClose = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();


                                break;
                            case scen4:
                                Log.d("Testmessage", "Bild 1 wurde angeklickt");
                                myDialog = new Dialog(ctx);
                                myDialog.setContentView(R.layout.popup_case_four_dec_one);
                                txtClose = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();

                                break;
                            case scen5:
                                Log.d("Testmessage", "Bild 1 wurde angeklickt");
                                myDialog = new Dialog(ctx);
                                myDialog.setContentView(R.layout.popup_case_five_dec_one);
                                txtClose = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();
                                break;

                            case scen6:
                                Log.d("Testmessage", "Bild 1 wurde angeklickt");
                                myDialog = new Dialog(ctx);
                                myDialog.setContentView(R.layout.popup_case_six_dec_one);
                                txtClose = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();
                                break;

                            case scen7:

                                Log.d("Testmessage", "Bild 1 wurde angeklickt");
                                myDialog = new Dialog(ctx);
                                myDialog.setContentView(R.layout.popup_case_seven_dec_one);
                                txtClose = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();
                                break;

                            case scen8:
                                Log.d("Testmessage", "Bild 1 wurde angeklickt");
                                myDialog = new Dialog(ctx);
                                myDialog.setContentView(R.layout.popup_case_eight_dec_one);
                                txtClose = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();
                                break;

                            case scen9:
                                Log.d("Testmessage", "Bild 1 wurde angeklickt");
                                myDialog = new Dialog(ctx);
                                myDialog.setContentView(R.layout.popup_case_nine_dec_one);
                                txtClose = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();
                                break;

                            case scen10:
                                Log.d("Testmessage", "Bild 1 wurde angeklickt");
                                myDialog = new Dialog(ctx);
                                myDialog.setContentView(R.layout.popup_case_ten_dec_one);
                                txtClose = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();
                                break;

                            case scen11:
                                Log.d("Testmessage", "Bild 1 wurde angeklickt");
                                myDialog = new Dialog(ctx);
                                myDialog.setContentView(R.layout.popup_case_eleven_dec_one);
                                txtClose = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();
                                break;

                            case scen12:
                                Log.d("Testmessage", "Bild 1 wurde angeklickt");
                                myDialog = new Dialog(ctx);
                                myDialog.setContentView(R.layout.popup_case_twelve_dec_one);
                                txtClose = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();
                                break;

                            case scen13:
                                Log.d("Testmessage", "Bild 1 wurde angeklickt");
                                myDialog = new Dialog(ctx);
                                myDialog.setContentView(R.layout.popup_case_thirteen_dec_one);
                                txtClose = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();
                                break;


                        }


                       /* Log.d("Testmessage", "Bild 1 wurde angeklickt");
                        myDialog = new Dialog(ctx);
                        TextView txtClose;
                        myDialog.setContentView(R.layout.popup_case_one_dec_one);
                        txtClose = (TextView) myDialog.findViewById(R.id.CloseButton);
                        txtClose.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                myDialog.dismiss();
                            }
                        });
                        myDialog.show();*/

                        break;
                    case 2:

                        TextView txtClose2;
                        switch (nameOfResourceTwo) {

                            case dec1:
                                myDialog = new Dialog(ctx);


                                myDialog.setContentView(R.layout.popup_case_one_dec_two);
                                txtClose2 = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();

                                break;
                            case dec2:
                                myDialog = new Dialog(ctx);


                                myDialog.setContentView(R.layout.popup_case_two_dec_two);
                                txtClose2 = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();


                                break;
                            case dec3:
                                myDialog = new Dialog(ctx);


                                myDialog.setContentView(R.layout.popup_case_three_dec_two);
                                txtClose2 = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();


                                break;
                            case dec4:
                                myDialog = new Dialog(ctx);


                                myDialog.setContentView(R.layout.popup_case_four_dec_two);
                                txtClose2 = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();


                                break;
                            case dec5:
                                myDialog = new Dialog(ctx);


                                myDialog.setContentView(R.layout.popup_case_five_dec_two);
                                txtClose2 = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();


                                break;
                            case dec6:
                                myDialog = new Dialog(ctx);


                                myDialog.setContentView(R.layout.popup_case_six_dec_two);
                                txtClose2 = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();

                                break;
                            case dec7:
                                myDialog = new Dialog(ctx);


                                myDialog.setContentView(R.layout.popup_case_seven_dec_two);
                                txtClose2 = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();


                                break;
                            case dec8:
                                myDialog = new Dialog(ctx);


                                myDialog.setContentView(R.layout.popup_case_eight_dec_two);
                                txtClose2 = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();


                                break;
                            case dec9:
                                myDialog = new Dialog(ctx);


                                myDialog.setContentView(R.layout.popup_case_nine_dec_two);
                                txtClose2 = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();


                                break;
                            case dec10:
                                myDialog = new Dialog(ctx);


                                myDialog.setContentView(R.layout.popup_case_ten_dec_two);
                                txtClose2 = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();

                                break;
                            case dec11:
                                myDialog = new Dialog(ctx);


                                myDialog.setContentView(R.layout.popup_case_eleven_dec_two);
                                txtClose2 = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();


                                break;
                            case dec12:
                                myDialog = new Dialog(ctx);


                                myDialog.setContentView(R.layout.popup_case_twelve_dec_two);
                                txtClose2 = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();

                                break;
                            case dec13:
                                myDialog = new Dialog(ctx);


                                myDialog.setContentView(R.layout.popup_case_thirteen_dec_two);
                                txtClose2 = (TextView) myDialog.findViewById(R.id.CloseButton);
                                txtClose2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog.dismiss();
                                    }
                                });
                                myDialog.show();

                                break;

                        }
                        /*Log.d("Testmessage", "Bild 2 wurde angeklickt");


                        myDialog = new Dialog(ctx);

                        myDialog.setContentView(R.layout.popup_case_one_dec_two);
                        txtClose = (TextView) myDialog.findViewById(R.id.CloseButton);
                        txtClose.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                myDialog.dismiss();
                            }
                        });
                        myDialog.show();*/
                        break;
                }


            }


        });

        TextView textView = (TextView) item_view.findViewById(R.id.image_description);


        imageView.setImageResource(imageResource[position]);

        textView.setText("Szenario " + imageCount);
        container.addView(item_view);


        return item_view;

    }

    @Override
    public int getCount() {
        return imageResource.length;
    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {


        container.removeView((RelativeLayout) object);
        super.destroyItem(container, position, object);


    }


}
