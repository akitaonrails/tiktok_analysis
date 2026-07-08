package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class NearbyTag implements Serializable {

    @C09CT("text")
    public String text;

    public NearbyTag() {
        this(null);
    }

    public NearbyTag(String str) {
        this.text = str;
    }
}
