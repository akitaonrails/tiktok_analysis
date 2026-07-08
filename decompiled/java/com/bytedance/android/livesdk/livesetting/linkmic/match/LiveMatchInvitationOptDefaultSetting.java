package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C2097608Jq;
import X.C814420VxA;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey("gbl_battle_ab_test_default_group")
public final class LiveMatchInvitationOptDefaultSetting {
    public static final LiveMatchInvitationOptDefaultSetting INSTANCE = new LiveMatchInvitationOptDefaultSetting();
    public static final Map<String, Double> DEFAULT = C2097608Jq.LJIIIIZZ(new Pair("4", Double.valueOf(3.0d)), new Pair("13", Double.valueOf(0.0d)));

    public final Map<String, Integer> getValue() {
        Map<String, Double> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveMatchInvitationOptDefaultSetting.class);
        if (map == null) {
            map = DEFAULT;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            arrayList.add(new Pair(key, Integer.valueOf(value != null ? C814420VxA.LIZ(value.doubleValue()) : 0)));
        }
        return C2097608Jq.LJIILLIIL(arrayList);
    }

    public final Map<String, Double> getDEFAULT() {
        return DEFAULT;
    }
}
