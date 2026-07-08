package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_allow_setup_before_linker_created")
public final class LinkMicAllowSetupBeforeLinkerCreated {
    public static final boolean DEFAULT = false;
    public static final LinkMicAllowSetupBeforeLinkerCreated INSTANCE = new LinkMicAllowSetupBeforeLinkerCreated();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_allow_setup_before_linker_created", DEFAULT);
    }
}
