package in.qwerto.qwertovendor.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TableRow;

import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 18/9/15.
 */
public class PropertyType extends Activity implements View.OnClickListener{

    RelativeLayout pg,apartment,hotels,hs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_property_type);

        pg = (RelativeLayout) findViewById(R.id.trpghostel);
        apartment = (RelativeLayout) findViewById(R.id.trapartment);
        hotels = (RelativeLayout) findViewById(R.id.trHotels);
        hs = (RelativeLayout) findViewById(R.id.trHomeStays);

        pg.setOnClickListener(this);
        apartment.setOnClickListener(this);
        hotels.setOnClickListener(this);
        hs.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i=new Intent();
        switch (view.getId()){
            case R.id.trpghostel:
                i=new Intent(PropertyType.this,ListingPG.class);
                break;
            case R.id.trapartment:
                i=new Intent(PropertyType.this,ListingApartment.class);
                break;
            case R.id.trHotels:
                i = new Intent(PropertyType.this,ListingHotel.class);
                break;
            case R.id.trHomeStays:
                i = new Intent(PropertyType.this,ListingHS.class);
                break;
        }
        startActivity(i);
    }
}
