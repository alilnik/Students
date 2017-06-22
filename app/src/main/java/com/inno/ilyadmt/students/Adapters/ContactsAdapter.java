package com.inno.ilyadmt.students.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.inno.ilyadmt.students.Models.Contact;
import com.inno.ilyadmt.students.Models.ContactType;
import com.inno.ilyadmt.students.R;

import java.util.List;

/**
 * Created by mjazz on 22.06.2017.
 */

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.MyViewHolder> {

    public ContactsAdapter(List<Contact> contactsList) {
        this.contactsList = contactsList;
    }

    private List<Contact> contactsList;

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView contact;
        ImageView type;

        public MyViewHolder(View view) {
            super(view);
            contact = (TextView)view.findViewById(R.id.contact);
            type = (ImageView) view.findViewById(R.id.contact_image);
        }
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list_row, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Contact c = contactsList.get(position);
        holder.contact.setText(c.getValue());
        if(c.getType().equals(ContactType.TELEGRAM)){
            holder.type.setImageResource(R.drawable.telegram);
        }
        else holder.type.setImageResource(R.drawable.phone);
    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }
}
