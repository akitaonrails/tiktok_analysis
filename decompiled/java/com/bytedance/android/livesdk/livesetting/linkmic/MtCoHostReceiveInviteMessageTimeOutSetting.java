package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("mt_co_host_receive_invite_message_time_out")
public final class MtCoHostReceiveInviteMessageTimeOutSetting {
    public static final int DEFAULT = 15;
    public static final MtCoHostReceiveInviteMessageTimeOutSetting INSTANCE = new MtCoHostReceiveInviteMessageTimeOutSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("mt_co_host_receive_invite_message_time_out", DEFAULT);
    }
}
