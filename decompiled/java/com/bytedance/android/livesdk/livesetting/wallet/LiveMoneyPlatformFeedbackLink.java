package com.bytedance.android.livesdk.livesetting.wallet;

import X.C2188811AlT;
import X.C495520Jby;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("mp_iap_feedback_link")
public final class LiveMoneyPlatformFeedbackLink {
    public static final LiveMoneyPlatformFeedbackLink INSTANCE = new LiveMoneyPlatformFeedbackLink();
    public static final String DEFAULT = "aweme://roma_redirect/?";

    public final String getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        String str = DEFAULT;
        String stringValue = settingsManager.getStringValue("mp_iap_feedback_link", str);
        return stringValue != null ? stringValue : str;
    }

    public final String getFeedbackUrl(String str, int i) {
        C495520Jby c495520Jby = new C495520Jby(getValue());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TT_CSP_Payment_mp_iap_");
        sbLIZ.append(str);
        c495520Jby.LIZJ("spark_page", C2188811AlT.LIZIZ(sbLIZ));
        c495520Jby.LIZJ("enter_from", str);
        c495520Jby.LIZJ("error_code", String.valueOf(i));
        return c495520Jby.LIZLLL();
    }
}
