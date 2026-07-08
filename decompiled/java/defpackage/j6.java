package defpackage;

import X.C2179971ATj;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j6 implements Runnable, Comparable<j6> {
    public final int LL;
    public final long LLILLJJLI;
    public final long LLILLL;
    public final Runnable LLILZ;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.LLILZ.run();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(j6 j6Var) {
        j6 j6Var2 = j6Var;
        int iLJI = Intrinsics.LJI(this.LL, j6Var2.LL);
        if (iLJI == 0) {
            int iLJII = Intrinsics.LJII(this.LLILLJJLI, j6Var2.LLILLJJLI);
            if (iLJII == 0) {
                return Intrinsics.LJII(this.LLILLL, j6Var2.LLILLL);
            }
            return iLJII;
        }
        return iLJI;
    }

    public j6(int i, long j, long j2, Runnable runnable) {
        this.LL = i;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = runnable;
    }
}
