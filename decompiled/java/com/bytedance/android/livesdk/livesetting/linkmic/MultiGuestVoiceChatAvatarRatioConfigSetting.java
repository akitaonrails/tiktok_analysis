package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C20441214yg;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_layout_avatar_ratio_config")
public final class MultiGuestVoiceChatAvatarRatioConfigSetting {
    public static final String DEFAULT = "{}";
    public static final MultiGuestVoiceChatAvatarRatioConfigSetting INSTANCE = new MultiGuestVoiceChatAvatarRatioConfigSetting();
    public static JSONObject cache;

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("multi_guest_layout_avatar_ratio_config", DEFAULT);
    }

    public final float getAvatarPercentByLayoutKey(String str) {
        Float fValueOf;
        if (str != null) {
            if (cache == null) {
                try {
                    cache = new JSONObject(INSTANCE.getValue());
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C20441214yg.LJ("MultiGuestVoiceChatAvatarRatioConfigSetting", String.valueOf(th.getMessage()));
                }
            }
            JSONObject jSONObject = cache;
            if (jSONObject != null && (fValueOf = Float.valueOf((float) jSONObject.optDouble(str))) != null) {
                return fValueOf.floatValue();
            }
            return 0.58f;
        }
        return 0.58f;
    }
}
