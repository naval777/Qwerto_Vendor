package in.qwerto.qwertovendor.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TableRow;
import android.widget.TextView;

import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 29/9/15.
 */
public class EditProperty extends Activity implements View.OnClickListener{

    TextView back,PGName;
    RelativeLayout image;
    TableRow propDetails,accoDetails,images,nearBy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_edit_property);

        propDetails = (TableRow) findViewById(R.id.trPropDetails);
        accoDetails = (TableRow) findViewById(R.id.trAccoDetails);
        images = (TableRow) findViewById(R.id.trImages);
        nearBy = (TableRow) findViewById(R.id.trNearBy);

        image = (RelativeLayout) findViewById(R.id.rlPgPic);

        back = (TextView) findViewById(R.id.tvBack);
        PGName = (TextView) findViewById(R.id.tvPgName);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.trPropDetails:
                break;
            case R.id.trAccoDetails:
                break;
            case R.id.trImages:
                break;
            case R.id.tvBack:
                break;
        }
    }
}
