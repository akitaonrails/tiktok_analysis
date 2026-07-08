package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class AIAdCardLabel implements Serializable {

    @C09CT("text")
    public final String text;

    public AIAdCardLabel() {
        this(null);
    }

    public final String getText() {
        return this.text;
    }

    public AIAdCardLabel(String str) {
        this.text = str;
    }
}
