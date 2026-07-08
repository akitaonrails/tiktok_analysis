package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey("ttlive_pcs_comment_detection_config")
public final class LivePcsHighIntentUserIdentificationSetting {
    public static LivePcsCommentDetectionSettingMap commentDetectionSettingMap;
    public static final LivePcsHighIntentUserIdentificationSetting INSTANCE = new LivePcsHighIntentUserIdentificationSetting();
    public static final String DEFAULT = "";

    private final LivePcsCommentDetectionSettingMap getValue() {
        if (commentDetectionSettingMap == null) {
            commentDetectionSettingMap = new LivePcsCommentDetectionSettingMap(SettingsManager.INSTANCE.getStringValue("ttlive_pcs_comment_detection_config", DEFAULT));
        }
        LivePcsCommentDetectionSettingMap livePcsCommentDetectionSettingMap = commentDetectionSettingMap;
        return livePcsCommentDetectionSettingMap == null ? new LivePcsCommentDetectionSettingMap("") : livePcsCommentDetectionSettingMap;
    }

    public final String getAndroidScene() {
        return getValue().getAndroidScene();
    }

    public final String getInputSeparator() {
        return getValue().getInputSeparator();
    }

    public final boolean isEnabled() {
        return getValue().getEnable();
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }
}
