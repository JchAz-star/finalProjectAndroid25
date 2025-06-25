package il.ac.tcb.finalprojectandroidstudio25;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterActivity extends AppCompatActivity {

    EditText edUserName,edEmail,edPassword,edConfirm;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);

        edUserName = findViewById(R.id.editTextRegUserName);
        edPassword = findViewById(R.id.editTextRegPassword);
        edEmail = findViewById(R.id.editTextRegEmail);
        edConfirm = findViewById(R.id.editTextRegConfirmPassword);
        btn = findViewById(R.id.buttonRegister);
        tv = findViewById(R.id.textViewExisitingUser);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edUserName.getText().toString();
                String email = edEmail.getText().toString();
                String password = edPassword.getText().toString();
                String confirm = edConfirm.getText().toString();
                Database db = new Database(getApplicationContext(),"healthcare",null,1);
                if(username.isEmpty() || email.isEmpty() || password.isEmpty() || confirm.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Please fill All Details",Toast.LENGTH_SHORT).show();
                }
                else {
                    if(password.compareTo(confirm)==0){
                        if(isValid(password)){
                        db.register(username,email,password);
                            Toast.makeText(getApplicationContext(),"Record Inserted",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
                        }
                        else{
                            Toast.makeText(getApplicationContext(),"password must contain at least 8 chars, have letter, digit and special symbol",Toast.LENGTH_SHORT).show();
                        }

                    }
                    else {
                        Toast.makeText(getApplicationContext(),"Password and Confirm does not match",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }public static boolean isValid(String passwordHere){
        int f1 = 0, f2 = 0, f3 = 0;

        if (passwordHere.length() < 8) {
            return false;
        } else {
            for (int i = 0; i < passwordHere.length(); i++) {
                char c = passwordHere.charAt(i);
                if (Character.isLetter(c)) {
                    f1 = 1;
                } else if (Character.isDigit(c)) {
                    f2 = 1;
                } else if (!Character.isLetterOrDigit(c)) {
                    f3 = 1;
                }
            }
        }

        return f1 == 1 && f2 == 1 && f3 == 1;
    }

}
