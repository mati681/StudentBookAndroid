package com.example.user.dzienniczekucznia.data;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.dzienniczekucznia.R;
import com.example.user.dzienniczekucznia.models.Grupy;

import java.util.List;

public class GroupAdapter  extends RecyclerView.Adapter<GroupAdapter.ViewHolder> {
    private Context context;
    private List<Grupy> list;

    public GroupAdapter(Context context, List<Grupy> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.single_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Grupy Grupy = list.get(position);

        holder.textTitle.setText(Grupy.getName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textTitle, textRating, textYear;

        public ViewHolder(View itemView) {
            super(itemView);

            textTitle = itemView.findViewById(R.id.main_title);

        }
    }

}


