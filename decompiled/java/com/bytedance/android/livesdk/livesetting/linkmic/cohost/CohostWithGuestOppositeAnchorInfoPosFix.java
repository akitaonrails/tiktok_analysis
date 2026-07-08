package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_with_guest_opposite_anchor_info_pos_fix")
public final class CohostWithGuestOppositeAnchorInfoPosFix {
    public static final boolean DEFAULT = true;
    public static final CohostWithGuestOppositeAnchorInfoPosFix INSTANCE = new CohostWithGuestOppositeAnchorInfoPosFix();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_with_guest_opposite_anchor_info_pos_fix", DEFAULT);
    }
}
