package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_anchor_finish_channel_when_leave")
public final class MultiGuestAnchorFinishChannelWhenLeave {
    public static final boolean DEFAULT = true;
    public static final MultiGuestAnchorFinishChannelWhenLeave INSTANCE = new MultiGuestAnchorFinishChannelWhenLeave();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_anchor_finish_channel_when_leave", DEFAULT);
    }
}
