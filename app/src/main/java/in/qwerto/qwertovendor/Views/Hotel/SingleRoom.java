package in.qwerto.qwertovendor.Views.Hotel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import in.qwerto.qwertovendor.R;
import in.qwerto.qwertovendor.Views.Amenity;

/**
 * Created by sandeep on 3/10/15.
 */
public class SingleRoom extends LinearLayout {

    Amenity attachedBr, tv, ac, waterHeater, roomHeater, attachedBalcony, wifi, wardrobe, fridge, complimentarybf, studyLamp,
            tables, chairs;

    LinearLayout addAmenity;

    Context c;

    public SingleRoom(Context context) {
        super(context);
        this.c = context;

        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.view_single_hotel_room, this, true);

        attachedBr = (Amenity) findViewById(R.id.amAttachedBathroom);
        tv = (Amenity) findViewById(R.id.amTV);
        ac = (Amenity) findViewById(R.id.amAC);
        waterHeater = (Amenity) findViewById(R.id.amWaterHeater);
        roomHeater = (Amenity) findViewById(R.id.amRoomHeater);
        attachedBalcony = (Amenity) findViewById(R.id.amAttachedBalcony);
        wifi = (Amenity) findViewById(R.id.amFreeWifi);
        wardrobe = (Amenity) findViewById(R.id.amWardrobe);
        fridge = (Amenity) findViewById(R.id.amFridge);
        complimentarybf = (Amenity) findViewById(R.id.amComplimentarybf);
        studyLamp = (Amenity) findViewById(R.id.amStudyLamps);
        tables = (Amenity) findViewById(R.id.amTables);
        chairs = (Amenity) findViewById(R.id.amChairs);

        addAmenity = (LinearLayout) findViewById(R.id.llAddAmenity);

        addAmenity.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //show dialog to add amenity
            }
        });

    }

}