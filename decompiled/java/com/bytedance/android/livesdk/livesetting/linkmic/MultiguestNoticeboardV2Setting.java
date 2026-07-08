package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multiguest_noticeboard_v2")
public final class MultiguestNoticeboardV2Setting {
    public static final int DEFAULT = 0;
    public static final MultiguestNoticeboardV2Setting INSTANCE = new MultiguestNoticeboardV2Setting();
    public static final int TEMPLATE = 1;
    public static final int TEMPLATE_WITH_PREVIEW = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multiguest_noticeboard_v2", DEFAULT);
    }

    public final boolean isPreviewEnable() {
        return getValue() == 2;
    }

    public final boolean templateEnable() {
        return getValue() == 1 || getValue() == 2;
    }
}
