package in.qwerto.qwertovendor.Activities;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;

import in.qwerto.qwertovendor.Adapters.ImageAdapter;
import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 27/8/15.
 */
public class SetImages extends ActionBarActivity implements View.OnClickListener {


    ArrayList<Bitmap> items;

    RecyclerView images;
    ImageAdapter adapter;
    private final int TAKE_PIC = 1;
    private final int OPEN_GALLERY = 2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_select_image);
        images = (RecyclerView) findViewById(R.id.rvImages);

        items = new ArrayList<>();
        items.add(BitmapFactory.decodeResource(getResources(), R.drawable.delete));

        adapter = new ImageAdapter(this, items);
        images.setAdapter(adapter);
//        sglm = new StaggeredGridLayoutManager(3,1);
        GridLayoutManager manager = new GridLayoutManager(this, 3);
        manager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                if (position <= 1 ) {
                    return 3;
                }
                return 1;
            }
        });
        images.setLayoutManager(manager);


        ItemTouchHelper.Callback callback = new ItemTouchHelper.Callback() {

            //and in your imlpementaion of
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {

                if(target.getAdapterPosition()==0){
//                    images.removeViewAt(target.getAdapterPosition());
                    items.remove(viewHolder.getAdapterPosition());
                    adapter.notifyDataSetChanged();
                }
                else {
                    Collections.swap(items, viewHolder.getAdapterPosition(), target.getAdapterPosition());
                    adapter.notifyItemMoved(viewHolder.getAdapterPosition(), target.getAdapterPosition());
                    return true;
                }
                return true;
            }

            @Override
            public void onMoved(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int fromPos, RecyclerView.ViewHolder target, int toPos, int x, int y) {
                super.onMoved(recyclerView, viewHolder, fromPos, target, toPos, x, y);
            }

            @Override
            public boolean canDropOver(RecyclerView recyclerView, RecyclerView.ViewHolder current, RecyclerView.ViewHolder target) {

                if(current.getAdapterPosition()==0){
                    return false;
                }
                return super.canDropOver(recyclerView, current, target);
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {

            }

            //defines the enabled move directions in each state (idle, swiping, dragging).
            @Override
            public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                return makeFlag(ItemTouchHelper.ACTION_STATE_DRAG,
                        ItemTouchHelper.DOWN | ItemTouchHelper.UP | ItemTouchHelper.START | ItemTouchHelper.END);
            }
        };

        ItemTouchHelper ith = new ItemTouchHelper(callback);
        ith.attachToRecyclerView(images);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
//            case R.id.ivCamera:
//                Intent intent = new Intent(
//                        android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
//                startActivityForResult(intent, TAKE_PIC);
//                break;
//            case R.id.ivGallery:
//                Intent photoPic = new Intent(
//                        Intent.ACTION_PICK,
//                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//                startActivityForResult(photoPic, OPEN_GALLERY);
//                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (requestCode == TAKE_PIC) {

                Bundle extras = data.getExtras();
                items.add((Bitmap) extras.get("data"));
                adapter.notifyDataSetChanged();
            } else if (requestCode == OPEN_GALLERY) {
                Uri uri = data.getData();
                String[] string = {MediaStore.Images.Media.DATA};
                Cursor cursor = getContentResolver().query(uri, string, null, null,
                        null);
                cursor.moveToFirst();
                int index = cursor.getColumnIndex(string[0]);
                String path = cursor.getString(index);
                cursor.close();
                items.add(BitmapFactory.decodeFile(path));
                adapter.notifyDataSetChanged();
            }
        }
    }
}
