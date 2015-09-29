package in.qwerto.qwertovendor.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 16/9/15.
 */
public class CreateProfile extends Activity{

    TextView create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_create_profile);

        create = (TextView) findViewById(R.id.tvCreateAccount);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CreateProfile.this,WelcomeMessage.class));
            }
        });
    }
}
