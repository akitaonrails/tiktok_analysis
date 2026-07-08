package com.ss.android.ugc.aweme.base;

import X.C01GW;
import X.C07JE;
import X.C08JS;
import X.C098200Yq;
import X.C09CT;
import X.C0CLW;
import X.C1044430dHl;
import X.C1055620dZo;
import X.C1120604Zw;
import X.C1121904a9;
import X.C11G9;
import X.C11VV;
import X.C13BV;
import X.C13JW;
import X.C13JX;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C15O7;
import X.C1741890vQh;
import X.C189200o6;
import X.C19719512Dh;
import X.C19719612Di;
import X.C2188811AlT;
import X.C2276411E8h;
import X.C2344809Gs;
import X.C2371409Qy;
import X.C258480ABa;
import X.C2823017l;
import X.C304920BxK;
import X.C452501pT;
import X.C844470XAv;
import X.CallableC1394710mOj;
import X.InterfaceC1849700yEa;
import X.InterfaceC2661011f;
import Y.ACallableS432S0100000_29;
import android.os.Looper;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.api.BAProductAnchorStateApi;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes30.dex */
public final class AnchorListManager {
    public static final AnchorListManager LIZ = new AnchorListManager();
    public static final C11VV LIZIZ;
    public static final InterfaceC2661011f LIZJ;
    public static final Keva LIZLLL;
    public static final Keva LJ;
    public static boolean LJFF;
    public static String LJI;
    public static int LJII;
    public static final AtomicBoolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static Map<String, AnchorPublishStruct> LJIIJ;
    public static final C01GW LJIIJJI;

    public static final class AnchorLogExtra {

        @C09CT("anchor_type")
        public final String impressionType;

        public AnchorLogExtra() {
            this("");
        }

        public AnchorLogExtra(String str) {
            this.impressionType = str;
        }
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LIZIZ = (C11VV) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(strLIZIZ).create(C11VV.class);
        LIZJ = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(strLIZIZ).build();
        LIZLLL = Keva.getRepo("anchor_data_keva");
        LJ = Keva.getRepo("fe-storage");
        LJIIIIZZ = new AtomicBoolean(false);
        LJIIJJI = C452501pT.LIZIZ(new C2823017l());
    }

    public static void LIZIZ() {
        LJII--;
    }

