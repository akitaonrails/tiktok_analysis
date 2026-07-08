package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "moderator_add_fail_append_toast")
public final class ModeratorAddFailAppendToastSetting {
    public static final boolean DEFAULT = true;
    public static final ModeratorAddFailAppendToastSetting INSTANCE = new ModeratorAddFailAppendToastSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("moderator_add_fail_append_toast", DEFAULT);
    }
}
