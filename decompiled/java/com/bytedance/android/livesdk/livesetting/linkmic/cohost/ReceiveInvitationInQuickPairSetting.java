package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_receive_invite_in_quick_pair")
public final class ReceiveInvitationInQuickPairSetting {
    public static final int DEFAULT = 0;
    public static final ReceiveInvitationInQuickPairSetting INSTANCE = new ReceiveInvitationInQuickPairSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_receive_invite_in_quick_pair", DEFAULT) == 1;
    }
}
