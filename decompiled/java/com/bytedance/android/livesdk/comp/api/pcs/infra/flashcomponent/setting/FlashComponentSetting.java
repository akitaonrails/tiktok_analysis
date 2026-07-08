package com.bytedance.android.livesdk.comp.api.pcs.infra.flashcomponent.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("flash_component_setting")
public final class FlashComponentSetting {
    public static final String DEFAULT = "";
    public static final FlashComponentSetting INSTANCE = new FlashComponentSetting();
    public static JSONObject _flashComponentSetting;

    public final JSONObject getFlashComponentSetting() {
        JSONObject jSONObject;
        if (_flashComponentSetting == null) {
            try {
                jSONObject = new JSONObject(SettingsManager.INSTANCE.getStringValue("flash_component_setting", DEFAULT));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                jSONObject = new JSONObject();
            }
            _flashComponentSetting = jSONObject;
        }
        JSONObject jSONObject2 = _flashComponentSetting;
        if (jSONObject2 != null) {
            return jSONObject2;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
