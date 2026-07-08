package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_ignore_smooth_enter_first_frame_exp")
public final class LiveIgnoreSmoothEnterFirstFrameExp {
    public static final boolean DEFAULT = false;
    public static final LiveIgnoreSmoothEnterFirstFrameExp INSTANCE = new LiveIgnoreSmoothEnterFirstFrameExp();
    public static boolean isPreview;
    public static boolean isSmoothEnter;

    public static final boolean isExp() {
        if (SettingsManager.INSTANCE.getBooleanValue("live_ignore_smooth_enter_first_frame_exp", DEFAULT)) {
            return isSmoothEnter || isPreview;
        }
        return false;
    }

    public static final void setIsSmoothEnterOrPreview(boolean z, boolean z2) {
        isSmoothEnter = z;
        isPreview = z2;
    }
}
