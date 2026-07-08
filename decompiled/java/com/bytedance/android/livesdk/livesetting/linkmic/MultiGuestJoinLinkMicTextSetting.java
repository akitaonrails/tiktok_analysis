package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multiguest_join_linkmic_text")
public final class MultiGuestJoinLinkMicTextSetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestJoinLinkMicTextSetting INSTANCE = new MultiGuestJoinLinkMicTextSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("multiguest_join_linkmic_text", DEFAULT) == 1;
    }
}
