package com.bytedance.android.livesdk.livesetting.barrage;

import X.C1CC2;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.internal.s;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("barrage_privilege_tracking_config")
public final class BarragePrivilegeTrackingConfig {
    public static final Map<String, s<String, String>> DEFAULT;
    public static final BarragePrivilegeTrackingConfig INSTANCE;

    static {
        BarragePrivilegeTrackingConfig barragePrivilegeTrackingConfig = new BarragePrivilegeTrackingConfig();
        INSTANCE = barragePrivilegeTrackingConfig;
        DEFAULT = barragePrivilegeTrackingConfig.getDefault();
    }

    public final Map<String, s<String, String>> getDefault() {
        s sVar = new s();
        s sVar2 = new s();
        sVar2.put("type", "barrage_message");
        sVar2.put("scenario", "ecommerce_ordering");
        sVar.put("1", sVar2);
        s sVar3 = new s();
        sVar3.put("type", "barrage_message");
        sVar3.put("scenario", "ecommerce_buying");
        sVar.put("2", sVar3);
        s sVar4 = new s();
        sVar4.put("type", "barrage_message");
        sVar4.put("scenario", "user_level");
        sVar.put("8", sVar4);
        s sVar5 = new s();
        sVar5.put("type", "barrage_message");
        sVar5.put("scenario", "fans_club");
        sVar.put("10", sVar5);
        s sVar6 = new s();
        sVar6.put("type", "entrance_effect");
        sVar6.put("scenario", "user_level");
        sVar.put("9", sVar6);
        s sVar7 = new s();
        sVar7.put("type", "entrance_effect");
        sVar7.put("scenario", "fans_club");
        sVar.put("11", sVar7);
        return sVar;
    }

    public final Map<String, Map<String, String>> getValue() {
        Map<String, Map<String, String>> map;
        try {
            map = (Map) SettingsManager.INSTANCE.getValueSafely(BarragePrivilegeTrackingConfig.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1CC2.LIZ("BarragePrivilegeTrackingConfig.getValue", e);
            map = null;
        }
        return map == null ? DEFAULT : map;
    }
}
