package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey("linkmic_multiguestv3_page_first_frame_log")
public final class LinkMicMultiGuestPageFirstFrameLogSetting {
    public static final LinkMicMultiGuestPageFirstFrameLogSetting INSTANCE = new LinkMicMultiGuestPageFirstFrameLogSetting();
    public static double randomSampleVale = -1.0d;
    public static final LinkMicMultiGuestPageFirstFrameLogConfig DEFAULT = new LinkMicMultiGuestPageFirstFrameLogConfig(false, 1.0d);

    private final LinkMicMultiGuestPageFirstFrameLogConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LinkMicMultiGuestPageFirstFrameLogConfig linkMicMultiGuestPageFirstFrameLogConfig = DEFAULT;
        LinkMicMultiGuestPageFirstFrameLogConfig linkMicMultiGuestPageFirstFrameLogConfig2 = (LinkMicMultiGuestPageFirstFrameLogConfig) settingsManager.getValueSafely("linkmic_multiguestv3_page_first_frame_log", linkMicMultiGuestPageFirstFrameLogConfig);
        return linkMicMultiGuestPageFirstFrameLogConfig2 != null ? linkMicMultiGuestPageFirstFrameLogConfig2 : linkMicMultiGuestPageFirstFrameLogConfig;
    }

    public final boolean canReport() {
        if (!getConfig().enable) {
            return false;
        }
        if (randomSampleVale < 0.0d) {
            randomSampleVale = ThreadLocalRandom.current().nextDouble();
        }
        return randomSampleVale < getConfig().sampleRate;
    }
}
