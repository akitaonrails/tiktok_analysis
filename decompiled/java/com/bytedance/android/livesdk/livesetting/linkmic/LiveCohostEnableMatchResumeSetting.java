package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("cohost_match_resume_policy")
public final class LiveCohostEnableMatchResumeSetting {
    public static final LiveCohostEnableMatchResumeSetting INSTANCE = new LiveCohostEnableMatchResumeSetting();
    public static final CohostMatchResumeSetting DEFAULT = new CohostMatchResumeSetting(1, 27);

    public final CohostMatchResumeSetting getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        CohostMatchResumeSetting cohostMatchResumeSetting = DEFAULT;
        CohostMatchResumeSetting cohostMatchResumeSetting2 = (CohostMatchResumeSetting) settingsManager.getValueSafely("cohost_match_resume_policy", cohostMatchResumeSetting);
        return cohostMatchResumeSetting2 != null ? cohostMatchResumeSetting2 : cohostMatchResumeSetting;
    }

    public final boolean isEnableCoHostResume() {
        return getValue().enableMatchResume == 1;
    }
}
