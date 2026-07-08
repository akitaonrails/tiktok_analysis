package ttpobfuscated;

/* JADX INFO: loaded from: classes24.dex */
public interface p7 {
    o7 a(Integer num);

    void a(int i);

    boolean a();

    int b();

    int c();

    public static final class a {
        public static /* synthetic */ o7 a(p7 p7Var, Integer num, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    num = null;
                }
                return p7Var.a(num);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
        }
    }
}
