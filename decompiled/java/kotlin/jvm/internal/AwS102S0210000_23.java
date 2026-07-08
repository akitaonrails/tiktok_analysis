package kotlin.jvm.internal;

import X.C09AY;
import X.C0XM9;
import X.C1035880d3y;
import X.C1499720p86;
import X.C1499780p8C;
import X.C1499790p8D;
import X.C1499810p8F;
import X.C1499820p8G;
import X.C1533790q13;
import X.C20684815ws;
import X.C2265541Dlw;
import X.InterfaceC1041500dD2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.log.AdWebEventLogger;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public class AwS102S0210000_23 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS102S0210000_23 awS102S0210000_23) {
        String str = ((C1533790q13) awS102S0210000_23.l0).LIZ.LJJJJIZL;
        String strLJJZ = a0.LJJZ(str, "?", str);
        String strLJJZ2 = a0.LJJZ(strLJJZ, "#", strLJJZ);
        new AdWebEventLogger((InterfaceC1041500dD2) awS102S0210000_23.l1).logAd(C2265541Dlw.LIZ, ((C1035880d3y) ((InterfaceC1041500dD2) awS102S0210000_23.l1)).getAwemeRawAd(), new AwS8S1010000_35(a0.LJJLJLI(strLJJZ2, "/", strLJJZ2), awS102S0210000_23.z2, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS102S0210000_23 awS102S0210000_23) {
        C1499820p8G c1499820p8GLIZJ;
        Integer numValueOf;
        String str;
        String str2;
        C1499790p8D c1499790p8D = C1499780p8C.LIZLLL;
        if (c1499790p8D != null) {
            String str3 = ((C1499720p86) awS102S0210000_23.l0).LIZIZ;
            boolean z = awS102S0210000_23.z2;
            C0XM9 c0xm9 = (C0XM9) awS102S0210000_23.l1;
            if (str3 != null && c1499790p8D.LIZ.LJI() != 0) {
                synchronized (c1499790p8D.LIZ) {
                    try {
                        c1499820p8GLIZJ = c1499790p8D.LIZ.LIZJ(str3);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                C1499820p8G c1499820p8G = c1499820p8GLIZJ;
                if (c1499820p8G != null) {
                    long jAbs = Math.abs(System.currentTimeMillis() - c1499820p8G.LIZLLL);
                    C1499810p8F c1499810p8F = c1499820p8G.LIZ.LJJI;
                    if (jAbs < c1499810p8F.LIZ) {
                        if (c1499810p8F.LIZLLL && (!z || !c1499810p8F.LJ)) {
                            c1499790p8D.LIZ.LJ(str3);
                        }
                        return c1499820p8G.LIZIZ;
                    }
                    c1499790p8D.LIZ.LJ(str3);
                    PreloadExtraInfo preloadExtraInfo = c1499820p8G.LIZJ;
                    if (c0xm9.LIZLLL.LIZJ("check_preload_cache") != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("url", c0xm9.LIZJ.LJFF.LIZ());
                        if (preloadExtraInfo != null) {
                            numValueOf = Integer.valueOf(preloadExtraInfo.strategyId);
                        } else {
                            numValueOf = null;
                        }
                        linkedHashMap.put("strategy_id", String.valueOf(numValueOf));
                        String str4 = "";
                        if (preloadExtraInfo == null || (str = preloadExtraInfo.previousPage) == null) {
                            str = "";
                        }
                        linkedHashMap.put("previous_page", str);
                        if (preloadExtraInfo != null && (str2 = preloadExtraInfo.enterFrom) != null) {
                            str4 = str2;
                        }
                        linkedHashMap.put("enter_from", str4);
                        C20684815ws.LJIILLIIL("preload_cache_expired", linkedHashMap);
                        return null;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS102S0210000_23(C1533790q13 c1533790q13, InterfaceC1041500dD2 interfaceC1041500dD2, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1533790q13;
        this.l1 = interfaceC1041500dD2;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS102S0210000_23(C1499720p86 c1499720p86, boolean z, C0XM9 c0xm9, String str, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1499720p86;
        this.z2 = z;
        this.l1 = c0xm9;
    }
}
