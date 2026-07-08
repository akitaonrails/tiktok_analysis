package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("mt_co_host_reply_time_out")
public final class MtCoHostReplyTimeOutSetting {
    public static final int DEFAULT = 10;
    public static final MtCoHostReplyTimeOutSetting INSTANCE = new MtCoHostReplyTimeOutSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("mt_co_host_reply_time_out", DEFAULT);
    }
}
