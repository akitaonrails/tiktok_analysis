package ttpobfuscated;

import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class h0 {
    public final k0 a;
    public final Integer b;
    public final String c;
    public final Date d;
    public final Integer e;
    public final Map<String, List<String>> f;

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Date date = this.d;
        int iHashCode4 = (iHashCode3 + (date == null ? 0 : date.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Map<String, List<String>> map = this.f;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "ChallengeData(challengeType=" + this.a + ", seedId=" + this.b + ", token=" + this.c + ", serverTimestamp=" + this.d + ", requestedLeadingZeros=" + this.e + ", extension=" + this.f + ')';
    }

    public final k0 a() {
        return this.a;
    }

    public final Integer b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final Date d() {
        return this.d;
    }

    public final Integer e() {
        return this.e;
    }

    public final Map<String, List<String>> f() {
        return this.f;
    }

    public final k0 g() {
        return this.a;
    }

    public final Map<String, List<String>> h() {
        return this.f;
    }

    public final Integer i() {
        return this.e;
    }

    public final Integer j() {
        return this.b;
    }

    public final Date k() {
        return this.d;
    }

    public final String l() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (this.a == h0Var.a && Intrinsics.LJFF(this.b, h0Var.b) && Intrinsics.LJFF(this.c, h0Var.c) && Intrinsics.LJFF(this.d, h0Var.d) && Intrinsics.LJFF(this.e, h0Var.e) && Intrinsics.LJFF(this.f, h0Var.f)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h0(k0 k0Var, Integer num, String str, Date date, Integer num2, Map<String, ? extends List<String>> map) {
        this.a = k0Var;
        this.b = num;
        this.c = str;
        this.d = date;
        this.e = num2;
        this.f = map;
    }

    public final h0 a(k0 k0Var, Integer num, String str, Date date, Integer num2, Map<String, ? extends List<String>> map) {
        return new h0(k0Var, num, str, date, num2, map);
    }

    public static h0 a(h0 h0Var, k0 k0Var, Integer num, String str, Date date, Integer num2, Map map, int i, Object obj) {
        Map map2 = map;
        Integer num3 = num2;
        Date date2 = date;
        String str2 = str;
        Integer num4 = num;
        k0 k0Var2 = k0Var;
        if ((i & 1) != 0) {
            k0Var2 = h0Var.a;
        }
        if ((i & 2) != 0) {
            num4 = h0Var.b;
        }
        if ((i & 4) != 0) {
            str2 = h0Var.c;
        }
        if ((i & 8) != 0) {
            date2 = h0Var.d;
        }
        if ((i & 16) != 0) {
            num3 = h0Var.e;
        }
        if ((i & 32) != 0) {
            map2 = h0Var.f;
        }
        h0Var.getClass();
        return new h0(k0Var2, num4, str2, date2, num3, map2);
    }
}
