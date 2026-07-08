package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("link_mic_cohost_resume_client_fix")
public final class LinkMicCohostResumeClientFix {
    public static final boolean DEFAULT = true;
    public static final LinkMicCohostResumeClientFix INSTANCE = new LinkMicCohostResumeClientFix();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_cohost_resume_client_fix", DEFAULT);
    }
}
