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

        songs.add(new Songs(getString(R.string.musicOne), getString(R.string.artistOasis), R.drawable.ic_stop));
        songs.add(new Songs(getString(R.string.musicTwo), getString(R.string.artistColdplay), R.drawable.ic_play));
        songs.add(new Songs(getString(R.string.musicThree), getString(R.string.artistFooFighters), R.drawable.ic_play));
        songs.add(new Songs(getString(R.string.musicFour), getString(R.string.artistKingsOfLeon), R.drawable.ic_play));
        songs.add(new Songs(getString(R.string.musicFive), getString(R.string.artistNirvana), R.drawable.ic_play));
        songs.add(new Songs(getString(R.string.musicSix), getString(R.string.artistTheVerve), R.drawable.ic_play));
        songs.add(new Songs(getString(R.string.musicSeven), getString(R.string.artistRadiohead), R.drawable.ic_play));
        songs.add(new Songs(getString(R.string.musicEight), getString(R.string.artistEdSheeran), R.drawable.ic_play));
        songs.add(new Songs(getString(R.string.musicNine), getString(R.string.artistTheCure), R.drawable.ic_play));
        songs.add(new Songs(getString(R.string.musicTen), getString(R.string.artistPearlJam), R.drawable.ic_play));

        // Create an {@link ArrayAdapter}, whose data source is a list of Songs.
        SongsAdapter adapter = new SongsAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_nowplaying.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each song in the list of songs.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
    }
}