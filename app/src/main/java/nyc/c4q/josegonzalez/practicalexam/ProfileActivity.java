package nyc.c4q.josegonzalez.practicalexam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    public void heart(View view){
        Toast.makeText(getApplicationContext(),
                "Selected Heart Activity",
                Toast.LENGTH_SHORT)
                .show();
    }

    public void mail(View view){
        Toast.makeText(getApplicationContext(),
                "Selected Message Activity",
                Toast.LENGTH_SHORT)
                .show();

    }
    public void contacts(View view){
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);


    }
    public void logout(View view){
        Toast.makeText(getApplicationContext(),
                "Selected Logout Activity",
                Toast.LENGTH_SHORT)
                .show();


    }
}
