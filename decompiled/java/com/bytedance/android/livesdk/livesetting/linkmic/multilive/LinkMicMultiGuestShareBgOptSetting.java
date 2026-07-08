package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_sdk_multiguest_share_bg_opt")
public final class LinkMicMultiGuestShareBgOptSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicMultiGuestShareBgOptSetting INSTANCE = new LinkMicMultiGuestShareBgOptSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multiguest_share_bg_opt", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
