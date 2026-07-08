package com.ss.android.ugc.aweme.live.skylight.tooltip;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class ToolTipInteractRecord {

    @C09CT("interact_ts")
    public final long interactTimeStamps;

    @C09CT("show_ts")
    public final long showTimeStamps;

    public ToolTipInteractRecord(long j, long j2) {
        this.showTimeStamps = j;
        this.interactTimeStamps = j2;
    }
}
