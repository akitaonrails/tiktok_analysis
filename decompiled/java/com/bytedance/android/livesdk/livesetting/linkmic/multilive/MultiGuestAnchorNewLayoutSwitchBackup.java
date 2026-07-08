package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("multi_guest_anchor_new_layout_switch_backup")
public final class MultiGuestAnchorNewLayoutSwitchBackup {
    public static final boolean DEFAULT = true;
    public static final MultiGuestAnchorNewLayoutSwitchBackup INSTANCE = new MultiGuestAnchorNewLayoutSwitchBackup();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_anchor_new_layout_switch_backup", DEFAULT);
    }
}
