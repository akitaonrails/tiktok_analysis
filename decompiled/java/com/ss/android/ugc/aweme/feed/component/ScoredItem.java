package com.ss.android.ugc.aweme.feed.component;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class ScoredItem {

    @C09CT("media_id")
    public final String id;

    @C09CT("score")
    public final int score;

    public ScoredItem() {
        this(null, 0);
    }

    public ScoredItem(String str, int i) {
        this.id = str;
        this.score = i;
    }
}
