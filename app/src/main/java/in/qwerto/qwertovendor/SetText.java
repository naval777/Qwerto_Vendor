package in.qwerto.qwertovendor;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by sandeep on 28/8/15.
 */
public class SetText extends ActionBarActivity {

    //Sending Intent and request code details...keyword=type
    //title = 1
    //category = 2
    //description =3
    //price = 4

    EditText content;
    Button done;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_set_text);

        content = (EditText) findViewById(R.id.etContent);
        done = (Button) findViewById(R.id.bDone);

        content.setText(getIntent().getStringExtra("text"));
        content.setSelection(content.getText().length());

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("data",content.getText().toString());
                if(content.getText().length()==0){
                    setResult(RESULT_CANCELED,intent);
                }else{
                    setResult(RESULT_OK,intent);
                }
                finish();
            }
        });

        switch (getIntent().getIntExtra("type", -1)){
            case 1:
                content.setHint("Title");
                break;
            case 2:
                content.setHint("Category");
                break;
            case 3:
                content.setHint("Description");
                break;
            case 4:
                content.setHint("Price");
                content.setInputType(InputType.TYPE_CLASS_NUMBER);
                break;
        }
    }
}
