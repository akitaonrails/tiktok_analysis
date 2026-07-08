package ttpobfuscated;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class rg {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Map<String, Object> e;

    public int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "UserContext(region=" + this.a + ", userId=" + this.b + ", deviceId=" + this.c + ", userAction=" + this.d + ", extraInfo=" + this.e + ')';
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final Map<String, Object> e() {
        return this.e;
    }

    public final String f() {
        return this.c;
    }

    public final Map<String, Object> g() {
        return this.e;
    }

    public final String h() {
        return this.a;
    }

    public final String i() {
        return this.d;
    }

    public final String j() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg)) {
            return false;
        }
        rg rgVar = (rg) obj;
        if (Intrinsics.LJFF(this.a, rgVar.a) && Intrinsics.LJFF(this.b, rgVar.b) && Intrinsics.LJFF(this.c, rgVar.c) && Intrinsics.LJFF(this.d, rgVar.d) && Intrinsics.LJFF(this.e, rgVar.e)) {
            return true;
        }
        return false;
    }

    public rg(String str, String str2, String str3, String str4, Map<String, ? extends Object> map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = map;
    }

    public final rg a(String str, String str2, String str3, String str4, Map<String, ? extends Object> map) {
        return new rg(str, str2, str3, str4, map);
    }

    public static rg a(rg rgVar, String str, String str2, String str3, String str4, Map map, int i, Object obj) {
        Map map2 = map;
        String str5 = str4;
        String str6 = str3;
        String str7 = str2;
        String str8 = str;
        if ((i & 1) != 0) {
            str8 = rgVar.a;
        }
        if ((i & 2) != 0) {
            str7 = rgVar.b;
        }
        if ((i & 4) != 0) {
            str6 = rgVar.c;
        }
        if ((i & 8) != 0) {
            str5 = rgVar.d;
        }
        if ((i & 16) != 0) {
            map2 = rgVar.e;
        }
        rgVar.getClass();
        return new rg(str8, str7, str6, str5, map2);
    }
}
