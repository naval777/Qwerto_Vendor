package in.qwerto.qwertovendor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by sandeep on 18/9/15.
 */
public class PropertyType extends Activity {

    LinearLayout pg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_property_type);

        pg = (LinearLayout) findViewById(R.id.llpghostel);

        pg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PropertyType.this,PropertyDetails.class));
            }
        });


    }
}
