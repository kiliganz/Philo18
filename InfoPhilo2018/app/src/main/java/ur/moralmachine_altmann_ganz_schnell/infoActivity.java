package ur.moralmachine_altmann_ganz_schnell;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class infoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        setBackToMenu();

    }

    public void setBackToMenu() {
        Button infoButton = (Button) findViewById(R.id.backToMenuInfo);
        infoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(infoActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}


