package in.qwerto.qwertovendor;

/**
 * Created by sandeep on 16/9/15.
 */
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class QwertoText extends TextView {

    public QwertoText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public QwertoText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public QwertoText(Context context) {
        super(context);
        init();
    }

    private void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(),
                "fonts/quicksand_regular.ttf");
        setTypeface(tf);
    }

}