package googleadprojects.vlad.application3.model.activties;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import googleadprojects.vlad.application3.R;

public class MainActivity extends AppCompatActivity {

    private String regUser="Vlad";
    private String regPass="123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.loginBtn);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                doLogin(v);
            }
        });
    }
    public void doLogin(View view){

        TextView title = findViewById(R.id.title);

        EditText inputUsername = findViewById(R.id.inputUsername);
        EditText inputPassword = findViewById(R.id.inputPass);
        String username = inputUsername.getText().toString();
        String password = inputPassword.getText().toString();


        title.setVisibility(view.VISIBLE);

        if(username.isEmpty()){
            inputUsername.setError("Please enter an username");
            inputUsername.requestFocus();
        }

        if((username.equals(regUser)) && (password.equals(regPass))) {
            Toast toast = Toast.makeText(MainActivity.this, "Logged in!", Toast.LENGTH_SHORT);
            toast.setMargin(50, 50);
            toast.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL,0,0);
            toast.show();
            startActivity(new Intent(MainActivity.this, MovieActivity.class));
        }
    }
}
