package ttpobfuscated;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class s1 {
    public final String a;
    public String b;
    public final Function0<String> c;
    public final String d;
    public final String e;
    public final String f;

    public int hashCode() {
        int iA = m2.a(this.b, this.a.hashCode() * 31, 31);
        Function0<String> function0 = this.c;
        return this.f.hashCode() + m2.a(this.e, m2.a(this.d, (iA + (function0 == null ? 0 : function0.hashCode())) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConfigurationParams(appVersion=");
        sb.append(this.a);
        sb.append(", currentVersion=");
        sb.append(this.b);
        sb.append(", experimentGroup=");
        sb.append(this.c);
        sb.append(", osVersion=");
        sb.append(this.d);
        sb.append(", ttpVersion=");
        sb.append(this.e);
        sb.append(", platform=");
        return n0.a(sb, this.f, ')');
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final Function0<String> c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.a;
    }

    public final String h() {
        return this.b;
    }

    public final Function0<String> i() {
        return this.c;
    }

    public final String j() {
        return this.d;
    }

    public final String k() {
        return this.f;
    }

    public final String l() {
        return this.e;
    }

    public final void a(String str) {
        this.b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        if (Intrinsics.LJFF(this.a, s1Var.a) && Intrinsics.LJFF(this.b, s1Var.b) && Intrinsics.LJFF(this.c, s1Var.c) && Intrinsics.LJFF(this.d, s1Var.d) && Intrinsics.LJFF(this.e, s1Var.e) && Intrinsics.LJFF(this.f, s1Var.f)) {
            return true;
        }
        return false;
    }

    public s1(String str, String str2, Function0<String> function0, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = function0;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final s1 a(String str, String str2, Function0<String> function0, String str3, String str4, String str5) {
        return new s1(str, str2, function0, str3, str4, str5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ s1 a(s1 s1Var, String str, String str2, Function0 function0, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = s1Var.a;
        }
        if ((i & 2) != 0) {
            str2 = s1Var.b;
        }
        if ((i & 4) != 0) {
            function0 = s1Var.c;
        }
        if ((i & 8) != 0) {
            str3 = s1Var.d;
        }
        if ((i & 16) != 0) {
            str4 = s1Var.e;
        }
        if ((i & 32) != 0) {
            str5 = s1Var.f;
        }
        return s1Var.a(str, str2, function0, str3, str4, str5);
    }
}
