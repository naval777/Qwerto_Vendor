package in.qwerto.qwertovendor.Fragments.Hotel;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 3/10/15.
 */
public class RoomDetails extends Fragment {

    ImageView one,two,three,four;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fr_hotel_room_details, container, false);

        return v;
    }
}
