package com.bytedance.android.livesdk.livefinishcard;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_finish_card_full_to_half_opt_config")
public final class LiveEndPageFullToHalfOptSetting {
    public static final LiveEndPageFullToHalfOptSetting INSTANCE = new LiveEndPageFullToHalfOptSetting();
    public static final EndPageFullToHalfOptConfig DEFAULT = new EndPageFullToHalfOptConfig(false, true, false);

    private final EndPageFullToHalfOptConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        EndPageFullToHalfOptConfig endPageFullToHalfOptConfig = DEFAULT;
        EndPageFullToHalfOptConfig endPageFullToHalfOptConfig2 = (EndPageFullToHalfOptConfig) settingsManager.getValueSafely("live_finish_card_full_to_half_opt_config", endPageFullToHalfOptConfig);
        return endPageFullToHalfOptConfig2 != null ? endPageFullToHalfOptConfig2 : endPageFullToHalfOptConfig;
    }

    public final boolean isAnimationEnable() {
        return getValue().getEnableAnimation();
    }

    public final boolean isEnable() {
        return getValue().getEnable();
    }

    public final boolean isSwipeOptEnable() {
        return getValue().getSwipeOptEnable();
    }

    public static final class EndPageFullToHalfOptConfig {
        public static final TypeAdapter ADAPTER = new LiveEndPageFullToHalfOptSetting_EndPageFullToHalfOptConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public boolean enable;

        @C09CT("enable_animation")
        public boolean enableAnimation;

        @C09CT("swipe_opt_enable")
        public boolean swipeOptEnable;

        public EndPageFullToHalfOptConfig() {
            this(false, true, false);
        }

        public final boolean getEnable() {
            return this.enable;
        }

        public final boolean getEnableAnimation() {
            return this.enableAnimation;
        }

        public final boolean getSwipeOptEnable() {
            return this.swipeOptEnable;
        }

        public final void setEnable(boolean z) {
            this.enable = z;
        }

        public final void setEnableAnimation(boolean z) {
            this.enableAnimation = z;
        }

        public final void setSwipeOptEnable(boolean z) {
            this.swipeOptEnable = z;
        }

        public EndPageFullToHalfOptConfig(boolean z, boolean z2, boolean z3) {
            this.enable = z;
            this.enableAnimation = z2;
            this.swipeOptEnable = z3;
        }
    }
}
