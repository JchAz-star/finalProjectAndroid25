package il.ac.tcb.finalprojectandroidstudio25;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FindDoctorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_find_doctor);

        Button exit = findViewById(R.id.GoBackFromDoctorsBtn);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FindDoctorActivity.this,HomeActivity.class));
            }
        });

        Button familyPhysician = findViewById(R.id.FamilyPhysicisnBtn);
        familyPhysician.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent it = new Intent(FindDoctorActivity.this,DoctorDetailsActivity.class);
                it.putExtra("title","Family Physicians");
                startActivity(it);
            }
        });


        Button Dietician = findViewById(R.id.DieticianBtn);
        Dietician.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent it = new Intent(FindDoctorActivity.this,DoctorDetailsActivity.class);
                it.putExtra("title","Dietician");
                startActivity(it);
            }
        });

        Button Dentist = findViewById(R.id.DentistBtn);
        Dentist.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent it = new Intent(FindDoctorActivity.this,DoctorDetailsActivity.class);
                it.putExtra("title","Dentist");
                startActivity(it);
            }
        });


        Button Surgeon = findViewById(R.id.SurgeonBtn);
        Surgeon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent it = new Intent(FindDoctorActivity.this,DoctorDetailsActivity.class);
                it.putExtra("title","Surgeon");
                startActivity(it);
            }
        });


        Button Cardiologist = findViewById(R.id.CardoilogostBtn);
        Cardiologist.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent it = new Intent(FindDoctorActivity.this,DoctorDetailsActivity.class);
                it.putExtra("title","Cardiologist");
                startActivity(it);
            }
        });


    }

}