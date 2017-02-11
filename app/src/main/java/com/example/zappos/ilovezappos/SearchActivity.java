package com.example.zappos.ilovezappos;

import android.app.Activity;
import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;

/**
 * Created by divyasingh on 2/9/17.
 */

public class SearchActivity extends AppCompatActivity {

//    SearchView search = (SearchView) findViewById(R.id.searchView);
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.search_view);
//
//    }
//
//    @Override
//    public boolean onQueryTextSubmit(String query) {
//        Intent myIntent = new Intent(this, MainActivity.class);
//        myIntent.putExtra("ITEM", query);
//        startActivity(myIntent);
//        return false;
//    }
//
//    public boolean onQueryTextChange(String newText) {
//        return false;
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        // Inflate menu to add items to action bar if it is present.
        inflater.inflate(R.menu.menu_main, menu);
        // Associate searchable configuration with the SearchView
        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView =
                (SearchView) menu.findItem(R.id.menu_search).getActionView();
//        searchView.setSearchableInfo(
//                searchManager.getSearchableInfo(getComponentName()));
        ComponentName cn = new ComponentName(this, MainActivity.class);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(cn));
        return true;
    }

//    private void handleIntent(Intent intent) {
//
//        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
//            String query = intent.getStringExtra(SearchManager.QUERY);
//            Intent myIntent = new Intent(this, MainActivity.class);
//            myIntent.putExtra("ITEM", query);
//            startActivity(myIntent);
//        }
//    }
}

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.search_view);
//
//        // Get the intent, verify the action and get the query
//        Intent intent = getIntent();
//        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
//            String query = intent.getStringExtra(SearchManager.QUERY);
//            System.out.println(query);
//            Intent myIntent = new Intent(this, MainActivity.class);
//            myIntent.putExtra("ITEM", query);
//            startActivity(myIntent);
//        }
//    }
//}

