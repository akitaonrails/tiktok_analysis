package com.bytedance.android.livesdk.livesetting.watchlive.player;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_cold_start_surface_cover_opt_exp")
public final class LiveColdStartSurfaceCoverExp {
    public static final LiveColdStartSurfaceCoverExp INSTANCE = new LiveColdStartSurfaceCoverExp();
    public static final LiveColdStartSurfaceCoverConfig DEFAULT = new LiveColdStartSurfaceCoverConfig(false, false, false, false);

    public static final LiveColdStartSurfaceCoverConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveColdStartSurfaceCoverConfig liveColdStartSurfaceCoverConfig = DEFAULT;
        LiveColdStartSurfaceCoverConfig liveColdStartSurfaceCoverConfig2 = (LiveColdStartSurfaceCoverConfig) settingsManager.getValueSafely("live_cold_start_surface_cover_opt_exp", liveColdStartSurfaceCoverConfig);
        return liveColdStartSurfaceCoverConfig2 != null ? liveColdStartSurfaceCoverConfig2 : liveColdStartSurfaceCoverConfig;
    }

    public static final boolean disable() {
        return !getEnable();
    }

    public static final boolean getEnable() {
        return getValue().getEnable();
    }

    public static final boolean isBgFallbackOnly() {
        return getEnable() && getValue().getBgFallbackOnly();
    }

    public static final boolean isBranchRevealImmediate() {
        return getEnable() && !getValue().getRevealOnSelected();
    }

    public static final boolean isBranchRevealOnSelected() {
        return getEnable() && getValue().getRevealOnSelected();
    }

    public static final boolean isRevealOnDrawThread() {
        return getEnable() && getValue().getRevealOnDrawThread();
    }

    public static final boolean isRevealOnPlayerThread() {
        return getEnable() && !getValue().getRevealOnDrawThread();
    }

    public static final class LiveColdStartSurfaceCoverConfig {
        public static final TypeAdapter ADAPTER = new LiveColdStartSurfaceCoverExp_LiveColdStartSurfaceCoverConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("bg_fallback_only")
        public boolean bgFallbackOnly;

        @C09CT("enable")
        public boolean enable;

        @C09CT("reveal_on_draw_thread")
        public boolean revealOnDrawThread;

        @C09CT("reveal_on_selected")
        public boolean revealOnSelected;

        public LiveColdStartSurfaceCoverConfig() {
            this(false, false, false, false);
        }

        public final boolean getBgFallbackOnly() {
            return this.bgFallbackOnly;
        }

        public final boolean getEnable() {
            return this.enable;
        }

        public final boolean getRevealOnDrawThread() {
            return this.revealOnDrawThread;
        }

        public final boolean getRevealOnSelected() {
            return this.revealOnSelected;
        }

        public final void setBgFallbackOnly(boolean z) {
            this.bgFallbackOnly = z;
        }

        public final void setEnable(boolean z) {
            this.enable = z;
        }

        public final void setRevealOnDrawThread(boolean z) {
            this.revealOnDrawThread = z;
        }

        public final void setRevealOnSelected(boolean z) {
            this.revealOnSelected = z;
        }

        public LiveColdStartSurfaceCoverConfig(boolean z, boolean z2, boolean z3, boolean z4) {
            this.enable = z;
            this.revealOnSelected = z2;
            this.revealOnDrawThread = z3;
            this.bgFallbackOnly = z4;
        }
    }
}
