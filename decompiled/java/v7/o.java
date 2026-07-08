package v7;

import X.C15O7;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes32.dex */
public final class o<TResult> {
    public final C15O7<TResult> LIZ = new C15O7<>();

    public final void LIZ() {
        if (!this.LIZ.LJIJI()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public final void LIZIZ(Exception exc) {
        if (LIZLLL(exc)) {
        } else {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public final void LIZJ(TResult tresult) {
        if (LJ(tresult)) {
        } else {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    public final boolean LIZLLL(Exception exc) {
        C15O7<TResult> c15o7 = this.LIZ;
        synchronized (c15o7.LIZ) {
            try {
                if (c15o7.LIZIZ) {
                    return false;
                }
                c15o7.LIZIZ = true;
                c15o7.LJ = exc;
                c15o7.LIZ.notifyAll();
                c15o7.LJIJ();
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LJ(TResult tresult) {
        return this.LIZ.LJIJJ(tresult);
    }
}
