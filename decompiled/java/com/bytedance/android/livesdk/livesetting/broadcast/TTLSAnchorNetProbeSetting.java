package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@SettingsKey("ttls_anchor_net")
public final class TTLSAnchorNetProbeSetting {
    public static final TTLSAnchorNetProbeSetting INSTANCE = new TTLSAnchorNetProbeSetting();
    public static final String DEFAULT = "";

    public final String getAnchorNetAppId() {
        try {
            String strOptString = new JSONObject(SettingsManager.INSTANCE.getStringValue("ttls_anchor_net", DEFAULT)).optString("rtc_app_id");
            return strOptString != null ? strOptString : "";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }
}
