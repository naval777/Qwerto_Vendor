package in.qwerto.qwertovendor.Activities;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import in.qwerto.qwertovendor.Fragments.Apartment.AccomodationDetails;
import in.qwerto.qwertovendor.Fragments.Apartment.BluePrint;
import in.qwerto.qwertovendor.Fragments.Apartment.PropertyDetails;
import in.qwerto.qwertovendor.Fragments.Payment;
import in.qwerto.qwertovendor.Fragments.VerificationStatus;
import in.qwerto.qwertovendor.R;
import in.qwerto.qwertovendor.Views.Apartment.Images;

/**
 * Created by sandeep on 3/10/15.
 */
public class ListingApartment extends Activity {

    LinearLayout next, back;
    int currentDetail = 1;
    ImageView[] statuscircles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_listing_apart);

        next = (LinearLayout) findViewById(R.id.llNext);
        back = (LinearLayout) findViewById(R.id.llBack);

        statuscircles = new ImageView[]
                {
                        (ImageView) findViewById(R.id.stage1),
                        (ImageView) findViewById(R.id.stage2),
                        (ImageView) findViewById(R.id.stage3),
                        (ImageView) findViewById(R.id.stage4),
                        (ImageView) findViewById(R.id.stage5),
                        (ImageView) findViewById(R.id.stage6),
                };

        displayPropDets();

        if (currentDetail == 1) {
            back.setVisibility(View.GONE);
        }

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (currentDetail) {
                    case 1:
                        displayBluePrint();
                        for(int i=0;i<5;i++)
                        {
                            statuscircles[i].setImageResource(R.drawable.circularback);
                        }
                        statuscircles[0].setImageResource(R.drawable.circularcomplete);
                        statuscircles[1].setImageResource(R.drawable.circularcurrentdark);
                        break;
                    case 2:
                        displayAccoDetails();
                        for(int i=0;i<5;i++)
                        {
                            statuscircles[i].setImageResource(R.drawable.circularback);
                        }
                        statuscircles[0].setImageResource(R.drawable.circularcomplete);
                        statuscircles[1].setImageResource(R.drawable.circularcomplete);
                        statuscircles[2].setImageResource(R.drawable.circularcurrentdark);
                        break;
                    case 3:
                        displayImagDets();
                        for(int i=0;i<5;i++)
                        {
                            statuscircles[i].setImageResource(R.drawable.circularback);
                        }
                        statuscircles[0].setImageResource(R.drawable.circularcomplete);
                        statuscircles[1].setImageResource(R.drawable.circularcomplete);
                        statuscircles[2].setImageResource(R.drawable.circularcomplete);
                        statuscircles[3].setImageResource(R.drawable.circularcurrentdark);
                        break;
                    case 4:
                        displayPayment();
                        for(int i=0;i<5;i++)
                        {
                            statuscircles[i].setImageResource(R.drawable.circularback);
                        }
                        statuscircles[0].setImageResource(R.drawable.circularcomplete);
                        statuscircles[1].setImageResource(R.drawable.circularcomplete);
                        statuscircles[2].setImageResource(R.drawable.circularcomplete);
                        statuscircles[3].setImageResource(R.drawable.circularcomplete);
                        statuscircles[4].setImageResource(R.drawable.circularcurrentdark);
                        break;
                    case 5:
                        displayVerifStatus();
                        for(int i=0;i<5;i++)
                        {
                            statuscircles[i].setImageResource(R.drawable.circularback);
                        }
                        statuscircles[0].setImageResource(R.drawable.circularcomplete);
                        statuscircles[1].setImageResource(R.drawable.circularcomplete);
                        statuscircles[2].setImageResource(R.drawable.circularcomplete);
                        statuscircles[3].setImageResource(R.drawable.circularcomplete);
                        statuscircles[4].setImageResource(R.drawable.circularcomplete);
                        statuscircles[5].setImageResource(R.drawable.circularcurrentdark);
                }

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (currentDetail) {
                    case 2:
                        displayPropDets();
                        for(int i=0;i<5;i++)
                        {
                            statuscircles[i].setImageResource(R.drawable.circularback);
                        }
                        statuscircles[0].setImageResource(R.drawable.circularcurrentdark);
                        break;
                    case 3:
                        displayBluePrint();
                        for(int i=0;i<5;i++)
                        {
                            statuscircles[i].setImageResource(R.drawable.circularback);
                        }
                        statuscircles[0].setImageResource(R.drawable.circularcomplete);
                        statuscircles[1].setImageResource(R.drawable.circularcurrentdark);
                        break;
                    case 4:
                        displayAccoDetails();
                        for(int i=0;i<5;i++)
                        {
                            statuscircles[i].setImageResource(R.drawable.circularback);
                        }
                        statuscircles[0].setImageResource(R.drawable.circularcomplete);
                        statuscircles[1].setImageResource(R.drawable.circularcomplete);
                        statuscircles[2].setImageResource(R.drawable.circularcurrentdark);
                        break;
                    case 5:
                        displayImagDets();
                        for(int i=0;i<5;i++)
                        {
                            statuscircles[i].setImageResource(R.drawable.circularback);
                        }
                        statuscircles[0].setImageResource(R.drawable.circularcomplete);
                        statuscircles[1].setImageResource(R.drawable.circularcomplete);
                        statuscircles[2].setImageResource(R.drawable.circularcomplete);
                        statuscircles[3].setImageResource(R.drawable.circularcurrentdark);
                        break;
                    case 6:
                        displayPayment();
                        for(int i=0;i<5;i++)
                        {
                            statuscircles[i].setImageResource(R.drawable.circularback);
                        }
                        statuscircles[0].setImageResource(R.drawable.circularcomplete);
                        statuscircles[1].setImageResource(R.drawable.circularcomplete);
                        statuscircles[2].setImageResource(R.drawable.circularcomplete);
                        statuscircles[3].setImageResource(R.drawable.circularcomplete);
                        statuscircles[4].setImageResource(R.drawable.circularcurrentdark);
                        break;
                }
            }
        });

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

    private void displayBluePrint(){
        BluePrint bp = new BluePrint();
        FragmentTransaction trans2 = getFragmentManager().beginTransaction();
        trans2.replace(R.id.fragment, bp);
        trans2.addToBackStack(null);
        trans2.commit();
        back.setVisibility(View.VISIBLE);
        currentDetail=2;
    }

    private void displayAccoDetails(){
        AccomodationDetails ad = new AccomodationDetails();
        FragmentTransaction trans2 = getFragmentManager().beginTransaction();
        trans2.replace(R.id.fragment, ad);
        trans2.addToBackStack(null);
        trans2.commit();
        currentDetail=3;
    }

    private void displayImagDets(){
        Images images = new Images();
        FragmentTransaction trans2 = getFragmentManager().beginTransaction();
        trans2.replace(R.id.fragment, images);
        trans2.addToBackStack(null);
        trans2.commit();
        currentDetail=4;
    }

    private void displayPayment(){
        Payment pay = new Payment();
        FragmentTransaction trans2 = getFragmentManager().beginTransaction();
        trans2.replace(R.id.fragment, pay);
        trans2.addToBackStack(null);
        trans2.commit();
        currentDetail=5;
        next.setVisibility(View.VISIBLE);
    }

    private void displayVerifStatus(){
        VerificationStatus vs = new VerificationStatus();
        FragmentTransaction trans2 = getFragmentManager().beginTransaction();
        trans2.replace(R.id.fragment, vs);
        trans2.addToBackStack(null);
        trans2.commit();
        currentDetail=6;
        next.setVisibility(View.GONE);
    }

}
