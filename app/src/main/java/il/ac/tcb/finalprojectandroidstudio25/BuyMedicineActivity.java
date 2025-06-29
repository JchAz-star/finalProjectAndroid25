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

public class BuyMedicineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_buy_medicine);

        // Go Back button
        Button GoBackFromBuyMedicine = findViewById(R.id.BuyMedicineGoBackBtn);
        GoBackFromBuyMedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BuyMedicineActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

    }
}