package com.ss.android.ugc.aweme.share.improve.action.aidubbing;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class AiDubbingToggleRequest {

    @C09CT("item_id")
    public final Long itemId;

    @C09CT("toggle_status")
    public final Boolean toggleStatus;

    public AiDubbingToggleRequest() {
        this(null, null);
    }

    public AiDubbingToggleRequest(Long l, Boolean bool) {
        this.itemId = l;
        this.toggleStatus = bool;
    }
}
