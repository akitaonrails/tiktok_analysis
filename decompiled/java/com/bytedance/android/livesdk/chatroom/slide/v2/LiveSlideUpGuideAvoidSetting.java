package com.bytedance.android.livesdk.chatroom.slide.v2;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_slide_up_guide_avoid")
public final class LiveSlideUpGuideAvoidSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSlideUpGuideAvoidSetting INSTANCE = new LiveSlideUpGuideAvoidSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_slide_up_guide_avoid", DEFAULT);
    }
}
