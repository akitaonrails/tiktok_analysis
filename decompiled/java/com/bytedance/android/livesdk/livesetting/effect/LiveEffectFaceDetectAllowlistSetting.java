package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_face_detect_requirement_list")
public final class LiveEffectFaceDetectAllowlistSetting {
    public static final String[] ALLOWLIST;
    public static final String[] DEFAULT;
    public static final LiveEffectFaceDetectAllowlistSetting INSTANCE = new LiveEffectFaceDetectAllowlistSetting();

    static {
        String[] strArr = new String[0];
        DEFAULT = strArr;
        ALLOWLIST = SettingsManager.INSTANCE.getStringArrayValue("live_face_detect_requirement_list", strArr);
    }

    public final String[] getALLOWLIST() {
        return ALLOWLIST;
    }
}
