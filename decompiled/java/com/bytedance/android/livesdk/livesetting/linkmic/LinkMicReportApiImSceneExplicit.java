package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_report_api_im_scene_explicit")
public final class LinkMicReportApiImSceneExplicit {
    public static final int DEFAULT = 1;
    public static final LinkMicReportApiImSceneExplicit INSTANCE = new LinkMicReportApiImSceneExplicit();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_report_api_im_scene_explicit", DEFAULT);
    }
}
