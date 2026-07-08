package com.bytedance.i18n.location.wifi;

import X.C08XD;
import X.C098200Yq;
import X.C1208460hYK;
import X.C1490690otX;
import X.C1490700otY;
import X.C1499050p71;
import X.C1798460wtw;
import X.C1798490wtz;
import X.C1798620wuC;
import X.C185100nR;
import X.C185200nS;
import X.C189200o6;
import X.C2188811AlT;
import X.C786410Ut5;
import Y.AComparatorS46S0000000_27;
import android.os.SystemClock;
import com.bytedance.i18n.location.api.WifiClient;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Unit;

/* JADX INFO: loaded from: classes28.dex */
public final class WifiClientImpl implements WifiClient {
    public C1798490wtz LIZIZ;
    public C1490700otY LIZJ;
    public final List<C1798460wtw> LIZLLL = new ArrayList();
    public final List<C1798460wtw> LJ = new ArrayList();

    @Override // com.bytedance.i18n.location.api.WifiClient
    public final C1490700otY LJ() {
        return this.LIZJ;
    }

    @Override // com.bytedance.i18n.location.api.WifiClient
    public final void LIZIZ(C1798490wtz c1798490wtz, C1490700otY c1490700otY) {
        Object c098200Yq;
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init: ");
        sbLIZ.append(c1798490wtz);
        sbLIZ.append(' ');
        sbLIZ.append(c1490700otY);
        C1798620wuC.LIZLLL("WifiClientImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ = c1798490wtz;
        if (C1490690otX.LIZ(this.LIZJ, c1490700otY)) {
            C1798620wuC.LIZLLL("WifiClientImpl", "init: rule not changed");
            C185100nR.LJIJI(null, null, "rule", "not changed");
            return;
        }
        C185100nR.LJIJI(null, null, "rule", "changed");
        this.LIZJ = c1490700otY;
        ((ArrayList) this.LIZLLL).clear();
        ((ArrayList) this.LJ).clear();
        for (C1499050p71 c1499050p71 : c1490700otY.LIZLLL) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                if (c1499050p71.LIZ.length() != 0 && c1499050p71.LIZIZ.length() != 0) {
                    Pattern patternCompile = PatternProtector.compile(c1499050p71.LIZ);
                    int i = c1499050p71.LIZLLL;
                    if (i == 0) {
                        ((ArrayList) this.LJ).add(new C1798460wtw(patternCompile, c1499050p71.LIZIZ, c1499050p71.LIZJ));
                    } else if (i == 1) {
                        ((ArrayList) this.LIZLLL).add(new C1798460wtw(patternCompile, c1499050p71.LIZIZ, c1499050p71.LIZJ));
                    }
                    long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                    C1798620wuC c1798620wuC2 = C1798620wuC.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("init: compile pattern ");
                    sbLIZ2.append(c1499050p71.LIZIZ);
                    sbLIZ2.append(" cost ");
                    sbLIZ2.append(jUptimeMillis2);
                    sbLIZ2.append(" ms");
                    C1798620wuC.LIZLLL("WifiClientImpl", C2188811AlT.LIZIZ(sbLIZ2));
                    C185100nR c185100nR = C185100nR.LIZ;
                    C185200nS.LIZ(0, "success", c1499050p71.LIZIZ, Long.valueOf(jUptimeMillis2));
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1798620wuC c1798620wuC3 = C1798620wuC.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("init: compile pattern failed ");
                sbLIZ3.append(c1499050p71);
                C1798620wuC.LIZJ("WifiClientImpl", C2188811AlT.LIZIZ(sbLIZ3), null);
                C185100nR c185100nR2 = C185100nR.LIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("compile failed ");
                sbLIZ4.append(thM5exceptionOrNullimpl.getMessage());
                C185200nS.LIZ(-1, C2188811AlT.LIZIZ(sbLIZ4), c1499050p71.LIZIZ, Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
            }
        }
        ArrayList arrayList = (ArrayList) this.LIZLLL;
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS46S0000000_27(0));
        }
        ArrayList arrayList2 = (ArrayList) this.LJ;
        if (arrayList2.size() > 1) {
            C08XD.LJJ(arrayList2, new AComparatorS46S0000000_27(1));
        }
        if (c1798490wtz.LJIIIIZZ && ((ArrayList) this.LIZLLL).isEmpty()) {
            ((ArrayList) this.LIZLLL).add(new C1798460wtw(PatternProtector.compile(".*"), "debug_catch_all", 0));
            C1798620wuC.LIZLLL("WifiClientImpl", "init: debug bypass - added catch-all whitelist pattern");
        }
        C786410Ut5.H2(c1798490wtz.LIZ, "wifi");
        C786410Ut5.H2(c1798490wtz.LIZ, "connectivity");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0129  */
    @Override // com.bytedance.i18n.location.api.WifiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(long r24, long r26, long r28, java.lang.String r30, X.InterfaceC1780400wQo r31) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.i18n.location.wifi.WifiClientImpl.LJIJJ(long, long, long, java.lang.String, X.0wQo):void");
    }

    public static void LJIJJLI(long j, String str, int i, String str2, boolean z, boolean z2, boolean z3) {
        String str3;
        if (!z2) {
            str3 = "passive";
        } else if (z3) {
            str3 = "active_success";
        } else {
            str3 = "active_fallback";
        }
        C185100nR.LJIJI(null, null, "scan_result", str3);
        C1208460hYK.LIZJ(j, "no_cert", "Wifi", null, "precise", i, str, z, str2);
    }
}
