package ttpobfuscated;

import X.InterfaceC1364105Vn;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes24.dex */
public interface qb {
    Object a(String str, String str2, PublicKey publicKey, re reVar, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    public static abstract class b extends r4 {

        public static final class a extends b {
            public a(Throwable th) {
                super(th);
            }
        }

        public b(Throwable th) {
            super(th.getMessage());
        }
    }

    public static final class a {
        public static /* synthetic */ Object a(qb qbVar, String str, String str2, PublicKey publicKey, re reVar, InterfaceC1364105Vn interfaceC1364105Vn, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    reVar = re.CONFIG;
                }
                return qbVar.a(str, str2, publicKey, reVar, interfaceC1364105Vn);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verify");
        }
    }
}
