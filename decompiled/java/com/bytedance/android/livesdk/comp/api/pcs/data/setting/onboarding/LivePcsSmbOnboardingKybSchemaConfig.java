package com.bytedance.android.livesdk.comp.api.pcs.data.setting.onboarding;

import X.C20441214yg;
import X.C2188811AlT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("smb_onboarding_new_kyb_schema")
public final class LivePcsSmbOnboardingKybSchemaConfig {
    public static final LivePcsSmbOnboardingKybSchemaConfig INSTANCE = new LivePcsSmbOnboardingKybSchemaConfig();
    public static final String DEFAULT = "";

    public final String getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        String str = DEFAULT;
        String stringValue = settingsManager.getStringValue("smb_onboarding_new_kyb_schema", str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LivePcsSmbOnboardingKybSchemaConfig getValue return res=");
        sbLIZ.append(stringValue);
        C20441214yg.LIZIZ("PCS", C2188811AlT.LIZIZ(sbLIZ));
        if (stringValue.length() != 0) {
            return stringValue;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LivePcsSmbOnboardingKybSchemaConfig empty return default=");
        sbLIZ2.append(str);
        C20441214yg.LIZIZ("PCS", C2188811AlT.LIZIZ(sbLIZ2));
        return str;
    }
}
