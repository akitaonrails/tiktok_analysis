package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_link_control_OOM_setting")
public final class LiveLinkControlPresenterOOMSetting {
    public static final boolean DEFAULT = true;
    public static final LiveLinkControlPresenterOOMSetting INSTANCE = new LiveLinkControlPresenterOOMSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_link_control_OOM_setting", DEFAULT);
    }
}
