package com.bytedance.android.livesdk.sei;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class SeiLiveShowExtra {

    @C09CT("mic_ctrl")
    public boolean allowOpenMicFreely;

    @C09CT("each_show_duration")
    public int eachShowDuration;

    @C09CT("show_id")
    public long showId;

    @C09CT("show_status")
    public int showStatus;

    @C09CT("trans_d")
    public long transDuration;

    @C09CT("trans_t")
    public long transStartTime;

    public SeiLiveShowExtra() {
        this(0, 0L, 0, 0L, 0L, false);
    }

    public SeiLiveShowExtra(int i, long j, int i2, long j2, long j3, boolean z) {
        this.eachShowDuration = i;
        this.showId = j;
        this.showStatus = i2;
        this.transStartTime = j2;
        this.transDuration = j3;
        this.allowOpenMicFreely = z;
    }
}
