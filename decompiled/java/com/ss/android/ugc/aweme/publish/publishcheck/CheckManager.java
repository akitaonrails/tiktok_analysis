package com.ss.android.ugc.aweme.publish.publishcheck;

import X.C01GW;
import X.C201955140j;
import X.C2188811AlT;
import X.C452501pT;
import X.C857230Xk1;
import X.EnumC864300XvQ;
import X.InterfaceC857250Xk3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class CheckManager {
    public static final CheckManager LIZ = new CheckManager();
    public static final HashMap<LifecycleOwner, C857230Xk1> LIZIZ = new HashMap<>();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1758));

    public final void LIZLLL(C857230Xk1 c857230Xk1) {
        synchronized (this) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("releaseChecker, name = ");
                sbLIZ.append(c857230Xk1.LIZ);
                C201955140j.LIZIZ("CheckManager", C2188811AlT.LIZIZ(sbLIZ));
                Iterator<T> it2 = LIZIZ.entrySet().iterator();
                Object key = null;
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (Intrinsics.LJFF(entry.getValue(), c857230Xk1)) {
                        key = entry.getKey();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static C857230Xk1 LIZIZ(LifecycleOwner lifecycleOwner, String str) {
        return LIZ.LIZ(lifecycleOwner, str, ((Number) LIZJ.getValue()).intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0035 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x0012, B:8:0x0014, B:10:0x0018, B:12:0x0020, B:13:0x0022, B:15:0x0026, B:17:0x002e, B:21:0x003e, B:23:0x0044, B:26:0x0048, B:27:0x0052, B:19:0x0035), top: B:32:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C857230Xk1 LIZ(androidx.lifecycle.LifecycleOwner r5, java.lang.String r6, int r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.HashMap<androidx.lifecycle.LifecycleOwner, X.0Xk1> r3 = com.ss.android.ugc.aweme.publish.publishcheck.CheckManager.LIZIZ     // Catch: java.lang.Throwable -> L53
            java.lang.Object r0 = r3.get(r5)     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L35
            java.lang.Object r0 = r3.get(r5)     // Catch: java.lang.Throwable -> L53
            X.0Xk1 r0 = (X.C857230Xk1) r0     // Catch: java.lang.Throwable -> L53
            r2 = 0
            if (r0 == 0) goto L3c
            X.0XvQ r1 = r0.LJIIJJI     // Catch: java.lang.Throwable -> L53
        L14:
            X.0XvQ r0 = X.EnumC864300XvQ.CANCELED     // Catch: java.lang.Throwable -> L53
            if (r1 == r0) goto L35
            java.lang.Object r0 = r3.get(r5)     // Catch: java.lang.Throwable -> L53
            X.0Xk1 r0 = (X.C857230Xk1) r0     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L22
            X.0XvQ r2 = r0.LJIIJJI     // Catch: java.lang.Throwable -> L53
        L22:
            X.0XvQ r0 = X.EnumC864300XvQ.END     // Catch: java.lang.Throwable -> L53
            if (r2 == r0) goto L35
            java.lang.Object r0 = r3.get(r5)     // Catch: java.lang.Throwable -> L53
            X.0Xk1 r0 = (X.C857230Xk1) r0     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L3e
            boolean r1 = r0.LIZIZ()     // Catch: java.lang.Throwable -> L53
            r0 = 1
            if (r1 != r0) goto L3e
        L35:
            com.ss.android.ugc.aweme.publish.publishcheck.CheckManager r0 = com.ss.android.ugc.aweme.publish.publishcheck.CheckManager.LIZ     // Catch: java.lang.Throwable -> L53
            X.0Xk1 r0 = r0.LIZJ(r5, r6, r7)     // Catch: java.lang.Throwable -> L53
            goto L46
        L3c:
            r1 = r2
            goto L14
        L3e:
            java.lang.Object r0 = r3.get(r5)     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L48
            X.0Xk1 r0 = (X.C857230Xk1) r0     // Catch: java.lang.Throwable -> L53
        L46:
            monitor-exit(r4)
            return r0
        L48:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L53
            r1.toString()     // Catch: java.lang.Throwable -> L53
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L53
            throw r0     // Catch: java.lang.Throwable -> L53
        L53:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L53
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.publish.publishcheck.CheckManager.LIZ(androidx.lifecycle.LifecycleOwner, java.lang.String, int):X.0Xk1");
    }

    public final C857230Xk1 LIZJ(final LifecycleOwner lifecycleOwner, String str, int i) {
        C857230Xk1 c857230Xk1;
        synchronized (this) {
            try {
                lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.publish.publishcheck.CheckManager$newChecker$1$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                        EnumC864300XvQ enumC864300XvQ;
                        EnumC864300XvQ enumC864300XvQ2;
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C857230Xk1 c857230Xk12 = CheckManager.LIZIZ.get(lifecycleOwner);
                            if (c857230Xk12 != null && (enumC864300XvQ = c857230Xk12.LJIIJJI) == EnumC864300XvQ.RUNNING && enumC864300XvQ != (enumC864300XvQ2 = EnumC864300XvQ.CANCELED) && enumC864300XvQ != EnumC864300XvQ.END) {
                                c857230Xk12.LJIIJJI = enumC864300XvQ2;
                                Iterator it2 = ((ArrayList) c857230Xk12.LJI).iterator();
                                while (it2.hasNext()) {
                                    ((InterfaceC857250Xk3) it2.next()).LIZJ(c857230Xk12.LIZ);
                                }
                                CheckManager.LIZ.LIZLLL(c857230Xk12);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("canceled by code, reason: ");
                                sbLIZ.append("destroyed owner");
                                C857230Xk1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("status when cancelCheck ");
                                sbLIZ2.append(c857230Xk12.LJIIJJI);
                                C857230Xk1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
                            }
                            CheckManager.LIZIZ.remove(lifecycleOwner);
                        }
                    }
                });
                c857230Xk1 = new C857230Xk1(str, i);
                LIZIZ.put(lifecycleOwner, c857230Xk1);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c857230Xk1;
    }
}
