package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_fans_club_hide_unqualified_anchor_stickers")
public final class FansClubHideUnqualifiedAnchorSettings {
    public static final boolean DEFAULT = false;
    public static final FansClubHideUnqualifiedAnchorSettings INSTANCE = new FansClubHideUnqualifiedAnchorSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_club_hide_unqualified_anchor_stickers", DEFAULT);
    }
}
