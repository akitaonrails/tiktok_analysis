package com.ss.android.ugc.aweme.services.edit;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class MusicStripResultConfirmRequest {

    @C09CT("edit_req_id")
    public final String editReqId;

    @C09CT("is_apply_strip_result")
    public final boolean isApplyStripResult;

    @C09CT("item_id")
    public final long itemId;

    @C09CT("user_id")
    public final long userId;

    public MusicStripResultConfirmRequest() {
        this(0L, 0L, false, null);
    }

    public final boolean isApplyStripResult() {
        return this.isApplyStripResult;
    }

    public MusicStripResultConfirmRequest(long j, long j2, boolean z, String str) {
        this.itemId = j;
        this.userId = j2;
        this.isApplyStripResult = z;
        this.editReqId = str;
    }
}
