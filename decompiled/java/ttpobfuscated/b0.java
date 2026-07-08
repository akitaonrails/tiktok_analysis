package ttpobfuscated;

import java.security.cert.Certificate;

/* JADX INFO: loaded from: classes24.dex */
public interface b0 {
    Certificate a(String str, re reVar, int i);

    Certificate a(re reVar, int i);

    boolean b(re reVar, int i);

    public static abstract class a extends r4 {
        public final Throwable a;

        public final Throwable a() {
            return this.a;
        }

        /* JADX INFO: renamed from: ttpobfuscated.b0$a$a, reason: collision with other inner class name */
        public static final class C0043a extends a {
            public C0043a(Throwable th) {
                super(th);
            }
        }

        public static final class b extends a {
            public b(Throwable th) {
                super(th);
            }
        }

        public static final class c extends a {
            public c(Throwable th) {
                super(th);
            }
        }

        public a(Throwable th) {
            super(th.getMessage());
            this.a = th;
        }
    }
}
