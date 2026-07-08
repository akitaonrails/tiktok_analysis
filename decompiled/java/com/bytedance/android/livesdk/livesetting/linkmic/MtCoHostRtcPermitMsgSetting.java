package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_cohost_rtc_permit_msg_enable")
public final class MtCoHostRtcPermitMsgSetting {
    public static final int DEFAULT = 0;
    public static final MtCoHostRtcPermitMsgSetting INSTANCE = new MtCoHostRtcPermitMsgSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_rtc_permit_msg_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
