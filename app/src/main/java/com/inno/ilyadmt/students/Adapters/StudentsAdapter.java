package com.inno.ilyadmt.students.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.inno.ilyadmt.students.Models.Student;
import com.inno.ilyadmt.students.R;

import java.util.List;

/**
 * Created by mjazz on 27.06.2017.
 */

public class StudentsAdapter extends RecyclerView.Adapter<StudentsAdapter.MyViewHolder> {

    private List<Student> students;

    public StudentsAdapter(List<Student> students){
        this.students = students;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView group;
        public MyViewHolder(View itemView) {
            super(itemView);
            name = (TextView)itemView.findViewById(R.id.stud_list_row_name);
            group = (TextView)itemView.findViewById(R.id.stud_list_row_group);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_students_list_row, parent, false);
        return new StudentsAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Student s = students.get(position);
        holder.name.setText(s.getFirstName() + " " + s.getSurname());
        holder.group.setText(s.getGroupID().toString());
    }


    @Override
    public int getItemCount() {
        return students.size();
    }
}
