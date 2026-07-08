package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_live_invite_friend_freq_ctrl")
public final class MultiLiveInviteFriendFreqCtrl {
    public static final MultiLiveInviteFriendFreqCtrl INSTANCE = new MultiLiveInviteFriendFreqCtrl();
    public static final InviteFriendFreCtrlConfig DEFAULT = new InviteFriendFreCtrlConfig(new RoomWindow(3600, 100), 180);

    public final InviteFriendFreCtrlConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        InviteFriendFreCtrlConfig inviteFriendFreCtrlConfig = DEFAULT;
        InviteFriendFreCtrlConfig inviteFriendFreCtrlConfig2 = (InviteFriendFreCtrlConfig) settingsManager.getValueSafely("multi_live_invite_friend_freq_ctrl", inviteFriendFreCtrlConfig);
        return inviteFriendFreCtrlConfig2 != null ? inviteFriendFreCtrlConfig2 : inviteFriendFreCtrlConfig;
    }

    public final InviteFriendFreCtrlConfig getValue() {
        return getSettingValue();
    }
}
