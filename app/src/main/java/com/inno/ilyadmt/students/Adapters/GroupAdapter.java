package com.inno.ilyadmt.students.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.inno.ilyadmt.students.Models.Group;
import com.inno.ilyadmt.students.Models.Student;
import com.inno.ilyadmt.students.R;

import java.util.List;

/**
 * Created by mjazz on 29.06.2017.
 */

public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.MyViewHolder>{
    List<Group> groups;

    public GroupAdapter(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public GroupAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adaptere_group_list_row, parent, false);
        return new GroupAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Group g = groups.get(position);
        holder.name.setText(g.getId().toString());
    }

    @Override
    public int getItemCount() {
        return groups.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        public MyViewHolder(View itemView) {
            super(itemView);
            name = (TextView)itemView.findViewById(R.id.group_list_row_name);
        }
    }


}
