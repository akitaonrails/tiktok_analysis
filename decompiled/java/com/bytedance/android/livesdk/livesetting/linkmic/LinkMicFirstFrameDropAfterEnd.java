package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes21.dex */
@SettingsKey("linkmic_first_frame_drop_after_end")
public final class LinkMicFirstFrameDropAfterEnd {
    public static final boolean DEFAULT = true;
    public static final LinkMicFirstFrameDropAfterEnd INSTANCE = new LinkMicFirstFrameDropAfterEnd();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_first_frame_drop_after_end", DEFAULT);
    }
}
