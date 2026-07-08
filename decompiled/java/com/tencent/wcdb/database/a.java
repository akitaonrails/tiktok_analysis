package com.tencent.wcdb.database;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;

/* JADX INFO: loaded from: classes15.dex */
public abstract class a implements Closeable {
    public int mReferenceCount = 1;

    public final void LIZ() {
        synchronized (this) {
            try {
                int i = this.mReferenceCount;
                if (i <= 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("attempt to re-open an already-closed object: ");
                    sbLIZ.append(this);
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
                this.mReferenceCount = i + 1;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public abstract void LIZIZ();

    public final void LIZLLL() {
        boolean z;
        synchronized (this) {
            try {
                int i = this.mReferenceCount - 1;
                this.mReferenceCount = i;
                z = i == 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            LIZIZ();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        LIZLLL();
    }
}
