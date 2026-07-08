package com.bytedance.memrelief.watcher;

import X.C1C7U;
import X.C20100213km;
import X.C822650WOx;
import X.ThreadFactoryC20100313kn;
import Y.ARunnableS130S0100000_30;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes31.dex */
public class GcWatcherQueue {
    public static Reference<Object> refGcObj;
    public static ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
    public static Runnable sGcWatchers;
    public static long sLastGcTime;
    public static boolean sUsingWeak;

    public static void initReference() {
        if (sUsingWeak) {
            refGcObj = new WeakReference(new Object(), referenceQueue);
        } else {
            refGcObj = new SoftReference(new Object(), referenceQueue);
        }
    }

    public static /* synthetic */ void lambda$init$0(Runnable runnable) {
        C1C7U.LIZ("GcWatcherQueue@5b5c.init$1L");
        while (true) {
            try {
                referenceQueue.remove();
                runnable.run();
                initReference();
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                C1C7U.LIZIZ("GcWatcherQueue@5b5c.init$1L");
                return;
            }
        }
    }

    public static void init(boolean z, Runnable runnable) {
        C822650WOx c822650WOx;
        sUsingWeak = z;
        sGcWatchers = runnable;
        initReference();
        synchronized (C20100213km.class) {
            if (C20100213km.LIZ == null) {
                C20100213km.LIZ = new C822650WOx(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC20100313kn("MemRelief_GC"));
            }
            c822650WOx = C20100213km.LIZ;
        }
        c822650WOx.execute(new ARunnableS130S0100000_30(runnable, 12));
    }
}
