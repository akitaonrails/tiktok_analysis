package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multiguest_playbook_preview_on_top_enabled")
public final class MultiGuestPlaybookPreviewOnTopEnabledSettings {
    public static final boolean DEFAULT = true;
    public static final MultiGuestPlaybookPreviewOnTopEnabledSettings INSTANCE = new MultiGuestPlaybookPreviewOnTopEnabledSettings();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multiguest_playbook_preview_on_top_enabled", DEFAULT);
    }
}
