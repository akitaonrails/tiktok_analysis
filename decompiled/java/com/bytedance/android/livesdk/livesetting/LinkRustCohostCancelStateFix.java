package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_sdk_group_join_cancel_fix")
public final class LinkRustCohostCancelStateFix {
    public static final boolean DEFAULT = true;
    public static final LinkRustCohostCancelStateFix INSTANCE = new LinkRustCohostCancelStateFix();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_sdk_group_join_cancel_fix", DEFAULT);
    }
}
