package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_top_live_random_match_use_coroutine")
public final class MultiTopLiveRandomMatchUseCoroutineSetting {
    public static final boolean DEFAULT = true;
    public static final MultiTopLiveRandomMatchUseCoroutineSetting INSTANCE = new MultiTopLiveRandomMatchUseCoroutineSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_top_live_random_match_use_coroutine", DEFAULT);
    }
}
