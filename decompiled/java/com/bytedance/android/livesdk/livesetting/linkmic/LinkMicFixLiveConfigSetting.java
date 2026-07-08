package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("link_mic_fix_live_config_setting")
public final class LinkMicFixLiveConfigSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicFixLiveConfigSetting INSTANCE = new LinkMicFixLiveConfigSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_fix_live_config_setting", DEFAULT);
    }
}
