package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "top_live_exit_use_weak_reference")
public final class TopLiveExitUseWeakReferenceSetting {
    public static final boolean DEFAULT = false;
    public static final TopLiveExitUseWeakReferenceSetting INSTANCE = new TopLiveExitUseWeakReferenceSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("top_live_exit_use_weak_reference", DEFAULT);
    }
}
