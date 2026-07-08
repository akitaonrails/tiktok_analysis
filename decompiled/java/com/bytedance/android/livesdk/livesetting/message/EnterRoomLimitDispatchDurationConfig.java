package com.bytedance.android.livesdk.livesetting.message;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes19.dex */
public final class EnterRoomLimitDispatchDurationConfig {
    public static final TypeAdapter ADAPTER = new EnterRoomLimitDispatchDurationConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enabled")
    public boolean enabled;

    @C09CT("duration")
    public long duration = 8;

    @C09CT("till_time")
    public long tillTime = Mp4ScreenVideoLoadTimeout.CONTROL;

    public final long getDuration() {
        return this.duration;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final long getTillTime() {
        return this.tillTime;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setTillTime(long j) {
        this.tillTime = j;
    }
}
