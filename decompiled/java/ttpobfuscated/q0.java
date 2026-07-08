package ttpobfuscated;

import ttp.orbu.sdk.app.domain.entity.cleanup.CleanUpSystemErrorType;

/* JADX INFO: loaded from: classes24.dex */
public interface q0 {
    void a();

    public static abstract class a extends r4 {
        public final CleanUpSystemErrorType a;
        public final Throwable b;

        public final CleanUpSystemErrorType a() {
            return this.a;
        }

        public final Throwable b() {
            return this.b;
        }

        /* JADX INFO: renamed from: ttpobfuscated.q0$a$a, reason: collision with other inner class name */
        public static final class C0067a extends a {
            public C0067a(CleanUpSystemErrorType cleanUpSystemErrorType, Throwable th) {
                super(cleanUpSystemErrorType, th);
            }
        }

        public a(CleanUpSystemErrorType cleanUpSystemErrorType, Throwable th) {
            super(null);
            this.a = cleanUpSystemErrorType;
            this.b = th;
        }
    }
}
