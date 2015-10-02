package in.qwerto.qwertovendor.Views.Pg;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import in.qwerto.qwertovendor.R;

/**
 * Created by sandeep on 17/9/15.
 */
public class Meals extends LinearLayout implements View.OnClickListener {

    Context c;
    TextView addMeal;
    LinearLayout mealList;
    ArrayList<SingleMeal> meals;
    RadioButton yes, no;
    LinearLayout mealYes, mealNo;


    public Meals(Context context) {
        super(context);
        this.c = context;
        initView();
    }

    private void initView() {
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.view_pg_open_meals, this, true);

        addMeal = (TextView) view.findViewById(R.id.tvAddMealPlan);

        yes = (RadioButton) view.findViewById(R.id.rbMealsYes);
        no = (RadioButton) view.findViewById(R.id.rbMealsNo);

        mealYes = (LinearLayout) view.findViewById(R.id.llMealYes);
        mealNo = (LinearLayout) view.findViewById(R.id.llMealNo);

        mealList = (LinearLayout) view.findViewById(R.id.llMealList);

        addMeal.setOnClickListener(this);
        mealYes.setOnClickListener(this);
        mealNo.setOnClickListener(this);

    }

    public ArrayList<SingleMeal> getData() {
        return meals;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvAddMealPlan:
                AddMealDialog dialog = new AddMealDialog(c, "General meal plan", true, true, true, 0, "",
                        mealList.getChildCount());
                dialog.show();
                break;
            case R.id.llMealYes:
                yes.setChecked(true);
                no.setChecked(false);
                addMeal.setVisibility(VISIBLE);
                mealList.setVisibility(VISIBLE);
                break;
            case R.id.llMealNo:
                yes.setChecked(false);
                no.setChecked(true);
                addMeal.setVisibility(GONE);
                mealList.setVisibility(GONE);
                break;
        }
    }

    public class AddMealDialog extends Dialog implements OnClickListener {

        Context context;
        TextView done, canc;
        EditText title;
        EditText extra, description;
        CheckBox bf, lunch, dinner;
        RadioButton included, ext;
        ImageView edit;
        int cost = 0;
        String name, descrip;
        boolean lun, din, breakfast;
        int count;


        public AddMealDialog(Context context, String name, boolean bf, boolean lunch, boolean dinner, int cost, String description,int count) {
            super(context);
            this.context = context;
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            if (context instanceof Activity) {
                setOwnerActivity((Activity) context);
            }
            this.name = name;
            this.descrip = description;
            this.breakfast = bf;
            this.lun = lunch;
            this.din = dinner;
            this.cost = cost;
            this.count = count;
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            setContentView(R.layout.view_add_meal_plan);

            done = (TextView) findViewById(R.id.tvDone);
            canc = (TextView) findViewById(R.id.tvCancel);

            title = (EditText) findViewById(R.id.etMealTitle);
            extra = (EditText) findViewById(R.id.etMealsExtra);
            description = (EditText) findViewById(R.id.etPlanDescription);

            included = (RadioButton) findViewById(R.id.rbIncluded);
            ext = (RadioButton) findViewById(R.id.rbExtra);

            bf = (CheckBox) findViewById(R.id.cbBF);
            lunch = (CheckBox) findViewById(R.id.cbLunch);
            dinner = (CheckBox) findViewById(R.id.cbDinner);

            edit = (ImageView) findViewById(R.id.ivEditTitle);

            TableRow includedRow = (TableRow) findViewById(R.id.rowIncluded);
            TableRow extraRow = (TableRow) findViewById(R.id.rowExtra);


            done.setOnClickListener(this);
            canc.setOnClickListener(this);
            includedRow.setOnClickListener(this);
            extraRow.setOnClickListener(this);
            edit.setOnClickListener(this);

            //setting previous data
            title.setText(name);
            bf.setChecked(breakfast);
            lunch.setChecked(lun);
            dinner.setChecked(din);

            if (cost > 0) {
                ext.setChecked(true);
                extra.setText(" " + cost);
                included.setChecked(false);
            } else {
                included.setChecked(true);
                ext.setChecked(false);
            }

            description.setText(descrip);

        }

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.tvDone:
                    if (included.isChecked()) {
                        cost = 0;
                    } else {
                        if (extra.getText().toString().length() == 0) {
                            Toast.makeText(c, "Invalid input", Toast.LENGTH_SHORT).show();
                        } else {
                            cost = Integer.parseInt(extra.getText().toString());
                        }
                    }
                    SingleMeal sm = new SingleMeal(c, bf.isChecked(), lunch.isChecked(), dinner.isChecked(), cost, description.getText().toString(), "",count);
                    mealList.addView(sm,count);
                    dismiss();
                    break;
                case R.id.tvCancel:
                    dismiss();
                    break;
                case R.id.ivEditTitle:
                    title.setFocusable(true);
                    title.setClickable(true);
                    break;
                case R.id.rowExtra:
                    break;
                case R.id.rowIncluded:
                    break;
            }
        }
    }

    public class SingleMeal extends LinearLayout {
        boolean bf, lunch, dinner;
        final int cost;//0 if included in room rent
        String description;
        Context c;
        String title;
        int position;

        public SingleMeal(final Context c, final boolean bf, final boolean lunch, final boolean dinner, final int cost, final String description, final String title, final int position) {
            super(c);
            this.c = c;
            this.bf = bf;
            this.lunch = lunch;
            this.dinner = dinner;
            this.cost = cost;
            this.description = description;
            this.title = title;
            this.position=position;

            LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.view_single_meal_plan, this, true);

            final TextView mealCost = (TextView) view.findViewById(R.id.tvMealCost);
            TextView mealDescription = (TextView) view.findViewById(R.id.tvMealDescription);

            ImageView edit = (ImageView) view.findViewById(R.id.ivEditMeal);
            ImageView delete = (ImageView) view.findViewById(R.id.ivDeleteMeal);

            mealCost.setText("Cost: Rs." + cost + " per month");
            mealDescription.setText(description);

            edit.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    AddMealDialog dialog = new AddMealDialog(c, title, bf, lunch, dinner, cost, description,position);
                    dialog.show();
                    mealList.removeViewAt(position);
                }
            });

            delete.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    mealList.removeViewAt(position);
                }
            });
        }

        public String getDescription() {
            return description;
        }

        public int getCost() {
            return cost;
        }

        public boolean getDinner() {
            return dinner;
        }

        public boolean getLunch() {
            return lunch;
        }

        public boolean getBf() {
            return bf;
        }

    }
}