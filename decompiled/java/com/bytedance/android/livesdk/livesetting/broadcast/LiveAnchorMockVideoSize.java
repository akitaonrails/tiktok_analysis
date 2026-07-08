package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_anchor_mock_video_size")
public final class LiveAnchorMockVideoSize {
    public static final AnchorMockVideoSizeConfig DEFAULT;
    public static final LiveAnchorMockVideoSize INSTANCE = new LiveAnchorMockVideoSize();
    public static AnchorMockVideoSizeConfig videoSize;

    static {
        AnchorMockVideoSizeConfig anchorMockVideoSizeConfig = new AnchorMockVideoSizeConfig();
        DEFAULT = anchorMockVideoSizeConfig;
        AnchorMockVideoSizeConfig anchorMockVideoSizeConfig2 = (AnchorMockVideoSizeConfig) SettingsManager.INSTANCE.getValueSafely("live_anchor_mock_video_size", anchorMockVideoSizeConfig);
        if (anchorMockVideoSizeConfig2 != null) {
            anchorMockVideoSizeConfig = anchorMockVideoSizeConfig2;
        }
        videoSize = anchorMockVideoSizeConfig;
    }

    public final AnchorMockVideoSizeConfig getValue() {
        return videoSize;
    }

    public static final void setValue(int i, int i2) {
        AnchorMockVideoSizeConfig anchorMockVideoSizeConfig = new AnchorMockVideoSizeConfig();
        anchorMockVideoSizeConfig.width = i;
        anchorMockVideoSizeConfig.height = i2;
        videoSize = anchorMockVideoSizeConfig;
    }
}
