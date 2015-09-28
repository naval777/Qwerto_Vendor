package in.qwerto.qwertovendor;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by sandeep on 26/9/15.
 */
public class BlueprintDetails extends LinearLayout implements View.OnClickListener {

    Context c;
    int count=0;
    TextView number,name;
    ImageView increase, decrease;

    public BlueprintDetails(Context context) {
        super(context);
        this.c=context;
    }

    public BlueprintDetails(Context context, AttributeSet attrs){
        super(context);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.BlueprintDetails, 0, 0);
        String title = a.getString(R.styleable.BlueprintDetails_detail_name);

        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_blueprint_details, this, true);

        increase = (ImageView) findViewById(R.id.ivIncrease);
        decrease = (ImageView) findViewById(R.id.ivDecrease);
        number = (TextView) findViewById(R.id.tvNumber);
        name = (TextView) findViewById(R.id.tvTitle);

        name.setText(title);

        number.setText(""+count);

        increase.setOnClickListener(this);
        decrease.setOnClickListener(this);
    }

    private void initView(){

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ivIncrease:
                number.setText(""+ ++count);
                break;
            case R.id.ivDecrease:
                if(count>0){
                    number.setText(""+ --count);
                }
                break;
        }
    }
}
