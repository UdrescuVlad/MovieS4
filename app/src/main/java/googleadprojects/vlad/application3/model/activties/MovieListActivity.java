package googleadprojects.vlad.application3.model.activties;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import googleadprojects.vlad.application3.R;
import googleadprojects.vlad.application3.model.model.Movie;


public class MovieListActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private ArrayList<Movie> movieList;

    private String avengersInfiniteDescription = "The Avengers and their allies must be willing to sacrifice all in an attempt to defeat the powerful Thanos before his blitz of devastation and ruin puts an end to the universe.";
    private String inceptionDescription = "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a CEO.";
    private String theDepartedDescription = "An undercover cop and a mole in the police attempt to identify each other while infiltrating an Irish gang in South Boston.";
    private String spiritedAwayDescription = "During her family's move to the suburbs, a sullen 10-year-old girl wanders into a world ruled by gods, witches, and spirits, and where humans are changed into beasts.";
    private String interstellarDescription = "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);

        mRecyclerView = (RecyclerView)findViewById(R.id.rv_movie);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        Movie interstellar = new Movie("Interstellar", interstellarDescription, "Sci-Fi", 4.7f);
        Movie theDeparted = new Movie("The Departed", theDepartedDescription, "Crime", 4.3f);
        Movie spiritedAway = new Movie("Spirited Away", spiritedAwayDescription, "Animated, Fantasy", 5.0f);
        Movie inception = new Movie("Inception", inceptionDescription, "Sci-Fi", 3.5);
        Movie avengersInfinite = new Movie("Avengers: Infinity War", avengersInfiniteDescription, "Sci-Fi, Fantasy", 4.0f);

        movieList = new ArrayList<>(5);
        movieList.add(interstellar);
        movieList.add(theDeparted);
        movieList.add(spiritedAway);
        movieList.add(inception);
        movieList.add(avengersInfinite);

        
    }
}
