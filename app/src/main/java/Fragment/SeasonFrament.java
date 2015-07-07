package Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import Adapter.SeasonAdapter;
import tuandn.com.androidtraining_part2.R;

/**
 * Created by Anh Trung on 7/7/2015.
 */
public class SeasonFrament extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RecyclerView rv = (RecyclerView) inflater.inflate(
                R.layout.frament_season, container, false);
        setupRecyclerView(rv);
        return rv;
    }

    private void setupRecyclerView(RecyclerView recyclerView){
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));

//        SeasonAdapter adapter = new SeasonAdapter(SeasonFrament.this);
//        recyclerView.setAdapter(SeasonAdapter new SeasonAdapter(getS));
    }



}
