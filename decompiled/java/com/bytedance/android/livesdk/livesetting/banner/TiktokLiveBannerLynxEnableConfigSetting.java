package com.bytedance.android.livesdk.livesetting.banner;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "tiktok_live_banner_lynx_enable_config")
public final class TiktokLiveBannerLynxEnableConfigSetting {
    public static final TiktokLiveBannerLynxEnableConfigSetting INSTANCE = new TiktokLiveBannerLynxEnableConfigSetting();
    public static final Map<String, Boolean> DEFAULT = C2097608Jq.LJ();

    public final Map<String, Boolean> getValue() {
        return (Map) SettingsManager.INSTANCE.getValueSafely("tiktok_live_banner_lynx_enable_config", DEFAULT);
    }

    public final Map<String, Boolean> getDEFAULT() {
        return DEFAULT;
    }
}
