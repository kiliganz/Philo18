package ur.moralmachine_altmann_ganz_schnell;


import android.util.Log;

public class SubmissionClass {

    int Gesamtutil = 0;
    int Gesamtfahrer = 0;
    int Gesamtvaeter = 0;
    int Gesamtkinder = 0;

    public void submitValues(int Kind, int Vater, int Fahrer, int Util) {


        Gesamtkinder += Kind;
        Gesamtvaeter += Vater;
        Gesamtfahrer += Fahrer;
        Gesamtutil += Util;


        Log.d("Gesamtkinder", "" + Gesamtkinder);
        Log.d("Gesamtvaeter", "" + Gesamtvaeter);
        Log.d("Gesamtfahrer", "" + Gesamtfahrer);
        Log.d("Gesamtutil", "" + Gesamtutil);


        //TODO  write into CalcClass


    }


}
