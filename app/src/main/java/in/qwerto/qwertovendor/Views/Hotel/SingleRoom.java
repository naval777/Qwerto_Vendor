package in.qwerto.qwertovendor.Views.Hotel;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import in.qwerto.qwertovendor.R;
import in.qwerto.qwertovendor.Views.Amenity;

/**
 * Created by sandeep on 3/10/15.
 */
public class SingleRoom extends LinearLayout {

    Amenity attachedBr, tv, ac, waterHeater, roomHeater, attachedBalcony, wifi, wardrobe, fridge, complimentarybf, studyLamp,
            tables, chairs;

    LinearLayout addAmenity,roomAmenities;

    Context context;

    public SingleRoom(final Context context) {
        super(context);
        this.context = context;

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_single_hotel_room, this, true);

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
        roomAmenities = (LinearLayout) findViewById(R.id.llRoomAmenities);

        addAmenity.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //show dialog to add amenity

                AddAmenity aa = new AddAmenity(context," ");
                aa.show();
            }
        });

    }


    public class AddAmenity extends Dialog implements OnClickListener {

        Context context;
        TextView done, canc;
        EditText amenityName;
        String name;


        public AddAmenity(Context context, String name) {
            super(context);
            this.context = context;
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            if (context instanceof Activity) {
                setOwnerActivity((Activity) context);
            }
            this.name = name;
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            setContentView(R.layout.view_add_meal_plan);

            done = (TextView) findViewById(R.id.tvDone);
            canc = (TextView) findViewById(R.id.tvCancel);

            amenityName = (EditText) findViewById(R.id.etAmenityName);

            done.setOnClickListener(this);
            canc.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.tvDone:
                    name = amenityName.getText().toString();
                    if(name.length()==0){
                        Toast.makeText(context,"Cannot be empty", Toast.LENGTH_SHORT).show();
                        dismiss();
                    }else{
                        Amenity amenity = new Amenity(context,name);
                        roomAmenities.addView(amenity,roomAmenities.getChildCount()-2);
                    }
                    break;
                case R.id.tvCancel:
                    dismiss();
                    break;
            }
        }
    }

}