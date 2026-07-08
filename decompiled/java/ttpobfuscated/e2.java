package ttpobfuscated;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class e2 {
    public final String a;

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return n0.a(new StringBuilder("CrashLogBaseParams(basePath="), this.a, ')');
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.a;
    }

    public e2(String str) {
        this.a = str;
    }

    public final e2 a(String str) {
        return new e2(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e2) && Intrinsics.LJFF(this.a, ((e2) obj).a)) {
            return true;
        }
        return false;
    }

    public static e2 a(e2 e2Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = e2Var.a;
        }
        e2Var.getClass();
        return new e2(str);
    }
}
