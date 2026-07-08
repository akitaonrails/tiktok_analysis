package com.tiktok.kmp.shareprop;

import X.C00Z0;
import X.C098200Yq;
import X.C1154320g90;
import X.C1154330g91;
import X.C1784390wXF;
import X.C1784400wXG;
import X.C1784410wXH;
import X.C1784420wXI;
import X.C1784440wXK;
import X.C1784460wXM;
import X.C1784480wXO;
import X.C189200o6;
import X.C19267610Zm;
import X.C19283010cG;
import X.C23250099c;
import X.C23271099x;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes28.dex */
public final class KMPSharePropagationServiceImpl implements IKMPSharePropagationService {
    @Override // com.tiktok.kmp.shareprop.IKMPSharePropagationService
    public final Map<String, String> LIZ(String str, Integer num, Long l) {
        boolean z;
        Object c098200Yq;
        C1784460wXM.LIZ.getClass();
        long epochMilliseconds = C19267610Zm.LIZ.now().toEpochMilliseconds();
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (z || num == null || l == null || l.longValue() <= 0) {
            return null;
        }
        try {
            C1784440wXK c1784440wXK = C1784460wXM.LIZJ;
            C19283010cG c19283010cG = C1784460wXM.LIZIZ;
            int iIntValue = num.intValue();
            long jLongValue = l.longValue();
            c1784440wXK.getClass();
            C1154330g91 c1154330g91 = (C1154330g91) C23250099c.LJ(C23271099x.INSTANCE, new C1784410wXH(c19283010cG, jLongValue, str, iIntValue, null));
            C1784460wXM.LIZJ(epochMilliseconds, "read", c1154330g91.LIZIZ);
            C1784480wXO c1784480wXO = c1154330g91.LIZ;
            if (c1784480wXO != null) {
                c098200Yq = C1784460wXM.LIZIZ(c1784480wXO);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (Map) obj;
    }

    @Override // com.tiktok.kmp.shareprop.IKMPSharePropagationService
    public final void LIZIZ(String str, String str2, Integer num, Long l, Integer num2) {
        C1154320g90 c1154320g90;
        C1784460wXM c1784460wXM = C1784460wXM.LIZ;
        boolean zBooleanValue = ((Boolean) C00Z0.LIZ.getValue()).booleanValue();
        c1784460wXM.getClass();
        long epochMilliseconds = C19267610Zm.LIZ.now().toEpochMilliseconds();
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0 && num != null && l != null && num2 != null && l.longValue() > 0 && num2.intValue() > 0) {
            try {
                C1784480wXO c1784480wXOLIZ = C1784460wXM.LIZ(num.intValue(), str, str2);
                if (c1784480wXOLIZ != null) {
                    if (zBooleanValue) {
                        C1784440wXK c1784440wXK = C1784460wXM.LIZJ;
                        C19283010cG c19283010cG = C1784460wXM.LIZIZ;
                        long jLongValue = l.longValue();
                        int iIntValue = num2.intValue();
                        c1784440wXK.getClass();
                        C23250099c.LIZLLL(C1784440wXK.LIZIZ, null, null, new C1784390wXF(c19283010cG, jLongValue, iIntValue, ((Number) C23250099c.LJ(C23271099x.INSTANCE, new C1784400wXG(c1784480wXOLIZ, jLongValue, iIntValue, null))).longValue(), null), 3);
                        c1154320g90 = new C1154320g90(false);
                    } else {
                        C1784440wXK c1784440wXK2 = C1784460wXM.LIZJ;
                        C19283010cG c19283010cG2 = C1784460wXM.LIZIZ;
                        long jLongValue2 = l.longValue();
                        int iIntValue2 = num2.intValue();
                        c1784440wXK2.getClass();
                        c1154320g90 = (C1154320g90) C23250099c.LJ(C23271099x.INSTANCE, new C1784420wXI(c19283010cG2, c1784480wXOLIZ, jLongValue2, iIntValue2, null));
                    }
                    C1784460wXM.LIZJ(epochMilliseconds, "write", c1154320g90.LIZ);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }
}
