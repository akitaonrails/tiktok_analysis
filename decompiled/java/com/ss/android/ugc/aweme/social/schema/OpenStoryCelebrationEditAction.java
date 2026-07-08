package com.ss.android.ugc.aweme.social.schema;

import X.C018G;
import X.C01TT;
import X.C098200Yq;
import X.C1449670npN;
import X.C1728406pm;
import X.C189200o6;
import X.C259800zU;
import X.InterfaceC1728106pj;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.jvm.internal.AwS87S0210000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class OpenStoryCelebrationEditAction implements IRouteAction {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        Object obj;
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        if (context == null) {
            return Boolean.FALSE;
        }
        C259800zU c259800zU = new C259800zU();
        try {
            Integer numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(C018G.LIZIZ(str, "celebration_type")));
            C189200o6.m2constructorimpl(numValueOf);
            obj = numValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq4 = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq4);
            obj = c098200Yq4;
        }
        boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
        Object obj2 = null;
        T t = obj;
        if (zM7isFailureimpl) {
            t = 0;
        }
        c259800zU.element = t;
        if (t == 0) {
            return Boolean.FALSE;
        }
        try {
            c098200Yq = C018G.LIZIZ(str, "peer_user_id");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str2 = (String) c098200Yq;
        C1728406pm c1728406pm = C1728406pm.LIZ;
        int iIntValue = ((Number) c259800zU.element).intValue();
        try {
            c098200Yq2 = C018G.LIZIZ(str, "extra");
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq2 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = null;
        }
        c1728406pm.getClass();
        Pair pairLIZJ = C1728406pm.LIZJ(iIntValue, context, Long.valueOf(C1728406pm.LIZ()), str2, (String) c098200Yq2);
        boolean zBooleanValue = ((Boolean) pairLIZJ.getFirst()).booleanValue();
        InterfaceC1728106pj interfaceC1728106pj = (InterfaceC1728106pj) pairLIZJ.getSecond();
        if (interfaceC1728106pj == null) {
            return Boolean.FALSE;
        }
        if (zBooleanValue) {
            interfaceC1728106pj.LIZJ(new C1449670npN(this, str, c259800zU, str2, bundle));
        }
        try {
            c098200Yq3 = C018G.LIZIZ(str, "preload");
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq3 = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq3)) {
            obj2 = c098200Yq3;
        }
        C01TT.LIZLLL(new AwS87S0210000_2(Intrinsics.LJFF(obj2, "1"), interfaceC1728106pj, context, 7));
        return Boolean.TRUE;
    }
}
