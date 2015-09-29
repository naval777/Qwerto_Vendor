package in.qwerto.qwertovendor.Fragments;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 29/9/15.
 */
public class Profile extends Fragment implements View.OnClickListener{

    TextView properties, requests;
    LinearLayout myProps, payment, setting;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fr_profile, container, false);

        properties = (TextView) v.findViewById(R.id.tvProperties);
        requests = (TextView) v.findViewById(R.id.tvRequests);

        myProps = (LinearLayout) v.findViewById(R.id.llMyProps);
        payment = (LinearLayout) v.findViewById(R.id.llPayment);
        setting = (LinearLayout) v.findViewById(R.id.llSettings);

        return v;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.llMyProps:
                break;
            case R.id.llPayment:
                break;
            case R.id.llSettings:
                break;
        }
    }
}
