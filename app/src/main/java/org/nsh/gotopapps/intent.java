package org.nsh.gotopapps;

import android.net.Uri;

public class intent {
    private Uri data;
    private Class<poldariau> poldariauClass;

    public intent(Object packageContext) {
    }


    public intent(Class<poldariau> policeClass) {
    }

    public intent(police packageContext, Class<Polsektampan> poldariauClass) {
    }

    public intent(String actionDial, Uri parse) {
    }


    public void setData(Uri data) {
        this.data = data;
    }

    public Uri getData() {
        return data;
    }

    public void putExtra(String name, String Value) {
    }
}
