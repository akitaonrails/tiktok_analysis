package com.ss.ttffmpeg;

import X.C0WZX;
import X.C2204961BRm;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class CustomVerify {
    public static final Method LIZ;
    public static final Class<?> LIZIZ;
    public static final Method LIZJ;

    public static final native void _init();

    static {
        try {
            LIZ = Class.forName("com.ttnet.org.chromium.net.q0").getMethod("verifyServerCertificates", byte[][].class, String.class, String.class);
            Class<?> cls = Class.forName("com.ttnet.org.chromium.net.AndroidCertVerifyResult");
            LIZIZ = cls;
            LIZJ = cls.getMethod("getStatus", new Class[0]);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZ() {
        _init();
    }

    public static int doVerify(byte[][] bArr, String str, String str2) {
        Method method;
        Method method2 = LIZ;
        if (method2 != null && LIZIZ != null && (method = LIZJ) != null) {
            try {
                return ((Integer) C2204961BRm.a0(method, C2204961BRm.a0(method2, null, new Object[]{bArr, str, str2}, new C0WZX("dzBzEhEpEd7IU1EsVReDKLIqo/XEvA8CTY0PnA==", null)), new Object[0], new C0WZX("dzBzEhEpEd7IU1EsVReDKLIqo/XEvA8CTY0PnA==", null))).intValue();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return -99996;
            }
        }
        return -99995;
    }
}
