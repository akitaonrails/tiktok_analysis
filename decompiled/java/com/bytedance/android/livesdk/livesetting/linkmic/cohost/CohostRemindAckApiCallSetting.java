package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "cohost_remind_ack_api_call_enable")
public final class CohostRemindAckApiCallSetting {
    public static final boolean DEFAULT = true;
    public static final CohostRemindAckApiCallSetting INSTANCE = new CohostRemindAckApiCallSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_remind_ack_api_call_enable", DEFAULT);
    }
}
