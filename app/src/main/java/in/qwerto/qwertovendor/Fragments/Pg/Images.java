package in.qwerto.qwertovendor.Fragments.Pg;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.qwerto.qwertovendor.Adapters.RequestsAdapter;
import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 29/9/15.
 */
public class Images extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fr_images_nearby, container, false);

        return v;
    }
}
