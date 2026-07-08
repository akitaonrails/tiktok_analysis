package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "multi_top_live_pending_avatar_task_count")
public final class MultiTopLivePendingAvatarTaskCountSetting {
    public static final int DEFAULT = 10;
    public static final MultiTopLivePendingAvatarTaskCountSetting INSTANCE = new MultiTopLivePendingAvatarTaskCountSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_top_live_pending_avatar_task_count", DEFAULT);
    }
}
