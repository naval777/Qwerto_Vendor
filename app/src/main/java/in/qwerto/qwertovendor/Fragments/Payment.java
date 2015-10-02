package in.qwerto.qwertovendor.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 3/10/15.
 */
public class Payment extends Fragment {

    LinearLayout savings, current;
    RadioButton sav, cur;
    EditText name, acnumber, bankName, branchName, IFSCCode;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fr_payment, container, false);

        savings = (LinearLayout) v.findViewById(R.id.llSavings);
        current = (LinearLayout) v.findViewById(R.id.llCurrent);

        sav = (RadioButton) v.findViewById(R.id.rbSavings);
        cur = (RadioButton) v.findViewById(R.id.rbCurrent);

        name = (EditText) v.findViewById(R.id.etACName);
        acnumber = (EditText) v.findViewById(R.id.etACNumber);
        bankName = (EditText) v.findViewById(R.id.etBankName);
        branchName = (EditText) v.findViewById(R.id.etBranchName);
        IFSCCode = (EditText) v.findViewById(R.id.etIFSCCode);

        savings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sav.setChecked(true);
                cur.setChecked(false);
            }
        });

        current.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sav.setChecked(false);
                cur.setChecked(true);
            }
        });

        return v;
    }

}
