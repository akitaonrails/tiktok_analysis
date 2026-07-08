package ttpobfuscated;

import X.C786410Ut5;

/* JADX INFO: loaded from: classes24.dex */
public final class gc {
    public final k0 a;
    public final long b;

    public int hashCode() {
        return C786410Ut5.Y2(this.b) + (this.a.hashCode() * 31);
    }

    public String toString() {
        return "RequestValidation(challengeType=" + this.a + ", expiryInMillis=" + this.b + ')';
    }

    public final k0 a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final k0 c() {
        return this.a;
    }

    public final long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc)) {
            return false;
        }
        gc gcVar = (gc) obj;
        if (this.a == gcVar.a && this.b == gcVar.b) {
            return true;
        }
        return false;
    }

    public gc(k0 k0Var, long j) {
        this.a = k0Var;
        this.b = j;
    }

    public final gc a(k0 k0Var, long j) {
        return new gc(k0Var, j);
    }

    public static gc a(gc gcVar, k0 k0Var, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            k0Var = gcVar.a;
        }
        if ((i & 2) != 0) {
            j = gcVar.b;
        }
        gcVar.getClass();
        return new gc(k0Var, j);
    }
}
