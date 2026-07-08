package com.ss.android.ugc.aweme.localservice.consume.playnum;

import com.ss.android.ugc.aweme.localservice.model.PoiFeedPlayNumModel;

/* JADX INFO: loaded from: classes33.dex */
public final class UserPlayData {
    public PoiFeedPlayNumModel model;
    public String uid;

    public final void setModel(PoiFeedPlayNumModel poiFeedPlayNumModel) {
        this.model = poiFeedPlayNumModel;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public UserPlayData(String str, PoiFeedPlayNumModel poiFeedPlayNumModel) {
        this.uid = str;
        this.model = poiFeedPlayNumModel;
    }
}
