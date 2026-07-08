package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_show_gift_sub_switch")
public final class LiveShowGiftSubSwitch {
    public static final boolean DEFAULT = true;
    public static final LiveShowGiftSubSwitch INSTANCE = new LiveShowGiftSubSwitch();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_show_gift_sub_switch", DEFAULT);
    }
}
