package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_quick_cohost_switch_pool_enable")
public final class QuickCohostSwitchPoolEnable {
    public static final boolean DEFAULT = false;
    public static final QuickCohostSwitchPoolEnable INSTANCE = new QuickCohostSwitchPoolEnable();

    public final boolean isTrue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_quick_cohost_switch_pool_enable", DEFAULT);
    }
}
