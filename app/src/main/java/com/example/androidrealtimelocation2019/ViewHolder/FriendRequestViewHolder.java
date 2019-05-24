package com.example.androidrealtimelocation2019.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidrealtimelocation2019.R;

public class FriendRequestViewHolder extends RecyclerView.ViewHolder {
    public TextView txt_user_email;
    public ImageView btn_accept,btn_decline;
    public FriendRequestViewHolder(@NonNull View itemView) {
        super(itemView);
        txt_user_email = itemView.findViewById(R.id.txt_user_email);
        btn_accept = itemView.findViewById(R.id.btn_accept);
        btn_decline = itemView.findViewById(R.id.btn_decline);
    }
}
