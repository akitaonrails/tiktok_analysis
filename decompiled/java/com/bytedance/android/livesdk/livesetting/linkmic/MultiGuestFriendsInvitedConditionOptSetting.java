package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_friends_invited_condition_opt")
public final class MultiGuestFriendsInvitedConditionOptSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestFriendsInvitedConditionOptSetting INSTANCE = new MultiGuestFriendsInvitedConditionOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_friends_invited_condition_opt", DEFAULT);
    }
}
