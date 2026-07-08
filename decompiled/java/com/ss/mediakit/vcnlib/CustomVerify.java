package com.ss.mediakit.vcnlib;

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

    public static final native void _init();

    static {
        try {
            verifyMethod = Class.forName("com.ttnet.org.chromium.net.q0").getMethod("verifyServerCertificates", byte[][].class, String.class, String.class);
            Class<?> cls = Class.forName("com.ttnet.org.chromium.net.AndroidCertVerifyResult");
            verifyResultClass = cls;
            getVerifyStatusMethod = cls.getMethod("getStatus", new Class[0]);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                verifyMethod = Class.forName("com.ss.mediakit.vcnlib.X509Util").getMethod("verifyServerCertificates", byte[][].class, String.class, String.class);
                Class<?> cls2 = Class.forName("com.ss.mediakit.vcnlib.AndroidCertVerifyResult");
                verifyResultClass = cls2;
                getVerifyStatusMethod = cls2.getMethod("getStatus", new Class[0]);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        hasInited = true;
    }

    public static void init() {
        _init();
    }

    public static int doVerify(byte[][] bArr, String str, String str2) {
        Method method = verifyMethod;
        if (method != null && verifyResultClass != null && getVerifyStatusMethod != null) {
            try {
                return ((Integer) C2204961BRm.a0(getVerifyStatusMethod, C2204961BRm.a0(method, null, new Object[]{bArr, str, str2}, new C0WZX("dzBzEhEpEcfZUV4gThuQKIrTtQeidM5jOF8O+cp+NYVF4L0=", null)), new Object[0], new C0WZX("dzBzEhEpEcfZUV4gThuQKIrTtQeidM5jOF8O+cp+NYVF4L0=", null))).intValue();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return -99996;
            }
        }
        return -99995;
    }
}
