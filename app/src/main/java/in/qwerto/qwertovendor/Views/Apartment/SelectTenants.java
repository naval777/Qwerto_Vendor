package in.qwerto.qwertovendor.Views.Apartment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;

import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 3/10/15.
 */
public class SelectTenants extends LinearLayout implements View.OnClickListener{

    Context c;
    RadioButton bachRB, familyRB, bachloretteRB;
    LinearLayout bachelor,family,bachelorette;
    int type=0;//=1 for bachelor and =2 for family =3 for bachelorette

    public SelectTenants(Context context) {
        super(context);
        this.c = context;
        initView();
    }

    private void initView() {
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.view_ap_open_pref_tens, this, true);

        bachRB = (RadioButton) findViewById(R.id.rbBachelor);
        familyRB = (RadioButton) findViewById(R.id.rbFamily);
        bachloretteRB = (RadioButton) findViewById(R.id.rbBachelorette);

        bachelor = (LinearLayout) findViewById(R.id.llBachelor);
        family = (LinearLayout) findViewById(R.id.llFamily);
        bachelorette = (LinearLayout) findViewById(R.id.llBachelorette);

        bachelor.setOnClickListener(this);
        family.setOnClickListener(this);
        bachelorette.setOnClickListener(this);

    }

    public int getData(){
        return type;
    }

    @Override
    public void onClick(View view) {

        bachRB.setChecked(false);
        bachloretteRB.setChecked(false);
        familyRB.setChecked(false);

        switch (view.getId()){
            case R.id.rbBachelor:
                bachRB.setChecked(true);
                type=1;
                break;
            case R.id.rbFamily:
                familyRB.setChecked(true);
                type = 2;
                break;
            case R.id.rbBachelorette:
                bachloretteRB.setChecked(true);
                type = 3;
                break;
        }
    }
}