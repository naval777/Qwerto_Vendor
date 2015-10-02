package in.qwerto.qwertovendor.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 29/9/15.
 */
public class Request extends Activity {

    TextView PGName,request;
    ImageView showHide,attachSend;
    LinearLayout details;
    boolean visible=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_request);

        PGName = (TextView) findViewById(R.id.tvPgName);
        request = (TextView) findViewById(R.id.tvRequestText);

        showHide = (ImageView) findViewById(R.id.ivShowHide);
        attachSend = (ImageView) findViewById(R.id.ivAttachSend);

        details = (LinearLayout) findViewById(R.id.llRequestDetails);

        showHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(visible){
                    details.setVisibility(View.GONE);
                    showHide.setImageResource(R.drawable.down_arrow);
                }else{
                    details.setVisibility(View.VISIBLE);
                    showHide.setImageResource(R.drawable.up_arrow);
                }

            }
        });


    }
}
