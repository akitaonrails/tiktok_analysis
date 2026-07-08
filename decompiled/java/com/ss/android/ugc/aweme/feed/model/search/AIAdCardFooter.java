package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class AIAdCardFooter implements Serializable {

    @C09CT("text")
    public final String text;

    public AIAdCardFooter() {
        this(null);
    }

    public final String getText() {
        return this.text;
    }

    public AIAdCardFooter(String str) {
        this.text = str;
    }
}
