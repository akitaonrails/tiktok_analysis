package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_mic_layout_zorder_setting")
public final class LiveMicLayoutZOrderSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMicLayoutZOrderSetting INSTANCE = new LiveMicLayoutZOrderSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_mic_layout_zorder_setting", DEFAULT);
    }
}
