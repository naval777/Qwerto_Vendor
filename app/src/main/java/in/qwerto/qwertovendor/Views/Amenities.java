package in.qwerto.qwertovendor.Views;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 17/9/15.
 */
public class Amenities extends LinearLayout {

    Context c;
    Amenity houseKeeping, laundry, gym, newspaper, waterPurifier, washingMachine, cctv, tv, cookingAllowed, wifi, parking, fridge, security, microwave, geyser, diningTable;
    boolean [] extras;


    public Amenities(Context context) {
        super(context);
        this.c = context;
        extras = new boolean[16];
        initView();
    }

    private void initView() {
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_open_amenity, this, true);

        houseKeeping = (Amenity) findViewById(R.id.aHouseKeeping);
        laundry = (Amenity) findViewById(R.id.aLaundry);
        gym = (Amenity) findViewById(R.id.aGym);
        newspaper = (Amenity) findViewById(R.id.aNewspaper);
        waterPurifier = (Amenity) findViewById(R.id.aWaterPurifier);
        washingMachine = (Amenity) findViewById(R.id.aWashingMachine);
        cctv = (Amenity) findViewById(R.id.aCCTV);
        tv = (Amenity) findViewById(R.id.aTV);
        cookingAllowed = (Amenity) findViewById(R.id.aCookingAllowed);
        wifi= (Amenity) findViewById(R.id.aWifi);
        parking = (Amenity) findViewById(R.id.aParking);
        fridge = (Amenity) findViewById(R.id.aFridge);
        security = (Amenity) findViewById(R.id.aSecurity);
        microwave = (Amenity) findViewById(R.id.aMicrowave);
        geyser = (Amenity) findViewById(R.id.aGeyser);
        diningTable = (Amenity) findViewById(R.id.aDiningtable);
    }

    public boolean [] getData(){
        extras[0]=houseKeeping.getChecked();
        extras[1]=laundry.getChecked();
        extras[2]=gym.getChecked();
        extras[3]=newspaper.getChecked();
        extras[4]=waterPurifier.getChecked();
        extras[5]=washingMachine.getChecked();
        extras[6]=cctv.getChecked();
        extras[7]=tv.getChecked();
        extras[8]=cookingAllowed.getChecked();
        extras[9]=wifi.getChecked();
        extras[10]=parking.getChecked();
        extras[11]=fridge.getChecked();
        extras[12]=security.getChecked();
        extras[13]=microwave.getChecked();
        extras[14]=geyser.getChecked();
        extras[15]=diningTable.getChecked();
        return extras;
    }
}
