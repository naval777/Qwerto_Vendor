package in.qwerto.qwertovendor;

import android.widget.TextView;

/**
 * Created by sandeep on 29/9/15.
 */
public class RequestClass {

    String requestText,PGName;
    boolean accDec;


    public void setRequestText(String requestText) {
        this.requestText = requestText;
    }

    public void setAccDec(boolean accDec) {
        this.accDec = accDec;
    }

    public void setPGName(String  PGName) {
        this.PGName = PGName;
    }

    public String getRequestText() {
        return requestText;
    }

    public String  getPGName() {
        return PGName;
    }

    public boolean isAccDec() {
        return accDec;
    }

}
