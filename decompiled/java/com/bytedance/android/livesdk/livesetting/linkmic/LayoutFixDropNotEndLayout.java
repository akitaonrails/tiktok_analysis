package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "layout_fix_drop_not_end_layout")
public final class LayoutFixDropNotEndLayout {
    public static final boolean DEFAULT = true;
    public static final LayoutFixDropNotEndLayout INSTANCE = new LayoutFixDropNotEndLayout();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("layout_fix_drop_not_end_layout", DEFAULT);
    }
}
