package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLiveStruct implements Serializable {

    @C09CT("live_cover_type")
    public final String liveCoverType;

    public SearchLiveStruct() {
        this(null);
    }

    public SearchLiveStruct(String str) {
        this.liveCoverType = str;
    }
}
