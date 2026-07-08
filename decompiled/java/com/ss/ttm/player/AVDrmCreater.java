package com.ss.ttm.player;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes2.dex */
public class AVDrmCreater {
    public static synchronized long createDrm(int i) {
        long j = 0;
        if (i != 1) {
            return 0L;
        }
        try {
            j = CastLongProtector.parseLong(String.valueOf(Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrm").getMethod("createDrm", new Class[0]).invoke(null, new Object[0])));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return j;
    }
}
