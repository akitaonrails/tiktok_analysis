package com.bytedance.memrelief.gc;

import X.C2370009Qk;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class WeakRefMonitor {
    public static WeakReference<C2370009Qk> sGcWatcher = new WeakReference<>(new C2370009Qk());
    public static final List<Runnable> sGcWatchers = new CopyOnWriteArrayList();

    public static void addGcWatcher(Runnable runnable) {
        sGcWatchers.add(runnable);
    }

    public static void removeGcWatcher(Runnable runnable) {
        sGcWatchers.remove(runnable);
    }
}
