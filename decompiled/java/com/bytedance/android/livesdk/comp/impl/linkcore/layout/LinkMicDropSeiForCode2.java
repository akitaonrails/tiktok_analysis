package com.bytedance.android.livesdk.comp.impl.linkcore.layout;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_linkmic_drop_sei_for_code_2")
public final class LinkMicDropSeiForCode2 {
    public static final boolean DEFAULT = false;
    public static final LinkMicDropSeiForCode2 INSTANCE = new LinkMicDropSeiForCode2();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("livesdk_linkmic_drop_sei_for_code_2", DEFAULT);
    }
}
