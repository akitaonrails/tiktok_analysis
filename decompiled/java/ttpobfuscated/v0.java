package ttpobfuscated;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class v0 {
    public final String a;
    public final int b;
    public final k0 c;
    public final String d;

    public int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CleanupParams(reasonCode=");
        sb.append(this.a);
        sb.append(", returnCode=");
        sb.append(this.b);
        sb.append(", challengeType=");
        sb.append(this.c);
        sb.append(", clientIdentifier=");
        return n0.a(sb, this.d, ')');
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final k0 c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final k0 e() {
        return this.c;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.a;
    }

    public final int h() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (Intrinsics.LJFF(this.a, v0Var.a) && this.b == v0Var.b && this.c == v0Var.c && Intrinsics.LJFF(this.d, v0Var.d)) {
            return true;
        }
        return false;
    }

    public v0(String str, int i, k0 k0Var, String str2) {
        this.a = str;
        this.b = i;
        this.c = k0Var;
        this.d = str2;
    }

    public final v0 a(String str, int i, k0 k0Var, String str2) {
        return new v0(str, i, k0Var, str2);
    }

    public static /* synthetic */ v0 a(v0 v0Var, String str, int i, k0 k0Var, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = v0Var.a;
        }
        if ((i2 & 2) != 0) {
            i = v0Var.b;
        }
        if ((i2 & 4) != 0) {
            k0Var = v0Var.c;
        }
        if ((i2 & 8) != 0) {
            str2 = v0Var.d;
        }
        return v0Var.a(str, i, k0Var, str2);
    }
}
