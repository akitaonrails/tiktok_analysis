package ttpobfuscated;

import X.C098200Yq;
import X.C13LE;
import X.C189200o6;
import X.InterfaceC1364105Vn;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ttp.orbu.sdk.TTPOrbuSdk;
import ttpobfuscated.c;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes24.dex */
public final class d implements c {
    public final TTPOrbuSdk.OrbuState a;
    public final String b = C13LE.LIZ(d.class).LJI();

    /* JADX INFO: loaded from: classes14.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TTPOrbuSdk.OrbuState.values().length];
            try {
                iArr[TTPOrbuSdk.OrbuState.PRE_ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[TTPOrbuSdk.OrbuState.ENABLE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                iArr[TTPOrbuSdk.OrbuState.DISABLE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            a = iArr;
        }
    }

    public d(TTPOrbuSdk.OrbuState orbuState) {
        this.a = orbuState;
    }

    @Override // ttpobfuscated.c
    public Object a(InterfaceC1364105Vn<? super la> interfaceC1364105Vn) throws c.a.C0045a {
        Object c098200Yq;
        try {
            int i = a.a[this.a.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new Throwable();
                    }
                    c098200Yq = la.InActive;
                } else {
                    c098200Yq = la.Active;
                }
            } else {
                c098200Yq = la.PreActive;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return c098200Yq;
        }
        q3.a aVar = q3.a;
        String str = this.b;
        aVar.getClass();
        q3.a.c.b("Error while getting the Activation state", str, thM5exceptionOrNullimpl);
        throw new c.a.C0045a();
    }
}
