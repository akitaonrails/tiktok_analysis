package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "service_plus_enable")
public final class MultiGuestPlaybookServicePlus {
    public static final boolean DEFAULT = true;
    public static final MultiGuestPlaybookServicePlus INSTANCE = new MultiGuestPlaybookServicePlus();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("service_plus_enable", DEFAULT);
    }
}
