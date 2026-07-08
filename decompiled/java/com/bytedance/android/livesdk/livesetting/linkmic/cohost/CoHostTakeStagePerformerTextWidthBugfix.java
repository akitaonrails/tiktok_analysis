package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_take_stage_performer_text_width_fix")
public final class CoHostTakeStagePerformerTextWidthBugfix {
    public static final int DEFAULT = 1;
    public static final CoHostTakeStagePerformerTextWidthBugfix INSTANCE = new CoHostTakeStagePerformerTextWidthBugfix();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_take_stage_performer_text_width_fix", DEFAULT) > 0;
    }
}
