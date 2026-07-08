package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class FeedExtra implements Serializable {

    @C09CT("recommend_info")
    public final String recommendInfo;

    public FeedExtra() {
        this(null);
    }

    public FeedExtra(String str) {
        this.recommendInfo = str;
    }
}
