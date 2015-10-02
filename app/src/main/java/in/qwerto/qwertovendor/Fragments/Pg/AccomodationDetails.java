package in.qwerto.qwertovendor.Fragments.Pg;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import in.qwerto.qwertovendor.R;
import in.qwerto.qwertovendor.Views.Pg.AccoDetail;

/**
 * Created by sandeep on 18/9/15.
 */
public class AccomodationDetails extends Fragment implements View.OnClickListener{


    AccoDetail gender, security, roomDetails, meals, amenities, restrictions;
    LinearLayout next;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fr_pg_acco_details, container, false);


        gender = (AccoDetail) v.findViewById(R.id.adGender);
        security = (AccoDetail) v.findViewById(R.id.adSecurity);
        roomDetails = (AccoDetail) v.findViewById(R.id.adRoomDetails);
        meals = (AccoDetail) v.findViewById(R.id.adMeals);
        amenities = (AccoDetail) v.findViewById(R.id.adAmenities);
        restrictions = (AccoDetail) v.findViewById(R.id.adRestrictions);

        gender.setOnClickListener(this);
        security.setOnClickListener(this);
        roomDetails.setOnClickListener(this);
        meals.setOnClickListener(this);
        amenities.setOnClickListener(this);
        restrictions.setOnClickListener(this);

        next= (LinearLayout) getActivity().findViewById(R.id.tvNext);

//        next.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //getdata and move to next activity
//                AccomodationDetails frament = new AccomodationDetails();
//                FragmentTransaction trans=getFragmentManager().beginTransaction();
//                trans.replace(R.id.fragment, frament);
//                trans.addToBackStack(null);
//                trans.commit();
//            }
//        });

        return v;
    }

    @Override
    public void onClick(View view) {
        gender.setOpened(false);
        security.setOpened(false);
        roomDetails.setOpened(false);
        meals.setOpened(false);
        amenities.setOpened(false);
        restrictions.setOpened(false);

        switch (view.getId()){
            case R.id.adGender:
                gender.setOpened(true);
                break;
            case R.id.adSecurity:
                security.setOpened(true);
                break;
            case R.id.adRoomDetails:
                roomDetails.setOpened(true);
                break;
            case R.id.adMeals:
                meals.setOpened(true);
                break;
            case R.id.adAmenities:
                amenities.setOpened(true);
                break;
            case R.id.adRestrictions:
                restrictions.setOpened(true);
                break;
        }
    }
}