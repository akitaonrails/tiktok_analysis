package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_buffer_control_opt_setting")
public final class LiveGiftBufferControllerOptSetting {
    public static final LiveGiftBufferControllerOptSetting INSTANCE = new LiveGiftBufferControllerOptSetting();
    public static final boolean DEFAULT = false;
    public static final boolean isEnabled = SettingsManager.INSTANCE.getBooleanValue("live_gift_buffer_control_opt_setting", DEFAULT);

    public final boolean isEnabled() {
        return isEnabled;
    }
}
