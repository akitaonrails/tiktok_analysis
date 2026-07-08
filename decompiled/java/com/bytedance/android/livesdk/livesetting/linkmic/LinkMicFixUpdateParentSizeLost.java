package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_fix_update_parent_size_lost")
public final class LinkMicFixUpdateParentSizeLost {
    public static final boolean DEFAULT = true;
    public static final LinkMicFixUpdateParentSizeLost INSTANCE = new LinkMicFixUpdateParentSizeLost();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_fix_update_parent_size_lost", DEFAULT);
    }
}
