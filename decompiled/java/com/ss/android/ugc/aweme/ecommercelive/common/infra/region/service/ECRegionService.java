package com.ss.android.ugc.aweme.ecommercelive.common.infra.region.service;

import X.C098200Yq;
import X.C0PEM;
import X.C123100dR;
import X.C13LP;
import X.C15438062q;
import X.C189200o6;
import X.C2097608Jq;
import X.C21189317w3;
import X.C21191817wS;
import X.C21191917wT;
import X.C21192217wW;
import X.C21192317wX;
import X.C2188811AlT;
import X.C2222691Bz1;
import X.C2273401Dyc;
import X.C23250099c;
import X.C817503Hh;
import X.EnumC21186317vZ;
import X.EnumC21189117w1;
import X.EnumC21192017wU;
import X.InterfaceC304970BxP;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.IEcommerceRegionService;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.ab.ECRegionSyncSettings;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.service.ECRegionService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes33.dex */
public final class ECRegionService implements IECommerceRegionService {
    public String LIZ = "";
    public String LIZIZ = "";
    public String LIZJ = "";
    public Pair<String, String> LIZLLL = new Pair<>("", "");
    public int LJ;

    public static String LJII() {
        try {
            String str = C2273401Dyc.LIZLLL;
            String strLIZ = C2222691Bz1.LIZ();
            String strLJ = C2222691Bz1.LJ();
            ECRegionSyncSettings.EcomCodeConfig ecomCodeConfig = ECRegionSyncSettings.LIZ.codeConfigMap.get(str);
            if (ecomCodeConfig == null) {
                return EnumC21186317vZ.US.getValue();
            }
            String str2 = ecomCodeConfig.defaultCode;
            if (!ecomCodeConfig.custom.isEmpty()) {
                for (Map.Entry<String, List<String>> entry : ecomCodeConfig.custom.entrySet()) {
                    String key = entry.getKey();
                    List<String> value = entry.getValue();
                    String str3 = strLJ.length() == 0 ? strLIZ : strLJ;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(value, 10));
                    Iterator<String> it2 = value.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().toLowerCase(Locale.getDefault()));
                    }
                    if (arrayList.contains(str3.toLowerCase(Locale.getDefault()))) {
                        return key;
                    }
                }
            }
            return str2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return EnumC21186317vZ.US.getValue();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.infra.region.service.IECommerceRegionService
    public final boolean LIZLLL() {
        ECRegionSyncSettings.EcomRegionConfig ecomRegionConfig = ECRegionSyncSettings.LIZ;
        return ECRegionSyncSettings.LIZ.regionUpdateType > 0;
    }

    public final String LJIIIIZZ() {
        ECRegionSyncSettings.EcomRegionConfig ecomRegionConfig = ECRegionSyncSettings.LIZ;
        int i = ECRegionSyncSettings.LIZ.regionUpdateType;
        return i == 0 ? EnumC21192017wU.ONLINE.getValue() : i == 1 ? EnumC21192017wU.LOCAL.getValue() : i == 2 ? this.LIZ : "";
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.infra.region.service.IECommerceRegionService
    public final boolean isEnable() {
        ECRegionSyncSettings.EcomRegionConfig ecomRegionConfig = ECRegionSyncSettings.LIZ;
        return ECRegionSyncSettings.LIZ.regionUpdateType >= 0;
    }

    public ECRegionService() {
        if (isEnable()) {
            SettingsManager.LIZLLL().LJIIIZ(new InterfaceC304970BxP() { // from class: X.17wV
                @Override // X.InterfaceC304970BxP
                public final void LIZ() {
                    String strLJI;
                    ECRegionService eCRegionService = this.LL;
                    synchronized (ECRegionService.class) {
                        try {
                            try {
                                SettingsManager.LIZLLL().getClass();
                                strLJI = SettingsManager.LJI("ttec_content_code_region", "");
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C189200o6.m2constructorimpl(new C098200Yq(th));
                                strLJI = null;
                            }
                            eCRegionService.LJI(EnumC21192017wU.COMMON_API, strLJI, null, null);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.infra.region.service.IECommerceRegionService
    public final String LJFF() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.infra.region.service.IECommerceRegionService
    public final C21192317wX LIZ(Boolean bool) {
        return new C21192317wX(LJII(), LIZJ(bool), this.LIZIZ, this.LIZJ, LJIIIIZZ());
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.infra.region.service.IECommerceRegionService
    public final String LIZJ(Boolean bool) {
        String lowerCase;
        String strLIZJ;
        ECRegionSyncSettings.EcomRegionConfig ecomRegionConfig = ECRegionSyncSettings.LIZ;
        if (Intrinsics.LJFF(bool, Boolean.TRUE) && ecomRegionConfig.staticRegionInRoom && C123100dR.LIZ(this.LIZLLL.getSecond())) {
            return this.LIZLLL.getSecond();
        }
        int i = ecomRegionConfig.regionUpdateType;
        if (i != 1) {
            if (i != 2) {
                IEcommerceRegionService iEcommerceRegionService = (IEcommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IEcommerceRegionService.class, false, false, false, 14, null);
                if (iEcommerceRegionService != null && (strLIZJ = iEcommerceRegionService.LIZJ()) != null) {
                    lowerCase = strLIZJ.toLowerCase(Locale.getDefault());
                } else {
                    lowerCase = null;
                }
                if (C13LP.LJJJJ(lowerCase, C21192217wW.LIZ().usRegions)) {
                    return C21189317w3.LIZ(EnumC21189117w1.US);
                }
                if (C13LP.LJJJJ(lowerCase, C21192217wW.LIZ().seaRegions)) {
                    return C21189317w3.LIZ(EnumC21189117w1.SEA);
                }
                return C21189317w3.LIZ(EnumC21189117w1.US);
            }
            String str = this.LIZJ;
            if (str.length() != 0) {
                return str;
            }
            return LJII();
        }
        return LJII();
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.infra.region.service.IECommerceRegionService
    public final Map<String, Object> LJ(Boolean bool) {
        if (!isEnable()) {
            return null;
        }
        return C2097608Jq.LJIIIIZZ(new Pair("local_code_region", LJII()), new Pair("manager_code_region", LIZJ(bool)), new Pair("api_route_region", this.LIZIZ), new Pair("api_code_region", this.LIZJ), new Pair("region_from", LJIIIIZZ()), new Pair("region_update_type", Integer.valueOf(ECRegionSyncSettings.LIZ.regionUpdateType)));
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.infra.region.service.IECommerceRegionService
    public final void LIZIZ(String str, boolean z) {
        ECRegionSyncSettings.EcomRegionConfig ecomRegionConfig = ECRegionSyncSettings.LIZ;
        if (ECRegionSyncSettings.LIZ.staticRegionInRoom) {
            if (!z) {
                this.LIZLLL = new Pair<>(str, LIZJ(Boolean.TRUE));
            } else {
                if (!Intrinsics.LJFF(str, this.LIZLLL.getFirst())) {
                    return;
                }
                this.LIZLLL = new Pair<>("", "");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.infra.region.service.IECommerceRegionService
    public final void LJI(EnumC21192017wU enumC21192017wU, String str, String str2, String str3) {
        boolean z;
        if (!isEnable()) {
            return;
        }
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C21191817wS c21191817wS = C21191817wS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("No region available: ");
            sbLIZ.append(enumC21192017wU.getValue());
            sbLIZ.append(',');
            sbLIZ.append(str);
            sbLIZ.append(',');
            sbLIZ.append(str3);
            C21191817wS.LIZIZ(c21191817wS, enumC21192017wU, null, 1, C2188811AlT.LIZIZ(sbLIZ), 6);
            return;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = a0.LJJLIIIJ(str, new char[]{';'}, false, 0, 6).iterator();
            while (it2.hasNext()) {
                List listLJJLIIIJ = a0.LJJLIIIJ((String) it2.next(), new char[]{'='}, false, 0, 6);
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJ, 10));
                Iterator it3 = listLJJLIIIJ.iterator();
                while (it3.hasNext()) {
                    arrayList.add(a0.LJLIIIL((String) it3.next()).toString());
                }
                if (arrayList.size() == 2) {
                    linkedHashMap.put(arrayList.get(0), ((String) arrayList.get(1)).toLowerCase(Locale.getDefault()));
                }
            }
            if (linkedHashMap.containsKey("route_region") && linkedHashMap.containsKey("codebase_region")) {
                String str4 = (String) linkedHashMap.get("route_region");
                String str5 = (String) linkedHashMap.get("codebase_region");
                if (C123100dR.LIZ(str4) && C123100dR.LIZ(str5) && !Intrinsics.LJFF(str5, this.LIZJ)) {
                    this.LIZ = enumC21192017wU.getValue();
                    this.LIZIZ = str4.toLowerCase(Locale.getDefault());
                    this.LIZJ = str5.toLowerCase(Locale.getDefault());
                    this.LJ++;
                    C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C21191917wT(enumC21192017wU, this, str2, str3, null), 2);
                }
            } else if (!linkedHashMap.containsKey("route_region") || !linkedHashMap.containsKey("codebase_region")) {
                C21191817wS c21191817wS2 = C21191817wS.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("No region available: ");
                sbLIZ2.append(enumC21192017wU.getValue());
                sbLIZ2.append(',');
                sbLIZ2.append(str);
                sbLIZ2.append(',');
                sbLIZ2.append(str3);
                C21191817wS.LIZIZ(c21191817wS2, enumC21192017wU, str2, 2, C2188811AlT.LIZIZ(sbLIZ2), 2);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
