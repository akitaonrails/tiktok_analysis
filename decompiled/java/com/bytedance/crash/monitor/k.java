package com.bytedance.crash.monitor;

import X.C0VX9;
import X.C0VXF;
import X.C801930Vd1;
import X.C802690VeF;
import X.C802790VeP;
import X.RunnableC801900Vcy;
import android.content.Context;
import com.bytedance.crash.ICommonParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class k {
    public static C802790VeP LIZ;
    public static RunnableC801900Vcy LIZIZ;

    public static RunnableC801900Vcy LIZJ() {
        if (LIZIZ == null) {
            synchronized (k.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new RunnableC801900Vcy(LIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public static C802790VeP LIZIZ(Context context, ICommonParams iCommonParams) {
        C0VX9.LJIIIIZZ(context);
        synchronized (C802790VeP.class) {
            try {
                C802790VeP c802790VeP = LIZ;
                if (c802790VeP != null) {
                    return c802790VeP;
                }
                C802690VeF c802690VeF = new C802690VeF(iCommonParams);
                LIZ = c802690VeF;
                RunnableC801900Vcy runnableC801900Vcy = LIZIZ;
                if (runnableC801900Vcy != null) {
                    runnableC801900Vcy.LLILZ = c802690VeF;
                }
                C801930Vd1.LIZIZ(context, C0VX9.LJI(context));
                return LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static synchronized f LIZ(long j, long j2, Context context, String str, String str2) {
        final f fVar;
        C0VX9.LJIIIIZZ(context);
        fVar = new f(str, str2, j, j2);
        C801930Vd1.LIZJ();
        C0VXF.post(new Runnable() { // from class: X.0Vd3
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MonitorManager@3764.createEventMonitor$1");
                try {
                    new C801980Vd6(fVar).LIZJ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MonitorManager@3764.createEventMonitor$1");
            }
        });
        return fVar;
    }
}
