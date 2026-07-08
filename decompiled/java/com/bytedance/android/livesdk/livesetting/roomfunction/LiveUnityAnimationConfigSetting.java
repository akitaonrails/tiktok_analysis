package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C1097870efx;
import X.C2095008Iq;
import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_event_area_unity_animation_config")
public final class LiveUnityAnimationConfigSetting {
    public static final LiveUnityAnimationConfigSetting INSTANCE = new LiveUnityAnimationConfigSetting();
    public static final Map<String, Map<String, Object>> DEFAULT = C2097608Jq.LJ();

    public static final Map<String, Object> getConfigMap() {
        return (Map) SettingsManager.INSTANCE.getValueSafely("live_event_area_unity_animation_config", DEFAULT);
    }

    public static final boolean enable() {
        Object obj;
        String string;
        Boolean boolLJLI;
        Map<String, Object> configMap = getConfigMap();
        if (configMap == null || (obj = configMap.get("enable")) == null || (string = obj.toString()) == null || (boolLJLI = a0.LJLI(string)) == null) {
            return false;
        }
        return boolLJLI.booleanValue();
    }

    public static final C1097870efx getItemConfig(String str) {
        Object obj;
        Map map;
        int iIntValue;
        int iIntValue2;
        String string;
        Integer numLJIIJJI;
        String string2;
        Integer numLJIIJJI2;
        Map<String, Object> configMap = getConfigMap();
        if (configMap != null) {
            obj = configMap.get(str);
        } else {
            obj = null;
        }
        if (!(obj instanceof Map) || (map = (Map) obj) == null) {
            return null;
        }
        Object obj2 = map.get("priority");
        if (obj2 != null && (string2 = obj2.toString()) != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(string2)) != null) {
            iIntValue = numLJIIJJI2.intValue();
        } else {
            iIntValue = 0;
        }
        Object obj3 = map.get("time_out");
        if (obj3 != null && (string = obj3.toString()) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(string)) != null) {
            iIntValue2 = numLJIIJJI.intValue();
        } else {
            iIntValue2 = 30;
        }
        return new C1097870efx(iIntValue, iIntValue2);
    }
}
