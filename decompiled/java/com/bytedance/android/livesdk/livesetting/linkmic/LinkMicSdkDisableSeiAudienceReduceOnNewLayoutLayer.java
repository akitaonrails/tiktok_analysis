package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_disable_sei_reduce_on_new_layout")
public final class LinkMicSdkDisableSeiAudienceReduceOnNewLayoutLayer {
    public static final boolean DEFAULT = true;
    public static final LinkMicSdkDisableSeiAudienceReduceOnNewLayoutLayer INSTANCE = new LinkMicSdkDisableSeiAudienceReduceOnNewLayoutLayer();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_disable_sei_reduce_on_new_layout", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
