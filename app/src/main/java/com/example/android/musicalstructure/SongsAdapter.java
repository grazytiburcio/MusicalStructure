package com.example.android.musicalstructure;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by grazy on 22/04/2018.
 */

public class SongsAdapter extends ArrayAdapter<Songs> {

    public SongsAdapter(Activity context, ArrayList<Songs> songs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Songs} object located at this position in the list
        Songs currentSongs = getItem(position);

        // Find the TextView in the list_item.xml layout with the name of the song
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_name_text_view);
        // Get the name of the song from the current Songs object and
        // set this text on the song_name TextView
        songTextView.setText(currentSongs.getSongName());

        // Find the TextView in the list_item.xml layout with the name of the artist
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_name_text_view);
        // Get the name of the artist from the current Songs object and
        // set this text on the artist_name TextView
        artistTextView.setText(currentSongs.getArtistName());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current Songs object and
        // set the image to iconView
        iconView.setImageResource(currentSongs.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}