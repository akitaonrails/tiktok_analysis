package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveAnchorLeaveConfig {
    public static final TypeAdapter ADAPTER = new LiveAnchorLeaveConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("live_anchor_leave_time")
    public long anchorLeaveTime;

    @C09CT("enable_leave_opt")
    public boolean enableLeaveOpt;

    public LiveAnchorLeaveConfig() {
        this(false, 60000L);
    }

    public final long getAnchorLeaveTime() {
        return this.anchorLeaveTime;
    }

    public final boolean getEnableLeaveOpt() {
        return this.enableLeaveOpt;
    }

    public final void setAnchorLeaveTime(long j) {
        this.anchorLeaveTime = j;
    }

    public final void setEnableLeaveOpt(boolean z) {
        this.enableLeaveOpt = z;
    }

    public LiveAnchorLeaveConfig(boolean z, long j) {
        this.enableLeaveOpt = z;
        this.anchorLeaveTime = j;
    }
}
