package com.ss.android.storage.cleaner;

import X.C0VSJ;
import X.C13BV;
import X.C13VI;
import X.C2188811AlT;
import X.C238400w2;
import X.C2454209jY;
import X.C274870Apx;
import X.C823050WQl;
import X.C830370Whn;
import X.EnumC1335420kr6;
import X.RunnableC513801zM;
import android.os.Build;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class ActiveClearLiveStorage extends C13VI {
    public static boolean LIZJ;
    public static final long LIZIZ = ((long) ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).a6()) * 86400000;
    public static String LIZLLL = "";

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return null;
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        return 0L;
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.RESOURCE;
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        if (!C274870Apx.LIZ) {
            return 0L;
        }
        C238400w2 c238400w2 = new C238400w2();
        try {
            if (((Boolean) C274870Apx.LIZIZ.getValue()).booleanValue()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                List<String> listU3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).u3();
                if (listU3 != null) {
                    Iterator<String> it2 = listU3.iterator();
                    while (it2.hasNext()) {
                        c238400w2.element += LJIILL(it2.next(), z);
                    }
                }
                if (z) {
                    C823050WQl.LIZIZ().execute(new RunnableC513801zM(System.currentTimeMillis() - jCurrentTimeMillis, c238400w2, 0));
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return c238400w2.element;
    }

    public final long LJIILL(String str, boolean z) {
        long jLIZ;
        List listLJJLIIIJILLIZJL;
        if (!LIZJ) {
            String strC5 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).C5(str);
            if (strC5 == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strC5, new String[]{str}, 0, 6)) == null || listLJJLIIIJILLIZJL.size() != 2) {
                return 0L;
            }
            LIZLLL = (String) ListProtector.get(listLJJLIIIJILLIZJL, 0);
            LIZJ = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZLLL);
        sbLIZ.append(str);
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (!c0vsj.exists()) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 26) {
            jLIZ = C830370Whn.LIZIZ(c0vsj);
        } else {
            jLIZ = C830370Whn.LIZ(c0vsj);
        }
        if (System.currentTimeMillis() - jLIZ <= LIZIZ) {
            return 0L;
        }
        return C2454209jY.LIZIZ(c0vsj, C13BV.INSTANCE, z);
    }
}
