package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowplaying);

        //Create an ArrayList of songs
        ArrayList<Songs> songs = new ArrayList<Songs>();

        songs.add(new Songs("1. Supersonic", "Oasis", R.drawable.ic_stop));
        songs.add(new Songs("2. Yellow", "Coldplay", R.drawable.ic_play));
        songs.add(new Songs("3. Times Like These", "Foo Fighthers", R.drawable.ic_play));
        songs.add(new Songs("4. Use Somebody", "Kings of Leon", R.drawable.ic_play));
        songs.add(new Songs("5. Lake Of Fire", "Nirvana", R.drawable.ic_play));
        songs.add(new Songs("6. Sonnet", "The Verve", R.drawable.ic_play));
        songs.add(new Songs("7. Fake Plastic Trees", "Radiohead", R.drawable.ic_play));
        songs.add(new Songs("8. The A Team", "Ed Sheeran", R.drawable.ic_play));
        songs.add(new Songs("9. Close To Me", "The Cure", R.drawable.ic_play));
        songs.add(new Songs("10. Evenflow", "Pearl Jam", R.drawable.ic_play));

        // Create an {@link ArrayAdapter}, whose data source is a list of Songs.
        SongsAdapter adapter = new SongsAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_nowplaying.xmlg.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each song in the list of songs.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
    }
}