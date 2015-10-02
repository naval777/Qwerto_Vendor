package in.qwerto.qwertovendor.Views.Apartment;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;

import in.qwerto.qwertovendor.Activities.ListingPG;
import in.qwerto.qwertovendor.R;
import in.qwerto.qwertovendor.Views.Amenity;

/**
 * Created by sandeep on 3/10/15.
 */
public class Restrictions extends LinearLayout {

    Amenity pet,smoking,drinking, gender, food, entry;
    EditText others;

    Context c;

    public Restrictions(Context context) {
        super(context);
        this.c = context;
        initview();
    }

    private void initview() {
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_ap_open_restriction, this, true);

        pet = (Amenity) findViewById(R.id.aPet);
        smoking = (Amenity) findViewById(R.id.aSmoking);
        drinking = (Amenity) findViewById(R.id.aDrinking);
        gender = (Amenity) findViewById(R.id.aOtherGender);
        food = (Amenity) findViewById(R.id.aFood);
        entry = (Amenity) findViewById(R.id.aEntry);

        others = (EditText) findViewById(R.id.etOtherRestriciton);


    }
}
