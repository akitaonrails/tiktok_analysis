package com.ss.android.vesdk.utils;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class TEMemMonitor {
    public ActivityManager mActivityManager;
    public Context mContext;

    private double getAvailMemorybyService() {
        C2204961BRm.LJFF(this.mActivityManager, new ActivityManager.MemoryInfo(), new C0WZX("dzBzEhEpEcvSUUUuTBbKcGrIihdWugrzj+hbYGHrpw0JhunsuuHh", null));
        return r4.availMem;
    }

    private double getTotalMemorybyService() {
        C2204961BRm.LJFF(this.mActivityManager, new ActivityManager.MemoryInfo(), new C0WZX("dzBzEhEpEcvSUUUuTBbKcGrIihdWugrzj+hbYGHrpw0JhunsuuHh", null));
        return r4.totalMem;
    }

    public double sample() {
        double availMemorybyService = getAvailMemorybyService();
        double totalMemorybyService = getTotalMemorybyService();
        if (totalMemorybyService == 0.0d) {
            return 0.0d;
        }
        return with2PointDouble(((totalMemorybyService - availMemorybyService) * 100.0d) / totalMemorybyService);
    }

    public TEMemMonitor(Context context) {
        this.mContext = context;
        this.mActivityManager = (ActivityManager) C786410Ut5.H2(context, "activity");
    }

    private double with2PointDouble(double d) {
        return Math.round(d * 100.0d) / 100.0d;
    }
}
