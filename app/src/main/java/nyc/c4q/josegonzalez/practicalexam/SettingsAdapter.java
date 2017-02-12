package nyc.c4q.josegonzalez.practicalexam;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by mathcore on 2/12/17.
 */

public class SettingsAdapter extends RecyclerView.Adapter<SettingsHolder> {


    @Override
    public SettingsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.settings_holder, parent, false);
        return new SettingsHolder(view);
    }

    @Override
    public void onBindViewHolder(SettingsHolder holder, int position) {
        holder.bind();
    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }


}
