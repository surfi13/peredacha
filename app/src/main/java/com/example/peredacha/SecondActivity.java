package com.example.peredacha;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setTextSize(26);
        textView.setPadding(16, 16, 16, 16);

        Bundle arguments = getIntent().getExtras();
        User user;

        if (arguments != null) {
            user = arguments.getParcelable(User.class.getSimpleName());
            if (user != null) {
                textView.setText("Имя: " + user.getName() +
                        "\nОрганизация: " + user.getCompany() +
                        "\nВозраст: " + user.getAge() +
                        "\nТелефон: " + user.getPhone());
            }
        }

        setContentView(textView);
    }
}
