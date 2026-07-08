package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("linkmic_cohost_clear_state_fix")
public final class LinkMicCohostClearStateFix {
    public static final boolean DEFAULT = true;
    public static final LinkMicCohostClearStateFix INSTANCE = new LinkMicCohostClearStateFix();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_cohost_clear_state_fix", DEFAULT);
    }
}
