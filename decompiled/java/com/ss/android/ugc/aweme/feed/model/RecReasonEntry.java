package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class RecReasonEntry implements Serializable {

    @C09CT("desc")
    public String desc;

    @C09CT("rec_type")
    public int type;

    @C09CT("url")
    public String url;

    public RecReasonEntry() {
    }

    public RecReasonEntry(int i, String str, String str2) {
        this.type = i;
        this.desc = str;
        this.url = str2;
    }
}
