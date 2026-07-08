package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "multiguest_guide_playbook_banner")
public final class MultiGuestPlaybookBannerEnabledSettings {
    public static final boolean DEFAULT = false;
    public static final MultiGuestPlaybookBannerEnabledSettings INSTANCE = new MultiGuestPlaybookBannerEnabledSettings();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multiguest_guide_playbook_banner", DEFAULT);
    }
}
