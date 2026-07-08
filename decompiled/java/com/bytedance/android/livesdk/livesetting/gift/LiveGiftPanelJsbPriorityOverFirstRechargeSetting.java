package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_panel_jsb_priority_over_first_recharge")
public final class LiveGiftPanelJsbPriorityOverFirstRechargeSetting {
    public static final LiveGiftPanelJsbPriorityOverFirstRechargeSetting INSTANCE = new LiveGiftPanelJsbPriorityOverFirstRechargeSetting();
    public static final boolean DEFAULT = true;

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_panel_jsb_priority_over_first_recharge", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
