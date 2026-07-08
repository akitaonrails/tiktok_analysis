package com.ttnet.org.chromium.base;

import X.C1499130p79;
import X.C1499170p7D;
import X.C786410Ut5;
import X.InterfaceC789910Uyj;
import android.app.Activity;
import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttnet.org.chromium.base.ApplicationStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class ApplicationStatus {
    public static final Map<Activity, Object> LIZ = Collections.synchronizedMap(new HashMap());
    public static C1499170p7D LIZIZ;
    public static C1499130p79<InterfaceC789910Uyj> LIZJ;

    public static void LIZ() {
        synchronized (LIZ) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static int getStateForApplication() {
        synchronized (LIZ) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return 0;
    }

    public static void registerThreadSafeNativeApplicationStateListener() {
        Runnable runnable = new Runnable() { // from class: X.0p7A
            /* JADX WARN: Type inference failed for: r0v2, types: [X.0Uyj, X.0p7D] */
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ApplicationStatus@a517.registerThreadSafeNativeApplicationStateListener$1");
                try {
                    if (ApplicationStatus.LIZIZ == null) {
                        ?? r0 = new InterfaceC789910Uyj() { // from class: X.0p7D
                        };
                        ApplicationStatus.LIZIZ = r0;
                        ApplicationStatus.LIZIZ(r0);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ApplicationStatus@a517.registerThreadSafeNativeApplicationStateListener$1");
            }
        };
        if (ThreadUtils.LIZ().getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII(ThreadUtils.LIZ(), runnable);
        }
    }

    public static boolean hasVisibleActivities() {
        int stateForApplication = getStateForApplication();
        return stateForApplication == 1 || stateForApplication == 2;
    }

    public static void LIZIZ(InterfaceC789910Uyj interfaceC789910Uyj) {
        if (LIZJ == null) {
            LIZJ = new C1499130p79<>();
        }
        C1499130p79<InterfaceC789910Uyj> c1499130p79 = LIZJ;
        if (c1499130p79.LLILZIL) {
            c1499130p79.LLILLJJLI.getClass();
        }
        if (interfaceC789910Uyj != null && !((ArrayList) c1499130p79.LL).contains(interfaceC789910Uyj)) {
            ((ArrayList) c1499130p79.LL).add(interfaceC789910Uyj);
        }
    }
}
