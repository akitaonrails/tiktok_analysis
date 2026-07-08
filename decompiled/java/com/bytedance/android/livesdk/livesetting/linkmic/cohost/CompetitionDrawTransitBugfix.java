package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("competition_draw_transit_bugfix")
public final class CompetitionDrawTransitBugfix {
    public static final boolean DEFAULT = true;
    public static final CompetitionDrawTransitBugfix INSTANCE = new CompetitionDrawTransitBugfix();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("competition_draw_transit_bugfix", DEFAULT);
    }
}
