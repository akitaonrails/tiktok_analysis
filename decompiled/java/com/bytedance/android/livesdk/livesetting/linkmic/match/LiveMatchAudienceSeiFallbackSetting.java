package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("gbl_double_match_audience_fallback_enable")
public final class LiveMatchAudienceSeiFallbackSetting {
    public static final int DEFAULT = 0;
    public static final LiveMatchAudienceSeiFallbackSetting INSTANCE = new LiveMatchAudienceSeiFallbackSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("gbl_double_match_audience_fallback_enable", DEFAULT) == 1;
    }
}
