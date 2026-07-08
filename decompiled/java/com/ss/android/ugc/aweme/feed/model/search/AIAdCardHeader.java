package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class AIAdCardHeader implements Serializable {

    @C09CT("label")
    public final AIAdCardLabel label;

    @C09CT("text")
    public final String text;

    public AIAdCardHeader() {
        this(null, null);
    }

    public final AIAdCardLabel getLabel() {
        return this.label;
    }

    public final String getText() {
        return this.text;
    }

    public AIAdCardHeader(String str, AIAdCardLabel aIAdCardLabel) {
        this.text = str;
        this.label = aIAdCardLabel;
    }
}
