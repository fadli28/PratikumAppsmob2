package org.nsh.gotopapps;

import android.app.ListActivity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import layout.Layout;

public class police extends ListActivity {

    protected void oncreate(Bundle icicle, Build.VERSION_CODES adroid){
        super.onCreate(icicle);
        String[] listpolice = new String[] {"Polsek Tampan","Polda Riau","Polres Pku"};
        this.setListAdapter(new ArrayAdapter<String>(this, Layout.simple_list_item_1,listpolice));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            intent a = null;
            if (pilihan.equals("Polsek Tampan"))
                a = new intent(this, Polsektampan.class);
            {

                }


        } catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }