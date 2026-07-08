package com.ss.android.ugc.aweme.commercialize.shoppingtask.host;

import X.AbstractC1044870dIT;
import X.C098200Yq;
import X.C1017070cZd;
import X.C1021060cg4;
import X.C1022620cia;
import X.C1025430cn7;
import X.C1025520cnG;
import X.C1025670cnV;
import X.C1025880cnq;
import X.C1044730dIF;
import X.C1044740dIG;
import X.C1044750dIH;
import X.C1044760dII;
import X.C1044770dIJ;
import X.C1044780dIK;
import X.C1044790dIL;
import X.C1044800dIM;
import X.C1044900dIW;
import X.C1227904rF;
import X.C1262704wr;
import X.C1867807Tg;
import X.C189200o6;
import X.C2188811AlT;
import X.C823050WQl;
import Y.ARunnableS85S0200000_16;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterModelTransform;
import com.ss.android.ugc.aweme.commercialize.shoppingtask.api.IShoppingTaskHostService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.AwS132S1200000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes17.dex */
public final class ShoppingTaskHostServiceImpl implements IShoppingTaskHostService {
    public static Aweme LJI(String str) {
        Object c098200Yq;
        Object obj = null;
        if (a0.LJJJIL(str)) {
            return null;
        }
        try {
            C1227904rF.LIZ.getClass();
            c098200Yq = (Aweme) C1227904rF.LIZIZ(str, Aweme.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1022620cia.LIZJ("ShoppingTaskHostService", thM5exceptionOrNullimpl);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (Aweme) obj;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.shoppingtask.api.IShoppingTaskHostService
    public final AbstractC1044870dIT LIZIZ(C1867807Tg c1867807Tg) {
        try {
            C1044730dIF.LIZ.getClass();
            C1262704wr c1262704wrLIZ = C1044730dIF.LIZ(c1867807Tg);
            if (c1262704wrLIZ.LIZ) {
                return C1044900dIW.LIZ;
            }
            return new C1044790dIL(c1262704wrLIZ.LIZIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1022620cia.LIZJ("ShoppingTaskHostService", th);
            String message = th.getMessage();
            if (message == null) {
                message = "gecko_init_failed";
            }
            return new C1044790dIL(message);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.shoppingtask.api.IShoppingTaskHostService
    public final C1044900dIW LIZJ(C1044800dIM c1044800dIM) {
        C823050WQl.LIZIZ().execute(new ARunnableS85S0200000_16(this, c1044800dIM, 25));
        return C1044900dIW.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.shoppingtask.api.IShoppingTaskHostService
    public final C1044900dIW LJ(C1044740dIG c1044740dIG) {
        C823050WQl.LIZIZ().execute(new ARunnableS85S0200000_16(this, c1044740dIG, 24));
        return C1044900dIW.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.shoppingtask.api.IShoppingTaskHostService
    public final void LJFF(String str) {
        C1044750dIH.LIZ.getClass();
        C1044750dIH.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.shoppingtask.api.IShoppingTaskHostService
    public final AbstractC1044870dIT LIZLLL(Context context, C1044780dIK c1044780dIK) {
        String str = "";
        Aweme awemeLJI = LJI(c1044780dIK.LIZLLL);
        if (awemeLJI == null) {
            return new C1044790dIL("invalid_aweme");
        }
        ICRouterManager iCRouterManager = (ICRouterManager) PluggableExtentionKt.pluggableSpi$default(ICRouterManager.class, false, false, false, 14, null);
        if (iCRouterManager == null) {
            return new C1044790dIL("crouter_unavailable");
        }
        try {
            String aid = awemeLJI.getAid();
            if (aid == null) {
                aid = "";
            }
            AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(awemeLJI);
            GMTBaseModel gMTBaseModelLIZ = null;
            ICRouterModelTransform iCRouterModelTransform = (ICRouterModelTransform) PluggableExtentionKt.pluggableSpi$default(ICRouterModelTransform.class, false, false, false, 14, null);
            if (iCRouterModelTransform != null) {
                gMTBaseModelLIZ = iCRouterModelTransform.LIZ(C1017070cZd.LJJIJLIJ(awemeLJI));
            }
            C1025880cnq c1025880cnq = new C1025880cnq(context, aid, awemeLJI, awemeRawAdLJJIJLIJ, gMTBaseModelLIZ);
            C1025520cnG c1025520cnG = new C1025520cnG(null, "", null, c1044780dIK.LIZIZ, c1044780dIK.LIZ, c1044780dIK.LIZJ, null, null, 965);
            C1025670cnV c1025670cnV = C1025670cnV.LIZIZ;
            iCRouterManager.LIZLLL(c1025880cnq, c1025520cnG, new C1021060cg4((CRouterCoreModel) null, new C1025430cn7(c1025670cnV, c1025670cnV, null, null, 124), 5), true).LJI();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("openShoppingTaskAd success, aid=");
            sbLIZ.append(awemeLJI.getAid());
            C1022620cia.LJ("ShoppingTaskHostService", C2188811AlT.LIZIZ(sbLIZ));
            return C1044900dIW.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1022620cia.LIZJ("ShoppingTaskHostService", th);
            String message = th.getMessage();
            if (message != null) {
                str = message;
            }
            return new C1044790dIL(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.shoppingtask.api.IShoppingTaskHostService
    public final boolean LIZ(Context context, String str, C1044770dIJ c1044770dIJ, AwS417S0200000_16 awS417S0200000_16) {
        Object c098200Yq;
        C1044750dIH c1044750dIH = C1044750dIH.LIZ;
        c1044750dIH.getClass();
        C1044750dIH.LIZ(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("open start, containerId=");
        sbLIZ.append(str);
        sbLIZ.append(", itemId=");
        sbLIZ.append(c1044770dIJ.LIZ);
        C1022620cia.LIZ("ShoppingTaskReportHelper", C2188811AlT.LIZIZ(sbLIZ));
        try {
            C1044760dII c1044760dII = new C1044760dII(c1044770dIJ, new AwS132S1200000_16(c1044750dIH, str, awS417S0200000_16, 5));
            C1044750dIH.LIZIZ.put(str, c1044760dII);
            c1044760dII.LIZ(context);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("open success, containerId=");
            sbLIZ2.append(str);
            C1022620cia.LJ("ShoppingTaskReportHelper", C2188811AlT.LIZIZ(sbLIZ2));
            c098200Yq = Boolean.TRUE;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1022620cia.LIZJ("ShoppingTaskReportHelper", thM5exceptionOrNullimpl);
            C1044750dIH.LIZ.getClass();
            C1044750dIH.LIZ(str);
            c098200Yq = Boolean.FALSE;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }
}
