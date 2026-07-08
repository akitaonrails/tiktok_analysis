package ttpobfuscated;

import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class p5 {
    public final String a;
    public final String b;
    public final long c;

    public int hashCode() {
        return C786410Ut5.Y2(this.c) + m2.a(this.b, this.a.hashCode() * 31, 31);
    }

    public String toString() {
        return "GeckoFileEntry(filePath=" + this.a + ", fileHash=" + this.b + ", fileSize=" + this.c + ')';
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.a;
    }

    public final long f() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5)) {
            return false;
        }
        p5 p5Var = (p5) obj;
        if (Intrinsics.LJFF(this.a, p5Var.a) && Intrinsics.LJFF(this.b, p5Var.b) && this.c == p5Var.c) {
            return true;
        }
        return false;
    }

    public p5(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final p5 a(String str, String str2, long j) {
        return new p5(str, str2, j);
    }

    public static /* synthetic */ p5 a(p5 p5Var, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = p5Var.a;
        }
        if ((i & 2) != 0) {
            str2 = p5Var.b;
        }
        if ((i & 4) != 0) {
            j = p5Var.c;
        }
        return p5Var.a(str, str2, j);
    }
}
