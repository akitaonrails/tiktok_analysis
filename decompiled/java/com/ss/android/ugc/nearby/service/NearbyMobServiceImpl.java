package com.ss.android.ugc.nearby.service;

import X.C0B97;
import X.C1189060h32;
import X.C1203960hR4;
import X.C1204010hR9;
import X.C1204880hSY;
import X.C1204910hSb;
import X.C1205100hSu;
import X.C1205170hT1;
import X.C1205260hTA;
import X.C123100dR;
import X.C19719512Dh;
import X.C19EG;
import X.C1ER1;
import X.C2097608Jq;
import X.C629410OmR;
import X.EnumC1203980hR6;
import X.EnumC1204030hRB;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.NearbyInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.nearby.api.INearbyMobService;
import com.ss.android.ugc.nearby.container.NearbyContentAssem;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyMobServiceImpl implements INearbyMobService {
    @Override // com.ss.android.ugc.nearby.api.INearbyMobService
    public final Long LIZLLL() {
        C1205260hTA.LIZ.getClass();
        return C1205260hTA.LJFF;
    }

    @Override // com.ss.android.ugc.nearby.api.INearbyMobService
    public final int LJIIIZ() {
        C1205260hTA.LIZ.getClass();
        return C1205260hTA.LJ;
    }

    @Override // com.ss.android.ugc.nearby.api.INearbyMobService
    public final Map<String, String> LJFF(String str) {
        if (!Intrinsics.LJFF(str, "places_discover")) {
            return C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : C1ER1.LIZIZ.LJJIJIIJIL(null).entrySet()) {
            if (!Intrinsics.LJFF(entry.getKey(), "enter_from") && !Intrinsics.LJFF(entry.getKey(), "enter_method") && C19719512Dh.LJII(linkedHashMap)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.nearby.api.INearbyMobService
    public final void LJIIJ(String str, Map<String, String> map) {
        C19EG c19egLIZ;
        String str2;
        boolean zBooleanValue;
        String sceneStr;
        EnumC1203980hR6 enumC1203980hR6;
        EnumC1204030hRB enumC1204030hRB;
        C1205170hT1.LIZ.getClass();
        if (!C1205170hT1.LIZIZ() || (c19egLIZ = C629410OmR.LIZ()) == null) {
            return;
        }
        if (C1205170hT1.LIZJ) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        C1189060h32.LJIJI(map, "is_city_name", str2);
        C1189060h32.LJIJI(map, "nearby_tab_position", C1204880hSY.LIZLLL(c19egLIZ));
        C1189060h32.LJIJI(map, "nearby_tab_city_id", C1204880hSY.LIZIZ());
        C1189060h32.LJIJI(map, "device_tabcity_location_relationship", C1204880hSY.LIZJ());
        C1189060h32.LJIJI(map, "enable_location", C1204880hSY.LIZ());
        if (Intrinsics.LJFF(str, "stay_time")) {
            NearbyContentAssem.LLJJIJIL.getClass();
            AwS562S0100000_18 awS562S0100000_18 = NearbyContentAssem.LLJJJIL;
            if (awS562S0100000_18 != null) {
                zBooleanValue = ((Boolean) awS562S0100000_18.invoke()).booleanValue();
            } else {
                zBooleanValue = false;
            }
            C1189060h32.LJIJI(map, "has_card_display", C1189060h32.LJJIJ(zBooleanValue));
            C1204010hR9 c1204010hR9 = C1203960hR4.LJIILLIIL;
            String str3 = null;
            if (c1204010hR9 != null && (enumC1204030hRB = c1204010hR9.LIZ) != null) {
                sceneStr = enumC1204030hRB.getSceneStr();
            } else {
                sceneStr = null;
            }
            C1189060h32.LJIJI(map, "load_scene", sceneStr);
            C1204010hR9 c1204010hR92 = C1203960hR4.LJIILLIIL;
            if (c1204010hR92 != null && (enumC1203980hR6 = c1204010hR92.LIZIZ) != null) {
                str3 = enumC1203980hR6.getStr();
            }
            C1189060h32.LJIJI(map, "load_status", str3);
        }
        C1189060h32.LJIJI(map, "nearby_tab_enter_from", C1205100hSu.LIZ);
        C1189060h32.LJIJI(map, "nearby_tab_enter_method", C1205100hSu.LIZIZ);
        if (Intrinsics.LJFF(str, "enter_homepage_nearby")) {
            C1204910hSb c1204910hSb = C1204910hSb.LIZ;
            String str4 = map.get("enter_method");
            c1204910hSb.getClass();
            if (((Boolean) C0B97.LIZ.getValue()).booleanValue() && str4 != null && str4.length() != 0) {
                C1204910hSb.LIZJ = str4;
            }
        }
    }

    @Override // com.ss.android.ugc.nearby.api.INearbyMobService
    public final void LIZJ(String str, HashMap<String, String> map, Aweme aweme, boolean z) {
        String str2;
        String str3;
        String logPbString;
        NearbyInfo nearbyInfo;
        NearbyInfo nearbyInfo2;
        if (!Intrinsics.LJFF(str, "homepage_nearby")) {
            return;
        }
        Map<String, String> mapLIZ = ((ILocationService) ServiceManager.get().getService(ILocationService.class)).LIZ();
        if (!mapLIZ.isEmpty()) {
            map.putAll(mapLIZ);
        }
        if (aweme != null) {
            map.put("publish_consume_interval", String.valueOf(System.currentTimeMillis() - aweme.getCreateTime()));
        }
        String logPbString2 = null;
        if (aweme != null && (nearbyInfo2 = aweme.getNearbyInfo()) != null) {
            str2 = nearbyInfo2.eventTrack;
        } else {
            str2 = null;
        }
        if (C123100dR.LIZ(str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObject.opt(next);
                    if (C123100dR.LIZ(next) && objOpt != null) {
                        map.put(next, objOpt.toString());
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (aweme != null && (nearbyInfo = aweme.getNearbyInfo()) != null) {
            str3 = nearbyInfo.nearbyDoubleColumnEventTrack;
        } else {
            str3 = null;
        }
        if (C123100dR.LIZ(str3)) {
            try {
                JSONObject jSONObject2 = new JSONObject(str3);
                Iterator<String> itKeys2 = jSONObject2.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    Object objOpt2 = jSONObject2.opt(next2);
                    if (C123100dR.LIZ(next2) && objOpt2 != null) {
                        map.put(next2, objOpt2.toString());
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        if (z && !map.containsKey("log_pb")) {
            if (aweme != null) {
                logPbString = aweme.getLogPbString();
            } else {
                logPbString = null;
            }
            if (C123100dR.LIZ(logPbString)) {
                if (aweme != null) {
                    logPbString2 = aweme.getLogPbString();
                }
                map.put("log_pb", String.valueOf(logPbString2));
            }
        }
        C1189060h32.LJIJI(map, "nearby_tab_city_id", C1204880hSY.LIZIZ());
        C1189060h32.LJIJI(map, "device_tabcity_location_relationship", C1204880hSY.LIZJ());
    }
}
