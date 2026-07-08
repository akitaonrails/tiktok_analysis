package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_live_replay_to_guest")
public final class MultiGuestReplayToGuestSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestReplayToGuestSetting INSTANCE = new MultiGuestReplayToGuestSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_live_replay_to_guest", DEFAULT);
    }
}
