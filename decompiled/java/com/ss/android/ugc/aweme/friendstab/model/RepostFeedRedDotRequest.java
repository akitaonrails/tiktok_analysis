package com.ss.android.ugc.aweme.friendstab.model;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class RepostFeedRedDotRequest {

    @C09CT("need_init_tab_status")
    public boolean needInitTabStatus;

    public RepostFeedRedDotRequest() {
        this(false);
    }

    public RepostFeedRedDotRequest(boolean z) {
        this.needInitTabStatus = z;
    }

    public final void setNeedInitTabStatus(boolean z) {
        this.needInitTabStatus = z;
    }
}
