package com.uit.musicplayer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;
import com.uit.musicplayer.R;
import com.uit.musicplayer.model.Playlist;

import java.util.List;

public class PlaylistAdapter extends ArrayAdapter<Playlist> {

    public PlaylistAdapter(@NonNull Context context, int resource, @NonNull List<Playlist> objects) {
        super(context, resource, objects);
    }

    class ViewHolder {
        TextView txtNamePlaylist;
        ImageView imageBackground, imagePlaylist;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder = null;
        if (convertView == null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.template_playlist, null);
            viewHolder = new ViewHolder();
            viewHolder.txtNamePlaylist = convertView.findViewById(R.id.textViewNamePlaylist);
            viewHolder.imageBackground = convertView.findViewById(R.id.imageViewBackgroundPlaylist);
            viewHolder.imagePlaylist = convertView.findViewById(R.id.imageViewPlaylist);

            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Playlist playlist = getItem(position);
        Picasso.get().load(playlist.getImagebackground()).into(viewHolder.imageBackground);
        Picasso.get().load(playlist.getImageicon()).into(viewHolder.imagePlaylist);
        viewHolder.txtNamePlaylist.setText(playlist.getNameplaylist());

        return convertView;
    }
}
