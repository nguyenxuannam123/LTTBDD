package thuchanh.android.toastandalertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnClickMe = (Button)this.findViewById(R.id.btnClickMe);

        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder b = new AlertDialog.Builder(MainActivity.this);
                b.setTitle("Warring");
                b.setMessage("Đừng có bấm yes");
                b.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                      Toast toast1 = Toast.makeText(MainActivity.this, "Đã bảo đừng có bấm yes", Toast.LENGTH_LONG);
                        toast1.show();
                    }
                });
                b.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                       Toast toast2 = Toast.makeText(MainActivity.this, "Bảo thế mà cũng nghe à", Toast.LENGTH_LONG);
                        toast2.show();
                    }
                });

            b.create().show();
            }
        });
    }
}
