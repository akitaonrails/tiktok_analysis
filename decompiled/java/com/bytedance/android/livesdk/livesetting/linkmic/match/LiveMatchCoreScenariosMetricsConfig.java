package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveMatchCoreScenariosMetricsConfig {
    public static final TypeAdapter ADAPTER = new LiveMatchCoreScenariosMetricsConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_bonus_track")
    public boolean enableBonusTrack;

    @C09CT("enable_component_track")
    public boolean enableComponentTrack;

    @C09CT("enable_powerup_track")
    public boolean enablePowerupTrack;

    @C09CT("enable_result_track")
    public boolean enableResultTrack;

    @C09CT("enable_score_track")
    public boolean enableScoreTrack;

    @C09CT("enable_timer_track")
    public boolean enableTimerTrack;

    @C09CT("enable_track")
    public boolean enableTrack;

    public LiveMatchCoreScenariosMetricsConfig() {
        this(true, true, true, true, true, true, true);
    }

    public LiveMatchCoreScenariosMetricsConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.enableTrack = z;
        this.enableScoreTrack = z2;
        this.enableTimerTrack = z3;
        this.enableResultTrack = z4;
        this.enableComponentTrack = z5;
        this.enableBonusTrack = z6;
        this.enablePowerupTrack = z7;
    }
}
