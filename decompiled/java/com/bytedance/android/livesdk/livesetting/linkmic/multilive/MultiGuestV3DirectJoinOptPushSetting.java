package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_invite_outroom_friend_push_duration")
public final class MultiGuestV3DirectJoinOptPushSetting {
    public static final int DEFAULT = 5;
    public static final MultiGuestV3DirectJoinOptPushSetting INSTANCE = new MultiGuestV3DirectJoinOptPushSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_invite_outroom_friend_push_duration", DEFAULT);
    }
}
