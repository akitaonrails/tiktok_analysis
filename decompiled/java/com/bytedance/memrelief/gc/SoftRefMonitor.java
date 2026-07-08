package com.bytedance.memrelief.gc;

import X.C1286520jaE;
import java.lang.ref.SoftReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class SoftRefMonitor {
    public static SoftReference<C1286520jaE> sGcWatcher = new SoftReference<>(new C1286520jaE());
    public static final List<Runnable> sGcWatchers = new CopyOnWriteArrayList();

    public static void addGcWatcher(Runnable runnable) {
        sGcWatchers.add(runnable);
    }

    public static void removeGcWatcher(Runnable runnable) {
        sGcWatchers.remove(runnable);
    }
}
