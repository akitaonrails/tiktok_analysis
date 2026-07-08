package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("cohost_match_resume_opt")
public final class CohostMatchResumeOpt {
    public static final int DEFAULT = 1;
    public static final CohostMatchResumeOpt INSTANCE = new CohostMatchResumeOpt();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("cohost_match_resume_opt", DEFAULT);
    }

    public final boolean isEnabledForAll() {
        return getValue() == 2;
    }

    public final boolean isEnabledForUnionSessionOnly() {
        return getValue() == 1;
    }
}
