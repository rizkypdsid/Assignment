package com.mrpds.assignment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity{
    ListView fk_list;
    ArrayAdapter<CharSequence> fkadapter;

    //var Fkarea
    GridView area_list;
    String[] area_arry = {"Jakarta","Bogor","Depok", "Tangerang","Bekasi","Sukabumi",
            "Tasikmalaya", "Tegal", "Purwokerto","Yogyakarta", "Surakarta ","Pontianak"};
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //handle Fklist
        fk_list = findViewById(R.id.fk_list);
        fkadapter = ArrayAdapter.createFromResource(this, R.array.fk_arry,
                android.R.layout.simple_list_item_1);
        fk_list.setAdapter(fkadapter);

        //handle Fkarea
        area_list = (GridView) findViewById(R.id.fk_area);
        adapter = new ArrayAdapter<String>(MainActivity.
                this, android.R.layout.simple_list_item_1, area_arry);
        area_list.setAdapter(adapter);
    }

}
