package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMatchScoreTrackConfig {
    public static final TypeAdapter ADAPTER = new LiveMatchScoreTrackConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_track")
    public boolean enable_track;

    @C09CT("enable_track_normal")
    public boolean enable_track_normal;

    @C09CT("periodic_check_interval")
    public float periodic_check_interval;

    public LiveMatchScoreTrackConfig() {
        this(true, false, 30.0f);
    }

    public LiveMatchScoreTrackConfig(boolean z, boolean z2, float f) {
        this.enable_track = z;
        this.enable_track_normal = z2;
        this.periodic_check_interval = f;
    }
}
