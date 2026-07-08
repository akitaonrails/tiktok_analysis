package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class TTMStoreLink implements Serializable {

    @C09CT("data")
    public String data;

    @C09CT("link")
    public String link;

    public TTMStoreLink() {
        this(null, null);
    }

    public TTMStoreLink(String str, String str2) {
        this.link = str;
        this.data = str2;
    }
}
