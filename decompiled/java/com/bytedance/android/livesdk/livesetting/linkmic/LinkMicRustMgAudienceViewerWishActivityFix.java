package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_multi_guest_audience_viewer_wish_activity_fix")
public final class LinkMicRustMgAudienceViewerWishActivityFix {
    public static final boolean DEFAULT = true;
    public static final LinkMicRustMgAudienceViewerWishActivityFix INSTANCE = new LinkMicRustMgAudienceViewerWishActivityFix();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_multi_guest_audience_viewer_wish_activity_fix", DEFAULT);
    }
}
