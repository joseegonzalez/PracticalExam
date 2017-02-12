package nyc.c4q.josegonzalez.practicalexam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {

    public final String EXTRA_MESSAGE = "nyc.c4q.josegonzalez.practicalexam;";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void login(View view) {
        EditText etUsername = (EditText) findViewById(R.id.username);
        EditText etPassword = (EditText) findViewById(R.id.password);
        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();
        Intent intent = new Intent(this, ProfileActivity.class);
        loginCheck(username, password, intent);


    }

    public void loginCheck(String name, String pass, Intent intent) {

        if (name.isEmpty()) {
            Toast.makeText(getApplicationContext(),
                    "Enter A Username",
                    Toast.LENGTH_SHORT)
                    .show();

        } else if (pass.isEmpty()) {
            Toast.makeText(getApplicationContext(),
                    "Enter A Password",
                    Toast.LENGTH_SHORT)
                    .show();
        } else {
            intent.putExtra(EXTRA_MESSAGE, name);
            intent.putExtra(EXTRA_MESSAGE, pass);
            startActivity(intent);
        }
    }

}

