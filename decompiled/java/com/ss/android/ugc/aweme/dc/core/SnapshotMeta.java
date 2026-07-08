package com.ss.android.ugc.aweme.dc.core;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class SnapshotMeta {

    @C09CT("update_at")
    public final long updateAt;

    @C09CT("user_id")
    public final String userId;

    @C09CT("version")
    public final int version;

    @C09CT("vo_version")
    public final int voVersion;

    public SnapshotMeta(int i, int i2, long j, String str) {
        this.version = i;
        this.voVersion = i2;
        this.updateAt = j;
        this.userId = str;
    }
}
