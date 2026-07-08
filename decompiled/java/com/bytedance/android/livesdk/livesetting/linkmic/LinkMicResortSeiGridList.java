package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_resort_sei_grid_list")
public final class LinkMicResortSeiGridList {
    public static final boolean DEFAULT = true;
    public static final LinkMicResortSeiGridList INSTANCE = new LinkMicResortSeiGridList();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_resort_sei_grid_list", DEFAULT);
    }
}
