package in.qwerto.qwertovendor.Views.Apartment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import in.qwerto.qwertovendor.R;
import in.qwerto.qwertovendor.Views.Amenity;

/**
 * Created by sandeep on 3/10/15.
 */
public class FlatAmenities extends LinearLayout {

    Amenity fridge, wm, tv, fans, lights, cupboard, bedCot, mattress, geyser, waterPurifier, diningTable, microWave, stove, wiFi,
            modularKitchen, sofa, chairs, tables;

    Context c;

    public FlatAmenities(Context context) {
        super(context);
        this.c = context;
        initView();

    }

    private void initView() {
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_ap_open_flat_amenities, this, true);

        fridge = (Amenity) findViewById(R.id.aFridge);
        wm = (Amenity) findViewById(R.id.aWashingMachine);
        tv = (Amenity) findViewById(R.id.aTV);
        fans = (Amenity) findViewById(R.id.aFans);
        lights = (Amenity) findViewById(R.id.aLights);
        cupboard = (Amenity) findViewById(R.id.aCupBoards);
        bedCot = (Amenity) findViewById(R.id.aBedCot);
        mattress = (Amenity) findViewById(R.id.aMatress);
        geyser = (Amenity) findViewById(R.id.aGeyser);
        waterPurifier = (Amenity) findViewById(R.id.aWaterPurifier);
        diningTable = (Amenity) findViewById(R.id.aDiningtable);
        microWave = (Amenity) findViewById(R.id.aMicrowave);
        stove = (Amenity) findViewById(R.id.aStove);
        wiFi = (Amenity) findViewById(R.id.aWifi);
        modularKitchen = (Amenity) findViewById(R.id.aMoularKitchen);
        sofa = (Amenity) findViewById(R.id.aSofa);
        chairs = (Amenity) findViewById(R.id.aChairs);
        tables = (Amenity) findViewById(R.id.aTables);


    }

}
