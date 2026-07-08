package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "popup_cohost_list_for_online_friend_capsule")
public final class PopupCohostListForOnlineFriendCapsuleSetting {
    public static final boolean DEFAULT = false;
    public static final PopupCohostListForOnlineFriendCapsuleSetting INSTANCE = new PopupCohostListForOnlineFriendCapsuleSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("popup_cohost_list_for_online_friend_capsule", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
