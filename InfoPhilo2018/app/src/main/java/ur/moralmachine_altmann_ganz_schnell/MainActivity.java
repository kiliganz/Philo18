package ur.moralmachine_altmann_ganz_schnell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onInfoButtonClicked();
        onStartButtonClicked();
        onResultButtonClicked();
    }

    public void onInfoButtonClicked(){
        Button infoButton = (Button) findViewById(R.id.infoButton);
        infoButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, infoActivity.class);
                startActivity(intent);
            }
        });

    }


    private void onStartButtonClicked(){
        Button infoButton = (Button) findViewById(R.id.startButton);
        infoButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
               // Intent intent = new Intent(MainActivity.this, gameActivity.class);
                //startActivity(intent);
                System.out.println("gameActivity");
            }
        });
    }



    private void onResultButtonClicked(){
        Button infoButton = (Button) findViewById(R.id.resultButton);
        infoButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
               // Intent intent = new Intent(MainActivity.this, resultActivity.class);
                //startActivity(intent);
                System.out.println("resultActivity");
            }
        });
    }

}