    public static boolean LIZJ() {
        try {
            Boolean enableAnchorCache = C0CLW.LIZIZ.LIZ.getEnableAnchorCache();
            if (enableAnchorCache != null) {
                return enableAnchorCache.booleanValue();
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static void LJIILIIL() {
        Map mapLJII;
        Collection collectionValues;
        Collection collectionValues2;
        AnchorPublishStruct anchorPublishStruct;
        try {
            Keva keva = LIZLLL;
            keva.storeString("anchor_map_key", C08JS.LIZIZ().LJIILLIIL(LJII(), new TypeToken<Map<String, AnchorPublishStruct>>() { // from class: X.0mOi
            }.getType()));
            Map mapLJII2 = LJII();
            if (mapLJII2 != null && (collectionValues2 = mapLJII2.values()) != null && (anchorPublishStruct = (AnchorPublishStruct) C13LP.LJJJLIIL(collectionValues2)) != null) {
                LJ.storeString("ECOMMERCE_i18N_STORAGE_PROMPT_STRING", anchorPublishStruct.anchorTips);
            }
            keva.storeBoolean("anchor_local_map_success", true);
            String str = LJI;
            if (str != null && !a0.LJJJIL(str)) {
                keva.storeString("anchor_region_keva", str);
            }
            try {
                if (((Number) C258480ABa.LIZ.getValue()).intValue() == 1 && (mapLJII = LJII()) != null && (collectionValues = mapLJII.values()) != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
                    Iterator it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf(((AnchorPublishStruct) it2.next()).type));
                    }
                    if (arrayList != null) {
                        LIZLLL.storeString("anchor_types_key", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AnchorListManager saveData Exception: ");
            sbLIZ.append(e);
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            C2276411E8h.LIZIZ.LIZLLL("anchor_business", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public static List LJI() {
        ?? arrayList;
        ?? arrayList2;
        Collection collectionValues;
        Collection collectionValues2;
        Map mapLJII = LJII();
        if (mapLJII == null || (collectionValues2 = mapLJII.values()) == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            arrayList = new ArrayList();
            for (Object obj : collectionValues2) {
                if (((AnchorPublishStruct) obj).isNew) {
                    arrayList.add(obj);
                }
            }
        }
        Map mapLJII2 = LJII();
        if (mapLJII2 == null || (collectionValues = mapLJII2.values()) == null) {
            arrayList2 = C13BV.INSTANCE;
        } else {
            arrayList2 = new ArrayList();
            for (Object obj2 : collectionValues) {
                if (!((AnchorPublishStruct) obj2).isNew) {
                    arrayList2.add(obj2);
                }
            }
        }
        return C13LP.LJLIL(arrayList2, arrayList);
    }

    public static Map LJII() {
        Map<String, AnchorPublishStruct> map;
        Collection<AnchorPublishStruct> collectionValues;
        Type type;
        if (LIZJ()) {
            Map<String, AnchorPublishStruct> map2 = LJIIJ;
            boolean z = false;
            if ((map2 == null || map2.isEmpty()) && !LJFF) {
                Keva keva = LIZLLL;
                Map<String, AnchorPublishStruct> map3 = null;
                LJI = keva.getString("anchor_region_keva", null);
                String string = keva.getString("anchor_map_key", null);
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        z = true;
                    }
                    if (z) {
                        C13JX c13jx = KTypeProjection.LIZJ;
                        C13JW c13jwLJII = C13LE.LJII(String.class);
                        c13jx.getClass();
                        type = C2371409Qy.LIZJ(C13LE.LIZJ(C13LE.LJI(Map.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJII(AnchorPublishStruct.class)))));
                    } else {
                        type = new TypeToken<Map<String, AnchorPublishStruct>>() { // from class: X.0xAA
                        }.getType();
                    }
                    Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, string, type);
                    if (!C19719512Dh.LJII(objFromJson)) {
                        objFromJson = null;
                    }
                    map3 = (Map) objFromJson;
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                LJIIIZ(map3);
                LJIIJJI(map3);
                LJIIJ(map3);
                if (!C1044430dHl.LIZ().enable) {
                    C1055620dZo.LIZ.getClass();
                    C1055620dZo.LIZ(map3);
                }
                BAProductAnchorStateApi.LIZ.getClass();
                BAProductAnchorStateApi.LIZ(map3);
                LJIIJ = map3;
            }
        }
        if (!C304920BxK.LIZ() && (map = LJIIJ) != null && (collectionValues = map.values()) != null) {
            C19719612Di.LJJIII(collectionValues, AFwS259S0000000_21.get$arr$(53), true);
        }
        return LJIIJ;
    }

    public static boolean LIZ(List list) {
        Collection collectionValues;
        if (((Number) C258480ABa.LIZ.getValue()).intValue() == 1 && LJI == null) {
            List list2 = (List) LJIIJJI.getValue();
            if (list2 == null || list2.isEmpty()) {
                return false;
            }
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (list.contains(Integer.valueOf(((Number) it2.next()).intValue()))) {
                    return true;
                }
            }
            return false;
        }
        Map mapLJII = LJII();
        if (mapLJII == null || (collectionValues = mapLJII.values()) == null || collectionValues.isEmpty()) {
            return false;
        }
        Iterator it3 = collectionValues.iterator();
        while (it3.hasNext()) {
            if (list.contains(Integer.valueOf(((AnchorPublishStruct) it3.next()).type))) {
                return true;
            }
        }
        return false;
    }

    public static void LIZLLL(Function0 function0) {
        Executor executor;
        boolean zLJI = MethodIDManager.LJI(137754);
        if (!LJIIIIZZ.get() && Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper()) && C07JE.LIZ()) {
            executor = C15O7.LJI;
        } else {
            executor = new Executor() { // from class: X.11VW
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            };
        }
        C15O7.LIZIZ(new ACallableS432S0100000_29(function0, 2), executor, null);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static String LJ(AnchorPublishStruct anchorPublishStruct) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str = null;
        if (anchorPublishStruct != null) {
            numValueOf = Integer.valueOf(anchorPublishStruct.type);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append('(');
        if (anchorPublishStruct != null) {
            str = anchorPublishStruct.subtype;
        }
        sbLIZ.append(str);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIIIZZ(com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct r4) {
        /*
            java.lang.String r4 = r4.logExtra
            r3 = 0
            com.google.gson.Gson r2 = X.C1741890vQh.LJFF()     // Catch: com.google.gson.s -> L3c
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L3c
            r0.getClass()     // Catch: com.google.gson.s -> L3c
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L3c
            if (r0 == 0) goto L18
            boolean r1 = r0.LJII     // Catch: com.google.gson.s -> L3c
            r0 = 1
            if (r1 != r0) goto L18
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 == 0) goto L1c
            goto L26
        L1c:
            X.11GM r0 = new X.11GM     // Catch: com.google.gson.s -> L3c
            r0.<init>()     // Catch: com.google.gson.s -> L3c
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L3c
            goto L30
        L26:
            java.lang.Class<com.ss.android.ugc.aweme.base.AnchorListManager$AnchorLogExtra> r0 = com.ss.android.ugc.aweme.base.AnchorListManager.AnchorLogExtra.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L3c
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L3c
        L30:
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r2, r4, r0)     // Catch: com.google.gson.s -> L3c
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.base.AnchorListManager.AnchorLogExtra     // Catch: com.google.gson.s -> L3c
            if (r0 != 0) goto L39
            r1 = r3
        L39:
            com.ss.android.ugc.aweme.base.AnchorListManager$AnchorLogExtra r1 = (com.ss.android.ugc.aweme.base.AnchorListManager.AnchorLogExtra) r1     // Catch: com.google.gson.s -> L3c
            goto L41
        L3c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r1 = r3
        L41:
            if (r1 == 0) goto L45
            java.lang.String r3 = r1.impressionType
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.AnchorListManager.LJIIIIZZ(com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct):java.lang.String");
    }

    public static void LJIIIZ(Map map) {
        if (map != null) {
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) ((Map.Entry) it2.next()).getValue();
                if (anchorPublishStruct.isNew) {
                    anchorPublishStruct.hadNew = true;
                }
            }
        }
    }

    public static void LJIIJ(Map map) {
        if (map != null) {
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                if (((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJIL().contains(Integer.valueOf(((AnchorPublishStruct) ((Map.Entry) it2.next()).getValue()).type))) {
                    LJIIIZ = true;
                }
            }
        }
    }

    public static void LJIIJJI(Map map) {
        LJII = 0;
        if (map != null) {
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                if (((AnchorPublishStruct) ((Map.Entry) it2.next()).getValue()).isNew) {
                    LJII++;
                }
            }
        }
    }

    public static void LJIIL(AnchorPublishStruct anchorPublishStruct) {
        AnchorPublishStruct anchorPublishStruct2;
        String strLJ = LJ(anchorPublishStruct);
        Map mapLJII = LJII();
        if (mapLJII != null && (anchorPublishStruct2 = (AnchorPublishStruct) mapLJII.get(strLJ)) != null) {
            anchorPublishStruct2.isNew = false;
        }
        LJIILIIL();
        ((InterfaceC1849700yEa) LIZJ.create(InterfaceC1849700yEa.class)).LIZ(C1741890vQh.LJIIIIZZ(Collections.singletonList(new AnchorAddLinkImpression(C11G9.CreationPageEntered.getValue(), anchorPublishStruct.type, anchorPublishStruct.subtype))));
    }

    public static void LJIILJJIL(Map map) {
        if (C304920BxK.LIZ()) {
            LJIIJ = map;
            C15O7.LIZJ(CallableC1394710mOj.LL);
            return;
        }
        if (map != null) {
            Collection collectionValues = map.values();
            if (collectionValues != null) {
                C19719612Di.LJJIII(collectionValues, AFwS259S0000000_21.get$arr$(54), true);
            }
        } else {
            map = null;
        }
        LJIIJ = map;
        C15O7.LIZJ(CallableC1394710mOj.LL);
    }

    public static AnchorPublishStruct LJFF(int i, String str) {
        Map mapLJII = LJII();
        if (mapLJII != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append('(');
            sbLIZ.append(str);
            sbLIZ.append(')');
            return (AnchorPublishStruct) mapLJII.get(C2188811AlT.LIZIZ(sbLIZ));
        }
        return null;
    }

    public static final class AnchorAddLinkImpression {

        @C09CT("anchor_subtype")
        public final String anchorSubtype;

        @C09CT("anchor_type")
        public final int anchorType;

        @C09CT("impression_type")
        public final int impressionType;

        public AnchorAddLinkImpression(int i, int i2, String str) {
            this.impressionType = i;
            this.anchorType = i2;
            this.anchorSubtype = str;
        }
    }
}
