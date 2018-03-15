package ur.moralmachine_altmann_ganz_schnell;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter {

    ArrayList<CardContent> content = new ArrayList<CardContent>();

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    ImageView scenery;
    TextView description,consequences;



    public static class ContentViewholder extends RecyclerView.ViewHolder {
        public ContentViewholder(View view) {
            super(view);
        }
    }
}
