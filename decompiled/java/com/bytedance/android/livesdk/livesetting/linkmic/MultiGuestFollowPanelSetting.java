package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_follow_panel_setting")
public final class MultiGuestFollowPanelSetting {
    public static final MultiGuestFollowPanelSetting INSTANCE = new MultiGuestFollowPanelSetting();
    public static final MultiGuestFollowPanelConf DEFAULT = new MultiGuestFollowPanelConf(5, 1, 5, true);

    public final MultiGuestFollowPanelConf getValue() {
        MultiGuestFollowPanelConf multiGuestFollowPanelConf = (MultiGuestFollowPanelConf) SettingsManager.INSTANCE.getValueSafely(MultiGuestFollowPanelSetting.class);
        return multiGuestFollowPanelConf == null ? DEFAULT : multiGuestFollowPanelConf;
    }
}
