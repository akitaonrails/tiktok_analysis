package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("rtc_ab_label")
public final class RtcAbLabelSetting {
    public static final String DEFAULT = "";
    public static final RtcAbLabelSetting INSTANCE = new RtcAbLabelSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("rtc_ab_label", DEFAULT);
    }
}
