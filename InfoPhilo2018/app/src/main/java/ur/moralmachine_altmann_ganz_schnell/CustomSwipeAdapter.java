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
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class CustomSwipeAdapter extends PagerAdapter {

    Dialog myDialog;


    private Context ctx;
    private int id1;
    private int id2;
    private LayoutInflater layoutInflater;
    SubmissionClass SubClass = new SubmissionClass();
    private int[] imageResource;


    public CustomSwipeAdapter(Context ctx, int id1, int id2) {

        this.id1 = id1;
        this.id2 = id2;
        this.ctx = ctx;
        Log.d("elfihasdadsf" + id1, "adlskfnadlkfna" + id2);
        imageResource = new int[]{id1, id2};

    }


    //S1D1:  2131231042
    //S2D1:
    //S3D1:
    //S4D1:
    //S5D1:
    //S6D1:
    //S7D1:
    //S8D1:
    //S9D1:
    //S10D1:
    //S11D1:
    //S12D1:
    //S13D1:


    //S1D2:   2131231043
    //S2D2:
    //S3D2:
    //S4D2:
    //S5D2:
    //S6D2:
    //S7D2:
    //S8D2:
    //S9D2:
    //S10D2:
    //S11D2:
    //S12D2:
    //S13D2:


    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (RelativeLayout) object);
    }


    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {


        final String nameOfResourceOne = String.valueOf(imageResource[0]);
        final String nameOfResourceTwo = String.valueOf(imageResource[1]);


        Log.d("StringID", "" + nameOfResourceOne);
        Log.d("StringID Scenario_2", "" + nameOfResourceTwo);

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
                            case "2131231042":
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration = Toast.LENGTH_LONG;

                                Toast toast = Toast.makeText(ctx, text, duration);
                                toast.show();


                                SubClass.submitValues(1, 0, 1, 0);
                                changeArray(R.drawable.scenario2_dec1, R.drawable.scenario2_dec2);


                                break;
                        }
                        break;

                    case 1:
                        switch (nameOfResourceTwo) {
                            case "2131231043":
                                Log.d("Testausgabe", "Auswahl " + imageCount + " wurde gespeichert");
                                CharSequence text = "Auswahl " + imageCount + " wurde gespeichert";
                                int duration = Toast.LENGTH_LONG;

                                Toast toast = Toast.makeText(ctx, text, duration);
                                toast.show();


                                SubClass.submitValues(22, 0, 22, 0);
                                break;
                        }
                        break;
                }


            }
        });


        ImageView imageView = (ImageView) item_view.findViewById(R.id.image_view);
        imageView.setOnClickListener(new View.OnClickListener() {
            @NonNull
            @Override
            public void onClick(View v) {

                switch (imageCount) {
                    case 1:


                        Log.d("Testmessage", "Bild 1 wurde angeklickt");
                        myDialog = new Dialog(ctx);
                        TextView txtClose;
                        myDialog.setContentView(R.layout.custom_pop_up_case_one);
                        txtClose = (TextView) myDialog.findViewById(R.id.CloseButton);
                        txtClose.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                myDialog.dismiss();
                            }
                        });
                        myDialog.show();

                        break;
                    case 2:
                        Log.d("Testmessage", "Bild 2 wurde angeklickt");


                        myDialog = new Dialog(ctx);

                        myDialog.setContentView(R.layout.custom_pop_up_case_two);
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


    public void changeArray(int DrawID1, int DrawID2) {

        imageResource = new int[]{DrawID1, DrawID2};


    }


}
