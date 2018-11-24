package googleadprojects.vlad.application3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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
        LinearLayout container = findViewById(R.id.container);
        TextView title = findViewById(R.id.title);

        EditText inputUsername = findViewById(R.id.inputUsername);
        String username = inputUsername.getText().toString();
            container.setVisibility(view.INVISIBLE);
            title.setVisibility(view.VISIBLE);
        Toast toast=Toast.makeText(this, "Do the login!"+username, Toast.LENGTH_SHORT);
        toast.setMargin(50,50);
        toast.show();
        startActivity(new Intent(MainActivity.this, MovieActivity.class));
    }
}
