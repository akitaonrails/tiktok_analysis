package com.lynx.tasm.behavior.ui.krypton;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.base.TraceEvent;
import j27.s;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import t27.a;

/* JADX INFO: loaded from: classes21.dex */
public class CanvasRuntimeMediator {
    public static Class<?> LJIIIIZZ;
    public static Constructor<?> LJIIIZ;
    public long LIZ;
    public a LIZIZ;
    public final WeakReference<s> LIZLLL;
    public final Map<Class<?>, Object> LIZJ = new ConcurrentHashMap();
    public volatile boolean LJ = false;
    public final ReadWriteLock LJFF = new ReentrantReadWriteLock(true);
    public final ReadWriteLock LJI = new ReentrantReadWriteLock(true);
    public volatile boolean LJII = false;

    private native long nativeCreate();

    private native void nativeNotifyCanvasInitializeSuccess(long j);

    private native void nativeReleaseRuntimeMediatorWeakPtr(long j);

    private native long nativeResetToWeakPtr(long j);

    public final synchronized void LIZLLL() {
        TraceEvent.LIZIZ("CanvasRuntimeMediator.setupCanvas");
        if (this.LJII) {
            return;
        }
        if (this.LIZIZ == null) {
            LynxLog.i("KryptonCanvasRuntimeMediator", "[Krypton] Create and init canvas manager");
            LJ();
            if (LIZIZ() && !this.LJ) {
                LynxLog.i("KryptonCanvasRuntimeMediator", "[Krypton] TriggerCanvasEnvReady to execute cached tasks");
                ((ReentrantReadWriteLock) this.LJI).readLock().lock();
                long j = this.LIZ;
                if (j != 0) {
                    nativeNotifyCanvasInitializeSuccess(j);
                }
                ((ReentrantReadWriteLock) this.LJI).readLock().unlock();
            }
        }
        this.LJII = true;
        TraceEvent.LJII("CanvasRuntimeMediator.setupCanvas");
    }

    private void onAppEnterBackground() {
        a aVar = this.LIZIZ;
        if (aVar != null) {
            aVar.onAppEnterBackground();
        }
    }

    private void onAppEnterForeground() {
        a aVar = this.LIZIZ;
        if (aVar != null) {
            aVar.onAppEnterForeground();
        }
    }

    private void onRuntimeDetach() {
        a aVar = this.LIZIZ;
        if (aVar != null) {
            aVar.onRuntimeDetach();
        }
    }

    private void onRuntimeMediatorDestroy() {
        a aVar = this.LIZIZ;
        if (aVar != null) {
            aVar.onRuntimeMediatorDestroy();
            ((ReentrantReadWriteLock) this.LJI).writeLock().lock();
            nativeReleaseRuntimeMediatorWeakPtr(this.LIZ);
            this.LIZ = 0L;
            ((ReentrantReadWriteLock) this.LJI).writeLock().unlock();
        }
    }

    private void setupCanvasFromJS() {
        LynxLog.i("KryptonCanvasRuntimeMediator", "[Krypton] setupCanvasFromJS");
        LIZLLL();
    }

    public final boolean LIZIZ() {
        LynxLog.i("KryptonCanvasRuntimeMediator", "[Krypton] Init CanvasManager, load so and create KryptonApp");
        if (this.LIZIZ == null) {
            return false;
        }
        if (!this.LIZIZ.init(this.LIZLLL.get())) {
            return false;
        }
        ((ReentrantReadWriteLock) this.LJFF).readLock().lock();
        ((ReentrantReadWriteLock) this.LJFF).readLock().unlock();
        for (Map.Entry entry : ((ConcurrentHashMap) this.LIZJ).entrySet()) {
            this.LIZIZ.registerService((Class) entry.getKey(), entry.getValue());
        }
        return true;
    }

    public final void LJ() {
        try {
            if (LJIIIIZZ == null) {
                LJIIIIZZ = Class.forName("com.lynx.canvas.CanvasManager");
            }
            if (LJIIIZ == null) {
                LJIIIZ = LJIIIIZZ.getConstructor(new Class[0]);
            }
            Object objNewInstance = LJIIIZ.newInstance(new Object[0]);
            if (!(objNewInstance instanceof a)) {
                LynxLog.e("KryptonCanvasRuntimeMediator", "[Krypton]  create canvasManager error");
            } else {
                LynxLog.e("KryptonCanvasRuntimeMediator", "[Krypton]  create canvasManager success.");
                this.LIZIZ = (a) objNewInstance;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Krypton]  create canvasManager error");
            sbLIZ.append(e.toString());
            LynxLog.e("KryptonCanvasRuntimeMediator", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final long LIZ() {
        return nativeCreate();
    }

    public CanvasRuntimeMediator(s sVar) {
        this.LIZLLL = new WeakReference<>(sVar);
    }

    private void onRuntimeAttach(long j) {
        a aVar = this.LIZIZ;
        if (aVar != null) {
            aVar.onNapiEnvReady(j);
        }
    }

    private void onRuntimeCreate(long j) {
        a aVar = this.LIZIZ;
        if (aVar != null) {
            aVar.onRuntimeMediatorReady(j);
        }
    }

    private void onRuntimeInit(long j) {
        a aVar = this.LIZIZ;
        if (aVar != null) {
            aVar.onRuntimeInit(j);
        }
        this.LJ = true;
    }

    private void setTaskRunner(long j) {
        a aVar = this.LIZIZ;
        if (aVar != null) {
            aVar.setTaskRunner(j);
        }
    }

    public final void LIZJ(long j) {
        this.LIZ = nativeResetToWeakPtr(j);
    }
}
