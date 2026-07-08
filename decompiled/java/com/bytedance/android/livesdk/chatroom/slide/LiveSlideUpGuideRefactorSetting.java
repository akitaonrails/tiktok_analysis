package com.bytedance.android.livesdk.chatroom.slide;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_slide_up_guide_refactor")
public final class LiveSlideUpGuideRefactorSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSlideUpGuideRefactorSetting INSTANCE = new LiveSlideUpGuideRefactorSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_slide_up_guide_refactor", DEFAULT);
    }
}
