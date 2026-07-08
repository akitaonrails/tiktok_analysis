package ttpobfuscated;

import X.C08FF;

/* JADX INFO: loaded from: classes24.dex */
public enum t4 {
    URL_QUERY(1),
    HEADER_COOKIE(2);

    public static final a b = new a();
    public final int a;

    public static final /* synthetic */ t4[] a() {
        return new t4[]{URL_QUERY, HEADER_COOKIE};
    }

    public final int b() {
        return this.a;
    }

    public static final class a {
        public final t4 a(Integer num) {
            for (t4 t4Var : t4.values()) {
                int i = t4Var.a;
                if (num != null && i == num.intValue()) {
                    return t4Var;
                }
            }
            return null;
        }
    }

    public static t4 valueOf(String str) {
        return (t4) C08FF.LIZ(t4.class, str);
    }

    t4(int i) {
        this.a = i;
    }
}
