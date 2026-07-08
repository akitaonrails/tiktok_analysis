package ttpobfuscated;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class p {
    public final String a;
    public ed b;

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        return "Bucket(id=" + this.a + ", frequency=" + this.b + ')';
    }

    public final String a() {
        return this.a;
    }

    public final ed b() {
        return this.b;
    }

    public final ed c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public final void a(ed edVar) {
        this.b = edVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (Intrinsics.LJFF(this.a, pVar.a) && Intrinsics.LJFF(this.b, pVar.b)) {
            return true;
        }
        return false;
    }

    public p(String str, ed edVar) {
        this.a = str;
        this.b = edVar;
    }

    public final p a(String str, ed edVar) {
        return new p(str, edVar);
    }

    public static /* synthetic */ p a(p pVar, String str, ed edVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pVar.a;
        }
        if ((i & 2) != 0) {
            edVar = pVar.b;
        }
        return pVar.a(str, edVar);
    }
}
