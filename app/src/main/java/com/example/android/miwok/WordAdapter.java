package com.example.android.miwok;
import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context, ArrayList<Word> words)
        { super(context, 0, words);}


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Word currentWord = getItem(position);

        TextView miwokNameTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        miwokNameTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultNameTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        defaultNameTextView.setText(currentWord.getDefaultTranslation());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_view);



        iconView.setImageResource(currentWord.getImageResourceId());



        return listItemView;

    }


}
