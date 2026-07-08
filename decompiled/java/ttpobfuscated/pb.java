package ttpobfuscated;

import java.security.PublicKey;

/* JADX INFO: loaded from: classes24.dex */
public interface pb {
    PublicKey a(re reVar, int i);

    public static abstract class a extends r4 {
        public final Throwable a;

        public final Throwable a() {
            return this.a;
        }

        /* JADX INFO: renamed from: ttpobfuscated.pb$a$a, reason: collision with other inner class name */
        public static final class C0066a extends a {
            public C0066a(Throwable th) {
                super(th);
            }
        }

        public a(Throwable th) {
            super(th.getMessage());
            this.a = th;
        }
    }
}
