package in.qwerto.qwertovendor.Views.Apartment;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import in.qwerto.qwertovendor.R;
import in.qwerto.qwertovendor.Views.Amenity;

/**
 * Created by sandeep on 3/10/15.
 */
public class SocietyAmenities extends LinearLayout {

    Amenity waterSupply,powerbackup,security,carParking, lift, gym, swimmingPool, gasSupply, park, cctv;

    Context c;

    public SocietyAmenities(Context context) {
        super(context);
        this.c = context;
        initView();

    }

    private void initView() {

        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_ap_open_soc_amenity, this, true);

        waterSupply = (Amenity) findViewById(R.id.aWaterSupply);
        powerbackup = (Amenity) findViewById(R.id.aPowerBackUp);
        security = (Amenity) findViewById(R.id.aSecurity);
        carParking = (Amenity) findViewById(R.id.aCarParking);
        lift = (Amenity) findViewById(R.id.aLift);
        gym = (Amenity) findViewById(R.id.aGym);
        swimmingPool = (Amenity) findViewById(R.id.aSwimmingPool);
        gasSupply = (Amenity) findViewById(R.id.aGasSupply);
        park = (Amenity) findViewById(R.id.aPark);
        cctv = (Amenity) findViewById(R.id.aCCTV);


    }
}
