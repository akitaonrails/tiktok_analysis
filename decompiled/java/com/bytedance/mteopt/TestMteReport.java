package com.bytedance.mteopt;

import X.C2111908Pd;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class TestMteReport {
    public static native int test(int i);

    public static synchronized void LIZ(int i, Context context) {
        if (C2111908Pd.LIZ(context)) {
            try {
                test(i);
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}
