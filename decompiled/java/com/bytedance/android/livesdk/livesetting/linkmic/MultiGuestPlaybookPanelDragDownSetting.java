package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "playbook_panel_drag_down")
public final class MultiGuestPlaybookPanelDragDownSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestPlaybookPanelDragDownSetting INSTANCE = new MultiGuestPlaybookPanelDragDownSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("playbook_panel_drag_down", DEFAULT);
    }
}
