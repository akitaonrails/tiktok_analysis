package com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate;

import X.C04TD;
import X.C0PEM;
import X.C1005540cH2;
import X.C1005550cH3;
import X.C1005560cH4;
import X.C13LP;
import X.C20162213um;
import X.C21187717vn;
import X.C21187817vo;
import X.C2296808zG;
import X.C23250099c;
import X.EnumC1005660cHE;
import X.EnumC1005690cHH;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes17.dex */
public final class SmartCheckIntegrateImpl implements ISmartCheckIntegrate {
    public static ISmartCheckIntegrate LIZLLL() {
        Object objLIZ = C04TD.LIZ(ISmartCheckIntegrate.class, false);
        if (objLIZ != null) {
            return (ISmartCheckIntegrate) objLIZ;
        }
        if (C04TD.a0 == null) {
            synchronized (ISmartCheckIntegrate.class) {
                if (C04TD.a0 == null) {
                    C04TD.a0 = new SmartCheckIntegrateImpl();
                }
            }
        }
        return C04TD.a0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.ISmartCheckIntegrate
    public final void init() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1005560cH4(null), 3);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.ISmartCheckIntegrate
    public final boolean LIZ(String str) {
        if (str == null) {
            return false;
        }
        try {
            String str2 = (String) C13LP.LJJJLZIJ(0, a0.LJJLIIIJILLIZJL(str, new String[]{"?"}, 2, 2));
            if (str2 == null) {
                str2 = "";
            }
            if (a0.LJJJIL(str2)) {
                return false;
            }
            List<String> list = C21187717vn.LIZ().nativePageKeys;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (a0.LJJIIZI(str2, it2.next(), false)) {
                        return true;
                    }
                }
            }
            List<String> list2 = C21187817vo.LIZ().nativePageKeys;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            Iterator<String> it3 = list2.iterator();
            while (it3.hasNext()) {
                if (a0.LJJIIZI(str2, it3.next(), false)) {
                    return true;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20162213um c20162213um = C20162213um.LIZ;
            String value = EnumC1005690cHH.SCHEMA.getValue();
            EnumC1005660cHE enumC1005660cHE = EnumC1005660cHE.CHECK;
            String message = e.getMessage();
            c20162213um.getClass();
            C20162213um.LIZ("SmartCheck", value, enumC1005660cHE, message);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.ISmartCheckIntegrate
    public final void LIZIZ(String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        if (map == null) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1005550cH3(str, map, map2, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.ISmartCheckIntegrate
    public final void LIZJ(String str, String str2, String str3, String str4, String str5, String str6, Map map, boolean z) {
        if (str == null) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1005540cH2(str, map, z, str2, str3, str4, str5, str6, null), 3);
    }
}
