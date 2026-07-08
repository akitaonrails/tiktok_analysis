package com.bytedance.android.livesdk.model;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class LastUsedLiveBoardsModel {

    @C09CT("board")
    public long boardId;

    @C09CT("need_restore")
    public boolean needRestore;

    @C09CT("update_time")
    public long updateTime;

    public LastUsedLiveBoardsModel() {
        this(0L, 0L, false);
    }

    public LastUsedLiveBoardsModel(long j, long j2, boolean z) {
        this.boardId = j;
        this.updateTime = j2;
        this.needRestore = z;
    }
}
