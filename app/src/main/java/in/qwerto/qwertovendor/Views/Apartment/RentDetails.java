package in.qwerto.qwertovendor.Views.Apartment;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;

import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 3/10/15.
 */
public class RentDetails extends LinearLayout{

    EditText rent, maintenance;

    Context c;

    public RentDetails(Context context) {
        super(context);
        this.c =context;
        initview();
    }

    private void initview() {
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_ap_open_rent_details, this, true);

        rent = (EditText) findViewById(R.id.etRent);
        maintenance = (EditText) findViewById(R.id.etMaintenance);

    }


}
