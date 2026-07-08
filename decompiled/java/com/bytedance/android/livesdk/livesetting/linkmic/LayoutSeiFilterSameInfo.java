package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "layout_sei_filter_same_info")
public final class LayoutSeiFilterSameInfo {
    public static final boolean DEFAULT = true;
    public static final LayoutSeiFilterSameInfo INSTANCE = new LayoutSeiFilterSameInfo();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("layout_sei_filter_same_info", DEFAULT);
    }
}
