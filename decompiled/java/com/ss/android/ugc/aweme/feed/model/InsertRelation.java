package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class InsertRelation {
    public static final int $stable = 0;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("relation")
    public final int followStatus;

    public InsertRelation(String str, int i) {
        this.awemeId = str;
        this.followStatus = i;
    }
}
