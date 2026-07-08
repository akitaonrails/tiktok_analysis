package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_outside_invite_optimize_v2")
public final class MultiGuestV3DirectJoinOptSetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestV3DirectJoinOptSetting INSTANCE = new MultiGuestV3DirectJoinOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_outside_invite_optimize_v2", DEFAULT);
    }
}
