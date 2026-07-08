package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_sdk_multiguest_expand_guest_count_version_v2")
public final class LiveSdkMultiguestExpandGuestCountVersionV2Setting {
    public static final int DEFAULT = 0;
    public static final LiveSdkMultiguestExpandGuestCountVersionV2Setting INSTANCE = new LiveSdkMultiguestExpandGuestCountVersionV2Setting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_sdk_multiguest_expand_guest_count_version_v2", DEFAULT);
    }
}
