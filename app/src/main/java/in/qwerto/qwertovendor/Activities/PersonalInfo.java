package in.qwerto.qwertovendor.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 29/9/15.
 */
public class PersonalInfo extends Activity implements View.OnClickListener{

    ImageView editName,editPhone,editEmail;
    LinearLayout editImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_personal_info);

        editName = (ImageView) findViewById(R.id.ivEditName);
        editEmail = (ImageView) findViewById(R.id.ivEditEmail);
        editPhone = (ImageView) findViewById(R.id.ivEditPhone);
        editImage = (LinearLayout) findViewById(R.id.llEditImage);

        editName.setOnClickListener(this);
        editEmail.setOnClickListener(this);
        editPhone.setOnClickListener(this);
        editImage.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ivEditName:
                break;
            case R.id.ivEditEmail:
                break;
            case R.id.ivEditPhone:
                break;
            case R.id.llEditImage:
                break;
        }
    }
}
