package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_toolbar_tips_clickable")
public final class ToolbarTipsClickableExperiment {
    public static final ToolbarTipsClickableExperiment INSTANCE = new ToolbarTipsClickableExperiment();
    public static final boolean DEFAULT = false;
    public static final boolean clickable = SettingsManager.INSTANCE.getBooleanValue("live_toolbar_tips_clickable", DEFAULT);

    public final boolean getClickable() {
        return clickable;
    }
}
