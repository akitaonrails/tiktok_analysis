package ttpobfuscated;

import X.C08FF;

/* JADX INFO: loaded from: classes24.dex */
public enum n8 {
    IntType("Int"),
    LongType("Long"),
    BooleanType("Boolean"),
    StringType("String"),
    FloatType("Float"),
    DoubleType("Double"),
    ArrayType("Array"),
    ObjectType("Object");

    public final String a;

    public final String b() {
        return this.a;
    }

    public static n8 valueOf(String str) {
        return (n8) C08FF.LIZ(n8.class, str);
    }

    n8(String str) {
        this.a = str;
    }
}
