package com.example.user.dzienniczekucznia.Remote;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.user.dzienniczekucznia.R;
import com.example.user.dzienniczekucznia.models.Grupy;

import java.util.List;

public class GrupaAdapter extends ArrayAdapter<Grupy> {
    private List<Grupy> groups;
    private Context mContext;
    private int layoutResourceId;

    public GrupaAdapter(Context context, int layoutResourceId, List<Grupy> gatuneks){
        super(context,layoutResourceId,gatuneks);
        this.groups = gatuneks;
        this.mContext = context;
        this.layoutResourceId = layoutResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        GrupaAdapter.GatunekHolder holder = null;

        if(row == null)
        {
            LayoutInflater inflater = ((Activity)mContext).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new GrupaAdapter.GatunekHolder();
            holder.txtID = (TextView)row.findViewById(R.id.identyfikator);
            holder.txtNazwa = (TextView)row.findViewById(R.id.nazwaGatunku);

            row.setTag(holder);
        }
        else
        {
            holder = (GrupaAdapter.GatunekHolder)row.getTag();
        }

        Grupy gatunek = groups.get(position);
        holder.txtID.setText(gatunek.getId().toString());
        holder.txtNazwa.setText(gatunek.getName());

        return row;
    }

    static class GatunekHolder
    {
        TextView txtID;
        TextView txtNazwa;
    }
}
