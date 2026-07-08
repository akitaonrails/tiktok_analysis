package ttpobfuscated;

import X.InterfaceC1364105Vn;
import java.security.cert.Certificate;

/* JADX INFO: loaded from: classes24.dex */
public interface c0 {
    Object a(String str, String str2, Certificate certificate, re reVar, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    public static abstract class a extends r4 {
        public final Throwable a;

        public final Throwable a() {
            return this.a;
        }

        /* JADX INFO: renamed from: ttpobfuscated.c0$a$a, reason: collision with other inner class name */
        public static final class C0046a extends a {
            public C0046a(Throwable th) {
                super(th);
            }
        }

        public a(Throwable th) {
            super(th.getMessage());
            this.a = th;
        }
    }

    public static final class b {
        public static /* synthetic */ Object a(c0 c0Var, String str, String str2, Certificate certificate, re reVar, InterfaceC1364105Vn interfaceC1364105Vn, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    reVar = re.CONFIG;
                }
                return c0Var.a(str, str2, certificate, reVar, interfaceC1364105Vn);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verify");
        }
    }
}
