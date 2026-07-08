package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_layout_sort_anchor_by_position")
public final class CoHostLayoutSortAnchorByPositionSetting {
    public static final boolean DEFAULT = true;
    public static final CoHostLayoutSortAnchorByPositionSetting INSTANCE = new CoHostLayoutSortAnchorByPositionSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_layout_sort_anchor_by_position", DEFAULT);
    }
}
