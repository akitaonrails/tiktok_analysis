package com.bytedance.keva;

import X.C0W9U;
import X.C1C7U;
import X.C2179971ATj;
import X.C786410Ut5;
import X.InterfaceC21351618h8;
import X.InterfaceC21351718h9;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes33.dex */
public final class KevaCacheManager {
    public static boolean IS_LOW_MEMORY;
    public static KevaCacheManager kevaCacheManagerInstance;
    public Thread delayTimeClearCacheThread;
    public Long lastClearTime;
    public final int mCacheClearExpirationTime;
    public InterfaceC21351718h9 mICleanCacheMessage;
    public final int mIntervalMillisTime;
    public final boolean mIsNeedReleaseNativeMemory;
    public final boolean mIsOpenReleaseJavaMemory;
    public static final AtomicBoolean mStartClear = new AtomicBoolean(false);
    public static final ConcurrentLinkedQueue<InterfaceC21351618h8> kevaImplListener = new ConcurrentLinkedQueue<>();

    public void setICleanCacheMessage(InterfaceC21351718h9 interfaceC21351718h9) {
    }

    public void startDelayClearCache() {
        if (this.mIsOpenReleaseJavaMemory && this.delayTimeClearCacheThread == null) {
            this.lastClearTime = Long.valueOf(System.currentTimeMillis());
            BPEAThread bPEAThread = new BPEAThread() { // from class: com.bytedance.keva.KevaCacheManager.1
                private void bpea_origin_run() {
                    com_bytedance_keva_KevaCacheManager$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
                public void run() {
                    C1C7U.LIZ("KevaCacheManager@cc3f.startDelayClearCache$1");
                    boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                    try {
                        com_bytedance_keva_KevaCacheManager$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        if (zLJ) {
                            C0W9U.LJFF();
                        }
                        C1C7U.LIZIZ("KevaCacheManager@cc3f.startDelayClearCache$1");
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (zLJ) {
                            C0W9U.LJFF();
                        }
                        throw th;
                    }
                }

                public void com_bytedance_keva_KevaCacheManager$1__run$___twin___() {
                    while (true) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        AtomicBoolean atomicBoolean = KevaCacheManager.mStartClear;
                        if (atomicBoolean.compareAndSet(false, true)) {
                            long jLongValue = jCurrentTimeMillis - KevaCacheManager.this.lastClearTime.longValue();
                            KevaCacheManager kevaCacheManager = KevaCacheManager.this;
                            if (jLongValue > kevaCacheManager.mIntervalMillisTime) {
                                KevaCacheManager.IS_LOW_MEMORY = false;
                                kevaCacheManager.cleanCache(kevaCacheManager.mCacheClearExpirationTime, kevaCacheManager.mIsNeedReleaseNativeMemory);
                                atomicBoolean.set(false);
                                return;
                            }
                            atomicBoolean.set(false);
                        }
                        try {
                            Thread.sleep(KevaCacheManager.this.mIntervalMillisTime);
                        } catch (InterruptedException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }

                public static void com_bytedance_keva_KevaCacheManager$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    try {
                        anonymousClass1.com_bytedance_keva_KevaCacheManager$1__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            };
            this.delayTimeClearCacheThread = bPEAThread;
            bPEAThread.start();
        }
    }

    public static KevaCacheManager getInstance() {
        return kevaCacheManagerInstance;
    }

    private void InitLowMemoryListener(Context context) {
        if (!this.mIsOpenReleaseJavaMemory) {
            return;
        }
        if (context instanceof Activity) {
            context = C786410Ut5.N3(context);
        } else if (!(context instanceof Application)) {
            return;
        }
        C786410Ut5.u4((Application) context, new ComponentCallbacks2() { // from class: com.bytedance.keva.KevaCacheManager.2
            public final Runnable realTimeClearCacheThread = new Runnable() { // from class: com.bytedance.keva.KevaCacheManager.2.1
                public void com_bytedance_keva_KevaCacheManager$2$1__run$___twin___() {
                    KevaCacheManager.IS_LOW_MEMORY = true;
                    KevaCacheManager kevaCacheManager = KevaCacheManager.getInstance();
                    if (kevaCacheManager != null) {
                        kevaCacheManager.cleanCache(10000, false);
                    }
                    KevaCacheManager.mStartClear.set(false);
                }

                @Override // java.lang.Runnable
                public void run() {
                    C1C7U.LIZ("KevaCacheManager@cc3f.InitLowMemoryListener$1$<field>$1");
                    com_bytedance_keva_KevaCacheManager$2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("KevaCacheManager@cc3f.InitLowMemoryListener$1$<field>$1");
                }

                public static void com_bytedance_keva_KevaCacheManager$2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    try {
                        anonymousClass1.com_bytedance_keva_KevaCacheManager$2$1__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            };

            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration configuration) {
            }

            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int i) {
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
                if (KevaCacheManager.mStartClear.compareAndSet(false, true)) {
                    new BPEAThread(this.realTimeClearCacheThread).start();
                }
            }
        });
    }

    public static void registerClearListener(InterfaceC21351618h8 interfaceC21351618h8) {
        kevaImplListener.add(interfaceC21351618h8);
    }

    public void cleanCache(int i, boolean z) {
        for (InterfaceC21351618h8 interfaceC21351618h8 : kevaImplListener) {
            interfaceC21351618h8.getRepoName();
            interfaceC21351618h8.clearCache(i, z);
        }
    }

    public KevaCacheManager(boolean z, int i, int i2, boolean z2) {
        this.mIntervalMillisTime = i;
        this.mCacheClearExpirationTime = i2;
        this.mIsNeedReleaseNativeMemory = z2;
        this.mIsOpenReleaseJavaMemory = z;
    }

    public KevaCacheManager(Context context, boolean z, int i, int i2, boolean z2) {
        this(z, i, i2, z2);
        InitLowMemoryListener(context);
        kevaCacheManagerInstance = this;
    }

    public static KevaCacheManager init(Context context, boolean z, int i, int i2, boolean z2) {
        KevaCacheManager kevaCacheManager = kevaCacheManagerInstance;
        if (kevaCacheManager != null) {
            return kevaCacheManager;
        }
        return new KevaCacheManager(context, z, i, i2, z2);
    }
}
