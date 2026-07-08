package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_nudge_entrance")
public final class LiveNudgeEntranceSetting {
    public static final boolean DEFAULT = false;
    public static final LiveNudgeEntranceSetting INSTANCE = new LiveNudgeEntranceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_nudge_entrance", DEFAULT);
    }
}
