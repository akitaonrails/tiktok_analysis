package com.lynx.tasm.core;

import X.C2188811AlT;
import X.InterfaceC1292320jja;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.jsbridge.RuntimeLifecycleListenerDelegate;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.LynxBackgroundRuntime;
import com.lynx.tasm.LynxError;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes21.dex */
public class JSProxy {
    public long LIZ;
    public final WeakReference<s> LIZIZ;
    public final String LIZJ;
    public final ReadWriteLock LIZLLL;
    public long LJ;
    public final HashMap<Long, Object> LJFF;
    public boolean LJI;

    private native void nativeAddLifecycleListener(long j, RuntimeLifecycleListenerDelegate runtimeLifecycleListenerDelegate);

    private native void nativeCallIntersectionObserver(long j, int i, int i2, long j2);

    private native void nativeCallJSApiCallbackWithValue(long j, int i, long j2);

    private native void nativeCallJSFunction(long j, String str, String str2, long j2);

    private native long nativeCreate(long j, String str);

    private native long nativeCreateWithRuntimeActor(long j, String str);

    private native void nativeDestroy(long j, String str);

    public static native void nativeEvaluateScript(long j, String str, byte[] bArr, int i);

    public static native void nativeRejectDynamicComponentLoad(long j, String str, int i, int i2, String str2);

    public static native void nativeRunOnJSThread(long j, Runnable runnable);

    private void setRuntimeId(long j) {
    }

    public final void LJFF() {
        this.LIZLLL.writeLock().lock();
        long j = this.LIZ;
        if (j != 0) {
            nativeDestroy(j, this.LIZJ);
            this.LIZ = 0L;
        }
        this.LJFF.clear();
        this.LIZLLL.writeLock().unlock();
    }

    private Object getArgs(long j) {
        ((ReentrantReadWriteLock) this.LIZLLL).writeLock().lock();
        try {
            Object objRemove = this.LJFF.remove(Long.valueOf(j));
            ((ReentrantReadWriteLock) this.LIZLLL).writeLock().unlock();
            return objRemove;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantReadWriteLock) this.LIZLLL).writeLock().unlock();
            throw th;
        }
    }

    public final void LIZ(InterfaceC1292320jja interfaceC1292320jja) {
        if (interfaceC1292320jja == null) {
            LynxLog.w("JSProxy", "add a null lifecycle listener.");
            return;
        }
        RuntimeLifecycleListenerDelegate runtimeLifecycleListenerDelegate = new RuntimeLifecycleListenerDelegate(this.LIZIZ, interfaceC1292320jja);
        ((ReentrantReadWriteLock) this.LIZLLL).readLock().lock();
        long j = this.LIZ;
        if (j != 0) {
            nativeAddLifecycleListener(j, runtimeLifecycleListenerDelegate);
        }
        ((ReentrantReadWriteLock) this.LIZLLL).readLock().unlock();
    }

    public final long LJI(Object obj) {
        HashMap<Long, Object> map = this.LJFF;
        long j = this.LJ + 1;
        this.LJ = j;
        map.put(Long.valueOf(j), obj);
        return this.LJ;
    }

    public final void LJII(Runnable runnable) {
        ((ReentrantReadWriteLock) this.LIZLLL).readLock().lock();
        long j = this.LIZ;
        if (j != 0) {
            nativeRunOnJSThread(j, runnable);
        }
        ((ReentrantReadWriteLock) this.LIZLLL).readLock().unlock();
    }

    public JSProxy(LynxBackgroundRuntime lynxBackgroundRuntime, String str) {
        this.LIZLLL = new ReentrantReadWriteLock();
        this.LJ = 0L;
        this.LJFF = new HashMap<>();
        this.LJI = false;
        this.LIZIZ = new WeakReference<>(null);
        this.LIZJ = str;
        this.LIZ = nativeCreateWithRuntimeActor(lynxBackgroundRuntime.LJFF, str);
    }

    public final void LIZLLL(int i, JavaOnlyMap javaOnlyMap) {
        ((ReentrantReadWriteLock) this.LIZLLL).writeLock().lock();
        long j = this.LIZ;
        if (j != 0) {
            nativeCallJSApiCallbackWithValue(j, i, LJI(javaOnlyMap));
        }
        int size = this.LJFF.size();
        ((ReentrantReadWriteLock) this.LIZLLL).writeLock().unlock();
        LJ(size, "callJSApiCallbackWithValue");
    }

    public final void LJ(int i, String str) {
        WeakReference<s> weakReference;
        if (!this.LJI && i > 200 && (weakReference = this.LIZIZ) != null) {
            this.LJI = true;
            s sVar = weakReference.get();
            if (sVar != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Calling [");
                sbLIZ.append(str);
                sbLIZ.append("] too frequently.This may cause OOM issues.");
                sVar.LJIILLIIL(new LynxError(20201, C2188811AlT.LIZIZ(sbLIZ)));
            }
        }
    }

    public JSProxy(long j, WeakReference<s> weakReference, String str) {
        this.LIZLLL = new ReentrantReadWriteLock();
        this.LJ = 0L;
        this.LJFF = new HashMap<>();
        this.LJI = false;
        this.LIZIZ = weakReference;
        this.LIZJ = str;
        this.LIZ = nativeCreate(j, str);
    }

    public final void LIZIZ(String str, String str2, JavaOnlyArray javaOnlyArray) {
        ((ReentrantReadWriteLock) this.LIZLLL).writeLock().lock();
        long j = this.LIZ;
        if (j != 0) {
            nativeCallJSFunction(j, str, str2, LJI(javaOnlyArray));
        }
        int size = this.LJFF.size();
        ((ReentrantReadWriteLock) this.LIZLLL).writeLock().unlock();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("callFunction:");
        sbLIZ.append(str);
        sbLIZ.append(e3.d);
        sbLIZ.append(str2);
        LJ(size, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZJ(int i, int i2, JavaOnlyMap javaOnlyMap) {
        ((ReentrantReadWriteLock) this.LIZLLL).writeLock().lock();
        long j = this.LIZ;
        if (j != 0) {
            nativeCallIntersectionObserver(j, i, i2, LJI(javaOnlyMap));
        }
        int size = this.LJFF.size();
        ((ReentrantReadWriteLock) this.LIZLLL).writeLock().unlock();
        LJ(size, "callIntersectionObserver");
    }
}
