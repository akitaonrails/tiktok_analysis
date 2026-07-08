package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_with_guest_sdk_session_ext_setting")
public final class CohostWithGuestSDKSessionExtSetting {
    public static final int DEFAULT = 0;
    public static final CohostWithGuestSDKSessionExtSetting INSTANCE = new CohostWithGuestSDKSessionExtSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("cohost_with_guest_sdk_session_ext_setting", DEFAULT);
    }

    public final boolean forceEnabled() {
        return getValue() == 1;
    }
}
