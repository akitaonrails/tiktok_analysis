package com.bytedance.android.livesdk.livesetting.recharge;

import X.C2097608Jq;
import X.C2188811AlT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_recharge_entrance_hashes")
public final class LiveRechargeEntranceHashesSetting {
    public static final LiveRechargeEntranceHashesSetting INSTANCE = new LiveRechargeEntranceHashesSetting();
    public static final HashMap<String, String> DEFAULT = C2097608Jq.LJI(new Pair("live_custom_dialog", "tvBA3Pq"), new Pair("package_load_fail_button", "zeJlaRl"), new Pair("package_load_fail_immediate", "vDxySqf"), new Pair("recharge_panel_direct", "9Fm3MSz"), new Pair("retry_tries_exceeded", "ga6lYVr"), new Pair("panel_replace", "gJte5Ru"));

    private final Map<String, String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        HashMap<String, String> map = DEFAULT;
        Map<String, String> map2 = (Map) settingsManager.getValueSafely("live_recharge_entrance_hashes", map);
        return map2 != null ? map2 : map;
    }

    public final String getHashForEntrance(String str, boolean z) {
        String str2 = getValue().get(str);
        if (str2 == null) {
            return "";
        }
        if (!z) {
            return str2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append("_LY");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
