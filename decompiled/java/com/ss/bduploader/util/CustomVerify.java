package com.ss.bduploader.util;

import X.C0WZX;
import X.C2204961BRm;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class CustomVerify {
    public static Method getVerifyStatusMethod;
    public static boolean hasInited;
    public static Method verifyMethod;
    public static Class<?> verifyResultClass;

    static {
        try {
            verifyMethod = Class.forName("com.ss.bduploader.util.X509Util").getMethod("verifyServerCertificates", byte[][].class, String.class, String.class);
            Class<?> cls = Class.forName("com.ss.bduploader.util.AndroidCertVerifyResult");
            verifyResultClass = cls;
            getVerifyStatusMethod = cls.getMethod("getStatus", new Class[0]);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        hasInited = true;
    }

    public static int doVerify(byte[][] bArr, String str, String str2) {
        Method method = verifyMethod;
        if (method != null && verifyResultClass != null && getVerifyStatusMethod != null) {
            try {
                return ((Integer) C2204961BRm.a0(getVerifyStatusMethod, C2204961BRm.a0(method, null, new Object[]{bArr, str, str2}, new C0WZX("dzBzEhEpEcjYQEctShOAYxA5gGtg51MomXZziOn87Qj9tWU=", null)), new Object[0], new C0WZX("dzBzEhEpEcjYQEctShOAYxA5gGtg51MomXZziOn87Qj9tWU=", null))).intValue();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return -99996;
            }
        }
        return -99995;
    }
}
