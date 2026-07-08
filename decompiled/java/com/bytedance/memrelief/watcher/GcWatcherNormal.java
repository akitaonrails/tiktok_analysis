package com.bytedance.memrelief.watcher;

import X.C2188701AlI;
import com.bytedance.memrelief.watcher.GcWatcherNormal;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes34.dex */
public class GcWatcherNormal {
    public static Reference<C2188701AlI> sGcWatcher;
    public static Runnable sGcWatchers;
    public static long sLastGcTime;
    public static boolean sUsingWeak;

    public static void initReference() {
        if (sUsingWeak) {
            sGcWatcher = new WeakReference(new Object() { // from class: X.1AlI
                public final void finalize() {
                    Runnable runnable = GcWatcherNormal.sGcWatchers;
                    if (runnable != null) {
                        runnable.run();
                    }
                    GcWatcherNormal.initReference();
                }
            });
        } else {
            sGcWatcher = new SoftReference(new Object() { // from class: X.1AlI
                public final void finalize() {
                    Runnable runnable = GcWatcherNormal.sGcWatchers;
                    if (runnable != null) {
                        runnable.run();
                    }
                    GcWatcherNormal.initReference();
                }
            });
        }
    }

    public static void init(boolean z, Runnable runnable) {
        sUsingWeak = z;
        sGcWatchers = runnable;
        initReference();
    }
}
