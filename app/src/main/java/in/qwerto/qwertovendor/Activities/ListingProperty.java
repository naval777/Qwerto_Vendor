package in.qwerto.qwertovendor.Activities;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

import in.qwerto.qwertovendor.Fragments.PropertyDetails;
import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 18/9/15.
 */
public class ListingProperty extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_listing_property);

        PropertyDetails frament = new PropertyDetails();
        FragmentTransaction trans=getFragmentManager().beginTransaction();
        trans.replace(R.id.fragment, frament);
        trans.addToBackStack(null);
        trans.commit();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
