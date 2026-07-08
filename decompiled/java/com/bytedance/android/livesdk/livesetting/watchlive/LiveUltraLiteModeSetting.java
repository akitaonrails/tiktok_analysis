package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_ultra_lite_mode_exp")
public final class LiveUltraLiteModeSetting {
    public static final LiveUltraLiteModeSetting INSTANCE = new LiveUltraLiteModeSetting();
    public static final LiveUltraLiteModeConfig DEFAULT = new LiveUltraLiteModeConfig(false, 60, 2, 60, 2, false, 1, "");

    public static final class LiveUltraLiteModeConfig {
        public static final TypeAdapter ADAPTER = new LiveUltraLiteModeSetting_LiveUltraLiteModeConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("auto_toast_count")
        public int autoToastCount;

        @C09CT("auto_toast_interval")
        public long autoToastInterval;

        @C09CT("default_auto_switch")
        public int defaultAutoSwitch;

        @C09CT("enable_listeners")
        public boolean enable;

        @C09CT("enable_setting_entry")
        public boolean enableSettingEntry;

        @C09CT("guide_toast_count")
        public int guideToastCount;

        @C09CT("guide_toast_interval")
        public long guideToastInterval;

        @C09CT("learn_more_url")
        public String learnMoreUrl;

        public LiveUltraLiteModeConfig() {
            this(false, 60L, 2, 60L, 2, false, 1, "");
        }

        public final int getAutoToastCount() {
            return this.autoToastCount;
        }

        public final long getAutoToastInterval() {
            return this.autoToastInterval;
        }

        public final int getDefaultAutoSwitch() {
            return this.defaultAutoSwitch;
        }

        public final boolean getEnable() {
            return this.enable;
        }

        public final boolean getEnableSettingEntry() {
            return this.enableSettingEntry;
        }

        public final int getGuideToastCount() {
            return this.guideToastCount;
        }

        public final long getGuideToastInterval() {
            return this.guideToastInterval;
        }

        public final String getLearnMoreUrl() {
            return this.learnMoreUrl;
        }

        public final void setAutoToastCount(int i) {
            this.autoToastCount = i;
        }

        public final void setAutoToastInterval(long j) {
            this.autoToastInterval = j;
        }

        public final void setDefaultAutoSwitch(int i) {
            this.defaultAutoSwitch = i;
        }

        public final void setEnable(boolean z) {
            this.enable = z;
        }

        public final void setEnableSettingEntry(boolean z) {
            this.enableSettingEntry = z;
        }

        public final void setGuideToastCount(int i) {
            this.guideToastCount = i;
        }

        public final void setGuideToastInterval(long j) {
            this.guideToastInterval = j;
        }

        public final void setLearnMoreUrl(String str) {
            this.learnMoreUrl = str;
        }

        public LiveUltraLiteModeConfig(boolean z, long j, int i, long j2, int i2, boolean z2, int i3, String str) {
            this.enableSettingEntry = z;
            this.guideToastInterval = j;
            this.guideToastCount = i;
            this.autoToastInterval = j2;
            this.autoToastCount = i2;
            this.enable = z2;
            this.defaultAutoSwitch = i3;
            this.learnMoreUrl = str;
        }
    }

    public final LiveUltraLiteModeConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveUltraLiteModeConfig liveUltraLiteModeConfig = DEFAULT;
        LiveUltraLiteModeConfig liveUltraLiteModeConfig2 = (LiveUltraLiteModeConfig) settingsManager.getValueSafely("live_ultra_lite_mode_exp", liveUltraLiteModeConfig);
        return liveUltraLiteModeConfig2 != null ? liveUltraLiteModeConfig2 : liveUltraLiteModeConfig;
    }
}
