package com.inno.ilyadmt.students.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.inno.ilyadmt.students.Models.Journal;
import com.inno.ilyadmt.students.Models.Student;
import com.inno.ilyadmt.students.R;

import java.util.List;

/**
 * Created by mjazz on 22.06.2017.
 */

public class JournalsAdapter extends RecyclerView.Adapter<JournalsAdapter.MyViewHolder> {

    private List<Journal> journals;
    private Student s;

    public JournalsAdapter(List<Journal> journalList, Student s) {
        this.journals = journalList;
        this.s = s;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView lecturer;
        TextView subject;
        ImageView presence;

        public MyViewHolder(View view) {
            super(view);
            lecturer = (TextView)view.findViewById(R.id.lecturer);
            subject = (TextView)view.findViewById(R.id.subject);
            presence = (ImageView)view.findViewById(R.id.presence);

        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_journal_list_row, parent, false);
        return  new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Boolean p = null;
        Journal j = journals.get(position);
        if (j.getJournal().containsKey(s)){
            p = j.getJournal().get(s);
        }else return;
        holder.lecturer.setText(j.getLesson().getLector());
        holder.subject.setText(j.getLesson().getSubject());
        if (p) holder.presence.setImageResource(R.drawable.tick);
        else holder.presence.setImageResource(R.drawable.cross);
    }

    @Override
    public int getItemCount() {
        return journals.size();
    }



}
