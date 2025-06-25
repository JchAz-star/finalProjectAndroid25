package il.ac.tcb.finalprojectandroidstudio25;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DoctorDetailsActivity extends AppCompatActivity {
    TextView tv,tvDetails;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_doctor_details);

        btn= findViewById(R.id.btnBackDoctorsDetails);

        tv = findViewById(R.id.textViewTitle);
        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);

        tvDetails = findViewById(R.id.textViewDetails);

        String detailsText = "";
        if (title == null) {
            title = "Unknown";
        }

        switch (title) {

            case "Family Physicians":
                detailsText = "the doctors name is john and he is an exelent family physcian ! hes phone is 081234567";
                break;
            case "Dietician":
                detailsText = "to help you stay thin and fit call the dietist sara 088765432";
                break;
            case "Dentist":
                detailsText = "for a beutiful smile call 075674321 alexa";
                break;
            case "Surgeon":
                detailsText = "hope you dont need one... but if you do, call 098765234 James";
                break;
            case "Cardiologist":
                detailsText = "to have a strong functioning heart call Jacob 091237654";
                break;
            default:
                detailsText = "";
                break;
        }

        tvDetails.setText(detailsText);



        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(DoctorDetailsActivity.this,FindDoctorActivity.class));
            }
        });
    }
}