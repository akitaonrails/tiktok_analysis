package kotlin;

import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class Pair<A, B> implements Serializable {
    public final A LL;
    public final B LLILLJJLI;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Pair copy$default(Pair pair, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = pair.LL;
        }
        if ((i & 2) != 0) {
            obj2 = pair.LLILLJJLI;
        }
        return pair.copy(obj, obj2);
    }

    public final Pair<A, B> copy(A a, B b) {
        return new Pair<>(a, b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Intrinsics.LJFF(this.LL, pair.LL) && Intrinsics.LJFF(this.LLILLJJLI, pair.LLILLJJLI);
    }

    public int hashCode() {
        A a = this.LL;
        int iHashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.LLILLJJLI;
        return iHashCode + (b != null ? b.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('(');
        sbLIZ.append(this.LL);
        sbLIZ.append(", ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final A getFirst() {
        return this.LL;
    }

    public final B getSecond() {
        return this.LLILLJJLI;
    }

    public Pair(A a, B b) {
        this.LL = a;
        this.LLILLJJLI = b;
    }
}
