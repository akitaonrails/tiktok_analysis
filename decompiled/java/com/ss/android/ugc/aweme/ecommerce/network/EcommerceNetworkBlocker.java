package com.ss.android.ugc.aweme.ecommerce.network;

import X.C01GW;
import X.C098200Yq;
import X.C0BZ3;
import X.C0X2J;
import X.C0X2L;
import X.C0X4L;
import X.C0X52;
import X.C0XLG;
import X.C0XM9;
import X.C1019103yf;
import X.C1322400kW6;
import X.C1336440ksk;
import X.C1336450ksl;
import X.C13BV;
import X.C1499330p7T;
import X.C1504190pFJ;
import X.C1504200pFK;
import X.C1505940pI8;
import X.C1506020pIG;
import X.C1507890pLH;
import X.C1508050pLX;
import X.C189200o6;
import X.C1893807bM;
import X.C1AF0;
import X.C452501pT;
import X.C718040SEo;
import X.EnumC1014603xw;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public final class EcommerceNetworkBlocker implements NetworkPartner.Blocker {
    public static final EcommerceNetworkBlocker LIZ = new EcommerceNetworkBlocker();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1336440ksk());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1336450ksl());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1893807bM());
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(386));

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Blocker
    public final C0X52<?> LJFF(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final String LJII() {
        return C718040SEo.LIZ(this);
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Blocker
    public final C0X52<?> LIZJ(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        Object c098200Yq;
        String str;
        String str2;
        Object c098200Yq2;
        Object c098200Yq3;
        int i;
        try {
            c098200Yq = C0X2J.LIZ().interceptApis;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        List list = (List) c098200Yq;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        if (!list.isEmpty()) {
            String strLIZ = c0xm9.LIZJ.LJFF.LIZ();
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (a0.LJJIIZI(strLIZ, (String) it2.next(), false)) {
                    try {
                        C0X4L c0x4lLIZ = C0X2L.LIZ();
                        C0XLG c0xlg = c0xm9.LIZLLL;
                        if (c0x4lLIZ.LIZ) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        c0xlg.LIZ("x-ec-net-weak", String.valueOf(i));
                        int i2 = c0x4lLIZ.LIZIZ;
                        if (i2 != -1) {
                            c0xlg.LIZ("x-ec-net-quality", String.valueOf(i2));
                        }
                        int i3 = c0x4lLIZ.LIZJ;
                        if (i3 != -1) {
                            c0xlg.LIZ("x-ec-net-throughput", String.valueOf(i3));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                    }
                }
            }
        }
        C1322400kW6 c1322400kW6 = C1322400kW6.LIZ;
        String strLIZ2 = c0xm9.LIZJ.LJFF.LIZ();
        c1322400kW6.getClass();
        WeakNetworkOptimizeConfig weakNetworkOptimizeConfig = C1322400kW6.LIZIZ;
        if (weakNetworkOptimizeConfig.priorityOptimizeSwitch > 0 && weakNetworkOptimizeConfig.highPriorityPaths.contains(strLIZ2) && 1 != 0) {
            c0xm9.LJFF = 4;
        }
        C01GW c01gw = C0BZ3.LIZIZ;
        if (!((Map) c01gw.getValue()).isEmpty()) {
            String strLIZ3 = c0xm9.LIZJ.LJFF.LIZ();
            if (((Map) c01gw.getValue()).containsKey(strLIZ3)) {
                C0XLG c0xlg2 = c0xm9.LIZLLL;
                String str3 = (String) ((Map) c01gw.getValue()).get(strLIZ3);
                if (str3 == null) {
                    str3 = "";
                }
                c0xlg2.LIZ("ecom-search-bff-card-header", str3);
            }
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_switch_sea_add_header_enable", false)) {
            Request requestLIZ = c0xm9.LIZ();
            try {
                LIZ.getClass();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (!((Set) LIZIZ.getValue()).contains(requestLIZ.getHost()) && !((Set) LIZJ.getValue()).contains(requestLIZ.getPath())) {
                c098200Yq2 = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq2);
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                if (thM5exceptionOrNullimpl != null) {
                    C1019103yf.LIZ(EnumC1014603xw.ERR4, thM5exceptionOrNullimpl, null);
                }
                Request requestLIZ2 = c0xm9.LIZ();
                try {
                    LIZ.getClass();
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c098200Yq3 = new C098200Yq(th3);
                    C189200o6.m2constructorimpl(c098200Yq3);
                }
                if (!((Set) LIZLLL.getValue()).contains(requestLIZ2.getHost()) && !((Set) LJ.getValue()).contains(requestLIZ2.getPath())) {
                    c098200Yq3 = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq3);
                    Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq3);
                    if (thM5exceptionOrNullimpl2 != null) {
                        C1019103yf.LIZ(EnumC1014603xw.ERR4, thM5exceptionOrNullimpl2, null);
                    }
                }
            }
            C0XLG c0xlg3 = c0xm9.LIZLLL;
            SettingsManager.LIZLLL().getClass();
            c0xlg3.LIZ("ec-mx-region-base-type", String.valueOf(SettingsManager.LJ("ec_mx_region_base_type", 0)));
        }
        String strLIZ4 = C1508050pLX.LIZ();
        C1507890pLH c1507890pLHLIZ = C1507890pLH.LIZJ.LIZ();
        if (c1507890pLHLIZ != null) {
            str = c1507890pLHLIZ.LIZIZ.LJIIJ;
        } else {
            str = null;
        }
        c0xm9.LIZJ(C1504190pFJ.class, new C1504190pFJ(strLIZ4, str));
        if (C1506020pIG.LIZ()) {
            C1505940pI8.LIZ.getClass();
            if (C1506020pIG.LIZ() && (str2 = C1505940pI8.LJIIIZ.LIZ) != null) {
                c0xm9.LIZJ(C1504200pFK.class, new C1504200pFK(str2));
            }
        }
        return null;
    }
}
