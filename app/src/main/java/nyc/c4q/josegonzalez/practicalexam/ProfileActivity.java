package nyc.c4q.josegonzalez.practicalexam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    private ListView mDrawerList;
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        mDrawerList = (ListView) findViewById(R.id.list_view_drawer);
        addDrawerItems();
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
    }

    public void heart(View view) {
        Toast.makeText(getApplicationContext(),
                "Selected Heart Activity",
                Toast.LENGTH_SHORT)
                .show();
    }

    public void mail(View view) {
        Toast.makeText(getApplicationContext(),
                "Selected Message Activity",
                Toast.LENGTH_SHORT)
                .show();
    }

    public void contacts(View view) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);


    }

    public void logout(View view) {
        Toast.makeText(getApplicationContext(),
                "Selected Logout Activity",
                Toast.LENGTH_SHORT)
                .show();
        moveTaskToBack(true);
        finish();

    }
    private void addDrawerItems() {
        String[] osArray = { "Button 1", "Button 2", "Button 3", " Logout"};
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, osArray);
        mDrawerList.setAdapter(mAdapter);
    }


}
