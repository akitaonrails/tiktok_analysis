package ttpobfuscated;

import X.C786410Ut5;

/* JADX INFO: loaded from: classes24.dex */
public final class u5 {
    public final int a;
    public final double b;

    public int hashCode() {
        return C786410Ut5.X2(this.b) + (this.a * 31);
    }

    public String toString() {
        return "GeckoScanSettings(cBase=" + this.a + ", cScale=" + this.b + ')';
    }

    public final int a() {
        return this.a;
    }

    public final double b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final double d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        if (this.a == u5Var.a && Double.compare(this.b, u5Var.b) == 0) {
            return true;
        }
        return false;
    }

    public u5(int i, double d) {
        this.a = i;
        this.b = d;
    }

    public final u5 a(int i, double d) {
        return new u5(i, d);
    }

    public static u5 a(u5 u5Var, int i, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = u5Var.a;
        }
        if ((i2 & 2) != 0) {
            d = u5Var.b;
        }
        u5Var.getClass();
        return new u5(i, d);
    }
}
