package in.qwerto.qwertovendor.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 15/9/15.
 */
public class SplashScreen extends Activity implements View.OnClickListener {

    TextView signIn, signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_splash_screen);

        signIn= (TextView) findViewById(R.id.tvSignIn);
        signUp= (TextView) findViewById(R.id.tvSignUp);

        signIn.setOnClickListener(this);
        signUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tvSignIn:
                break;
            case R.id.tvSignUp:
                break;
        }
        startActivity(new Intent(SplashScreen.this,PickNumber.class));
    }
}
