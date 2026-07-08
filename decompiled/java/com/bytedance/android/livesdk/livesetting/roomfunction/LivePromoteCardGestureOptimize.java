package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_promote_card_gesture_opt")
public final class LivePromoteCardGestureOptimize {
    public static final boolean DEFAULT = false;
    public static final LivePromoteCardGestureOptimize INSTANCE = new LivePromoteCardGestureOptimize();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_promote_card_gesture_opt", DEFAULT);
    }
}
