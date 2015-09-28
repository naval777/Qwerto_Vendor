package in.qwerto.qwertovendor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by sandeep on 17/9/15.
 */
public class Restrictions extends LinearLayout {

    Context c;
    Amenity smoking, drinking, maleVs,femaleVs;
    EditText others;
    boolean [] rules;

    public Restrictions(Context context) {
        super(context);
        this.c = context;
        rules = new boolean[4];
        initView();
    }

    private void initView() {
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.view_open_restriction, this, true);

        smoking = (Amenity) findViewById(R.id.aSmoking);
        drinking = (Amenity) findViewById(R.id.aDrinking);
        maleVs = (Amenity) findViewById(R.id.aMaleVisitor);
        femaleVs = (Amenity) findViewById(R.id.aFemaleVisitor);

        others = (EditText) findViewById(R.id.etOtherRestriciton);
    }

    public boolean [] getData(){
        rules[0]=smoking.getChecked();
        rules[1]=drinking.getChecked();
        rules[2]=maleVs.getChecked();
        rules[3]=femaleVs.getChecked();
        return rules;
    }
}
