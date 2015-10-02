package in.qwerto.qwertovendor.Fragments.Apartment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.qwerto.qwertovendor.R;
import in.qwerto.qwertovendor.Views.Pg.AccoDetail;

/**
 * Created by sandeep on 3/10/15.
 */
public class AccomodationDetails extends Fragment implements View.OnClickListener{

    AccoDetail tenants, security, rentDetails, flatAmenities, societyAmenities, restrictions;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fr_ap_acco_details, container, false);

        tenants = (AccoDetail) v.findViewById(R.id.adTenants);
        security = (AccoDetail) v.findViewById(R.id.adSecurity);
        rentDetails = (AccoDetail) v.findViewById(R.id.adRentDetails);
        flatAmenities = (AccoDetail) v.findViewById(R.id.adFlatAmenities);
        societyAmenities = (AccoDetail) v.findViewById(R.id.adSocietyAmenities);
        restrictions = (AccoDetail) v.findViewById(R.id.adRestrictions);

        tenants.setOnClickListener(this);
        security.setOnClickListener(this);
        rentDetails.setOnClickListener(this);
        flatAmenities.setOnClickListener(this);
        societyAmenities.setOnClickListener(this);
        restrictions.setOnClickListener(this);


        return v;
    }

    @Override
    public void onClick(View view) {

        tenants.setOpened(false);
        security.setOpened(false);
        rentDetails.setOpened(false);
        flatAmenities.setOpened(false);
        societyAmenities.setOpened(false);
        restrictions.setOpened(false);

        switch (view.getId()){
            case R.id.adTenants:
                tenants.setOpened(true);
                break;
            case R.id.adSecurity:
                security.setOpened(true);
                break;
            case R.id.adRentDetails:
                rentDetails.setOpened(true);
                break;
            case R.id.adFlatAmenities:
                flatAmenities.setOpened(true);
                break;
            case R.id.adSocietyAmenities:
                societyAmenities.setOpened(true);
                break;
            case R.id.adRestrictions:
                restrictions.setOpened(true);
                break;
        }
    }
}
