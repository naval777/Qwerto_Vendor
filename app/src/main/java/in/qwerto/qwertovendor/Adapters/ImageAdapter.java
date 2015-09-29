package in.qwerto.qwertovendor.Adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Vibrator;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

import in.qwerto.qwertovendor.R;


/**
 * Created by sandeep on 28/8/15.
 */
public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> {

    Context context;
    ArrayList<Bitmap> items;

    public ImageAdapter(Context context,ArrayList<Bitmap> items){
        this.context = context;
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemLayoutView = LayoutInflater.from(context)
                .inflate(R.layout.view_image, null);
        ViewHolder1 viewHolder1 = null;
        ViewHolder viewHolder = null;
        if(i==0){
            viewHolder1 = new ViewHolder1(itemLayoutView);
            return  viewHolder1;
        }else{
            viewHolder = new ViewHolder(itemLayoutView);
        }

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.imgViewIcon.setImageBitmap(items.get(i));
        viewHolder.imgViewIcon.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                ((Vibrator)context.getSystemService(context.VIBRATOR_SERVICE)).vibrate(200);
                return false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imgViewIcon;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            imgViewIcon = (ImageView) itemLayoutView.findViewById(R.id.ivImage);
        }
    }

    public static class ViewHolder1 extends ImageAdapter.ViewHolder {

        public ViewHolder1(View itemLayoutView) {
            super(itemLayoutView);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 200);
            imgViewIcon.setLayoutParams(layoutParams);
        }
    }

}
