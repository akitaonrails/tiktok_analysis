package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_enable_show_user_name_on_micview")
public final class LinkMicEnableShowUserNameOnMicviewSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicEnableShowUserNameOnMicviewSetting INSTANCE = new LinkMicEnableShowUserNameOnMicviewSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_enable_show_user_name_on_micview", DEFAULT);
    }
}
