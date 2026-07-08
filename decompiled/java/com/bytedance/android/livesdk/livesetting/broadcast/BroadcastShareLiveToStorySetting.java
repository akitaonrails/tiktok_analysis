package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_share_live_to_story")
public final class BroadcastShareLiveToStorySetting {
    public static final int DEFAULT = 0;
    public static final BroadcastShareLiveToStorySetting INSTANCE = new BroadcastShareLiveToStorySetting();

    public static final boolean isAllEnable() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_share_live_to_story", DEFAULT) == 1;
    }

    public static final boolean isOnlyAudienceAndGuestEnable() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_share_live_to_story", DEFAULT) == 2;
    }
}
