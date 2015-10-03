package in.qwerto.qwertovendor.Fragments.Hotel;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import in.qwerto.qwertovendor.R;
import in.qwerto.qwertovendor.Views.Hotel.SingleRoom;
import in.qwerto.qwertovendor.Views.Pg.AccoDetail;

/**
 * Created by sandeep on 3/10/15.
 */
public class RoomDetails extends Fragment implements View.OnClickListener{

    ImageView one,two,three,four;
    LinearLayout rooms;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fr_hotel_room_details, container, false);

        one = (ImageView) v.findViewById(R.id.ivOne);
        two = (ImageView) v.findViewById(R.id.ivTwo);
        three = (ImageView) v.findViewById(R.id.ivThree);
        four = (ImageView) v.findViewById(R.id.ivFour);

        rooms = (LinearLayout) v.findViewById(R.id.llRooms);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View view) {

        one.setBackground(null);
        two.setBackground(null);
        three.setBackground(null);
        four.setBackground(null);

        switch (view.getId()){
            case R.id.ivOne:
                one.setBackgroundResource(R.color.qwerto);
                rooms.removeAllViews();
                AccoDetail room = new AccoDetail(getActivity(),"Room 1",0, false,12 );
                rooms.addView(room);
                break;
            case R.id.ivTwo:
                two.setBackgroundResource(R.color.qwerto);
                rooms.removeAllViews();
                room= new AccoDetail(getActivity(),"Room 1",0, false,12 );
                rooms.addView(room);
                room = new AccoDetail(getActivity(), "Room 2", 0, false, 12);
                rooms.addView(room);
                break;
            case R.id.ivThree:
                three.setBackgroundResource(R.color.qwerto);
                rooms.removeAllViews();
                room= new AccoDetail(getActivity(),"Room 1",0, false,12 );
                rooms.addView(room);
                room= new AccoDetail(getActivity(), "Room 2", 0, false, 12);
                rooms.addView(room);
                room = new AccoDetail(getActivity(), "Room 3", 0, false, 12);
                rooms.addView(room);
                break;
            case R.id.ivFour:
                four.setBackgroundResource(R.color.qwerto);
                rooms.removeAllViews();
                room = new AccoDetail(getActivity(),"Room 1",0, false,12 );
                rooms.addView(room);
                room = new AccoDetail(getActivity(), "Room 2", 0, false, 12);
                rooms.addView(room);
                room = new AccoDetail(getActivity(), "Room 3", 0, false, 12);
                rooms.addView(room);
                room = new AccoDetail(getActivity(), "Room 4", 0, false, 12);
                rooms.addView(room);
                break;
        }



    }
}
