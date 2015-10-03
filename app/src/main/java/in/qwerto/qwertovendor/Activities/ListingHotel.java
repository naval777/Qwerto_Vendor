package in.qwerto.qwertovendor.Activities;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import in.qwerto.qwertovendor.Fragments.Hotel.Amenities;
import in.qwerto.qwertovendor.Fragments.Hotel.Food;
import in.qwerto.qwertovendor.Fragments.Hotel.Images;
import in.qwerto.qwertovendor.Fragments.Hotel.Management;
import in.qwerto.qwertovendor.Fragments.Hotel.Policies;
import in.qwerto.qwertovendor.Fragments.Hotel.PropertyDetails;
import in.qwerto.qwertovendor.Fragments.Hotel.RoomDetails;
import in.qwerto.qwertovendor.Fragments.Payment;
import in.qwerto.qwertovendor.Fragments.VerificationStatus;
import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 3/10/15.
 */
public class ListingHotel extends Activity {

    int currentDetail=1;
    LinearLayout next, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_listing_hotels);

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
                        displayRoomDets();
                        break;
                    case 2:
                        displayAmenities();
                        break;
                    case 3:
                        displayImages();
                        break;
                    case 4:
                        displayPolicies();
                        break;
                    case 5:
                        displayFood();
                        break;
                    case 6:
                        displayManagement();
                        break;
                    case 7:
                        displayPayment();
                        break;
                    case 8:
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
                        displayRoomDets();
                        break;
                    case 4:
                        displayAmenities();
                        break;
                    case 5:
                        displayImages();
                        break;
                    case 6:
                        displayPolicies();
                        break;
                    case 7:
                        displayFood();
                        break;
                    case 8:
                        displayManagement();
                        break;
                    case 9:
                        displayPayment();
                }
            }
        });

    }

    private void displayPropDets(){
        PropertyDetails pd = new PropertyDetails();
        FragmentTransaction trans2 = getFragmentManager().beginTransaction();
        trans2.replace(R.id.fragment, pd);
        trans2.addToBackStack(null);
        trans2.commit();
        currentDetail=1;
        back.setVisibility(View.GONE);

    }

    private void displayRoomDets(){
        RoomDetails rd = new RoomDetails();
        FragmentTransaction trans2 = getFragmentManager().beginTransaction();
        trans2.replace(R.id.fragment, rd);
        trans2.addToBackStack(null);
        trans2.commit();
        currentDetail=2;
        back.setVisibility(View.VISIBLE);

    }

    private void displayAmenities(){
        Amenities amenities = new Amenities();
        FragmentTransaction trans2 = getFragmentManager().beginTransaction();
        trans2.replace(R.id.fragment, amenities);
        trans2.addToBackStack(null);
        trans2.commit();
        currentDetail=3;

    }

    private void displayImages(){
        Images images = new Images();
        FragmentTransaction trans2 = getFragmentManager().beginTransaction();
        trans2.replace(R.id.fragment, images);
        trans2.addToBackStack(null);
        trans2.commit();
        currentDetail=4;

    }

    private void displayPolicies(){
        Policies policies = new Policies();
        FragmentTransaction trans2 = getFragmentManager().beginTransaction();
        trans2.replace(R.id.fragment, policies);
        trans2.addToBackStack(null);
        trans2.commit();
        currentDetail=5;

    }

    private void displayFood(){
        Food food = new Food();
        FragmentTransaction trans2 = getFragmentManager().beginTransaction();
        trans2.replace(R.id.fragment, food);
        trans2.addToBackStack(null);
        trans2.commit();
        currentDetail=6;

    }

    private void displayManagement(){

        Management m = new Management();
        FragmentTransaction trans2 = getFragmentManager().beginTransaction();
        trans2.replace(R.id.fragment, m);
        trans2.addToBackStack(null);
        trans2.commit();
        currentDetail=7;

    }

    private void displayPayment(){
        Payment pay = new Payment();
        FragmentTransaction trans2 = getFragmentManager().beginTransaction();
        trans2.replace(R.id.fragment, pay);
        trans2.addToBackStack(null);
        trans2.commit();
        currentDetail=8;
        next.setVisibility(View.VISIBLE);
    }
    private void displayVerifStatus(){
        VerificationStatus vs = new VerificationStatus();
        FragmentTransaction trans2 = getFragmentManager().beginTransaction();
        trans2.replace(R.id.fragment, vs);
        trans2.addToBackStack(null);
        trans2.commit();
        currentDetail=9;
        next.setVisibility(View.GONE);
    }
}
