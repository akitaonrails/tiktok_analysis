package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "interact_not_restore_param")
public final class InteractNotRestoreParam {
    public static final boolean DEFAULT = true;
    public static final InteractNotRestoreParam INSTANCE = new InteractNotRestoreParam();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("interact_not_restore_param", DEFAULT);
    }
}
