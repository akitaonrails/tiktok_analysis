package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class PinInfo {

    @C09CT("display_duration")
    public long displayDuration;

    @C09CT("has_pin")
    public boolean pinEnabled;

    public PinInfo() {
        this(false, 0L);
    }

    public PinInfo(boolean z, long j) {
        this.pinEnabled = z;
        this.displayDuration = j;
    }
}
