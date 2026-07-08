package com.ss.android.ugc.aweme.tools.draft.entity;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftOperationInfo {

    @C09CT("free_up_space")
    public long freeUpSpace;

    @C09CT("has_aigc_new_framework_task")
    public boolean hasAigcNewFrameworkTask;

    @C09CT("is_need_show")
    public boolean isNeedShow;

    @C09CT("is_update_sticker")
    public boolean isUpdateSticker;

    @C09CT("type")
    public int type;

    public DraftOperationInfo() {
        this(-1, true, 0L, false, false);
    }

    public DraftOperationInfo(int i, boolean z, long j, boolean z2, boolean z3) {
        this.type = i;
        this.isNeedShow = z;
        this.freeUpSpace = j;
        this.isUpdateSticker = z2;
        this.hasAigcNewFrameworkTask = z3;
    }
}
