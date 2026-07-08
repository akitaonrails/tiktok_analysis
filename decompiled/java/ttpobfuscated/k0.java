package ttpobfuscated;

import X.C08FF;

/* JADX INFO: loaded from: classes24.dex */
public enum k0 {
    None("none", "00000000-0000-0000-8c5a-6d1304a09307"),
    HashCash("hashcash", "c9386f8e-6cdf-4183-82f0-b2a15be35acf");

    public static final a c = new a();
    public final String a;
    public final String b;

    public static final /* synthetic */ k0[] a() {
        return new k0[]{None, HashCash};
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public static final class a {
        public final k0 a(String str) {
            k0[] k0VarArrValues = k0.values();
            int length = k0VarArrValues.length;
            for (int i = 0; i < length; i++) {
                k0 k0Var = k0VarArrValues[i];
                if (kotlin.text.u.LJIJI(k0Var.a, str, true) || kotlin.text.u.LJIJI(k0Var.b, str, true)) {
                    return k0Var;
                }
            }
            return null;
        }
    }

    public static k0 valueOf(String str) {
        return (k0) C08FF.LIZ(k0.class, str);
    }

    k0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
