package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("linkmic_sei_format_err_end_layout")
public final class LinkMicSeiFormatErrIntervalSetting {
    public static final long DEFAULT = 5000;
    public static final LinkMicSeiFormatErrIntervalSetting INSTANCE = new LinkMicSeiFormatErrIntervalSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("linkmic_sei_format_err_end_layout", DEFAULT);
    }
}
