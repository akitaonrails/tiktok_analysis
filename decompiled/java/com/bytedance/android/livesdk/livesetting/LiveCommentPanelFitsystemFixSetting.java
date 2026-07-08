package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_comment_panel_fitsystem_fix")
public final class LiveCommentPanelFitsystemFixSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCommentPanelFitsystemFixSetting INSTANCE = new LiveCommentPanelFitsystemFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_comment_panel_fitsystem_fix", DEFAULT);
    }
}
