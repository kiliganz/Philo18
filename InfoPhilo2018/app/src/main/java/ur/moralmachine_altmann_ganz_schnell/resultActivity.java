package ur.moralmachine_altmann_ganz_schnell;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class resultActivity extends AppCompatActivity {


    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();
    public int avgCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        setAvg();
        instanciateButtons();
        updateProgressBars();
        resetStats();


    }


    public void updateProgressBars() {


        ///


        myRef.child("Nutzer").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                long test = dataSnapshot.getChildrenCount();
                Log.d("Anzahl Nutzer: ", "" + test);


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        ///

        final ProgressBar interveinProgressBar = (ProgressBar) findViewById(R.id.interveinStats);

        myRef.child("Nutzer").child("User: " + LoginActivity.userId).child("Intervein").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.getValue() != null) {

                    int interveinStats = Integer.valueOf(dataSnapshot.getValue().toString());
                    interveinProgressBar.setProgress(interveinStats);
                } else {
                    int interveinStats = 0;
                    interveinProgressBar.setProgress(interveinStats);

                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        final ProgressBar prodriverProgressBar = (ProgressBar) findViewById(R.id.proDriverStats);
        myRef.child("Nutzer").child("User: " + LoginActivity.userId).child("Prodriver").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.getValue() != null) {

                    int proDriverStats = Integer.valueOf(dataSnapshot.getValue().toString());
                    prodriverProgressBar.setProgress(proDriverStats);
                } else {
                    int proDriverStats = 0;
                    prodriverProgressBar.setProgress(proDriverStats);

                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        final ProgressBar rulesProgressBar = (ProgressBar) findViewById(R.id.rulesStats);
        myRef.child("Nutzer").child("User: " + LoginActivity.userId).child("Rules").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.getValue() != null) {

                    int rulesStats = Integer.valueOf(dataSnapshot.getValue().toString());
                    rulesProgressBar.setProgress(rulesStats);
                } else {
                    int rulesStats = 0;
                    rulesProgressBar.setProgress(rulesStats);

                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        final ProgressBar utilProgressBar = (ProgressBar) findViewById(R.id.utilStats);
        myRef.child("Nutzer").child("User: " + LoginActivity.userId).child("Util").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.getValue() != null) {

                    int rulesStats = Integer.valueOf(dataSnapshot.getValue().toString());
                    utilProgressBar.setProgress(rulesStats);
                } else {
                    int rulesStats = 0;
                    utilProgressBar.setProgress(rulesStats);

                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        myRef.child("Average").child("Intervein").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.getValue() != null) {

                    int avgIntervein = Integer.valueOf(dataSnapshot.getValue().toString());

                    interveinProgressBar.setSecondaryProgress(avgIntervein);
                } else {
                    int avgIntervein = 0;
                    interveinProgressBar.setSecondaryProgress(avgIntervein);


                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        myRef.child("Average").child("Prodriver").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.getValue() != null) {

                    int avgProdriver = Integer.valueOf(dataSnapshot.getValue().toString());

                    prodriverProgressBar.setSecondaryProgress(avgProdriver);
                } else {
                    int avgProdriver = 0;
                    prodriverProgressBar.setSecondaryProgress(avgProdriver);


                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        myRef.child("Average").child("Rules").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.getValue() != null) {

                    int avgRules = Integer.valueOf(dataSnapshot.getValue().toString());

                    rulesProgressBar.setSecondaryProgress(avgRules);
                } else {
                    int avgRules = 0;
                    rulesProgressBar.setSecondaryProgress(avgRules);


                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        myRef.child("Average").child("Util").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.getValue() != null) {

                    int avgUtil = Integer.valueOf(dataSnapshot.getValue().toString());

                    utilProgressBar.setSecondaryProgress(avgUtil);
                } else {
                    int avgUtil = 0;
                    utilProgressBar.setSecondaryProgress(avgUtil);


                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    public void instanciateButtons() {
        Button backToMenu = findViewById(R.id.backToMenu);
        backToMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(resultActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


    public void resetStats() {
        Button resetStats = findViewById(R.id.resetStats);
        resetStats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myRef.child("Nutzer").child("User: " + LoginActivity.userId).child("Intervein").setValue(0);
                myRef.child("Nutzer").child("User: " + LoginActivity.userId).child("Prodriver").setValue(0);
                myRef.child("Nutzer").child("User: " + LoginActivity.userId).child("Rules").setValue(0);
                myRef.child("Nutzer").child("User: " + LoginActivity.userId).child("Util").setValue(0);
                updateProgressBars();

            }
        });
    }


    public void setAvg() {
        myRef.child("Nutzer").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                long test = dataSnapshot.getChildrenCount();
                int count = (int) test;
                Log.d("Anzahl Nutzer: ", "" + test);
                avgCount = count;
                Log.d("adojfwdjfbojadbfojbf", "" + avgCount);


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }


}















