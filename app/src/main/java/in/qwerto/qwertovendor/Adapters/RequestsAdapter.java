package in.qwerto.qwertovendor.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import in.qwerto.qwertovendor.Activities.Request;
import in.qwerto.qwertovendor.R;
import in.qwerto.qwertovendor.RequestClass;

/**
 * Created by sandeep on 29/9/15.
 */
public class RequestsAdapter extends RecyclerView.Adapter<RequestsAdapter.RequestViewHolder> {

    private LayoutInflater inflater;
    ArrayList<RequestClass> requestsData;
    Context context;

    public RequestsAdapter(Context context, ArrayList<RequestClass> requestsData){
        this.context =context;
        inflater=LayoutInflater.from(context);
        this.requestsData = requestsData;
    }

    @Override
    public RequestViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.view_single_request, parent, false);
        RequestViewHolder rvh = new RequestViewHolder(view);
        return rvh;
    }

    @Override
    public void onBindViewHolder(RequestViewHolder holder, final int position) {
        final RequestClass singleRequest = requestsData.get(position);
        holder.request.setText(singleRequest.getRequestText());
        holder.PGName.setText(singleRequest.getPGName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context,Request.class);
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return requestsData.size();
    }


    class RequestViewHolder extends RecyclerView.ViewHolder {

        TextView request,PGName;

        public RequestViewHolder(View itemView) {
            super(itemView);

            request = (TextView) itemView.findViewById(R.id.tvRequestText);
            PGName = (TextView) itemView.findViewById(R.id.tvPgName);
        }
    }
}
