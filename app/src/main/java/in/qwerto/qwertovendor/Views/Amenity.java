package in.qwerto.qwertovendor.Views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 17/9/15.
 */
public class Amenity extends LinearLayout {

    Context context;
    RadioButton yes, no;
    boolean yesOrNo;
    String name;
    int image_id;


    public Amenity(Context context) {
        super(context);
        this.context = context;
    }

    public Amenity(Context context, String name){
        super(context);
        this.context = context;
        this.name = name;
        image_id=0;
    }

    public Amenity(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.context = context;

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.Amenity, 0, 0);
        name = a.getString(R.styleable.Amenity_amenity_name);
        image_id = a.getResourceId(R.styleable.Amenity_image, 0);
//        yesOrNo = a.getBoolean(R.styleable.Amenity_yes,true);


        a.recycle();
    }

    public boolean getChecked() {
        return yesOrNo;
    }

    public void setChecked(boolean b) {
        if (b) {
            yes.setChecked(true);
            no.setChecked(false);
        } else {
            yes.setChecked(false);
            no.setChecked(true);
        }
    }

    private void initView() {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_single_amenity, this, true);

        TextView amenity = (TextView) findViewById(R.id.tvAmenityName);
        ImageView icon = (ImageView) findViewById(R.id.ivAmenityIcon);

        yes = (RadioButton) findViewById(R.id.rbYes);
        no = (RadioButton) findViewById(R.id.rbNo);

        amenity.setText(name);
        icon.setImageResource(image_id);
//
//        if(yesOrNo){
//            yes.setChecked(true);
//            no.setChecked(false);
//        }else{
//            yes.setChecked(false);
//            no.setChecked(true);
//        }

        yes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    no.setChecked(false);
                    yesOrNo = true;
                } else {
                    no.setChecked(true);
                    yesOrNo = false;
                }
            }
        });

        no.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    yes.setChecked(false);
                    yesOrNo = false;
                } else {
                    yes.setChecked(true);
                    yesOrNo = true;
                }
            }
        });

    }

}
