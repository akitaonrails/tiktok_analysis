package com.ss.android.ugc.aweme.inbox.bulletin.data;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinItemResponseCursor {

    @C09CT("min_time")
    public final Long minTime;

    @C09CT("time_cursor")
    public final Long nextCursor;

    public BulletinItemResponseCursor() {
        this(null, null);
    }

    public BulletinItemResponseCursor(Long l, Long l2) {
        this.nextCursor = l;
        this.minTime = l2;
    }
}
