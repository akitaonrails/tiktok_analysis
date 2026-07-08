package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_fetch_anchor_activity_info")
public final class MultiGuestFetchAnchorActivityInfoSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestFetchAnchorActivityInfoSetting INSTANCE = new MultiGuestFetchAnchorActivityInfoSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_fetch_anchor_activity_info", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
