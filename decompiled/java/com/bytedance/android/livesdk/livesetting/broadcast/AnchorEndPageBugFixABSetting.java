package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_end_page_bugfix")
public final class AnchorEndPageBugFixABSetting {
    public static final int DEFAULT = 0;
    public static final AnchorEndPageBugFixABSetting INSTANCE = new AnchorEndPageBugFixABSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("anchor_end_page_bugfix", DEFAULT) == 1;
    }
}
