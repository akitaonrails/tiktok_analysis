package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveLivingIconAnimatorConfig implements Serializable {

    @C09CT("inboxRefreshFrameInterval")
    public final int inboxRefreshFrameInterval;

    @C09CT("isInboxLiveEnable")
    public final boolean isInboxLiveEnable;

    @C09CT("isTopLiveEnable")
    public final boolean isTopLiveEnable;

    @C09CT("minFrameRate")
    public final int minFrameRate;

    @C09CT("topLiveRefreshFrameInterval")
    public final int topLiveRefreshFrameInterval;

    public LiveLivingIconAnimatorConfig() {
        this(false, false, 1, 1, 30);
    }

    public final boolean isInboxLiveEnable() {
        return this.isInboxLiveEnable;
    }

    public final boolean isTopLiveEnable() {
        return this.isTopLiveEnable;
    }

    public LiveLivingIconAnimatorConfig(boolean z, boolean z2, int i, int i2, int i3) {
        this.isInboxLiveEnable = z;
        this.isTopLiveEnable = z2;
        this.inboxRefreshFrameInterval = i;
        this.topLiveRefreshFrameInterval = i2;
        this.minFrameRate = i3;
    }
}
