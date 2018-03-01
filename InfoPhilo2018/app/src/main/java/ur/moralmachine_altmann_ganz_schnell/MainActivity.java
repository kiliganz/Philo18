package ur.moralmachine_altmann_ganz_schnell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        masterTestFunction();

    }
    // first master comment

    public void masterTestFunction(){
        System.out.print("Master branch test");
    }

    public void testBranchFunc(){
        System.out.print("Testbranch");
    }

    public void KiliTest(){
        // habedere
    }

    // double testing

    public void neuerTest(){
        System.out.println("Servus");
    }
}
