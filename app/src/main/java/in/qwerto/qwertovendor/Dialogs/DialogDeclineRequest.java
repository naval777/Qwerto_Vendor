package in.qwerto.qwertovendor.Dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 29/9/15.
 */
public class DialogDeclineRequest extends Dialog implements View.OnClickListener {

    Context context;
    TextView submit,cancel;
    TableRow noVacancy,noPrice,noAmenity,other;
    RadioButton nv,np,na,o;


    public DialogDeclineRequest(Context context) {
        super(context);
        this.context = context;
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        if (context instanceof Activity) {
            setOwnerActivity((Activity) context);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.view_decline_request);

        submit = (TextView) findViewById(R.id.tvSubmit);
        cancel = (TextView) findViewById(R.id.tvCancel);

        noVacancy = (TableRow) findViewById(R.id.trNoVacancy);
        noPrice = (TableRow) findViewById(R.id.trNoPrice);
        noAmenity = (TableRow) findViewById(R.id.trNoAmenities);
        other = (TableRow) findViewById(R.id.trOther);

        nv = (RadioButton) findViewById(R.id.rbNoVacancy);
        np = (RadioButton) findViewById(R.id.rbNoPrice);
        na = (RadioButton) findViewById(R.id.rbNoAmenity);
        o = (RadioButton) findViewById(R.id.rbOther);


        submit.setOnClickListener(this);
        cancel.setOnClickListener(this);
        noVacancy.setOnClickListener(this);
        noPrice.setOnClickListener(this);
        noAmenity.setOnClickListener(this);
        other.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        nv.setChecked(false);
        np.setChecked(false);
        na.setChecked(false);
        o.setChecked(false);
        switch (view.getId()) {
            case R.id.tvSubmit:
                dismiss();
                break;
            case R.id.tvCancel:
                dismiss();
                break;
            case R.id.trNoVacancy:
                nv.setChecked(true);
                break;
            case R.id.trNoPrice:
                np.setChecked(true);
                break;
            case R.id.trNoAmenities:
                na.setChecked(true);
                break;
            case R.id.trOther:
                o.setChecked(true);
                break;
        }
    }
}