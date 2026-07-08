package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class InsertItemParams {
    public static final int $stable = 0;

    @C09CT("aweme_ids")
    public final String awemeId;

    @C09CT("infos")
    public final InfoParams infos;

    public InsertItemParams() {
        this(null, null);
    }

    public InsertItemParams(String str, InfoParams infoParams) {
        this.awemeId = str;
        this.infos = infoParams;
    }
}
