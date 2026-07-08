package ttpobfuscated;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class q5 {
    public final int a;
    public final String b;
    public final Map<String, p5> c;

    public int hashCode() {
        return this.c.hashCode() + m2.a(this.b, this.a * 31, 31);
    }

    public String toString() {
        return "GeckoManifest(version=" + this.a + ", packageType=" + this.b + ", fileEntries=" + this.c + ')';
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final Map<String, p5> c() {
        return this.c;
    }

    public final Map<String, p5> d() {
        return this.c;
    }

    public final String e() {
        return this.b;
    }

    public final int f() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5)) {
            return false;
        }
        q5 q5Var = (q5) obj;
        if (this.a == q5Var.a && Intrinsics.LJFF(this.b, q5Var.b) && Intrinsics.LJFF(this.c, q5Var.c)) {
            return true;
        }
        return false;
    }

    public q5(int i, String str, Map<String, p5> map) {
        this.a = i;
        this.b = str;
        this.c = map;
    }

    public final q5 a(int i, String str, Map<String, p5> map) {
        return new q5(i, str, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ q5 a(q5 q5Var, int i, String str, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = q5Var.a;
        }
        if ((i2 & 2) != 0) {
            str = q5Var.b;
        }
        if ((i2 & 4) != 0) {
            map = q5Var.c;
        }
        return q5Var.a(i, str, map);
    }
}
