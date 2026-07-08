package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("linkmic_sdk_video_sei_end_layout")
public final class MultiGuestV3VideoSeiEndSetting {
    public static final MultiGuestV3VideoSeiEndSetting INSTANCE = new MultiGuestV3VideoSeiEndSetting();
    public static final VideoSeiEndSetting DEFAULT = new VideoSeiEndSetting(1, 1, 1, new ArrayList(C1697810uHb.LJIIJJI("video", "live_studio")));

    private final VideoSeiEndSetting getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        VideoSeiEndSetting videoSeiEndSetting = DEFAULT;
        VideoSeiEndSetting videoSeiEndSetting2 = (VideoSeiEndSetting) settingsManager.getValueSafely("linkmic_sdk_video_sei_end_layout", videoSeiEndSetting);
        return videoSeiEndSetting2 != null ? videoSeiEndSetting2 : videoSeiEndSetting;
    }

    public final boolean enableNoParseSeiEndLayout() {
        return getConfig().enableNoParseSeiEndLayout == 1;
    }

    public final ArrayList<String> enableSceneList() {
        return getConfig().enableSceneList;
    }

    public final boolean enableVideoSei() {
        return getConfig().enableVideoSei == 1;
    }

    public final boolean enableVideoSeiEndLayout() {
        return getConfig().enableVideoSeiEndLayout == 1;
    }
}
