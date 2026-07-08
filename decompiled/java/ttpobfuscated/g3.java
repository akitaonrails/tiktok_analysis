package ttpobfuscated;

import X.C08FF;

/* JADX INFO: loaded from: classes24.dex */
public enum g3 {
    Int32(1),
    String(3),
    Float(4),
    Boolean(5),
    Null(6),
    ArrayOfInt32s(129),
    ArrayOfStrings(131),
    ArrayOfFloats(132),
    ArrayOfBytes(133),
    ArrayOfBooleans(134),
    Undefined(255);

    public static final a b = new a();
    public final int a;

    public final int b() {
        return this.a;
    }

    public static final class a {
        public final g3 a(int i) {
            for (g3 g3Var : g3.values()) {
                if (g3Var.a == i) {
                    return g3Var;
                }
            }
            return null;
        }
    }

    public static g3 valueOf(String str) {
        return (g3) C08FF.LIZ(g3.class, str);
    }

    g3(int i) {
        this.a = i;
    }
}
