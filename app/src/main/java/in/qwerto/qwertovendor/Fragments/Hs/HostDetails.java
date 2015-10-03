package in.qwerto.qwertovendor.Fragments.Hs;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 3/10/15.
 */
public class HostDetails extends Fragment{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fr_hs_host_details, container, false);

        return v;
    }
}
