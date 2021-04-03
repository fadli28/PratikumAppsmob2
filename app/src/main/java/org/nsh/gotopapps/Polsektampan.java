package org.nsh.gotopapps;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import layout.Layout;

public class Polsektampan extends ListActivity {

    protected void oncreate(Bundle icicle, Build.VERSION_CODES adroid){
        super.onCreate(icicle);
        String[] listAction = new String[] {"Call Center","SMS Center","Driving Direction","Website","Info di Goggle","Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, Layout.simple_list_item_1,listAction));
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
            if (pilihan.equals("Call Center")){
                String nomortel ="tel:0812-8746-2812";
                a = new intent(Intent.ACTION_DIAL, Uri.parse(nomortel));

            } else if (pilihan.equals("SMS Center"))
            {
                String smstext="Mohd.Fadli Ariansyah/L";
                a = new intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:081264233834"));
                a.putExtra("sms_body",smstext);
            } else if (pilihan.equals("Driving Direction"))
            {
                String lokasirs ="https://maps.app.goo.gl/9LxsasHCfSZipSUUA";
                a = new intent(Intent.ACTION_VIEW,Uri.parse(lokasirs));

            } else if (pilihan.equals("Website"))
            {
                String website ="https://www.detik.com/tag/polsek-tampan";
                a = new intent(Intent.ACTION_VIEW,Uri.parse(website));
            }else if (pilihan.equals("Info di goggle"))
            {
                a = new intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"Polsek Tampan");
            }
        } catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
