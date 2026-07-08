package ttpobfuscated;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class g5 {
    public final String a;
    public final d5 b;
    public final boolean c;
    public final byte[] d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    public int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = (iHashCode + r0) * 31;
        byte[] bArr = this.d;
        return i + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    public String toString() {
        return "FileStatus(path=" + this.a + ", type=" + this.b + ", isFolder=" + this.c + ", content=" + Arrays.toString(this.d) + ')';
    }

    public final String a() {
        return this.a;
    }

    public final d5 b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final byte[] d() {
        return this.d;
    }

    public final byte[] e() {
        return this.d;
    }

    public final String f() {
        return this.a;
    }

    public final d5 g() {
        return this.b;
    }

    public final boolean h() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5)) {
            return false;
        }
        g5 g5Var = (g5) obj;
        if (Intrinsics.LJFF(this.a, g5Var.a) && this.b == g5Var.b && this.c == g5Var.c && Intrinsics.LJFF(this.d, g5Var.d)) {
            return true;
        }
        return false;
    }

    public g5(String str, d5 d5Var, boolean z, byte[] bArr) {
        this.a = str;
        this.b = d5Var;
        this.c = z;
        this.d = bArr;
    }

    public final g5 a(String str, d5 d5Var, boolean z, byte[] bArr) {
        return new g5(str, d5Var, z, bArr);
    }

    public static /* synthetic */ g5 a(g5 g5Var, String str, d5 d5Var, boolean z, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = g5Var.a;
        }
        if ((i & 2) != 0) {
            d5Var = g5Var.b;
        }
        if ((i & 4) != 0) {
            z = g5Var.c;
        }
        if ((i & 8) != 0) {
            bArr = g5Var.d;
        }
        return g5Var.a(str, d5Var, z, bArr);
    }
}
