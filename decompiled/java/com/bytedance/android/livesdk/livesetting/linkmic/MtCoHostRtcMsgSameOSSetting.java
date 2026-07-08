package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_cohost_rtc_msg_same_os_enable")
public final class MtCoHostRtcMsgSameOSSetting {
    public static final int DEFAULT = 1;
    public static final MtCoHostRtcMsgSameOSSetting INSTANCE = new MtCoHostRtcMsgSameOSSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_rtc_msg_same_os_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
