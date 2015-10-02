package in.qwerto.qwertovendor.Views.Pg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;

import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 17/9/15.
 */
public class SecurityDeposit extends LinearLayout implements View.OnClickListener {

    Context c;

    LinearLayout ref, nonref,extra;
    LinearLayout m1,m2,m3;
    RadioButton mon1,mon2,mon3;
    EditText other;
    int reftime=-1;

    public SecurityDeposit(Context context) {
        super(context);
        this.c = context;
        initView();
    }

    private void initView() {
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.view_open_security, this, true);

        ref = (LinearLayout) view.findViewById(R.id.llRefundable);
        nonref = (LinearLayout) view.findViewById(R.id.llNonRefundable);
        extra = (LinearLayout) view.findViewById(R.id.llrefExtra);

        m1 = (LinearLayout) findViewById(R.id.ll1month);
        m2 = (LinearLayout) findViewById(R.id.ll2month);
        m3 = (LinearLayout) findViewById(R.id.ll3month);

        mon1 = (RadioButton) findViewById(R.id.rb1month);
        mon2 = (RadioButton) findViewById(R.id.rb2month);
        mon3 = (RadioButton) findViewById(R.id.rb3month);

        other = (EditText) findViewById(R.id.etMonths);

        ref.setOnClickListener(this);
        nonref.setOnClickListener(this);
        m1.setOnClickListener(this);
        m2.setOnClickListener(this);
        m3.setOnClickListener(this);
        other.setOnFocusChangeListener(new OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    mon1.setChecked(false);
                    mon2.setChecked(false);
                    mon3.setChecked(false);
                    reftime=0;
                }
            }
        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.llRefundable:
                ref.setBackgroundResource(R.color.qwerto);
                nonref.setBackground(null);
                break;
            case R.id.llNonRefundable:
                nonref.setBackgroundResource(R.color.qwerto);
                ref.setBackground(null);
                break;
            case R.id.ll1month:
                mon1.setChecked(true);
                mon2.setChecked(false);
                mon3.setChecked(false);
                other.setText("");
                reftime=1;
                break;
            case R.id.ll2month:
                mon1.setChecked(false);
                mon2.setChecked(true);
                mon3.setChecked(false);
                other.setText("");
                reftime=2;
                break;
            case R.id.ll3month:
                mon1.setChecked(false);
                mon2.setChecked(false);
                mon3.setChecked(true);
                other.setText("");
                reftime=3;
                break;
        }
    }

    public int getData(){
        if(reftime==0){
            reftime=Integer.parseInt(other.getText().toString());
        }
        return reftime;
    }

}
