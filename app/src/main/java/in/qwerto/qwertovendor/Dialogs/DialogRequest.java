package in.qwerto.qwertovendor.Dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;

import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 29/9/15.
 */
public class DialogRequest extends Dialog implements View.OnClickListener {

    Context context;
    TextView custName,PGName,requestText;
    LinearLayout accept,decline;
    String name,pgName,text;
    int sharing;


    public DialogRequest(Context context, String name, String pgName, String text, int sharing) {
        super(context);
        this.context = context;
        this.name=name;
        this.pgName=pgName;
        this.text = text;
        this.sharing = sharing;
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        if (context instanceof Activity) {
            setOwnerActivity((Activity) context);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.view_accept_request);

        custName = (TextView) findViewById(R.id.tvName);
        PGName = (TextView) findViewById(R.id.tvPgName);
        requestText = (TextView) findViewById(R.id.tvRequestText);

        accept = (LinearLayout) findViewById(R.id.llAccept);
        decline = (LinearLayout) findViewById(R.id.llDecline);

        custName.setText(name);
        PGName.setText(pgName);
        requestText.setText(text);

        accept.setOnClickListener(this);
        decline.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.llAccept:
                DialogAcceptRequest dar= new DialogAcceptRequest(context,sharing);
                dar.show();
                dismiss();
                break;
            case R.id.llDecline:
                DialogDeclineRequest ddr = new DialogDeclineRequest(context);
                ddr.show();
                dismiss();
                break;
        }
    }
}