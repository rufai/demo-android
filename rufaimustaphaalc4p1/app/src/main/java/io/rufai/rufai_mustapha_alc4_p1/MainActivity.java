package io.rufai.rufai_mustapha_alc4_p1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonA  = (Button) findViewById(R.id.buttonB);
        buttonA.setOnClickListener(buttonAListener);

        Button buttonB  = (Button) findViewById(R.id.buttonC);
        buttonB.setOnClickListener(buttonBListener);

    }

    private final Button.OnClickListener buttonAListener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(view.getContext(), ActivityA.class);
            view.getContext().startActivity(intent);}
    };

    private final Button.OnClickListener buttonBListener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(view.getContext(), ActivityB.class);
            view.getContext().startActivity(intent);}
    };

}