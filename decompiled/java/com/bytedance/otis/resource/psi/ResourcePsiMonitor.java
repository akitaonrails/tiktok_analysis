package com.bytedance.otis.resource.psi;

import X.C08NV;
import X.C1C7U;
import X.C2214701Bm8;
import X.C2273601Dyw;
import X.C2273611Dyx;
import X.C2273621Dyy;
import X.C2273631Dyz;
import X.C2273641Dz0;
import X.C2273651Dz1;
import X.C2273681Dz4;
import X.C786410Ut5;
import Y.ARunnableS135S0100000_35;
import Y.ARunnableS29S0210000_35;
import Y.ARunnableS46S0101000_35;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.otis.resource.psi.ResourceContentionSnapshot;
import com.bytedance.otis.resource.psi.ResourcePsiMonitor;
import com.bytedance.otis.resource.psi.proc.MainSchedNative;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.RandomAccessFile;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes36.dex */
public final class ResourcePsiMonitor {
    public static final ResourcePsiMonitor INSTANCE = new ResourcePsiMonitor();
    public C2273601Dyw backgroundSampler;
    public C2273641Dz0 globalSampler;
    public volatile ResourcePsiListener listener;
    public volatile ExecutorService nativePrepExecutor;
    public C2273621Dyy sceneRegistry;
    public final AtomicBoolean initialized = new AtomicBoolean(false);
    public final AtomicBoolean started = new AtomicBoolean(false);
    public ResourceContentionConfig config = ResourceContentionConfig.defaults();

    public ResourceContentionSnapshot getLastBackgroundSnapshot() {
        ResourceContentionSnapshot resourceContentionSnapshot = null;
        try {
            C2273601Dyw c2273601Dyw = this.backgroundSampler;
            if (c2273601Dyw == null) {
                return null;
            }
            resourceContentionSnapshot = c2273601Dyw.LJI;
            return resourceContentionSnapshot;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return resourceContentionSnapshot;
        }
    }

