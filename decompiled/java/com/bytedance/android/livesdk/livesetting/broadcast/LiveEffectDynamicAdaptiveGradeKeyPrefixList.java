package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_effect_grade_prefix_list")
public final class LiveEffectDynamicAdaptiveGradeKeyPrefixList {
    public static final LiveEffectDynamicAdaptiveGradeKeyPrefixList INSTANCE = new LiveEffectDynamicAdaptiveGradeKeyPrefixList();
    public static final String[] DEFAULT = {"loki_astc_"};

    public final String[] getList() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_effect_grade_prefix_list", DEFAULT);
    }
}
