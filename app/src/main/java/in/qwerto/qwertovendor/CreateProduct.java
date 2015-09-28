package in.qwerto.qwertovendor;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;



public class CreateProduct extends ActionBarActivity implements View.OnClickListener {

    //Sending Intent and request code details...keyword=type
    //title = 1
    //category = 2
    //description =3
    //price = 4
    //for image=5

    TextView title, category, description, price;
    TextView tex, cex, dex, pex;
    ImageView image, cTitle, cCategory,cDesc, cPrice;
    LinearLayout tit, cat, des, pri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_create_product);
        initviews();
    }

    private void initviews(){
        tit = (LinearLayout) findViewById(R.id.llTitle);
        cat = (LinearLayout) findViewById(R.id.llCategory);
        des = (LinearLayout) findViewById(R.id.llDescription);
        pri = (LinearLayout) findViewById(R.id.llPrice);

        title = (TextView) findViewById(R.id.tvProductTitle);
        category = (TextView) findViewById(R.id.tvProductCategory);
        description = (TextView) findViewById(R.id.tvProductDescription);
        price = (TextView) findViewById(R.id.tvProductPrice);

        image = (ImageView) findViewById(R.id.ivProductImage);
        image.setOnClickListener(this);

        cTitle = (ImageView) findViewById(R.id.ivCheckTitle);
        cCategory = (ImageView) findViewById(R.id.ivCheckCategory);
        cDesc = (ImageView) findViewById(R.id.ivCheckDescription);
        cPrice = (ImageView) findViewById(R.id.ivCheckPrice);

        tex = (TextView) findViewById(R.id.tvTitleHelp);
        cex = (TextView) findViewById(R.id.tvCategoryHelp);
        dex = (TextView) findViewById(R.id.tvDescriptionHelp);
        pex = (TextView) findViewById(R.id.tvPriceHelp);

        tit.setOnClickListener(this);
        cat.setOnClickListener(this);
        des.setOnClickListener(this);
        pri.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ivProductImage:
                Log.d("image","clicked");
                Intent image = new Intent(CreateProduct.this, SetImages.class);
                startActivityForResult(image, 5);
                break;
            case R.id.llTitle:
                Intent title = new Intent(CreateProduct.this, SetText.class);
                title.putExtra("type",1);
                if(tex.getVisibility()==View.INVISIBLE){
                    title.putExtra("text",this.title.getText().toString());
                }
                startActivityForResult(title,1);
                break;
            case R.id.llCategory:
                Intent cat = new Intent(CreateProduct.this, SetText.class);
                cat.putExtra("type",2);
                if(cex.getVisibility()==View.INVISIBLE){
                    cat.putExtra("text", this.category.getText().toString());
                }
                startActivityForResult(cat, 2);
                break;
            case R.id.llDescription:
                Intent des = new Intent(CreateProduct.this, SetText.class);
                des.putExtra("type", 3);
                if(dex.getVisibility()==View.INVISIBLE){
                    des.putExtra("text", this.description.getText().toString());
                }
                startActivityForResult(des,3);
                break;
            case R.id.llPrice:
                Intent pri = new Intent(CreateProduct.this, SetText.class);
                pri.putExtra("type",4);
                if(pex.getVisibility()==View.INVISIBLE){
                    pri.putExtra("text", this.price.getText().toString());
                }
                startActivityForResult(pri,4);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 1:
                if (resultCode==RESULT_OK){
                    title.setText(data.getStringExtra("data"));
                    tex.setVisibility(View.INVISIBLE);
                    cTitle.setImageResource(R.drawable.checked);
                }else if(resultCode==RESULT_CANCELED){
                    title.setText("Title");
                    cTitle.setImageResource(R.drawable.check_box);
                    tex.setVisibility(View.VISIBLE);
                }
                break;
            case 2:
                if (resultCode==RESULT_OK){
                    category.setText(data.getStringExtra("data"));
                    cex.setVisibility(View.INVISIBLE);
                    cCategory.setImageResource(R.drawable.checked);
                }else if(resultCode==RESULT_CANCELED){
                    category.setText("Title");
                    cCategory.setImageResource(R.drawable.check_box);
                    cex.setVisibility(View.VISIBLE);
                }
                break;
            case 3:
                if (resultCode==RESULT_OK){
                    description.setText(data.getStringExtra("data"));
                    dex.setVisibility(View.INVISIBLE);
                    cDesc.setImageResource(R.drawable.checked);
                }else if(resultCode==RESULT_CANCELED){
                    description.setText("Title");
                    cDesc.setImageResource(R.drawable.check_box);
                    dex.setVisibility(View.VISIBLE);
                }
                break;
            case 4:
                if (resultCode==RESULT_OK){
                    price.setText(data.getStringExtra("data"));
                    pex.setVisibility(View.INVISIBLE);
                    cPrice.setImageResource(R.drawable.checked);
                }else if(resultCode==RESULT_CANCELED){
                    price.setText("Title");
                    cPrice.setImageResource(R.drawable.check_box);
                    pex.setVisibility(View.VISIBLE);
                }
                break;
            case 5:
                if (resultCode==RESULT_OK){

                }
                break;
        }
    }
}
