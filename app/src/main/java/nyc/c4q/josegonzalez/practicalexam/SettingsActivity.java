package nyc.c4q.josegonzalez.practicalexam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class SettingsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SettingsAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        recyclerView = (RecyclerView) findViewById(R.id.settings);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new SettingsAdapter();
        recyclerView.setAdapter(adapter);
    }
}
