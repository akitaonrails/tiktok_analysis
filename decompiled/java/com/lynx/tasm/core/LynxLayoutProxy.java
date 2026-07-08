package com.lynx.tasm.core;

import com.lynx.base.log.LynxLog;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes21.dex */
public class LynxLayoutProxy {
    public long LIZ;
    public final ReadWriteLock LIZIZ = new ReentrantReadWriteLock();

    private native long nativeCreate(long j);

    private native void nativeRelease(long j);

    private native void nativeRunOnLayoutThread(long j, Runnable runnable);

    public final void LIZ() {
        ((ReentrantReadWriteLock) this.LIZIZ).writeLock().lock();
        if (this.LIZ != 0) {
            LynxLog.i("LynxLayoutProxy", "LynxLayoutProxy will be destroyed");
            nativeRelease(this.LIZ);
            this.LIZ = 0L;
        }
        ((ReentrantReadWriteLock) this.LIZIZ).writeLock().unlock();
    }

    public LynxLayoutProxy(long j) {
        this.LIZ = nativeCreate(j);
        LynxLog.i("LynxLayoutProxy", "LynxLayoutProxy is created");
    }

    public final void LIZIZ(Runnable runnable) {
        ((ReentrantReadWriteLock) this.LIZIZ).readLock().lock();
        if (this.LIZ != 0) {
            LynxLog.i("LynxLayoutProxy", "runOnLayoutThread is invoked");
            nativeRunOnLayoutThread(this.LIZ, runnable);
        }
        ((ReentrantReadWriteLock) this.LIZIZ).readLock().unlock();
    }
}
