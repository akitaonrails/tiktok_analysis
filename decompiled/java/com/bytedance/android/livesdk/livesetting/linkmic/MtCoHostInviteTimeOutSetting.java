package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("mt_co_host_invite_time_out")
public final class MtCoHostInviteTimeOutSetting {
    public static final int DEFAULT = 20;
    public static final MtCoHostInviteTimeOutSetting INSTANCE = new MtCoHostInviteTimeOutSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("mt_co_host_invite_time_out", DEFAULT);
    }
}
