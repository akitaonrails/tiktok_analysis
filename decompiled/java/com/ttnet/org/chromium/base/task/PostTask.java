package com.ttnet.org.chromium.base.task;

import X.C08UR;
import X.C08US;
import X.C20532082o;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public class PostTask {
    public static final Object LIZ = new Object();
    public static List<C20532082o> LIZIZ = new ArrayList();
    public static final C08UR LIZJ = new C08UR(C08UR.LL, C08UR.LLILLJJLI, TimeUnit.SECONDS, C08UR.LLILZ, C08UR.LLILLL);
    public static final AtomicReferenceArray<Object> LIZLLL;

    static {
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(5);
        atomicReferenceArray.set(0, new C08US());
        LIZLLL = atomicReferenceArray;
    }

    public static void onNativeSchedulerReady() {
        List<C20532082o> list;
        synchronized (LIZ) {
            try {
                list = LIZIZ;
                LIZIZ = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator it2 = ((ArrayList) list).iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw null;
        }
    }

    public static void onNativeSchedulerShutdownForTesting() {
        synchronized (LIZ) {
            try {
                LIZIZ = new ArrayList();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LIZLLL.set(0, new C08US());
        int i = 1;
        while (true) {
            AtomicReferenceArray<Object> atomicReferenceArray = LIZLLL;
            if (i >= atomicReferenceArray.length()) {
                return;
            }
            atomicReferenceArray.set(i, null);
            i++;
        }
    }
}
