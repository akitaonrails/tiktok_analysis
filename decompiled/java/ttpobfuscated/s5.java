package ttpobfuscated;

import kotlin.jvm.internal.Intrinsics;
import ttp.orbu.sdk.app.domain.entity.gecko.GeckoValidationType;

/* JADX INFO: loaded from: classes24.dex */
public final class s5 {
    public final GeckoValidationType a;
    public final String b;

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GeckoPackageInputParams(validationType=");
        sb.append(this.a);
        sb.append(", manifestPath=");
        return n0.a(sb, this.b, ')');
    }

    public final GeckoValidationType a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.b;
    }

    public final GeckoValidationType d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5)) {
            return false;
        }
        s5 s5Var = (s5) obj;
        if (this.a == s5Var.a && Intrinsics.LJFF(this.b, s5Var.b)) {
            return true;
        }
        return false;
    }

    public s5(GeckoValidationType geckoValidationType, String str) {
        this.a = geckoValidationType;
        this.b = str;
    }

    public final s5 a(GeckoValidationType geckoValidationType, String str) {
        return new s5(geckoValidationType, str);
    }

    public static /* synthetic */ s5 a(s5 s5Var, GeckoValidationType geckoValidationType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            geckoValidationType = s5Var.a;
        }
        if ((i & 2) != 0) {
            str = s5Var.b;
        }
        return s5Var.a(geckoValidationType, str);
    }
}
