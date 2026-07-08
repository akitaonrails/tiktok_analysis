package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_end_live_card_v2")
public final class MultiGuestEndLiveCardV2Setting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestEndLiveCardV2Setting INSTANCE = new MultiGuestEndLiveCardV2Setting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_end_live_card_v2", DEFAULT);
    }
}
