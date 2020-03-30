package thuchanh.android.thucthanhlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnR;
    private Button btnL;
    private Button btnT;
    private Button btnF;
    private Button btnG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnR = (Button)this.findViewById(R.id.btnRelativeLayout);
        btnL = (Button)this.findViewById(R.id.btnLinearLayout);
        btnT = (Button)this.findViewById(R.id.btnTableLayout);
        btnF = (Button)this.findViewById(R.id.btnFrameLayout);
        btnG = (Button)this.findViewById(R.id.btnGridLayout);
    }

    @Override
    public  void onClick(View view){
        if(view.getId() == R.id.btnRelativeLayout){
            Intent intentR = new Intent(MainActivity.this, RelativeLayout.class);
            MainActivity.this.startActivity(intentR);
        }
        if(view.getId() == R.id.btnLinearLayout){
            Intent intentL = new Intent(MainActivity.this, LinearLayout.class);
            MainActivity.this.startActivity(intentL);
        }
        if(view.getId() == R.id.btnFrameLayout){
            Intent intentF = new Intent(MainActivity.this, FrameLayout.class);
            MainActivity.this.startActivity(intentF);
        }
        if(view.getId() == R.id.btnGridLayout){
            Intent intentG = new Intent(MainActivity.this, GridLayout.class);
            MainActivity.this.startActivity(intentG);
        }
        if(view.getId() == R.id.btnTableLayout){
            Intent intentT = new Intent(MainActivity.this, TableLayout.class);
            MainActivity.this.startActivity(intentT);
        }
    }

}
