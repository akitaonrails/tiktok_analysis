package com.ss.android.ugc.aweme.slash.data;

import X.C01GW;
import X.C0XIR;
import X.C1180620gpQ;
import X.C1180640gpS;
import X.C1181180gqK;
import X.C1181190gqL;
import X.C1181200gqM;
import X.C23112093u;
import X.C452501pT;
import X.EnumC1181510gqr;
import X.EnumC452301pR;
import X.InterfaceC1181010gq3;
import X.InterfaceC1181380gqe;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashVm extends ViewModel {
    public final C01GW LL = C452501pT.LIZ(EnumC452301pR.NONE, AFwS206S0000000_18.get$arr$(595));
    public final Set<String> LLILLJJLI = Collections.newSetFromMap(new ConcurrentHashMap());
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(594));
    public volatile C1180620gpQ LLILZ;

    public final C1180640gpS vQ2() {
        return (C1180640gpS) this.LLILLL.getValue();
    }

    public static void zQ2(C1180620gpQ c1180620gpQ) {
        C1181190gqL c1181190gqL;
        Map<String, C1181200gqM> map;
        if (c1180620gpQ != null && (c1181190gqL = c1180620gpQ.LL) != null && (map = c1181190gqL.LIZ) != null) {
            for (Map.Entry<String, C1181200gqM> entry : map.entrySet()) {
                BaseComponentData baseComponentData = entry.getValue().LIZ.LIZLLL;
                if (baseComponentData != null) {
                    baseComponentData.instanceId = entry.getKey();
                }
                BaseComponentData baseComponentData2 = entry.getValue().LIZ.LIZLLL;
                if (baseComponentData2 != null) {
                    baseComponentData2.componentType = entry.getValue().LIZ.LIZIZ;
                }
            }
        }
    }

    public final C1180620gpQ yQ2(Set<String> set, C1180620gpQ c1180620gpQ) {
        C1181190gqL c1181190gqLLIZ;
        C1181190gqL c1181190gqL;
        if (set.isEmpty()) {
            return c1180620gpQ;
        }
        C1181190gqL c1181190gqL2 = c1180620gpQ.LL;
        C1180620gpQ c1180620gpQLJIJJLI = null;
        c1181190gqLLIZ = null;
        C1181190gqL c1181190gqLLIZ2 = null;
        if (c1181190gqL2 != null) {
            c1181190gqLLIZ = C1181180gqK.LIZ(c1181190gqL2, new AwS597S0100000_18(set, (Set<String>) 570));
        } else {
            c1181190gqLLIZ = null;
        }
        C1180620gpQ c1180620gpQLJIJJLI2 = C1180620gpQ.LJIJJLI(c1180620gpQ, c1181190gqLLIZ, false, false, 30);
        C1180620gpQ c1180620gpQ2 = this.LLILZ;
        if (c1180620gpQ2 != null) {
            C1180620gpQ c1180620gpQ3 = this.LLILZ;
            if (c1180620gpQ3 != null && (c1181190gqL = c1180620gpQ3.LL) != null) {
                c1181190gqLLIZ2 = C1181180gqK.LIZ(c1181190gqL, new AwS597S0100000_18(set, (Set<String>) 571));
            }
            c1180620gpQLJIJJLI = C1180620gpQ.LJIJJLI(c1180620gpQ2, c1181190gqLLIZ2, false, false, 30);
        }
        this.LLILZ = c1180620gpQLJIJJLI;
        vQ2().LIZLLL(c1180620gpQLJIJJLI2.LLILLL);
        vQ2().LIZJ(c1180620gpQLJIJJLI2.LJ(), c1180620gpQLJIJJLI2.LLILLJJLI);
        return c1180620gpQLJIJJLI2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1180620gpQ xQ2(X.InterfaceC1181010gq3 r7, X.C1180620gpQ r8, java.lang.Throwable r9) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.slash.data.SlashVm.xQ2(X.0gq3, X.0gpQ, java.lang.Throwable):X.0gpQ");
    }

    public final C1180620gpQ wQ2(EnumC1181510gqr enumC1181510gqr, InterfaceC1181010gq3 interfaceC1181010gq3, C1180620gpQ c1180620gpQ, Throwable th, InterfaceC1181380gqe interfaceC1181380gqe, Function0<C1180620gpQ> function0) {
        Throwable cause;
        int errorCode;
        C23112093u c23112093u;
        C1180620gpQ c1180620gpQXQ2 = xQ2(interfaceC1181010gq3, c1180620gpQ, th);
        boolean z = true;
        if (c1180620gpQXQ2 != null) {
            this.LLILZ = c1180620gpQXQ2;
            vQ2().LIZLLL(c1180620gpQXQ2.LLILLL);
            vQ2().LIZJ(c1180620gpQXQ2.LJ(), c1180620gpQXQ2.LLILLJJLI);
            if (interfaceC1181380gqe != null) {
                if (th != null) {
                    z = false;
                }
                interfaceC1181380gqe.mC(c1180620gpQXQ2, enumC1181510gqr, z, null);
            }
            zQ2(c1180620gpQXQ2);
            return c1180620gpQXQ2;
        }
        C1180620gpQ c1180620gpQInvoke = this.LLILZ;
        if (c1180620gpQInvoke == null && (c1180620gpQInvoke = function0.invoke()) == null) {
            return null;
        }
        if ((th instanceof RuntimeException) && th != null) {
            cause = th.getCause();
        } else {
            cause = null;
        }
        if (((cause instanceof C0XIR) && (c23112093u = (C23112093u) cause) != null) || ((th instanceof C0XIR) && (c23112093u = (C23112093u) th) != null)) {
            errorCode = c23112093u.getErrorCode();
        } else if (th != null) {
            errorCode = -999;
        } else {
            errorCode = c1180620gpQInvoke.status_code;
        }
        C1180620gpQ c1180620gpQXQ22 = xQ2(interfaceC1181010gq3, C1180620gpQ.LJIJJLI(c1180620gpQInvoke, null, true, true, 21), th);
        if (c1180620gpQXQ22 != null) {
            c1180620gpQXQ22.status_code = errorCode;
        } else {
            c1180620gpQXQ22 = null;
        }
        this.LLILZ = c1180620gpQXQ22;
        C1180620gpQ c1180620gpQ2 = this.LLILZ;
        if (c1180620gpQ2 != null) {
            vQ2().LIZLLL(c1180620gpQ2.LLILLL);
            vQ2().LIZJ(c1180620gpQ2.LJ(), c1180620gpQ2.LLILLJJLI);
            if (interfaceC1181380gqe != null) {
                if (th != null) {
                    z = false;
                }
                interfaceC1181380gqe.mC(c1180620gpQ2, enumC1181510gqr, z, null);
            }
        }
        C1180620gpQ c1180620gpQ3 = this.LLILZ;
        zQ2(c1180620gpQ3);
        return c1180620gpQ3;
    }
}
