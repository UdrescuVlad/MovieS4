package googleadprojects.vlad.application3.model.adapters;

import android.content.ClipData;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

import googleadprojects.vlad.application3.model.model.Movie;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MovieViewHolder> {
    private ArrayList<Movie> mDataSet;
    private ItemClickListener  itcl;

    public MoviesAdapter(ArrayList<Movie> mDataSet, ItemClickListener itcl){
        this.mDataSet = mDataSet;
        this.itcl = itcl;
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder{
        public TextView tvMovieName;
        public TextView tvMovieGenre;
        public RatingBar rbMovieRating;
        public MovieViewHolder(View view){
            super(view);
            view.setOnClickListener(new View.OnClickListener(){
               @Override
               public void onClick(View view){
                   itcl.onItemClick(view,getAdapterPosition());
               }
            });
        }

    }
}
