package com.ttnet.org.chromium.net;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes2.dex */
public class TTPatternUtil {
    public static boolean isPatternStringValid(String str) {
        try {
            PatternProtector.compile(str);
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }
}
