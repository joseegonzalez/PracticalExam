package nyc.c4q.josegonzalez.practicalexam;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by mathcore on 2/12/17.
 */

public class SettingsHolder extends RecyclerView.ViewHolder {

    private TextView settingsInteger;

    public SettingsHolder(View itemView) {
        super(itemView);
        settingsInteger = (TextView) itemView.findViewById(R.id.tvinteger);
    }

    public void bind(){
        settingsInteger.setText("Setting - " + getAdapterPosition());
    }


}
