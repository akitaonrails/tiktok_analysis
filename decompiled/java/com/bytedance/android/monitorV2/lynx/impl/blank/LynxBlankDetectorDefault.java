package com.bytedance.android.monitorV2.lynx.impl.blank;

import X.C098200Yq;
import X.C1315470kKv;
import X.C1317650kOR;
import X.C1317790kOf;
import X.C1520960pgM;
import X.C189200o6;
import X.C824310WVh;
import X.EnumC1520990pgP;
import X.InterfaceC1317630kOP;
import X.InterfaceC1521770phf;
import Y.ARunnableS17S0200100_20;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.internal.AwS298S0300000_20;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxBlankDetectorDefault implements InterfaceC1521770phf {
    @Override // X.InterfaceC1521770phf
    public Double getDomScore(View view) {
        if (view instanceof LynxView) {
            C1315470kKv.LIZ.getClass();
            return Double.valueOf(C1315470kKv.LIZLLL(((LynxView) view).getLynxUIRoot(), 1));
        }
        return null;
    }

    @Override // X.InterfaceC1521770phf
    public void detect(View view, InterfaceC1317630kOP interfaceC1317630kOP) {
        Object c098200Yq;
        if (view == null) {
            interfaceC1317630kOP.LIZ(new C1317650kOR());
            return;
        }
        C1317790kOf c1317790kOf = new C1317790kOf(view.getWidth(), view.getHeight());
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1315470kKv c1315470kKv = C1315470kKv.LIZ;
        c1315470kKv.getClass();
        try {
            Rect rectLJFF = C1315470kKv.LJFF(view);
            C1315470kKv.LJ(view, rectLJFF, new HashSet(), new AwS298S0300000_20(rectLJFF, c1315470kKv, c1317790kOf, 0));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c1317790kOf.LIZ(0, 0, view.getWidth(), view.getHeight(), 1);
            C1520960pgM.LIZIZ(thM5exceptionOrNullimpl);
        }
        if (EnumC1520990pgP.ENABLE_LYNX_BLANK_DOM_SCORE_DETECT.isEnabled() && (view instanceof LynxView)) {
            C1315470kKv.LIZ.getClass();
            c1317790kOf.LJ = C1315470kKv.LIZLLL(((LynxView) view).getLynxUIRoot(), 1);
        }
        C824310WVh.LIZ(new ARunnableS17S0200100_20(System.currentTimeMillis() - jCurrentTimeMillis, c1317790kOf, interfaceC1317630kOP, 1));
    }
}
