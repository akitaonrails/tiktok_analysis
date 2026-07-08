package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_message_list_sub_capsule_audience_filter_allow_scenes")
public final class LiveSubCapsuleNotFilterSceneSetting {
    public static final LiveSubCapsuleNotFilterSceneSetting INSTANCE = new LiveSubCapsuleNotFilterSceneSetting();
    public static final String[] DEFAULT = {"sub_gift_tiktok2user_notice"};

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final String[] getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        String[] strArr = DEFAULT;
        String[] stringArrayValue = settingsManager.getStringArrayValue("live_message_list_sub_capsule_audience_filter_allow_scenes", strArr);
        return stringArrayValue.length != 0 ? stringArrayValue : strArr;
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }
}
