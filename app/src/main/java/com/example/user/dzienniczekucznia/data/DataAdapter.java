package com.example.user.dzienniczekucznia.data;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.dzienniczekucznia.R;
import com.example.user.dzienniczekucznia.models.Grupy;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private ArrayList<Grupy> grupy;

    public DataAdapter(ArrayList<Grupy> grupy) {
        this.grupy = grupy;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
        holder.tv_name.setText(grupy.get(position).getName());


    }

    @Override
    public int getItemCount() {
        return grupy.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_name;


        public ViewHolder(View itemView) {
            super(itemView);

            tv_name = (TextView)itemView.findViewById(R.id.tv_name);


        }
    }
}
