package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_apply_guide_after_one_click_permit")
public final class LinkMicApplyGuideContinueSetting {
    public static final int DEFAULT = 0;
    public static final LinkMicApplyGuideContinueSetting INSTANCE = new LinkMicApplyGuideContinueSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_apply_guide_after_one_click_permit", DEFAULT) > 0;
    }
}
