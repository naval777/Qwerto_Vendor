package in.qwerto.qwertovendor.Fragments.Apartment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import in.qwerto.qwertovendor.Activities.ListingApartment;
import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 3/10/15.
 */
public class PropertyDetails extends Fragment {

    public LinearLayout next,back;
    public ListingApartment listingApartment;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fr_ap_property_details, container, false);

//        next = (LinearLayout) getActivity().findViewById(R.id.tvNext);
//
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
}
