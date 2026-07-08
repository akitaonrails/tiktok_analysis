package ttpobfuscated;

import X.InterfaceC1364105Vn;

/* JADX INFO: loaded from: classes24.dex */
public interface j0 {
    public static final b a = b.a;

    public static final class b {
        public static final /* synthetic */ b a = new b();
    }

    Object a(h0 h0Var, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    public static abstract class a extends r4 {
        public final i0 a;
        public final String b;

        public final i0 a() {
            return this.a;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.b;
        }

        /* JADX INFO: renamed from: ttpobfuscated.j0$a$a, reason: collision with other inner class name */
        public static final class C0059a extends a {
            public C0059a(i0 i0Var, String str) {
                super(i0Var, str);
            }
        }

        public a(i0 i0Var, String str) {
            super(null);
            this.a = i0Var;
            this.b = str;
        }
    }
}
