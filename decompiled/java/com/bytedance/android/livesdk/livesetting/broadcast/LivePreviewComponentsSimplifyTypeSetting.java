package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_preview_components_simplify_type")
public final class LivePreviewComponentsSimplifyTypeSetting {
    public static final int DEFAULT = 0;
    public static final LivePreviewComponentsSimplifyTypeSetting INSTANCE = new LivePreviewComponentsSimplifyTypeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_preview_components_simplify_type", DEFAULT);
    }

    public final boolean inExperiment() {
        return getValue() > 0;
    }

    public final boolean needShadowForTitle() {
        return getValue() == 2;
    }

    public final boolean showBottomLiveGoalBtn() {
        int value = getValue();
        return 1 <= value && value < 3;
    }

    public final boolean showFullLiveGoalBtn() {
        return getValue() == 3;
    }
}
