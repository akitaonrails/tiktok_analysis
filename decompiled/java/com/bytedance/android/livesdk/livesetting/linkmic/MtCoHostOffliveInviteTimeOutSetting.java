package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("mt_co_host_offlive_invite_time_out")
public final class MtCoHostOffliveInviteTimeOutSetting {
    public static final int DEFAULT = 300;
    public static final MtCoHostOffliveInviteTimeOutSetting INSTANCE = new MtCoHostOffliveInviteTimeOutSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("mt_co_host_offlive_invite_time_out", DEFAULT);
    }
}
