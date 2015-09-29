package in.qwerto.qwertovendor.Views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 17/9/15.
 */
public class AccoDetail extends LinearLayout {

    Context c;
    boolean isOpened;
    int openView;
    SelectGender sg;
    SecurityDeposit sd;
    RoomDetails rd;
    Meals m;
    Amenities ame;
    Restrictions r;
    LinearLayout accoDetail;
    ImageView open;


    public AccoDetail(Context context) {
        super(context);
        this.c = context;
    }

    public AccoDetail(Context context, AttributeSet attrs) {
        super(context, attrs);

        c = context;

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.AccoDetail, 0, 0);
        String name = a.getString(R.styleable.AccoDetail_detailName);
        int image_id = a.getResourceId(R.styleable.AccoDetail_detail_icon, 0);
        isOpened = a.getBoolean(R.styleable.AccoDetail_isOpened, true);
        openView = a.getResourceId(R.styleable.AccoDetail_opened_view, 0);
        int type = a.getInt(R.styleable.AccoDetail_type,0);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_single_acco_detail, this, true);

        LinearLayout view = (LinearLayout) findViewById(R.id.llAccoDetailTitle);

        TextView amenity = (TextView) findViewById(R.id.tvAccoDetailName);
        ImageView icon = (ImageView) findViewById(R.id.ivAccoDetailIcon);
        open = (ImageView) findViewById(R.id.ivAccoDetailOpen);
        accoDetail = (LinearLayout) findViewById(R.id.llAccoDetailOpen);

        amenity.setText(name);
        icon.setImageResource(image_id);

        if (isOpened){
            accoDetail.setVisibility(VISIBLE);
        }else{
            accoDetail.setVisibility(GONE);
        }

        if(accoDetail.getVisibility()==GONE){
            open.setImageResource(R.drawable.down_arrow);
        }else{
            open.setImageResource(R.drawable.up_arrow);
        }

//        view.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(isOpened){
//                    accoDetail.setVisibility(GONE);
//                    open.setImageResource(R.drawable.down_arrow);
//                    isOpened=false;
//                }else{
//                    accoDetail.setVisibility(VISIBLE);
//                    open.setImageResource(R.drawable.up_arrow);
//                    isOpened=true;
//                }
//            }
//        });

        switch (type){
            case 1:
                sg = new SelectGender(context);
                accoDetail.addView(sg,0);
                break;
            case 2:
                sd = new SecurityDeposit(context);
                accoDetail.addView(sd,0);
                break;
            case 3:
                rd = new RoomDetails(context);
                accoDetail.addView(rd,0);
                break;
            case 4:
                m = new Meals(context);
                accoDetail.addView(m,0);
                break;
            case 5:
                ame = new Amenities(context);
                accoDetail.addView(ame,0);
                break;
            case 6:
                r = new Restrictions(context);
                accoDetail.addView(r,0);
                break;
        }

        a.recycle();
    }

    public void getData(int type){
        switch (type){
            case 1:
                sg.getData();
                break;
            case 2:
                sd.getData();
                break;
            case 3:
                rd.getData();
                break;
            case 4:
                m.getData();
                break;
            case 5:
                ame.getData();
                break;
            case 6:
                r.getData();
                break;
        }
    }

    public void setOpened(boolean b){
        isOpened = b;
        if(b){
            accoDetail.setVisibility(VISIBLE);
            open.setImageResource(R.drawable.up_arrow);
        }else{
            accoDetail.setVisibility(GONE);
            open.setImageResource(R.drawable.down_arrow);
        }
    }
}
