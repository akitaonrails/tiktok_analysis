package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_resume_leave_group_clean_up")
public final class CohostResumeLeaveGroupCleanup {
    public static final boolean DEFAULT = true;
    public static final CohostResumeLeaveGroupCleanup INSTANCE = new CohostResumeLeaveGroupCleanup();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_resume_leave_group_clean_up", DEFAULT);
    }
}
