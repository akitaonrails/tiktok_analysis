package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class EcomIntentExtra implements Serializable {

    @C09CT("search_penetrate_info")
    public final String searchPenetrateInfo;

    public EcomIntentExtra() {
        this(null);
    }

    public EcomIntentExtra(String str) {
        this.searchPenetrateInfo = str;
    }
}
