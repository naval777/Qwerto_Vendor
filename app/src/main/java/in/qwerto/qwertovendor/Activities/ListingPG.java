package in.qwerto.qwertovendor.Activities;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import in.qwerto.qwertovendor.Fragments.Pg.AccomodationDetails;
import in.qwerto.qwertovendor.Fragments.Pg.Images;
import in.qwerto.qwertovendor.Fragments.Pg.PropertyDetails;
import in.qwerto.qwertovendor.Fragments.VerificationStatus;
import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 18/9/15.
 */
public class ListingPG extends Activity {

    LinearLayout next, back;
    int currentDetail = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_listing_pg);

        next = (LinearLayout) findViewById(R.id.llNext);
        back = (LinearLayout) findViewById(R.id.llBack);

        displayPropDets();

        if (currentDetail == 1) {
            back.setVisibility(View.GONE);
        }

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (currentDetail) {
                    case 1:
                       displayAccoDets();
                        break;
                    case 2:
                       displayImageDets();
                        break;
                    case 3:
                       displayVerifStatus();
                        break;
                }

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (currentDetail) {
                    case 2:
                        displayPropDets();
                        break;
                    case 3:
                        displayAccoDets();
                        break;
                    case 4:
                        displayImageDets();
                        break;
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    private void displayAccoDets(){
        AccomodationDetails accomodationDetails = new AccomodationDetails();
        FragmentTransaction trans = getFragmentManager().beginTransaction();
        trans.replace(R.id.fragment, accomodationDetails);
        trans.addToBackStack(null);
        trans.commit();
        currentDetail=2;
        back.setVisibility(View.VISIBLE);
    }

    private void displayImageDets(){
        Images images = new Images();
        FragmentTransaction trans1 = getFragmentManager().beginTransaction();
        trans1.replace(R.id.fragment, images);
        trans1.addToBackStack(null);
        trans1.commit();
        currentDetail=3;
        next.setVisibility(View.VISIBLE);
    }

    private void displayVerifStatus(){
        VerificationStatus vs = new VerificationStatus();
        FragmentTransaction trans2 = getFragmentManager().beginTransaction();
        trans2.replace(R.id.fragment, vs);
        trans2.addToBackStack(null);
        trans2.commit();
        currentDetail=4;
        next.setVisibility(View.GONE);
    }

    private void displayPropDets(){
        PropertyDetails fragment = new PropertyDetails();
        FragmentTransaction trans = getFragmentManager().beginTransaction();
        trans.replace(R.id.fragment, fragment);
        trans.addToBackStack(null);
        trans.commit();
        back.setVisibility(View.GONE);
        currentDetail=1;
    }
}
