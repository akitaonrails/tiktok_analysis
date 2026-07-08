package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_layer_on_sei_recall_protect")
public final class LinkMicLayerOnSeiReCallProtectOpt {
    public static final boolean DEFAULT = true;
    public static final LinkMicLayerOnSeiReCallProtectOpt INSTANCE = new LinkMicLayerOnSeiReCallProtectOpt();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_layer_on_sei_recall_protect", DEFAULT);
    }
}
