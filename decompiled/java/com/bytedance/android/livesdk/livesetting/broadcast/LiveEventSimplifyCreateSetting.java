package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("enable_simplify_create_event")
public final class LiveEventSimplifyCreateSetting {
    public static final int DEFAULT = 0;
    public static final LiveEventSimplifyCreateSetting INSTANCE = new LiveEventSimplifyCreateSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("enable_simplify_create_event", DEFAULT) == 1;
    }
}
