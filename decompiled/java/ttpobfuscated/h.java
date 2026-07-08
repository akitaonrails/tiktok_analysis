package ttpobfuscated;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h {
    public final boolean a;
    public final Integer b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Integer num = this.b;
        return i + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ArrayAccessResult(isArrayAccess=" + this.a + ", index=" + this.b + ')';
    }

    public final boolean a() {
        return this.a;
    }

    public final Integer b() {
        return this.b;
    }

    public final Integer c() {
        return this.b;
    }

    public final boolean d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.a == hVar.a && Intrinsics.LJFF(this.b, hVar.b)) {
            return true;
        }
        return false;
    }

    public h(boolean z, Integer num) {
        this.a = z;
        this.b = num;
    }

    public final h a(boolean z, Integer num) {
        return new h(z, num);
    }

    public static h a(h hVar, boolean z, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = hVar.a;
        }
        if ((i & 2) != 0) {
            num = hVar.b;
        }
        hVar.getClass();
        return new h(z, num);
    }
}
