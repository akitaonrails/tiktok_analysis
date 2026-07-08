package ttpobfuscated;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s7 {
    public final Map<String, Boolean> a;
    public final Pair<String, Object> b;

    public s7() {
        this(null, null);
    }

    public int hashCode() {
        Map<String, Boolean> map = this.a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Pair<String, Object> pair = this.b;
        return iHashCode + (pair != null ? pair.hashCode() : 0);
    }

    public String toString() {
        return "InstructionParserData(pathToKeyValidityMap=" + this.a + ", keyValue=" + this.b + ')';
    }

    public final Map<String, Boolean> a() {
        return this.a;
    }

    public final Pair<String, Object> b() {
        return this.b;
    }

    public final Pair<String, Object> c() {
        return this.b;
    }

    public final Map<String, Boolean> d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7)) {
            return false;
        }
        s7 s7Var = (s7) obj;
        if (Intrinsics.LJFF(this.a, s7Var.a) && Intrinsics.LJFF(this.b, s7Var.b)) {
            return true;
        }
        return false;
    }

    public s7(Map<String, Boolean> map, Pair<String, ? extends Object> pair) {
        this.a = map;
        this.b = pair;
    }

    public final s7 a(Map<String, Boolean> map, Pair<String, ? extends Object> pair) {
        return new s7(map, pair);
    }

    public static s7 a(s7 s7Var, Map map, Pair pair, int i, Object obj) {
        if ((i & 1) != 0) {
            map = s7Var.a;
        }
        if ((i & 2) != 0) {
            pair = s7Var.b;
        }
        s7Var.getClass();
        return new s7(map, pair);
    }
}
