package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("ttlive_pcs_identify_comment_as_lead_method")
public final class LivePcsIdentifyCommentMethodSetting {
    public static final int DEFAULT = 0;
    public static final LivePcsIdentifyCommentMethodSetting INSTANCE = new LivePcsIdentifyCommentMethodSetting();
    public static Integer highIntentIdentificationMethod;

    public static /* synthetic */ void getHighIntentIdentificationMethod$annotations() {
    }

    public final int getValue() {
        if (highIntentIdentificationMethod == null) {
            highIntentIdentificationMethod = Integer.valueOf(SettingsManager.INSTANCE.getIntValue("ttlive_pcs_identify_comment_as_lead_method", DEFAULT));
        }
        Integer num = highIntentIdentificationMethod;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final boolean enable() {
        return getValue() != 0;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
