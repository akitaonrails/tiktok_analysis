package com.ss.android.ugc.aweme.ecommerce.resource;

import X.C054G;
import X.C08ZL;
import X.C08ZM;
import X.C0PEM;
import X.C0X52;
import X.C0X9S;
import X.C0XM9;
import X.C0XS7;
import X.C13BV;
import X.C13LP;
import X.C1499330p7T;
import X.C19719612Di;
import X.C1DFB;
import X.C2175508fh;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C679350Qkn;
import X.C718040SEo;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class EcomApiLifecycleManager implements NetworkPartner.Blocker, NetworkPartner.RequestHandler, NetworkPartner.ResponseHandler {
    public static String LIZIZ;
    public static C054G LIZJ;
    public static final boolean LJ;
    public static final boolean LJFF;
    public static final List<String> LJI;
    public static final List<String> LJII;
    public static final List<String> LJIIIIZZ;
    public static final EcomApiLifecycleManager LIZ = new EcomApiLifecycleManager();
    public static final Map<C08ZM, ArrayList<WeakReference<C0X9S<?>>>> LIZLLL = new LinkedHashMap();

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Blocker
    public final C0X52<?> LJFF(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    static {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.resource.EcomApiLifecycleManager.<clinit>():void");
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final String LJII() {
        return C718040SEo.LIZ(this);
    }

    public static String LJIILIIL(String str) {
        if (str != null) {
            return a0.LJJJLL("/", str);
        }
        return null;
    }

    public static void LJIILJJIL(String str) {
        if (!LJ || Intrinsics.LJFF(str, LIZIZ)) {
            return;
        }
        C054G c054g = LIZJ;
        if (c054g != null) {
            C2296808zG.LIZJ(c054g, null);
        }
        LIZJ = null;
        if (str != null) {
            LIZIZ = str;
            LIZJ = C2296808zG.LIZ(C2296908zH.LIZ());
        }
    }

    public static void LIZIZ(String str, String str2) {
        EcomApiLifecycleScene next;
        EcomApiLifecycleManagerExpData ecomApiLifecycleManagerExpData = C679350Qkn.LIZ;
        if (!ecomApiLifecycleManagerExpData.isEnabled) {
            return;
        }
        Iterator<EcomApiLifecycleScene> it2 = ecomApiLifecycleManagerExpData.scenes.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.name, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EcomApiLifecycleScene ecomApiLifecycleScene = next;
        if (ecomApiLifecycleScene == null || !ecomApiLifecycleScene.isEnabled) {
            return;
        }
        List<String> list = ecomApiLifecycleScene.apiPathsToCancel;
        ArrayList arrayList = new ArrayList();
        Iterator<String> it3 = list.iterator();
        while (it3.hasNext()) {
            String strLJIILIIL = LJIILIIL(it3.next());
            if (strLJIILIIL != null) {
                arrayList.add(strLJIILIIL);
            }
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C08ZL(str2, arrayList, null), 3);
    }

    public static String LJ(Request request, String str) {
        HashMap map;
        Object obj;
        String string;
        if (LJII.contains(str) && (map = (HashMap) request.tag(HashMap.class)) != null && (obj = map.get("pdp_product_id")) != null && (string = obj.toString()) != null && (!a0.LJJJIL(string))) {
            return string;
        }
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.ResponseHandler
    public final void LIZ(C0XS7<?> c0xs7, C1499330p7T c1499330p7T) {
        C0X9S<?> c0x9s = c1499330p7T.LIZ;
        if (c0x9s == null) {
            return;
        }
        String strLJIILIIL = LJIILIIL(c0x9s.request().getPath());
        if (C13LP.LJJJJ(strLJIILIIL, LJIIIIZZ) && strLJIILIIL != null) {
            C08ZM c08zm = new C08ZM(strLJIILIIL, LJ(c0x9s.request(), strLJIILIIL));
            Map<C08ZM, ArrayList<WeakReference<C0X9S<?>>>> map = LIZLLL;
            synchronized (map) {
                try {
                    ArrayList arrayList = (ArrayList) ((LinkedHashMap) map).get(c08zm);
                    if (arrayList != null) {
                        C19719612Di.LJJIIJ(arrayList, new AwS592S0100000_13(c0x9s, 42), true);
                    }
                    Collection collection = (Collection) ((LinkedHashMap) map).get(c08zm);
                    if (collection == null || collection.isEmpty()) {
                        map.remove(c08zm);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Blocker
    public final C0X52<?> LIZJ(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        String strLIZJ;
        String strLIZ;
        String strLJIILIIL = LJIILIIL(c0xm9.LIZJ.LJFF.LIZ());
        if (strLJIILIIL == null || !C679350Qkn.LIZIZ || !((ArrayList) LJIIIIZZ).contains(strLJIILIIL) || !LJ || !LJI.contains(strLJIILIIL) || (strLIZJ = c0xm9.LIZLLL.LIZJ("x-search-keyword")) == null || strLIZJ.length() == 0) {
            return null;
        }
        c0xm9.LIZLLL.LIZ.remove("x-search-keyword".toLowerCase(Locale.getDefault()));
        if (Intrinsics.LJFF(strLIZJ, LIZIZ) || (strLIZ = c0xm9.LIZJ.LJFF.LIZ()) == null) {
            return null;
        }
        return C0X52.LIZIZ(new TypedByteArray("text/plain", new byte[0], new String[0]), new C2175508fh(strLIZ, 499, "Canceled", C13BV.INSTANCE, new TypedByteArray("text/plain", new byte[0], new String[0])));
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.RequestHandler
    public final void LJIIIIZZ(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        C0X9S<?> c0x9s;
        String strLJIILIIL = LJIILIIL(c0xm9.LIZJ.LJFF.LIZ());
        if (!C13LP.LJJJJ(strLJIILIIL, LJIIIIZZ) || strLJIILIIL == null || (c0x9s = c1499330p7T.LIZ) == null) {
            return;
        }
        String strLJ = LJ(c0xm9.LIZ, strLJIILIIL);
        C08ZM c08zm = new C08ZM(strLJIILIIL, strLJ);
        Map<C08ZM, ArrayList<WeakReference<C0X9S<?>>>> map = LIZLLL;
        synchronized (map) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                Object arrayList = linkedHashMap.get(c08zm);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(c08zm, arrayList);
                }
                ((ArrayList) arrayList).add(new WeakReference(c0x9s));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("added call path ");
                sbLIZ.append(strLJIILIIL);
                sbLIZ.append(", context ");
                sbLIZ.append(strLJ);
                sbLIZ.append(", ");
                sbLIZ.append(c0x9s);
                C2188811AlT.LIZIZ(sbLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIIL(String str, C1DFB c1dfb, Function2 function2) {
        C054G c054g;
        C054G c054g2;
        if (str != null && LJ) {
            if (Intrinsics.LJFF(LIZIZ, str) && (c054g = LIZJ) != null && C2296808zG.LJI(c054g) && (c054g2 = LIZJ) != null) {
                C23250099c.LIZLLL(c054g2, c1dfb, null, function2, 2);
                return;
            }
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(c1dfb), null, null, function2, 3);
    }
}
