package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("multi_guest_audience_shoppong_mode")
public final class MulitGuestAudienceShoppingMode {
    public static final boolean DEFAULT = true;
    public static final MulitGuestAudienceShoppingMode INSTANCE = new MulitGuestAudienceShoppingMode();

    public static final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_audience_shoppong_mode", DEFAULT);
    }
}
