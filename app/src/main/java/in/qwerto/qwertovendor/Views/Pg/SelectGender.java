package in.qwerto.qwertovendor.Views.Pg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;

import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 17/9/15.
 */
public class SelectGender extends LinearLayout {

    Context c;
    RadioButton maleRB,femaleRB;
    LinearLayout male, female;
    int gender=0;//=1 for male and =2 for female

    public SelectGender(Context context) {
        super(context);
        this.c = context;
        initView();
    }

    private void initView() {
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.view_pg_open_gender, this, true);

        maleRB = (RadioButton) findViewById(R.id.rbMale);
        femaleRB = (RadioButton) findViewById(R.id.rbFemale);

        male = (LinearLayout) findViewById(R.id.llMale);
        female = (LinearLayout) findViewById(R.id.llFemale);

        male.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                maleRB.setChecked(true);
                femaleRB.setChecked(false);
                gender=1;
            }
        });

        female.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                maleRB.setChecked(false);
                femaleRB.setChecked(true);
                gender=2;
            }
        });

    }

    public int getData(){
       return gender;
    }

}
