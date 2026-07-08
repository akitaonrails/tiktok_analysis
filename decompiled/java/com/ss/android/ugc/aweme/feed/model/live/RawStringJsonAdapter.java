package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CU;
import X.C09DL;
import com.google.gson.TypeAdapter;
import com.google.gson.p;

/* JADX INFO: loaded from: classes4.dex */
public class RawStringJsonAdapter extends TypeAdapter<String> {
    @Override // com.google.gson.TypeAdapter
    public String read(C09CU c09cu) {
        new p();
        return p.LIZ(c09cu).toString();
    }

    @Override // com.google.gson.TypeAdapter
    public void write(C09DL c09dl, String str) {
        c09dl.LJIILL(str);
    }
}
