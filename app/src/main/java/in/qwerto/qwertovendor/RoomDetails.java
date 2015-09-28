package in.qwerto.qwertovendor;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by sandeep on 17/9/15.
 */
public class RoomDetails extends LinearLayout {

    Context c;
    TextView addRoom;
    ArrayList<SingleRoom> roomList;
    LinearLayout layout;
    LayoutInflater inflater;


    public RoomDetails(Context context) {
        super(context);
        this.c = context;
        initView();
    }

    private void initView() {
        inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.view_open_room_details, this, true);

        layout = (LinearLayout) view.findViewById(R.id.llRoomList);
        addRoom = (TextView) view.findViewById(R.id.tvAddRoomType);

        addRoom.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //Show dialog here
                AddRoomDialog dialog = new AddRoomDialog(c,0,0,0,false,false,false,false,layout.getChildCount(),2);
                dialog.show();
                SingleRoom sr = new SingleRoom(c,0,0,0,false,false,false,false,layout.getChildCount());
                layout.addView(sr,layout.getChildCount());
            }
        });
    }

    public ArrayList<SingleRoom> getData(){
        return roomList;
    }

    public class AddRoomDialog extends Dialog implements View.OnClickListener{

        Context context;
        TextView done,canc;
        int sharing=0,rent,numRooms;
        Amenity ab,ac,tv,eb;
        boolean aB,aC,tV,eB;
        EditText rentPM;
        EditText noOfRooms;
        int position;
        int type;

        ImageView s1,s2,s3,s4,s5,s6,s7,s8;

        public AddRoomDialog(Context context,int sharing,int rent,int numRooms,boolean ab,boolean tv, boolean ac, boolean eb,int position, int type) {
            super(context);
            this.context = context;
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            if (context instanceof Activity) {
                setOwnerActivity((Activity) context);
            }
            this.sharing = sharing;
            this.rent = rent;
            this.numRooms = numRooms;
            this.aB = ab;
            this.aC = ac;
            this.eB = eb;
            this.tV = tv;
            this.position = position;
            this.type = type;
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            setContentView(R.layout.view_add_room);

            done = (TextView) findViewById(R.id.tvDone);
            canc = (TextView) findViewById(R.id.tvCancel);

            ab = (Amenity) findViewById(R.id.amAttachedBathroom);
            ac = (Amenity) findViewById(R.id.amAC);
            tv = (Amenity) findViewById(R.id.amTV);
            eb = (Amenity) findViewById(R.id.amEB);

            s1 = (ImageView) findViewById(R.id.ivOne);
            s2 = (ImageView) findViewById(R.id.ivTwo);
            s3 = (ImageView) findViewById(R.id.ivThree);
            s4 = (ImageView) findViewById(R.id.ivFour);
            s5 = (ImageView) findViewById(R.id.ivFive);
            s6 = (ImageView) findViewById(R.id.ivSix);
            s7 = (ImageView) findViewById(R.id.ivSeven);
            s8 = (ImageView) findViewById(R.id.ivEight);

            rentPM = (EditText) findViewById(R.id.etRent);
            noOfRooms = (EditText) findViewById(R.id.etNumRooms);


            if(rent>0){
                rentPM.setText(rent+"");
            }else{
                rentPM.setText("");
            }
            if(numRooms>0){
                noOfRooms.setText(numRooms+"");
            }else{
                noOfRooms.setText("");
            }

            ab.setChecked(aB);
            ac.setChecked(aC);
            tv.setChecked(tV);
            eb.setChecked(eB);

            switch (sharing) {
                case 1:
                    s1.setBackgroundResource(R.color.qwerto);
                    break;
                case 2:
                    s2.setBackgroundResource(R.color.qwerto);
                    break;
                case 3:
                    s3.setBackgroundResource(R.color.qwerto);
                    break;
                case 4:
                    s4.setBackgroundResource(R.color.qwerto);
                    break;
                case 5:
                    s5.setBackgroundResource(R.color.qwerto);
                    break;
                case 6:
                    s6.setBackgroundResource(R.color.qwerto);
                    break;
                case 7:
                    s7.setBackgroundResource(R.color.qwerto);
                    break;
                case 8:
                    s8.setBackgroundResource(R.color.qwerto);
                    break;
            }



            done.setOnClickListener(this);
            canc.setOnClickListener(this);
            s1.setOnClickListener(this);
            s2.setOnClickListener(this);
            s3.setOnClickListener(this);
            s4.setOnClickListener(this);
            s5.setOnClickListener(this);
            s6.setOnClickListener(this);
            s7.setOnClickListener(this);
            s8.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

            s1.setBackground(null);
            s2.setBackground(null);
            s3.setBackground(null);
            s4.setBackground(null);
            s5.setBackground(null);
            s6.setBackground(null);
            s7.setBackground(null);
            s8.setBackground(null);

            switch (view.getId()){
                case R.id.ivOne:
                    sharing=1;
                    s1.setBackgroundResource(R.color.qwerto);
                    break;
                case R.id.ivTwo:
                    s2.setBackgroundResource(R.color.qwerto);
                    sharing=2;
                    break;
                case R.id.ivThree:
                    s3.setBackgroundResource(R.color.qwerto);
                    sharing=3;
                    break;
                case R.id.ivFour:
                    s4.setBackgroundResource(R.color.qwerto);
                    sharing=4;
                    break;
                case R.id.ivFive:
                    s5.setBackgroundResource(R.color.qwerto);
                    sharing=5;
                    break;
                case R.id.ivSix:
                    s6.setBackgroundResource(R.color.qwerto);
                    sharing=6;
                    break;
                case R.id.ivSeven:
                    s7.setBackgroundResource(R.color.qwerto);
                    sharing=7;
                    break;
                case R.id.ivEight:
                    s8.setBackgroundResource(R.color.qwerto);
                    sharing=8;
                    break;
                case R.id.tvDone:
                    if(rentPM.getText().toString().length()==0||noOfRooms.getText().toString().length()==0){
                        Toast.makeText(context,"Invalid input",Toast.LENGTH_SHORT).show();
                    }else{
                        rent = Integer.parseInt(rentPM.getText().toString());
                        numRooms = Integer.parseInt(noOfRooms.getText().toString());
                        SingleRoom sr = new SingleRoom(context,sharing,rent,numRooms,ab.getChecked(),tv.getChecked(),ac.getChecked(),eb.getChecked(),position);
                            layout.removeViewAt(position);
                            layout.addView(sr);
                    }
                    setLayoutPosition();
                    dismiss();
                    break;
                case R.id.tvCancel:
                    dismiss();
                    break;
            }
        }
    }

    public class SingleRoom extends LinearLayout{
        int sharing,rent,noOfRooms;
        boolean ab,tv,ac,eb;
        Context c;
        int position;

        public SingleRoom(Context context, final int sharing, final int rent, final int noOfRooms, final boolean ab, final boolean tv, final boolean ac, final boolean eb, final int position) {
            super(context);
            this.c = context;
            this.sharing = sharing;
            this.rent = rent;
            this.noOfRooms = noOfRooms;
            this.ab=ab;
            this.tv=tv;
            this.ac=ac;
            this.eb=eb;
            this.position = position;

            LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view=inflater.inflate(R.layout.view_single_room, this, true);

            TextView share,rentAmount,nosRooms;
            share = (TextView) view.findViewById(R.id.tvRoomShare);
            rentAmount = (TextView) view.findViewById(R.id.tvRoomRent);
            nosRooms = (TextView) view.findViewById(R.id.tvRoomNos);

            ImageView edit,delete;
            edit = (ImageView) view.findViewById(R.id.ivEditRoom);
            delete = (ImageView) view.findViewById(R.id.ivDeleteRoom);

            share.setText(sharing+" Sharing room");
            rentAmount.setText("Cost: Rs."+rent+" per month");
            nosRooms.setText("No. of rooms: "+noOfRooms);

            edit.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    AddRoomDialog dialog = new AddRoomDialog(c,sharing,rent,noOfRooms,ab,tv,ac,eb,position,1);
                    dialog.show();
                }
            });

            delete.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    layout.removeViewAt(position);
                    setLayoutPosition();
                }
            });
        }



        public boolean isEb() {
            return eb;
        }

        public boolean isAc() {
            return ac;
        }

        public boolean isTv() {
            return tv;
        }

        public boolean isAb() {
            return ab;
        }

        public int getNoOfRooms() {
            return noOfRooms;
        }

        public int getRent() {
            return rent;
        }

        public int getSharing() {
            return sharing;
        }
    }


    public void setLayoutPosition(){
        for(int i=0;i<layout.getChildCount();i++){
            SingleRoom singleRoom = (SingleRoom) layout.getChildAt(i);
            singleRoom.position=i;
            layout.removeViewAt(i);
            layout.addView(singleRoom,i);
        }
    }

}