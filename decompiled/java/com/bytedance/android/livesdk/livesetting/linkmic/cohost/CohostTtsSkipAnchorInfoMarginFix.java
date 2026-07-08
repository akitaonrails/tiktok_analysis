package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_tts_skip_anchor_info_margin_fix")
public final class CohostTtsSkipAnchorInfoMarginFix {
    public static final boolean DEFAULT = true;
    public static final CohostTtsSkipAnchorInfoMarginFix INSTANCE = new CohostTtsSkipAnchorInfoMarginFix();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_tts_skip_anchor_info_margin_fix", DEFAULT);
    }
}
