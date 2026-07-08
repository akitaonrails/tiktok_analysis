package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_guide_invite_panel_picker_max_num")
public final class AnchorGuideInvitePanelPickerMaxNumSetting {
    public static final int DEFAULT = 100;
    public static final AnchorGuideInvitePanelPickerMaxNumSetting INSTANCE = new AnchorGuideInvitePanelPickerMaxNumSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("anchor_guide_invite_panel_picker_max_num", DEFAULT);
    }
}
