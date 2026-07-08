package kotlin.collections;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class IndexedValue<T> {
    public final int LIZ;
    public final T LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) obj;
        return this.LIZ == indexedValue.LIZ && Intrinsics.LJFF(this.LIZIZ, indexedValue.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        T t = this.LIZIZ;
        return i + (t == null ? 0 : t.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IndexedValue(index=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IndexedValue(int i, T t) {
        this.LIZ = i;
        this.LIZIZ = t;
    }
}
