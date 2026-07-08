package ttpobfuscated;

/* JADX INFO: loaded from: classes24.dex */
public interface y7 {
    boolean a(String str, String str2);

    public static abstract class a extends r4 {
        public final Throwable a;

        public final Throwable a() {
            return this.a;
        }

        /* JADX INFO: renamed from: ttpobfuscated.y7$a$a, reason: collision with other inner class name */
        public static final class C0078a extends a {
            public C0078a(Throwable th) {
                super(th);
            }
        }

        public a(Throwable th) {
            super(th.getMessage());
            this.a = th;
        }
    }
}
