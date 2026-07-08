package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_paid_event_recharge_page")
public final class LivePaidEventSchema {
    public static final String DEFAULT = "";
    public static final LivePaidEventSchema INSTANCE = new LivePaidEventSchema();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_paid_event_recharge_page", DEFAULT);
    }
}
