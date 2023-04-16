package np.edu.divyagyan.simpleinterest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;

public class SimpleInterestActivity extends Activity {

    private EditText principleText, timeText, rateText;
    private Double principle, rate, time;
    private TextView resultView;
    private String simple_interest;
    private Button calculate, reset;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpleinterest);

        principleText = findViewById(R.id.principle);
        timeText = findViewById(R.id.time);
        rateText = findViewById(R.id.rate);
        resultView = findViewById(R.id.simple_interest);
        calculate = findViewById(R.id.calculate);
        reset = findViewById(R.id.reset);

        // setting the event listener
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                principle = Double.parseDouble(principleText.getText().toString());
                rate = Double.parseDouble(rateText.getText().toString());
                time = Double.parseDouble(timeText.getText().toString());

                simple_interest = String.valueOf(((principle * time * rate)/100));
                resultView.setText(simple_interest);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                principleText.setText(null);
                timeText.setText(null);
                rateText.setText(null);
                resultView.setText(null);
            }
        });

    }
}
