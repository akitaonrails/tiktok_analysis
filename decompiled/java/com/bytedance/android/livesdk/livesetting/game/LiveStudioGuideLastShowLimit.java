package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("limit_days_to_show_guideLS_once")
public final class LiveStudioGuideLastShowLimit {
    public static final int DEFAULT = 7;
    public static final LiveStudioGuideLastShowLimit INSTANCE = new LiveStudioGuideLastShowLimit();

    public final int value() {
        return SettingsManager.INSTANCE.getIntValue("limit_days_to_show_guideLS_once", DEFAULT);
    }
}
