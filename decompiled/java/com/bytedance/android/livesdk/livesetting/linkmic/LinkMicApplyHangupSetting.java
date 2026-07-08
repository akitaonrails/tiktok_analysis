package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_apply_hangup")
public final class LinkMicApplyHangupSetting {
    public static final LinkMicApplyHangupSetting INSTANCE = new LinkMicApplyHangupSetting();
    public static final LinkMicApplyHangupConfig DEFAULT = new LinkMicApplyHangupConfig(false, 5, 20, 7);

    public static final int getMaxApplyCount() {
        return INSTANCE.getValue().maxApplyCount;
    }

    public static final int getOverdueTimeSecond() {
        return INSTANCE.getValue().overdueTimeSecond;
    }

    public static final int getShareIconPriority() {
        return INSTANCE.getValue().shareIconPriority;
    }

    public static final boolean isEnable() {
        return INSTANCE.getValue().enable;
    }

    public final LinkMicApplyHangupConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LinkMicApplyHangupConfig linkMicApplyHangupConfig = DEFAULT;
        LinkMicApplyHangupConfig linkMicApplyHangupConfig2 = (LinkMicApplyHangupConfig) settingsManager.getValueSafely("link_mic_apply_hangup", linkMicApplyHangupConfig);
        return linkMicApplyHangupConfig2 != null ? linkMicApplyHangupConfig2 : linkMicApplyHangupConfig;
    }
}
