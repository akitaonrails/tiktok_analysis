package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AIAdCardSectionData implements Serializable {

    @C09CT("text")
    public final String text;

    public AIAdCardSectionData() {
        this(null);
    }

    public final String getText() {
        return this.text;
    }

    public AIAdCardSectionData(String str) {
        this.text = str;
    }
}
