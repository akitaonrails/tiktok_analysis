package com.ss.android.ugc.aweme.story.celebration.entrance;

import X.AbstractC1387200mCc;
import X.C018G;
import X.C01B8;
import X.C098200Yq;
import X.C11O8;
import X.C1389890mGx;
import X.C189200o6;
import X.C1906580ziK;
import X.C259800zU;
import Y.AfS147S0200000_11;
import Y.AfS180S0100000_11;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes12.dex */
public final class OpenCelebrationDetailAction implements IRouteAction {
    public final void LIZ(int i) {
        View viewLJI;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (viewLJI = abstractC1387200mCcLJ.LJI()) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(viewLJI);
            c1389890mGx.LJIIIZ(i);
            c1389890mGx.LJIIJJI();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        Object obj;
        Object c098200Yq;
        C259800zU c259800zU = new C259800zU();
        try {
            String strLIZIZ = C018G.LIZIZ(str, "item_id");
            C189200o6.m2constructorimpl(strLIZIZ);
            obj = strLIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq2 = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq2);
            obj = c098200Yq2;
        }
        boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
        Object obj2 = null;
        T t = obj;
        if (zM7isFailureimpl) {
            t = 0;
        }
        c259800zU.element = t;
        try {
            c098200Yq = Integer.valueOf(CastIntegerProtector.parseInt(C018G.LIZIZ(str, "celebration_type")));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        T t2 = c259800zU.element;
        if (t2 != 0 && obj2 != null) {
            C11O8 c11o8LIZ = C01B8.LIZ((String) t2);
            if (c11o8LIZ != null) {
                c11o8LIZ.LJJLL(new AfS147S0200000_11(context, c259800zU, 4), new AfS180S0100000_11(this, 3));
            }
            return Boolean.TRUE;
        }
        LIZ(2131833833);
        return Boolean.FALSE;
    }
}
