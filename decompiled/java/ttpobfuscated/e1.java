package ttpobfuscated;

/* JADX INFO: loaded from: classes24.dex */
public final class e1 {
    public final boolean a;

    public e1() {
        this(true);
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "ConfigDelayParams(useInitialDelay=" + this.a + ')';
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.a;
    }

    public e1(boolean z) {
        this.a = z;
    }

    public final e1 a(boolean z) {
        return new e1(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e1) && this.a == ((e1) obj).a) {
            return true;
        }
        return false;
    }

    public static e1 a(e1 e1Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = e1Var.a;
        }
        e1Var.getClass();
        return new e1(z);
    }
}
