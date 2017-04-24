package com.code_as_da.android.likhopao;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Dushyant Arse on 23-04-2017.
 */

public class MessageAdapter extends ArrayAdapter<ForumMessage> {
    public MessageAdapter(Context context, int resource, List<ForumMessage> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position,View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_message, parent, false);
        }

        ImageView photoImageView = (ImageView) convertView.findViewById(R.id.photoImageView);
        TextView messageTextView = (TextView) convertView.findViewById(R.id.messageTextView);
        TextView authorTextView = (TextView) convertView.findViewById(R.id.nameTextView);
        TextView documentTextView = (TextView) convertView.findViewById(R.id.documentTextView);

        ForumMessage message = getItem(position);

        boolean isPhoto = message.getPhotoUrl() != null;
        if(isPhoto) {
            messageTextView.setVisibility(View.GONE);
            photoImageView.setVisibility(View.VISIBLE);
            Glide.with(photoImageView.getContext())
                    .load(message.getPhotoUrl())
                    .into(photoImageView);
        } else {
            messageTextView.setVisibility(View.VISIBLE);
            photoImageView.setVisibility(View.GONE);
            messageTextView.setText(message.getText());
        }
        authorTextView.setText(message.getName());
        documentTextView.setText(message.getDocumentUrl());

        return convertView;
    }

}
