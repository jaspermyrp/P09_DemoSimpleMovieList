package sg.edu.rp.c346.demosimplemovielist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovie);

        ArrayList<String> movieList = new ArrayList<String>();
        movieList.add("Movie 1");
        movieList.add("Movie 2");

        ArrayAdapter<String> adapterMovie = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, movieList);
        lvMovie.setAdapter(adapterMovie);
    }
}
