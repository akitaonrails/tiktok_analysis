package com.bytedance.android.livesdk.livesetting.roomfunction.mainframework;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_lynx_banner_placeholder_config")
public final class LiveBannerPlaceholderSettingConfig {
    public static final LiveBannerPlaceholderSettingConfig INSTANCE = new LiveBannerPlaceholderSettingConfig();
    public static final BannerPlaceholderConfig DEFAULT = new BannerPlaceholderConfig(true, 2, 5);

    public final BannerPlaceholderConfig config() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        BannerPlaceholderConfig bannerPlaceholderConfig = DEFAULT;
        BannerPlaceholderConfig bannerPlaceholderConfig2 = (BannerPlaceholderConfig) settingsManager.getValueSafely("live_lynx_banner_placeholder_config", bannerPlaceholderConfig);
        return bannerPlaceholderConfig2 != null ? bannerPlaceholderConfig2 : bannerPlaceholderConfig;
    }

    public static final class BannerPlaceholderConfig {
        public static final TypeAdapter ADAPTER = new LiveBannerPlaceholderSettingConfig_BannerPlaceholderConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("static_banner_level")
        public int baseSingleLevel;

        @C09CT("dynamic_banner_level")
        public int dynamicBannerLevel;

        @C09CT("enable_tab_title")
        public boolean tabTitleEnable;

        public BannerPlaceholderConfig() {
            this(true, 2, 5);
        }

        public final int getBaseSingleLevel() {
            return this.baseSingleLevel;
        }

        public final int getDynamicBannerLevel() {
            return this.dynamicBannerLevel;
        }

        public final boolean getTabTitleEnable() {
            return this.tabTitleEnable;
        }

        public final void setBaseSingleLevel(int i) {
            this.baseSingleLevel = i;
        }

        public final void setDynamicBannerLevel(int i) {
            this.dynamicBannerLevel = i;
        }

        public final void setTabTitleEnable(boolean z) {
            this.tabTitleEnable = z;
        }

        public BannerPlaceholderConfig(boolean z, int i, int i2) {
            this.tabTitleEnable = z;
            this.baseSingleLevel = i;
            this.dynamicBannerLevel = i2;
        }
    }
}
