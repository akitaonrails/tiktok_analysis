package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "delete_repeat_request")
public final class DeleteRepeatRequestSetting {
    public static final boolean DEFAULT = false;
    public static final DeleteRepeatRequestSetting INSTANCE = new DeleteRepeatRequestSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("delete_repeat_request", DEFAULT);
    }

    public final boolean disable() {
        return !enable();
    }
}
