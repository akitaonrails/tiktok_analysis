package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_sdk_compensate_IM_timeout_interval")
public final class LinkMicSdkCompensateImInterval {
    public static final long DEFAULT = 5;
    public static final LinkMicSdkCompensateImInterval INSTANCE = new LinkMicSdkCompensateImInterval();

    public static final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("linkmic_sdk_compensate_IM_timeout_interval", DEFAULT);
    }
}
