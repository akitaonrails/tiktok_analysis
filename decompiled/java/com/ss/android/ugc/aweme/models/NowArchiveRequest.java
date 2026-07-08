package com.ss.android.ugc.aweme.models;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class NowArchiveRequest {

    @C09CT("count")
    public final long count;

    @C09CT("cursor")
    public final long cursor;

    @C09CT("load_type")
    public final int loadType;

    public NowArchiveRequest(long j, long j2, int i) {
        this.cursor = j;
        this.count = j2;
        this.loadType = i;
    }
}
