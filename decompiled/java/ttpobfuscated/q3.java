package ttpobfuscated;

/* JADX INFO: loaded from: classes24.dex */
public interface q3 {
    public static final a a = a.b;

    void a(Long l, String str, String str2);

    void a(String str, String str2, Throwable th);

    void b(String str, String str2, Throwable th);

    void c(String str, String str2, Throwable th);

    void d(String str, String str2, Throwable th);

    public static final class a implements q3 {
        public static final /* synthetic */ a b = new a();
        public static q3 c = new s8();
        public static final boolean d = false;

        public final q3 a() {
            return c;
        }

        public final boolean b() {
            return d;
        }

        public final void a(q3 q3Var) {
            c = q3Var;
        }

        @Override // ttpobfuscated.q3
        public void a(Long l, String str, String str2) {
            c.a(l, str, str2);
        }

        @Override // ttpobfuscated.q3
        public void b(String str, String str2, Throwable th) {
            c.b(str, str2, th);
        }

        @Override // ttpobfuscated.q3
        public void c(String str, String str2, Throwable th) {
            c.c(str, str2, th);
        }

        @Override // ttpobfuscated.q3
        public void d(String str, String str2, Throwable th) {
            c.d(str, str2, th);
        }

        @Override // ttpobfuscated.q3
        public void a(String str, String str2, Throwable th) {
            c.a(str, str2, th);
        }
    }

    public static final class b {
        public static /* synthetic */ void a(q3 q3Var, String str, String str2, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                if ((i & 4) != 0) {
                    th = null;
                }
                q3Var.d(str, str2, th);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logd");
        }

        public static /* synthetic */ void b(q3 q3Var, String str, String str2, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                if ((i & 4) != 0) {
                    th = null;
                }
                q3Var.b(str, str2, th);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loge");
        }

        public static /* synthetic */ void c(q3 q3Var, String str, String str2, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                if ((i & 4) != 0) {
                    th = null;
                }
                q3Var.a(str, str2, th);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logi");
        }

        public static /* synthetic */ void d(q3 q3Var, String str, String str2, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                if ((i & 4) != 0) {
                    th = null;
                }
                q3Var.c(str, str2, th);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logw");
        }

        public static /* synthetic */ void a(q3 q3Var, Long l, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str2 = null;
                }
                q3Var.a(l, str, str2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logPerf");
        }
    }
}
