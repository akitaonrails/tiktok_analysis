package com.bytedance.android.livesdk.comp.api.subscription.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_sub_only_space_preview")
public final class LiveSubOnlySpacePreviewSetting {
    public static final int DEFAULT = 0;
    public static final int DEFAULT_1 = 1;
    public static final int DEFAULT_2 = 2;
    public static final LiveSubOnlySpacePreviewSetting INSTANCE = new LiveSubOnlySpacePreviewSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_sub_only_space_preview", DEFAULT) > 0;
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_sub_only_space_preview", DEFAULT);
    }

    public final boolean displayCapsuleMultiTierTab() {
        return getValue() <= 1;
    }

    public final boolean displaySubOnlyPreviewPage() {
        return getValue() == 2;
    }

    public final boolean displaySubOnlyPreviewTab() {
        return getValue() == 1;
    }
}
