package ttpobfuscated;

/* JADX INFO: loaded from: classes20.dex */
public final class p0 {
    public final boolean a;

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "CleanUpSystemParams(isInitialized=" + this.a + ')';
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.a;
    }

    public p0(boolean z) {
        this.a = z;
    }

    public final p0 a(boolean z) {
        return new p0(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p0) && this.a == ((p0) obj).a) {
            return true;
        }
        return false;
    }

    public static p0 a(p0 p0Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = p0Var.a;
        }
        p0Var.getClass();
        return new p0(z);
    }
}
