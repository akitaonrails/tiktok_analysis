package ttpobfuscated;

import X.C098200Yq;
import X.C189200o6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes14.dex */
public final class m3 {
    public static final <R> R a(Function0<? extends R> function0, R r) {
        R rInvoke;
        try {
            rInvoke = function0.invoke();
            C189200o6.m2constructorimpl(rInvoke);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            rInvoke = (R) new C098200Yq(th);
            C189200o6.m2constructorimpl(rInvoke);
        }
        return C189200o6.m5exceptionOrNullimpl(rInvoke) == null ? rInvoke : r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R a(Function1<? super T, ? extends R> function1, T t, R r) {
        R rInvoke;
        try {
            rInvoke = function1.invoke(t);
            C189200o6.m2constructorimpl(rInvoke);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            rInvoke = (R) new C098200Yq(th);
            C189200o6.m2constructorimpl(rInvoke);
        }
        return C189200o6.m5exceptionOrNullimpl(rInvoke) == null ? rInvoke : r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R, S> R a(Function2<? super T, ? super S, ? extends R> function2, T t, S s, R r) {
        R rInvoke;
        try {
            rInvoke = function2.invoke(t, s);
            C189200o6.m2constructorimpl(rInvoke);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            rInvoke = (R) new C098200Yq(th);
            C189200o6.m2constructorimpl(rInvoke);
        }
        return C189200o6.m5exceptionOrNullimpl(rInvoke) == null ? rInvoke : r;
    }

    public static /* synthetic */ Object a(Function1 function1, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = null;
        }
        return a(function1, obj, obj2);
    }

    public static /* synthetic */ Object a(Function2 function2, Object obj, Object obj2, Object obj3, int i, Object obj4) {
        if ((i & 8) != 0) {
            obj3 = null;
        }
        return a(function2, obj, obj2, obj3);
    }
}
