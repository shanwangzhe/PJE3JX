package fr.univ_lille1.pje.pje3jx;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.List;

public class ListBooksActivity extends AppCompatActivity {

    List<Book> lib;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_books);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mListView = (ListView) findViewById(R.id.listView);

        BookAdapter adapter = new BookAdapter(ListBooksActivity.this, BookLibrary.getBooks());
        mListView.setAdapter(adapter);
    }

}
