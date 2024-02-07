package jordi.sanchez.m8_uf2_projecte_sanchez_jordi;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnViewLightLevel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquest botó hauria de navegar a LightLevelActivity
                Intent intent = new Intent(MainActivity.this, LightLevelActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btnViewHistory).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquest botó hauria de navegar a HistoryActivity
                Intent intent = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(intent);
            }
        });
    }
}



