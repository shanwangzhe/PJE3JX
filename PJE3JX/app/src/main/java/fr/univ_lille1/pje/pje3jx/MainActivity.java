package fr.univ_lille1.pje.pje3jx;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    BookLibrary libr;
    private Button name=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(Button)findViewById(R.id.name);
        name.setOnClickListener(new MyButtonListener());



        libr = new BookLibrary();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.action_add) {
            Intent intent = new Intent(this, AddBookActivity.class);
            startActivity(intent);
        }

        if (id == R.id.action_list) {
            Intent intent = new Intent(this, ListBooksActivity.class);
            startActivity(intent);
        }


        return super.onOptionsItemSelected(item);
    }

    class MyButtonListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            Intent intent =new Intent();

            intent.setClass(MainActivity.this, ListBooksActivity.class);
            MainActivity.this.startActivity(intent);

        }

    }
}
