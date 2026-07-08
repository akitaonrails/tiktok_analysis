package ttpobfuscated;

import X.C098200Yq;
import X.C13LP;
import X.C189200o6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.functions.Function0;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes4.dex */
public final class mb {
    public static final long b(List<Long> list, int i) {
        Object c098200Yq;
        try {
            c098200Yq = Long.valueOf(((Number) C13LP.LJLLJ(list).get((int) Math.round((((double) i) / 100.0d) * ((double) (list.size() - 1))))).longValue());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = -1L;
        }
        return ((Number) c098200Yq).longValue();
    }

    public static final <R> R a(String str, boolean z, String str2, Function0<? extends R> function0) {
        q3.a.getClass();
        if (q3.a.d) {
            long jNanoTime = System.nanoTime();
            R rInvoke = function0.invoke();
            lb.j.getClass();
            lb.k.a(str, Long.valueOf(jNanoTime), z, str2);
            return rInvoke;
        }
        return function0.invoke();
    }

    public static /* synthetic */ Object a(String str, boolean z, String str2, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return a(str, z, str2, function0);
    }
}
