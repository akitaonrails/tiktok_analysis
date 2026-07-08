package ttpobfuscated;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k2 {
    public final Map<String, String> a;
    public final List<g5> b;

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        return "CrashlogData(headers=" + this.a + ", data=" + this.b + ')';
    }

    public final Map<String, String> a() {
        return this.a;
    }

    public final List<g5> b() {
        return this.b;
    }

    public final List<g5> c() {
        return this.b;
    }

    public final Map<String, String> d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        if (Intrinsics.LJFF(this.a, k2Var.a) && Intrinsics.LJFF(this.b, k2Var.b)) {
            return true;
        }
        return false;
    }

    public k2(Map<String, String> map, List<g5> list) {
        this.a = map;
        this.b = list;
    }

    public final k2 a(Map<String, String> map, List<g5> list) {
        return new k2(map, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ k2 a(k2 k2Var, Map map, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            map = k2Var.a;
        }
        if ((i & 2) != 0) {
            list = k2Var.b;
        }
        return k2Var.a(map, list);
    }
}
