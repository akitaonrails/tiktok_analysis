package com.ss.android.ugc.aweme.framework.services.utils;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;

/* JADX INFO: loaded from: classes4.dex */
public final class KotlinReflectHelperKt {
    public static final IAabDelegate reflectObjectClass(String str) {
        try {
            Object obj = Class.forName(str).getDeclaredField("INSTANCE").get(null);
            if (obj instanceof IAabDelegate) {
                return (IAabDelegate) obj;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return null;
    }
}
