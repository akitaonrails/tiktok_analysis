package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class DaInfo implements Serializable {

    @C09CT("extra")
    public final String extra;

    @C09CT("name")
    public final String name;

    public DaInfo() {
        this(null, null);
    }

    public DaInfo(String str, String str2) {
        this.name = str;
        this.extra = str2;
    }
}
