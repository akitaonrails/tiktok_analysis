package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_fix_capsule_guide_repeat")
public final class LinkMicFixCapsuleGuideRepeatSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicFixCapsuleGuideRepeatSetting INSTANCE = new LinkMicFixCapsuleGuideRepeatSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_fix_capsule_guide_repeat", DEFAULT);
    }
}
