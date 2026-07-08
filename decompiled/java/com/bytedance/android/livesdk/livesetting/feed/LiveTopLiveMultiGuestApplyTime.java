package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("toplive_page_multi_guest_apply_delay_time")
public final class LiveTopLiveMultiGuestApplyTime {
    public static final LiveTopLiveMultiGuestApplyTime INSTANCE = new LiveTopLiveMultiGuestApplyTime();
    public static final int DEFAULT = 10;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("toplive_page_multi_guest_apply_delay_time", DEFAULT);
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
