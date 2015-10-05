package fr.univ_lille1.pje.pje3jx;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class ListBooksActivity extends AppCompatActivity {

    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_books);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mListView = (ListView) findViewById(R.id.listView);

        final BookAdapter adapter = new BookAdapter(ListBooksActivity.this, BookLibrary.getBooks());
        mListView.setAdapter(adapter);

        mListView.setLongClickable(true);
        mListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int pos, long id) {
                Toast.makeText(ListBooksActivity.this, "Livre supprimé !", Toast.LENGTH_SHORT).show();
                BookLibrary.deleteBook(pos);
                adapter.notifyDataSetChanged();
                return true;
            }
        });

    }

}
