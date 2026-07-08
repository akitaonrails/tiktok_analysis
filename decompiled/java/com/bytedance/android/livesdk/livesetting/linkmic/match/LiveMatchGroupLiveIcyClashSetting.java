package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gbl_group_live_icy_clash_config")
public final class LiveMatchGroupLiveIcyClashSetting {
    public static final LiveMatchGroupLiveIcyClashSetting INSTANCE = new LiveMatchGroupLiveIcyClashSetting();
    public static final LiveMatchGroupLiveIcyClashSettingConfig DEFAULT = new LiveMatchGroupLiveIcyClashSettingConfig(true, 0.75f, "aweme://roma_redirect/?spark_page=match_icy_clash_educate", "sslocal://webcast_lynxview?url=https%3A%2F%2Fsf-teko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-internal-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_match_icy_effect%2Fmain%2Ftemplate.js&enable_canvas=1&use_v8=1&enable_dynamic_v8=1");

    private final LiveMatchGroupLiveIcyClashSettingConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveMatchGroupLiveIcyClashSettingConfig liveMatchGroupLiveIcyClashSettingConfig = DEFAULT;
        LiveMatchGroupLiveIcyClashSettingConfig liveMatchGroupLiveIcyClashSettingConfig2 = (LiveMatchGroupLiveIcyClashSettingConfig) settingsManager.getValueSafely("gbl_group_live_icy_clash_config", liveMatchGroupLiveIcyClashSettingConfig);
        return liveMatchGroupLiveIcyClashSettingConfig2 != null ? liveMatchGroupLiveIcyClashSettingConfig2 : liveMatchGroupLiveIcyClashSettingConfig;
    }

    public final String getEducationUrl() {
        return getConfig().education_url;
    }

    public final float getEffectScreenHeightPercentage() {
        return getConfig().effect_screen_height_percentage;
    }

    public final String getEffectUrl() {
        return getConfig().effect_url;
    }

    public final boolean isEnable() {
        return getConfig().enable;
    }
}
