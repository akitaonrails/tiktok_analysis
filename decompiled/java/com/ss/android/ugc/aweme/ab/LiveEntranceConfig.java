package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveEntranceConfig implements Serializable {

    @C09CT("enable_following_head")
    public final boolean enableFollowingHead;

    @C09CT("enable_homepage_head")
    public final boolean enableHomepageHead;

    @C09CT("enable_inbox_head")
    public final boolean enableInboxHead;

    @C09CT("enable_video_head")
    public final boolean enableVideoHead;

    public LiveEntranceConfig() {
        this(false, false, false, false);
    }

    public LiveEntranceConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enableFollowingHead = z;
        this.enableInboxHead = z2;
        this.enableVideoHead = z3;
        this.enableHomepageHead = z4;
    }
}
