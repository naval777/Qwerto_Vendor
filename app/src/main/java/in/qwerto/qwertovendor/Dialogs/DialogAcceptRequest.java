package in.qwerto.qwertovendor.Dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 29/9/15.
 */
public class DialogAcceptRequest extends Dialog implements View.OnClickListener {

    Context context;
    TextView submit,cancel,roomType;
    EditText noRooms,comments;
    int vac;


    public DialogAcceptRequest(Context context, int vac) {
        super(context);
        this.context = context;
        this.vac = vac;
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        if (context instanceof Activity) {
            setOwnerActivity((Activity) context);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.view_accept_request);

        submit = (TextView) findViewById(R.id.tvSubmit);
        cancel = (TextView) findViewById(R.id.tvCancel);
        roomType = (TextView) findViewById(R.id.tvVacancy);

        noRooms = (EditText) findViewById(R.id.etNoOfRooms);
        comments = (EditText) findViewById(R.id.etComments);

        submit.setOnClickListener(this);
        cancel.setOnClickListener(this);

        roomType.setText("Vacancy for "+vac+" sharing rooms");

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvSubmit:
                dismiss();
                break;
            case R.id.tvCancel:
                dismiss();
                break;
        }
    }
}