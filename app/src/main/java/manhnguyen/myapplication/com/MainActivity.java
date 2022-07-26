package manhnguyen.myapplication.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //    TextView txtContent;
    TextView txtRandom;
    //    Button btnChangeContent;
//EditText editText;
    EditText Min;
    EditText Max;
    Button btnRandom;
//Button btnEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtRandom = (TextView) findViewById(R.id.Result);
        Min = (EditText) findViewById(R.id.min);
        Max = (EditText) findViewById(R.id.max);
//        txtContent = (TextView) findViewById(R.id.textContent);
        btnRandom = (Button) findViewById(R.id.btn);
//        btnChangeContent = (Button) findViewById(R.id.buttonChangeContent);
//
        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=Max.getText().toString().trim();
                String str2=Min.getText().toString().trim();
                if (str1.length()==0||str2.length()==0){
                    Toast.makeText(MainActivity.this,"Please , fill in filed!",Toast.LENGTH_LONG).show();;
                }else {
                    int max= Integer.parseInt(str1);
                    int min = Integer.parseInt(str2);
                    if (min>max){
                        Toast.makeText(MainActivity.this,"Please , make sure that min < max",Toast.LENGTH_LONG).show();;

                    }else {Random random = new Random();
                        int nb = random.nextInt(max - min + 1) + min;
                        txtRandom.setText(String.valueOf(nb));}
                    }
            }
        });
//        btnChangeContent.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                txtContent.setText("Change Content success");
//            }
//        });
//        editText=(EditText) findViewById(R.id.txtEdit);
//        btnEdit=(Button) findViewById(R.id.btnEdit);
//        btnEdit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String editContent=editText.getText().toString();
//                Toast.makeText(MainActivity.this,editContent,Toast.LENGTH_LONG).show();
//            }
//        });
    }
}