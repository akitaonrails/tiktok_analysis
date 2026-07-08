package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_cohost_gift_tray_layout_fix_enable")
public final class LiveCohostGiftTrayLayoutFixEnableSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCohostGiftTrayLayoutFixEnableSetting INSTANCE = new LiveCohostGiftTrayLayoutFixEnableSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_gift_tray_layout_fix_enable", DEFAULT);
    }
}
