package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("subscribe_agreement_checkbox_type")
public final class LiveGiftSubTermsCheckboxSetting {
    public static final int SHOW = 0;
    public static final LiveGiftSubTermsCheckboxSetting INSTANCE = new LiveGiftSubTermsCheckboxSetting();
    public static final int HIDE = 1;
    public static final int SHAKE = 2;
    public static final int DEFAULT = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("subscribe_agreement_checkbox_type", DEFAULT);
    }

    public final int getHIDE() {
        return HIDE;
    }

    public final int getSHAKE() {
        return SHAKE;
    }

    public final int getSHOW() {
        return SHOW;
    }
}
