package il.ac.tcb.finalprojectandroidstudio25;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class LabTestActivity extends AppCompatActivity {

    TextView RndResTxt;
    Button RndBtn;
    String[] resultOptions = {"Good", "Medium", "Bad"};
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lab_test);


        Button GoBackFromLabTestActivityBtn = findViewById(R.id.btnLabTestGoBack);
        GoBackFromLabTestActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LabTestActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });


        RndResTxt = findViewById(R.id.textResult);
        RndBtn = findViewById(R.id.btnChangeDocOpLabTest);  // This matches your XML


        RndResTxt.setText(getRandomResult());


        RndBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RndResTxt.setText(getRandomResult());
            }
        });
    }


    private String getRandomResult() {
        int index = random.nextInt(resultOptions.length);
        return resultOptions[index];
    }
}
