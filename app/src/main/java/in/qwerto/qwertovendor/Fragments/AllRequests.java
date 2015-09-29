package in.qwerto.qwertovendor.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

import in.qwerto.qwertovendor.Adapters.RequestsAdapter;
import in.qwerto.qwertovendor.R;
import in.qwerto.qwertovendor.RequestClass;

/**
 * Created by sandeep on 29/9/15.
 */
public class AllRequests extends Fragment {

    RecyclerView allRequests;
    RequestsAdapter adapter;
    ArrayList<RequestClass> requests;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fr_all_requests, container, false);

        allRequests = (RecyclerView) v.findViewById(R.id.rvAllRequests);

        adapter = new RequestsAdapter(getActivity(),requests);

        allRequests.setAdapter(adapter);
        allRequests.setLayoutManager(new LinearLayoutManager(getActivity()));

        return v;
    }
}
