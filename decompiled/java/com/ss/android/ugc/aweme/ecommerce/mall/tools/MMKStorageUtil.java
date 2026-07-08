package com.ss.android.ugc.aweme.ecommerce.mall.tools;

import X.C01GW;
import X.C098200Yq;
import X.C099V;
import X.C09CT;
import X.C1323630kY5;
import X.C1771710wCn;
import X.C1772630wEH;
import X.C1773900wGK;
import X.C189200o6;
import X.C2126308Ur;
import X.C2167108eL;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.C599820Nfo;
import X.C810670Vr7;
import X.C817503Hh;
import X.C844470XAv;
import X.InterfaceC1107590evd;
import X.InterfaceC1871920yoQ;
import android.content.SharedPreferences;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.performance.EcMallMemOptConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class MMKStorageUtil {
    public static final MMKStorageUtil LIZ = new MMKStorageUtil();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(168));
    public static volatile C1772630wEH LIZJ;
    public static final SharedPreferences LIZLLL;
    public static final C01GW LJ;

    public final synchronized boolean LIZJ() {
        boolean zContains;
        zContains = false;
        if (((EcMallMemOptConfig) C1771710wCn.LIZIZ.getValue()).enableCacheOpt == 1) {
            zContains = LIZ().contains("mix_mall_homepage_cache");
        } else if (LIZIZ("mix_mall_homepage_cache", "").length() > 0) {
            zContains = true;
        }
        return zContains;
    }

    static {
        C844470XAv.LIZ.getClass();
        LIZLLL = C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "xbridge-storage");
        LJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(167));
    }

    public static Keva LIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static boolean LIZLLL() {
        return C1773900wGK.LIZJ() ? LIZ().contains("mix_mall_homepage_cache") : ((Boolean) LJ.getValue()).booleanValue();
    }

    public static boolean LJ(n nVar) {
        Object c098200Yq;
        n nVarLJIILIIL;
        k kVarLJJIIZ;
        h hVarLJIIL;
        boolean z = false;
        if (nVar == null) {
            return false;
        }
        try {
            k kVarLJJIIZ2 = nVar.LJJIIZ("body");
            if (kVarLJJIIZ2 != null && (kVarLJJIIZ2 instanceof n) && (nVarLJIILIIL = kVarLJJIIZ2.LJIILIIL()) != null && (kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("sections")) != null && (kVarLJJIIZ instanceof h) && (hVarLJIIL = kVarLJJIIZ.LJIIL()) != null && hVarLJIIL.size() > 0) {
                z = true;
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    public static String LJII(Object obj) {
        new LinkedHashMap();
        if (obj instanceof Boolean) {
            Gson gson = C1323630kY5.LIZ;
            return C1323630kY5.LIZ(new StorageValue("Boolean", String.valueOf(((Boolean) obj).booleanValue())));
        }
        if (obj instanceof Integer) {
            Gson gson2 = C1323630kY5.LIZ;
            return C1323630kY5.LIZ(new StorageValue("Int", String.valueOf(((Number) obj).intValue())));
        }
        if (obj instanceof Double) {
            Gson gson3 = C1323630kY5.LIZ;
            return C1323630kY5.LIZ(new StorageValue("Number", String.valueOf(((Number) obj).doubleValue())));
        }
        if (obj instanceof String) {
            Gson gson4 = C1323630kY5.LIZ;
            String str = (String) obj;
            str.toString();
            return C1323630kY5.LIZ(new StorageValue("String", str));
        }
        if (obj instanceof InterfaceC1871920yoQ) {
            return LJII(((InterfaceC1871920yoQ) obj).toList());
        }
        if (obj instanceof InterfaceC1107590evd) {
            return LJII(((InterfaceC1107590evd) obj).LIZ());
        }
        if (obj instanceof List) {
            return C1323630kY5.LIZ(new StorageValue("Array", C1323630kY5.LIZ(obj)));
        }
        if (obj instanceof Map) {
            return C1323630kY5.LIZ(new StorageValue("Map", C1323630kY5.LIZ(obj)));
        }
        return "";
    }

    public static final class StorageValue {

        @C09CT("type")
        public final String type;

        @C09CT("value")
        public final String value;

        public StorageValue(String str, String str2) {
            this.type = str;
            this.value = str2;
        }
    }

    public static void LJFF(long j, Object obj) {
        if (obj == null) {
            return;
        }
        C23250099c.LIZJ(C817503Hh.LL, C2126308Ur.LIZ, C099V.DEFAULT, new C2167108eL(j, obj, null));
    }

    public final synchronized String LIZIZ(String str, String str2) {
        return LIZ().getString(str, str2);
    }

    public final synchronized boolean LJI(String str, Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        if (obj instanceof String) {
            LIZ().storeString(str, (String) obj);
        } else if (obj instanceof Boolean) {
            LIZ().storeBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            LIZ().storeFloat(str, ((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            LIZ().storeDouble(str, ((Number) obj).doubleValue());
        } else if (obj instanceof byte[]) {
            LIZ().storeBytes(str, (byte[]) obj);
        } else if (obj instanceof Integer) {
            LIZ().storeInt(str, ((Number) obj).intValue());
        } else if (obj instanceof Long) {
            LIZ().storeLong(str, ((Number) obj).longValue());
        } else if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
            LIZ().storeStringArray(str, (String[]) obj);
        } else if ((obj instanceof Set) && String.class.isAssignableFrom(((Set) obj).getClass().getComponentType())) {
            LIZ().storeStringSet(str, (Set) obj);
        } else {
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MMKStorageUtil.setData, unsupport data type=");
            sbLIZ.append(obj);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZ("ec_mmk_util", strLIZIZ);
            return z;
        }
        z = true;
        return z;
    }
}
