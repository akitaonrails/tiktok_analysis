package com.ss.android.ugc.aweme.localservice.service;

import X.AbstractC1549150qPp;
import X.C00EG;
import X.C098200Yq;
import X.C1189060h32;
import X.C1205490hTX;
import X.C13BV;
import X.C13LP;
import X.C1697810uHb;
import X.C1800840wxm;
import X.C1809500xBk;
import X.C1809510xBl;
import X.C189200o6;
import X.C18C6;
import X.C1955807lM;
import X.C19719512Dh;
import X.C19719612Di;
import X.C2097908Jt;
import X.C21244318Bt;
import X.C21313318ax;
import X.C21313418ay;
import X.C21313518az;
import X.C21313718b1;
import X.C21313818b2;
import X.C21314018b4;
import X.C21314318b7;
import X.C2344009Gk;
import X.C2365509Or;
import X.C296990BkX;
import X.EnumC21315318bH;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.rules.BtmParamsRule;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughAbilityOptConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughEnableCommonParamsConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughEnableExpandEventsConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughUnzipParamsConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassthroughParamsBtmExp;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.rules.LSPassThroughGlobalPropsSettings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class LocalServicePassThroughServiceImpl implements ILocalServicePassThroughService {
    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LJIIIIZZ() {
        return C1697810uHb.LJIIJJI(C21313318ax.class, C1800840wxm.class);
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final boolean LIZ() {
        return LSPassthroughParamsBtmExp.INSTANCE.hitExperiment();
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final List<String> LIZIZ() {
        Object c098200Yq;
        Collection collectionValues;
        Collection<? extends List<BtmParamsRule>> collectionValues2;
        C21313818b2.LIZ.getClass();
        if (!LSPassThroughUnzipParamsConfig.INSTANCE.enable()) {
            return C13BV.INSTANCE;
        }
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Map<String, ? extends List<BtmParamsRule>> map = C21313818b2.LIZJ;
            if (map != null && (collectionValues2 = map.values()) != null) {
                Iterator<T> it2 = collectionValues2.iterator();
                while (it2.hasNext()) {
                    Iterator it3 = ((List) it2.next()).iterator();
                    while (it3.hasNext()) {
                        linkedHashSet.addAll(((BtmParamsRule) it3.next()).unzipParams);
                    }
                }
            }
            Map<String, ? extends List<C21314318b7>> map2 = C21313818b2.LIZLLL;
            if (map2 != null && (collectionValues = ((LinkedHashMap) map2).values()) != null) {
                Iterator it4 = collectionValues.iterator();
                while (it4.hasNext()) {
                    Iterator it5 = ((List) it4.next()).iterator();
                    while (it5.hasNext()) {
                        List<String> list = ((C21314318b7) it5.next()).LJI;
                        if (list != null) {
                            linkedHashSet.addAll(list);
                        }
                    }
                }
            }
            c098200Yq = C13LP.LLIIII(linkedHashSet);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C13BV c13bv = C13BV.INSTANCE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = c13bv;
        }
        return (List) c098200Yq;
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final boolean LJIIJ() {
        return LSPassThroughAbilityOptConfig.INSTANCE.enable();
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final boolean LJIIL() {
        return LSPassThroughEnableCommonParamsConfig.INSTANCE.enable();
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final boolean LJIILJJIL() {
        return LSPassThroughEnableExpandEventsConfig.INSTANCE.enable();
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final Map LJIIIZ(PageFinder pageFinder) {
        boolean z;
        if ("order_attribute".length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new LinkedHashMap();
        }
        C21313718b1.LIZ.getClass();
        try {
            if (C21313718b1.LIZLLL(Collections.singletonList("order_attribute")).isEmpty()) {
                return new LinkedHashMap();
            }
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            btmSDK.getBtmPageInfoV2(pageFinder);
            C21244318Bt c21244318Bt = new C21244318Bt();
            c21244318Bt.LIZIZ = pageFinder;
            C18C6 bcmChainByBtmModel = btmSDK.getBcmChainByBtmModel(c21244318Bt, 20, false);
            C21313518az.LIZ.getClass();
            return C21313518az.LJIIIIZZ(bcmChainByBtmModel);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX.LIZ.LJ(EnumC21315318bH.PT_GET_VALUE_ERROR, e);
            return new LinkedHashMap();
        }
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final List<C1809510xBl> LJIIJJI(C1955807lM c1955807lM) {
        boolean z;
        boolean z2;
        boolean z3;
        C1809500xBk c1809500xBk = C1809500xBk.LIZ;
        if (LSPassThroughGlobalPropsSettings.INSTANCE.enable()) {
            try {
                if (!C1809500xBk.LIZJ) {
                    synchronized (c1809500xBk) {
                        try {
                            if (!C1809500xBk.LIZJ) {
                                C1809500xBk.LIZIZ();
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                if (!C1809500xBk.LIZIZ.isEmpty()) {
                    List listLIZ = C1809500xBk.LIZ(c1955807lM.LIZJ);
                    List listLIZ2 = C1809500xBk.LIZ(c1955807lM.LIZ);
                    List listLIZ3 = C1809500xBk.LIZ(c1955807lM.LIZIZ);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = listLIZ.iterator();
                    while (it2.hasNext()) {
                        Map map = (Map) ((LinkedHashMap) C1809500xBk.LIZIZ).get((String) it2.next());
                        if (map != null) {
                            Iterator it3 = listLIZ2.iterator();
                            while (it3.hasNext()) {
                                Map map2 = (Map) map.get((String) it3.next());
                                if (map2 != null) {
                                    Iterator it4 = listLIZ3.iterator();
                                    while (it4.hasNext()) {
                                        List list = (List) map2.get((String) it4.next());
                                        if (list != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            for (Object obj : list) {
                                                Map<String, ? extends Object> map3 = ((C00EG) obj).LIZ;
                                                Map<String, Object> map4 = c1955807lM.LIZLLL;
                                                if (map3 == null || map3.isEmpty()) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                if (!z) {
                                                    if (map4 == null || map4.isEmpty()) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    if (!z3) {
                                                        if (!map3.isEmpty()) {
                                                            for (Map.Entry<String, ? extends Object> entry : map3.entrySet()) {
                                                                String key = entry.getKey();
                                                                if (!Intrinsics.LJFF(map4.get(key), entry.getValue())) {
                                                                }
                                                            }
                                                        }
                                                        z2 = true;
                                                    }
                                                    z2 = false;
                                                    break;
                                                }
                                                z2 = true;
                                                if (z2) {
                                                    arrayList2.add(obj);
                                                }
                                            }
                                            ArrayList arrayList3 = new ArrayList();
                                            Iterator it5 = arrayList2.iterator();
                                            while (it5.hasNext()) {
                                                C19719612Di.LJJI(((C00EG) it5.next()).LIZIZ, arrayList3);
                                            }
                                            arrayList.addAll(arrayList3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return arrayList;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C21314018b4.LIZ(C21314018b4.LIZ, EnumC21315318bH.PT_SETTINGS_ERROR, e);
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final Object LIZJ(PageFinder pageFinder, String str) {
        C21313718b1 c21313718b1 = C21313718b1.LIZ;
        List listSingletonList = Collections.singletonList("promote_id");
        c21313718b1.getClass();
        return C21313718b1.LIZIZ(pageFinder, listSingletonList, str).get("promote_id");
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final Map LIZLLL(PageFinder pageFinder, String str, Map map) {
        try {
            if (!C296990BkX.LIZ() || ((HashMap) map).containsKey("local_service_pass_through_uuid")) {
                return null;
            }
            C21313718b1.LIZ.getClass();
            return C21313718b1.LIZ(pageFinder, str, map);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return map;
        }
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final void LJ(PageFinder pageFinder, String str, JSONObject jSONObject) {
        try {
            if (!C296990BkX.LIZ() || jSONObject.optString("local_service_pass_through_uuid", "").length() > 0) {
                return;
            }
            C21313718b1.LIZ.getClass();
            C21313518az c21313518az = C21313518az.LIZ;
            c21313518az.getClass();
            String strLIZIZ = C21313518az.LIZIZ(c21313518az, pageFinder, jSONObject, null, null, null, 28);
            C21313818b2 c21313818b2 = C21313818b2.LIZ;
            if (c21313818b2.LJFF(str) == null && c21313818b2.LIZJ(strLIZIZ) == null) {
                return;
            }
            C2365509Or.LIZLLL(jSONObject, "local_service_pass_through_uuid", C21313518az.LIZLLL(pageFinder));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final Map<String, Object> LJFF(PageFinder pageFinder, List<String> list, String str) {
        if (list != null && !list.isEmpty()) {
            C21313718b1.LIZ.getClass();
            return C21313718b1.LIZIZ(pageFinder, list, str);
        }
        return new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final void LJI(PageFinder pageFinder, C2344009Gk c2344009Gk, String str) {
        try {
            if (!C296990BkX.LIZ() || pageFinder == null || ((HashMap) c2344009Gk.LIZ).containsKey("local_service_pass_through_uuid")) {
                return;
            }
            C21313718b1.LIZ.getClass();
            C21313518az c21313518az = C21313518az.LIZ;
            c21313518az.getClass();
            String strLIZIZ = C21313518az.LIZIZ(c21313518az, pageFinder, null, c2344009Gk, null, null, 26);
            C21313818b2 c21313818b2 = C21313818b2.LIZ;
            if (c21313818b2.LJFF(str) == null && c21313818b2.LIZJ(strLIZIZ) == null) {
                return;
            }
            c2344009Gk.LJFF("local_service_pass_through_uuid", C21313518az.LIZLLL(pageFinder));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final void LJIILIIL(PageFinder pageFinder, JSONObject jSONObject, boolean z) {
        C21313718b1.LIZ.getClass();
        if (C296990BkX.LIZ()) {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            BcmParams bcmParams = new BcmParams();
            C21313418ay.LIZ(bcmParams, pageFinder, jSONObject, z);
            btmSDK.setBcmPageParams(pageFinder, bcmParams, Boolean.FALSE);
        }
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final Map LJIILL(PageFinder pageFinder, String str, Map map) {
        boolean z;
        if (!C296990BkX.LIZ() || map.containsKey("local_service_pass_through_uuid")) {
            return null;
        }
        C21313718b1.LIZ.getClass();
        if (LSPassThroughEnableCommonParamsConfig.INSTANCE.enable()) {
            String strLIZ = C21313518az.LIZ(C21313518az.LIZ, pageFinder, null, map, str, 2);
            C21313818b2 c21313818b2 = C21313818b2.LIZ;
            boolean z2 = true;
            if (c21313818b2.LIZJ(strLIZ) != null) {
                z = true;
            } else {
                z = false;
            }
            if (c21313818b2.LJFF(str) == null) {
                z2 = false;
            }
            if (z || z2) {
                map.put("local_service_pass_through_uuid", C21313518az.LIZLLL(pageFinder));
            }
        } else if (C21313818b2.LIZ.LJFF(str) != null) {
            C21313518az.LIZ.getClass();
            return C2097908Jt.LIZJ(new Pair("local_service_pass_through_uuid", C21313518az.LIZLLL(pageFinder)));
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final void LJII(PageFinder pageFinder, String str, Map map, Map map2) {
        Boolean boolValueOf;
        try {
            if (!C296990BkX.LIZ()) {
                return;
            }
            Boolean boolValueOf2 = null;
            if (map2 == null) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(map2.containsKey("local_service_pass_through_uuid"));
            }
            if (!C1189060h32.LJIILJJIL(boolValueOf)) {
                if (map != null) {
                    boolValueOf2 = Boolean.valueOf(map.containsKey("local_service_pass_through_uuid"));
                }
                if (!C1189060h32.LJIILJJIL(boolValueOf2)) {
                    C21313718b1.LIZ.getClass();
                    String strLIZ = C21313518az.LIZ(C21313518az.LIZ, pageFinder, map2, map, null, 8);
                    C21313818b2 c21313818b2 = C21313818b2.LIZ;
                    if (c21313818b2.LJFF(str) == null && c21313818b2.LIZJ(strLIZ) == null) {
                        return;
                    }
                    if (C19719512Dh.LJII(map2)) {
                        map2.put("local_service_pass_through_uuid", C21313518az.LIZLLL(pageFinder));
                    } else if (C19719512Dh.LJII(map)) {
                        map.put("local_service_pass_through_uuid", C21313518az.LIZLLL(pageFinder));
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
