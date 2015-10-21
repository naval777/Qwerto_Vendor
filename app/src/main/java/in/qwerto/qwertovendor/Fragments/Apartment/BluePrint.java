package in.qwerto.qwertovendor.Fragments.Apartment;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 3/10/15.
 */
public class BluePrint extends Fragment{
    LinearLayout next;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fr_ap_blueprint, container, false);
        Typeface myTypeface = Typeface.createFromAsset(getActivity().getAssets(), "fonts/quicksand_regular.ttf");
        TextView titleprop = (TextView) v.findViewById(R.id.titleprop);
        titleprop.setTypeface(myTypeface);
        return v;
    }

}
