package com.bytedance.android.livesdk.broadcast.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveAnchorStatusDiagnosticsPerfConfigAndroidConfig {
    public static final TypeAdapter ADAPTER = new LiveAnchorStatusDiagnosticsPerfConfigAndroidConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("high_device")
    public LiveAnchorStatusDiagnosticsPerfConfig highTier;

    @C09CT("low_device")
    public LiveAnchorStatusDiagnosticsPerfConfig lowTier;

    @C09CT("mid_device")
    public LiveAnchorStatusDiagnosticsPerfConfig mediumTier;

    public LiveAnchorStatusDiagnosticsPerfConfigAndroidConfig() {
        this(null, null, null);
    }

    public final boolean hasTierConfig() {
        return (this.lowTier == null && this.mediumTier == null && this.highTier == null) ? false : true;
    }

    public final LiveAnchorStatusDiagnosticsPerfConfig getHighTier() {
        return this.highTier;
    }

    public final LiveAnchorStatusDiagnosticsPerfConfig getLowTier() {
        return this.lowTier;
    }

    public final LiveAnchorStatusDiagnosticsPerfConfig getMediumTier() {
        return this.mediumTier;
    }

    public final void setHighTier(LiveAnchorStatusDiagnosticsPerfConfig liveAnchorStatusDiagnosticsPerfConfig) {
        this.highTier = liveAnchorStatusDiagnosticsPerfConfig;
    }

    public final void setLowTier(LiveAnchorStatusDiagnosticsPerfConfig liveAnchorStatusDiagnosticsPerfConfig) {
        this.lowTier = liveAnchorStatusDiagnosticsPerfConfig;
    }

    public final void setMediumTier(LiveAnchorStatusDiagnosticsPerfConfig liveAnchorStatusDiagnosticsPerfConfig) {
        this.mediumTier = liveAnchorStatusDiagnosticsPerfConfig;
    }

    public LiveAnchorStatusDiagnosticsPerfConfigAndroidConfig(LiveAnchorStatusDiagnosticsPerfConfig liveAnchorStatusDiagnosticsPerfConfig, LiveAnchorStatusDiagnosticsPerfConfig liveAnchorStatusDiagnosticsPerfConfig2, LiveAnchorStatusDiagnosticsPerfConfig liveAnchorStatusDiagnosticsPerfConfig3) {
        this.lowTier = liveAnchorStatusDiagnosticsPerfConfig;
        this.mediumTier = liveAnchorStatusDiagnosticsPerfConfig2;
        this.highTier = liveAnchorStatusDiagnosticsPerfConfig3;
    }
}