    public ResourceContentionSnapshot getLastGlobalSnapshot() {
        ResourceContentionSnapshot resourceContentionSnapshot = null;
        try {
            C2273641Dz0 c2273641Dz0 = this.globalSampler;
            if (c2273641Dz0 == null) {
                return null;
            }
            resourceContentionSnapshot = c2273641Dz0.LJIIL;
            return resourceContentionSnapshot;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return resourceContentionSnapshot;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setGcUnionEnabled$1() {
        C1C7U.LIZ("ResourcePsiMonitor@4622.setGcUnionEnabled$1L");
        applyGcUnionEnabled(true);
        C1C7U.LIZIZ("ResourcePsiMonitor@4622.setGcUnionEnabled$1L");
    }

    public void onBackground() {
        try {
            C2273641Dz0 c2273641Dz0 = this.globalSampler;
            if (c2273641Dz0 != null) {
                c2273641Dz0.LJIIJ = false;
                c2273641Dz0.LJIIJJI = true;
            }
            C2273601Dyw c2273601Dyw = this.backgroundSampler;
            if (c2273601Dyw != null) {
                BPEAHandler bPEAHandler = c2273601Dyw.LJ;
                int i = c2273601Dyw.LJIIJ;
                if (!c2273601Dyw.LJIIIZ || bPEAHandler == null) {
                    return;
                }
                C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS46S0101000_35(c2273601Dyw, i, 5));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onDispatchEnd() {
        try {
            if (this.started.get()) {
                C2273631Dyz.LJJIJL.LJ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onDispatchStart() {
        try {
            if (this.started.get()) {
                C2273631Dyz.LJJIJL.LJFF();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onForeground() {
        try {
            C2273641Dz0 c2273641Dz0 = this.globalSampler;
            if (c2273641Dz0 != null) {
                if (!c2273641Dz0.LJIIJ) {
                    c2273641Dz0.LJIIJJI = true;
                }
                c2273641Dz0.LJIIJ = true;
            }
            C2273601Dyw c2273601Dyw = this.backgroundSampler;
            if (c2273601Dyw != null) {
                BPEAHandler bPEAHandler = c2273601Dyw.LJ;
                int i = c2273601Dyw.LJIIJ;
                if (!c2273601Dyw.LJIIIZ || bPEAHandler == null) {
                    return;
                }
                C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS46S0101000_35(c2273601Dyw, i, 6));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void start() {
        C2273641Dz0 c2273641Dz0;
        if (this.initialized.get() && this.started.compareAndSet(false, true)) {
            try {
                if (this.config.globalEnabled && (c2273641Dz0 = this.globalSampler) != null) {
                    c2273641Dz0.LIZIZ();
                }
                C2273601Dyw c2273601Dyw = this.backgroundSampler;
                if (c2273601Dyw != null) {
                    c2273601Dyw.LIZIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public void stop() {
        if (this.started.compareAndSet(true, false)) {
            try {
                C2273641Dz0 c2273641Dz0 = this.globalSampler;
                if (c2273641Dz0 != null && c2273641Dz0.LJIIIIZZ) {
                    c2273641Dz0.LJIIIIZZ = false;
                    c2273641Dz0.LJIIIZ++;
                    BPEAHandler bPEAHandler = c2273641Dz0.LJ;
                    if (bPEAHandler != null) {
                        bPEAHandler.removeCallbacksAndMessages(null);
                    }
                    HandlerThread handlerThread = c2273641Dz0.LIZLLL;
                    if (handlerThread != null) {
                        handlerThread.quitSafely();
                    }
                    c2273641Dz0.LJ = null;
                    c2273641Dz0.LIZLLL = null;
                }
                C2273601Dyw c2273601Dyw = this.backgroundSampler;
                if (c2273601Dyw != null && c2273601Dyw.LJIIIZ) {
                    c2273601Dyw.LJIIIZ = false;
                    c2273601Dyw.LJIIJ++;
                    BPEAHandler bPEAHandler2 = c2273601Dyw.LJ;
                    if (bPEAHandler2 != null) {
                        bPEAHandler2.removeCallbacksAndMessages(null);
                    }
                    HandlerThread handlerThread2 = c2273601Dyw.LIZLLL;
                    if (handlerThread2 != null) {
                        handlerThread2.quitSafely();
                    }
                    c2273601Dyw.LJ = null;
                    c2273601Dyw.LIZLLL = null;
                    c2273601Dyw.LJIIJJI = null;
                    c2273601Dyw.LJFF = null;
                    c2273601Dyw.LJIIIIZZ = false;
                }
                C2273621Dyy c2273621Dyy = this.sceneRegistry;
                if (c2273621Dyy != null) {
                    c2273621Dyy.LIZLLL.clear();
                }
                C2273631Dyz c2273631Dyz = C2273631Dyz.LJJIJL;
                c2273631Dyz.LJII();
                C08NV c08nv = c2273631Dyz.LJJII.LIZIZ;
                synchronized (c08nv) {
                    RandomAccessFile randomAccessFile = c08nv.LIZIZ;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        c08nv.LIZIZ = null;
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }

    public static ResourcePsiMonitor getInstance() {
        return INSTANCE;
    }

    private void applyGcUnionEnabled(boolean z) {
        if (z) {
            MainSchedNative.LIZ(Process.myPid());
        }
        C2273631Dyz.LJJIJL.LJJIJIL = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatch(ResourceContentionSnapshot resourceContentionSnapshot) {
        ResourcePsiListener resourcePsiListener = this.listener;
        if (resourcePsiListener != null) {
            try {
                resourcePsiListener.onSnapshot(resourceContentionSnapshot);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static /* synthetic */ Thread lambda$runNativePrepAsync$2(Runnable runnable) {
        BPEAThread bPEAThread = new BPEAThread(runnable, "psi-native-prep");
        bPEAThread.setDaemon(true);
        return bPEAThread;
    }

    public static /* synthetic */ void lambda$runNativePrepAsync$3(Runnable runnable) {
        C1C7U.LIZ("ResourcePsiMonitor@4622.runNativePrepAsync$1L");
        try {
            runnable.run();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1C7U.LIZIZ("ResourcePsiMonitor@4622.runNativePrepAsync$1L");
    }

    private void runNativePrepAsync(Runnable runnable) {
        try {
            ExecutorService executorServiceI4 = this.nativePrepExecutor;
            if (executorServiceI4 == null) {
                synchronized (this) {
                    try {
                        executorServiceI4 = this.nativePrepExecutor;
                        if (executorServiceI4 == null) {
                            executorServiceI4 = C786410Ut5.i4(new ThreadFactory() { // from class: X.1Dsj
                                @Override // java.util.concurrent.ThreadFactory
                                public final Thread newThread(Runnable runnable2) {
                                    return ResourcePsiMonitor.lambda$runNativePrepAsync$2(runnable2);
                                }
                            });
                            this.nativePrepExecutor = executorServiceI4;
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            executorServiceI4.execute(new ARunnableS135S0100000_35(runnable, 28));
        } catch (Throwable th) {
        }
    }

    public void setGcUnionEnabled(boolean z) {
        if (!this.initialized.get()) {
            return;
        }
        try {
            if (z) {
                runNativePrepAsync(new ARunnableS135S0100000_35(this, 27));
            } else {
                C2273631Dyz.LJJIJL.LJJIJIL = false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void setListener(ResourcePsiListener resourcePsiListener) {
        this.listener = resourcePsiListener;
    }

    public void startScene(String str) {
        C2273621Dyy c2273621Dyy;
        try {
            if (this.started.get() && this.config.sceneEnabled && (c2273621Dyy = this.sceneRegistry) != null) {
                if (str == null) {
                    c2273621Dyy.getClass();
                    return;
                }
                Set<String> set = c2273621Dyy.LIZIZ.sceneAllowList;
                if (set != null && !set.contains(str)) {
                    return;
                }
                c2273621Dyy.LIZ();
                c2273621Dyy.LIZLLL.put(str, new C2273681Dz4(c2273621Dyy.LIZ.LJIIIIZZ(), SystemClock.uptimeMillis()));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public ResourceContentionSnapshot stopScene(String str) {
        C2273621Dyy c2273621Dyy;
        C2273681Dz4 c2273681Dz4Remove;
        try {
            if (!this.started.get() || !this.config.sceneEnabled || (c2273621Dyy = this.sceneRegistry) == null || str == null || (c2273681Dz4Remove = c2273621Dyy.LIZLLL.remove(str)) == null) {
                return null;
            }
            ResourceContentionSnapshot resourceContentionSnapshotLIZJ = C2273611Dyx.LIZJ(c2273681Dz4Remove.LIZ, c2273621Dyy.LIZ.LJIIIIZZ(), c2273621Dyy.LIZIZ, str, 0L, true);
            ResourcePsiListener resourcePsiListener = c2273621Dyy.LIZJ;
            if (resourcePsiListener != null) {
                try {
                    resourcePsiListener.onSnapshot(resourceContentionSnapshotLIZJ);
                    return resourceContentionSnapshotLIZJ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            return resourceContentionSnapshotLIZJ;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$init$0(C2273631Dyz c2273631Dyz, boolean z) {
        C1C7U.LIZ("ResourcePsiMonitor@4622.init$1L");
        boolean z2 = MainSchedNative.LIZ;
        c2273631Dyz.LJJIII = true;
        c2273631Dyz.LJJII.LIZLLL = true;
        applyGcUnionEnabled(z);
        C1C7U.LIZIZ("ResourcePsiMonitor@4622.init$1L");
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.1Dz5] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.1Dz5] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.1Dz5] */
    public void init(Context context, ResourceContentionConfig resourceContentionConfig) {
        C2273601Dyw c2273601Dyw;
        if (!this.initialized.compareAndSet(false, true)) {
            return;
        }
        if (resourceContentionConfig == null) {
            try {
                resourceContentionConfig = ResourceContentionConfig.defaults();
            } catch (Throwable th) {
                return;
            }
        }
        this.config = resourceContentionConfig;
        C2273631Dyz c2273631Dyz = C2273631Dyz.LJJIJL;
        long j = resourceContentionConfig.dispatchFilterThresholdMs * 1000000;
        c2273631Dyz.getClass();
        long jMax = Math.max(0L, j);
        if (c2273631Dyz.LJJI != jMax) {
            synchronized (c2273631Dyz.LIZ) {
                try {
                    c2273631Dyz.LJJI = jMax;
                    c2273631Dyz.LJIJJ = 0L;
                    c2273631Dyz.LJIJJLI = 0L;
                    c2273631Dyz.LJIL = 0L;
                    c2273631Dyz.LJJ = 0L;
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        ResourceContentionConfig resourceContentionConfig2 = this.config;
        if (resourceContentionConfig2.backgroundEnabled) {
            c2273601Dyw = new C2273601Dyw(resourceContentionConfig2, new ResourcePsiListener() { // from class: X.1Dz5
                @Override // com.bytedance.otis.resource.psi.ResourcePsiListener
                public final void onSnapshot(ResourceContentionSnapshot resourceContentionSnapshot) {
                    this.LIZ.dispatch(resourceContentionSnapshot);
                }
            });
        } else {
            c2273601Dyw = null;
        }
        this.backgroundSampler = c2273601Dyw;
        this.globalSampler = new C2273641Dz0(c2273631Dyz, this.config, new ResourcePsiListener() { // from class: X.1Dz5
            @Override // com.bytedance.otis.resource.psi.ResourcePsiListener
            public final void onSnapshot(ResourceContentionSnapshot resourceContentionSnapshot) {
                this.LIZ.dispatch(resourceContentionSnapshot);
            }
        });
        this.sceneRegistry = new C2273621Dyy(c2273631Dyz, this.config, new ResourcePsiListener() { // from class: X.1Dz5
            @Override // com.bytedance.otis.resource.psi.ResourcePsiListener
            public final void onSnapshot(ResourceContentionSnapshot resourceContentionSnapshot) {
                this.LIZ.dispatch(resourceContentionSnapshot);
            }
        });
        runNativePrepAsync(new ARunnableS29S0210000_35(this, c2273631Dyz, this.config.gcUnionEnabled, 1));
    }

    public void startScene(String str, C2214701Bm8 c2214701Bm8) {
        C2273621Dyy c2273621Dyy;
        try {
            if (this.started.get() && this.config.sceneEnabled && (c2273621Dyy = this.sceneRegistry) != null) {
                c2273621Dyy.LIZJ(str, c2214701Bm8);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public boolean addSyntheticDispatchSegment(C2214701Bm8 c2214701Bm8, C2214701Bm8 c2214701Bm82, boolean z) {
        if (!this.initialized.get()) {
            return false;
        }
        try {
            C2273651Dz1 c2273651Dz1LIZJ = C2273631Dyz.LJJIJL.LIZJ(c2214701Bm8, c2214701Bm82, z);
            if (c2273651Dz1LIZJ == null) {
                return false;
            }
            C2273641Dz0 c2273641Dz0 = this.globalSampler;
            if (c2273641Dz0 != null) {
                synchronized (c2273641Dz0.LJFF) {
                    try {
                        C2273611Dyx c2273611Dyx = c2273641Dz0.LJI;
                        if (c2273611Dyx != null) {
                            c2273641Dz0.LJI = c2273611Dyx.LIZLLL(c2273651Dz1LIZJ);
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            C2273621Dyy c2273621Dyy = this.sceneRegistry;
            if (c2273621Dyy != null) {
                c2273621Dyy.LIZIZ(c2273651Dz1LIZJ);
                return true;
            }
            return true;
        } catch (Throwable th) {
            return false;
        }
    }
}
