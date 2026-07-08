package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("co_host_allowcheck_businesscondition_to_adjustvideoview")
public final class CohostAllowCheckBusinessConditionToAdjustVideoView {
    public static final boolean DEFAULT = true;
    public static final CohostAllowCheckBusinessConditionToAdjustVideoView INSTANCE = new CohostAllowCheckBusinessConditionToAdjustVideoView();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("co_host_allowcheck_businesscondition_to_adjustvideoview", DEFAULT);
    }
}
