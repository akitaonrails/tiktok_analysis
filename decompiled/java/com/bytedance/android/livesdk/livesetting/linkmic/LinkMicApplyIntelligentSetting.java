package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_apply_intelligent_match")
public final class LinkMicApplyIntelligentSetting {
    public static final int DEFAULT = 0;
    public static final LinkMicApplyIntelligentSetting INSTANCE = new LinkMicApplyIntelligentSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_apply_intelligent_match", DEFAULT) > 0;
    }
}
