package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class MixStatusStruct implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("is_collected")
    public int isCollected;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("viewed_in_mix")
    public int viewedInMix;

    public static final class Companion {
    }

    public MixStatusStruct() {
        this(0, 0, 0);
    }

    public final int isCollected() {
        return this.isCollected;
    }

    public final void setCollected(int i) {
        this.isCollected = i;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setViewedInMix(int i) {
        this.viewedInMix = i;
    }

    public MixStatusStruct(int i, int i2, int i3) {
        this.status = i;
        this.isCollected = i2;
        this.viewedInMix = i3;
    }
}
