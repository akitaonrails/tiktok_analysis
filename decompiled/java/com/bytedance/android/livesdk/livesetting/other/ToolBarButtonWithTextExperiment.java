package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_toolbar_with_title")
public final class ToolBarButtonWithTextExperiment {
    public static final boolean DEFAULT = false;
    public static final boolean HAS_TEXT = true;
    public static final ToolBarButtonWithTextExperiment INSTANCE = new ToolBarButtonWithTextExperiment();

    public static final boolean hasText() {
        return !LiveToolbarUIConfig.noText();
    }
}
