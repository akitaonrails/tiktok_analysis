package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_sub_enable_tpl_list_prefetch")
public final class LiveSubEnableTplListPrefetchSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSubEnableTplListPrefetchSetting INSTANCE = new LiveSubEnableTplListPrefetchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sub_enable_tpl_list_prefetch", DEFAULT);
    }
}
