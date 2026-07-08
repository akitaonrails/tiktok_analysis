package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C2188811AlT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_cohost_cohost_suggestion_share_page_guide")
public final class LiveCoHostCoHostSuggestionSharePageGuide {
    public static final String DEFAULT = "aweme://roma_redirect/?spark_page=interactive_viewer_cohost_guide&target=guide";
    public static final LiveCoHostCoHostSuggestionSharePageGuide INSTANCE = new LiveCoHostCoHostSuggestionSharePageGuide();
    public static final String value;

    static {
        String stringValue = SettingsManager.INSTANCE.getStringValue("live_cohost_cohost_suggestion_share_page_guide", DEFAULT);
        if (stringValue == null) {
            stringValue = "aweme://roma_redirect/?spark_page=interactive_viewer_cohost_guide&target=guide";
        }
        value = stringValue;
    }

    public final String getValue() {
        return value;
    }

    public final String getSchema(boolean z) {
        String str = value;
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("&is_modertor=1");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("&is_modertor=0");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
