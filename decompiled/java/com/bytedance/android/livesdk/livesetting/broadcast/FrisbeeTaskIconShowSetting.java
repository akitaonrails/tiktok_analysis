package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("frisbee_task_icon_show")
public final class FrisbeeTaskIconShowSetting {
    public static final boolean DEFAULT = false;
    public static final FrisbeeTaskIconShowSetting INSTANCE = new FrisbeeTaskIconShowSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("frisbee_task_icon_show", DEFAULT);
    }
}
