package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("quick_cohost_timeout_pop_up_datachannel_setting")
public final class QuickCohostTimeoutPopupDataChannelSetting {
    public static final boolean DEFAULT = true;
    public static final QuickCohostTimeoutPopupDataChannelSetting INSTANCE = new QuickCohostTimeoutPopupDataChannelSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("quick_cohost_timeout_pop_up_datachannel_setting", DEFAULT);
    }
}
