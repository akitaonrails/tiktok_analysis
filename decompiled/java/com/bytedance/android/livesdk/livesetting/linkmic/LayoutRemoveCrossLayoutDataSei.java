package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "layout_remove_cross_layout_data_sei")
public final class LayoutRemoveCrossLayoutDataSei {
    public static final boolean DEFAULT = true;
    public static final LayoutRemoveCrossLayoutDataSei INSTANCE = new LayoutRemoveCrossLayoutDataSei();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("layout_remove_cross_layout_data_sei", DEFAULT);
    }
}
