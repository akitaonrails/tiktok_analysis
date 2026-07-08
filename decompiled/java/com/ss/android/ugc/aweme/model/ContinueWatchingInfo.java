package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class ContinueWatchingInfo implements Serializable {

    @C09CT("continue_watching_video_index")
    public final int continueIndex;

    @C09CT("continue_watching_status")
    public final ContinueStatus continueStatus;

    @C09CT("continue_watching_Trailer")
    public final boolean continueWatchingTrailer;

    public ContinueWatchingInfo() {
        this(0, ContinueStatus.UNKNOWN, false);
    }

    public ContinueWatchingInfo(int i, ContinueStatus continueStatus, boolean z) {
        this.continueIndex = i;
        this.continueStatus = continueStatus;
        this.continueWatchingTrailer = z;
    }
}
