package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("enable_cohost_avoid_cohost_icon_set_for_resume_live")
public final class EnableCoHostAvoidCohostIconSetForResumeLive {
    public static final boolean DEFAULT = false;
    public static final EnableCoHostAvoidCohostIconSetForResumeLive INSTANCE = new EnableCoHostAvoidCohostIconSetForResumeLive();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_cohost_avoid_cohost_icon_set_for_resume_live", DEFAULT);
    }
}
