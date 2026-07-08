package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("linkmic_sei_opt_precision")
public final class LinkMicSEIPrecisionSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicSEIPrecisionSetting INSTANCE = new LinkMicSEIPrecisionSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_sei_opt_precision", DEFAULT);
    }
}
