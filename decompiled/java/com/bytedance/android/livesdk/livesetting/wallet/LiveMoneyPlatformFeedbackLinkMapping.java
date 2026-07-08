package com.bytedance.android.livesdk.livesetting.wallet;

import X.C2097608Jq;
import X.C2188811AlT;
import X.C495520Jby;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("mp_iap_feedback_link_mapping")
public final class LiveMoneyPlatformFeedbackLinkMapping {
    public static final LiveMoneyPlatformFeedbackLinkMapping INSTANCE = new LiveMoneyPlatformFeedbackLinkMapping();
    public static final Map<String, String> DEFAULT = C2097608Jq.LJ();
    public static final String DEFAULT_URL = "aweme://roma_redirect/?spark_page=TT_CSP_Common_TopicList";
    public static final String DEFAULT_KEY = "default";

    public final Map<String, String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Map<String, String> map = DEFAULT;
        Map<String, String> map2 = (Map) settingsManager.getValueSafely("mp_iap_feedback_link_mapping", map);
        return map2 != null ? map2 : map;
    }

    private final C495520Jby getFeedbackUrlBuilder(String str) {
        if (getValue().containsKey(str)) {
            String str2 = getValue().get(str);
            if (str2 == null) {
                str2 = DEFAULT_URL;
            }
            return new C495520Jby(str2);
        }
        String str3 = getValue().get(DEFAULT_KEY);
        if (str3 == null) {
            str3 = DEFAULT_URL;
        }
        C495520Jby c495520Jby = new C495520Jby(str3);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mp_iap_");
        sbLIZ.append(str);
        c495520Jby.LIZJ("entrance", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("mp_iap_");
        sbLIZ2.append(str);
        c495520Jby.LIZJ("enter_from", C2188811AlT.LIZIZ(sbLIZ2));
        return c495520Jby;
    }

    public final String getFeedbackUrl(String str, int i) {
        C495520Jby feedbackUrlBuilder = getFeedbackUrlBuilder(str);
        feedbackUrlBuilder.LIZJ("error_code", String.valueOf(i));
        return feedbackUrlBuilder.LIZLLL();
    }
}
