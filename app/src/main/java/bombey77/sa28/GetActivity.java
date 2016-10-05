package bombey77.sa28;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class GetActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get);

        textView = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        textView.setText(name);
    }
}
