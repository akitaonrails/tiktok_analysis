package com.bytedance.android.livesdk.livesetting.message;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes19.dex */
public final class EnterRoomChangeWindowTimeConfig {
    public static final TypeAdapter ADAPTER = new EnterRoomChangeWindowTimeConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enabled")
    public boolean enabled;

    @C09CT("window_time")
    public long windowTime = 50;

    @C09CT("till_time")
    public long tillTime = Mp4ScreenVideoLoadTimeout.CONTROL;

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final long getTillTime() {
        return this.tillTime;
    }

    public final long getWindowTime() {
        return this.windowTime;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setTillTime(long j) {
        this.tillTime = j;
    }

    public final void setWindowTime(long j) {
        this.windowTime = j;
    }
}
