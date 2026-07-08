package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "like_continue_area_expand_anchor")
public final class LiveLikeContinueAreaExpandAnchorSetting {
    public static final int DEFAULT = 0;
    public static final LiveLikeContinueAreaExpandAnchorSetting INSTANCE = new LiveLikeContinueAreaExpandAnchorSetting();
    public static final int V1 = 1;
    public static final int V2 = 2;
    public static final int V3 = 3;
    public static final int V4 = 4;
    public static final int V5 = 5;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("like_continue_area_expand_anchor", DEFAULT);
    }

    public final boolean coHostCanLike$livesetting_release() {
        return getValue() == 3 || getValue() == 4 || getValue() == 5;
    }

    public final boolean enableExpand$livesetting_release() {
        return isExpandToBarrier$livesetting_release() || isExpandFullScreen$livesetting_release();
    }

    public final boolean isExpandFullScreen$livesetting_release() {
        return getValue() == 2 || getValue() == 5;
    }

    public final boolean isExpandToBarrier$livesetting_release() {
        return getValue() == 1 || getValue() == 4;
    }
}
