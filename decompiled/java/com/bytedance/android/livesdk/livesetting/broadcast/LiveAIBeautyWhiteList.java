package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_ai_beauty_allow_list")
public final class LiveAIBeautyWhiteList {
    public static final LiveAIBeautyWhiteList INSTANCE = new LiveAIBeautyWhiteList();
    public static final String DEFAULT = "smooth,contrast,tooth,degree,undereye,contour,brighteneyes,shape,eye,nose,mouth";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_ai_beauty_allow_list", DEFAULT);
    }
}
