package kotlin.ranges;

import X.C13LX;
import X.C1691240u70;
import X.C1846520y9S;
import X.C2188811AlT;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes28.dex */
public final class IntRange extends C1846520y9S implements C13LX<Integer> {
    public static final C1691240u70 LLILZIL;
    public static final IntRange LLILZLL = new IntRange(1, 0);

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0u70] */
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        LLILZIL = new Object(defaultConstructorMarker) { // from class: X.0u70
        };
    }

    @Override // X.C13LX
    /* JADX INFO: renamed from: LJIIIZ, reason: merged with bridge method [inline-methods] */
    public final Integer LJFF() {
        return Integer.valueOf(this.LLILLJJLI);
    }

    @Override // X.C13LX
    /* JADX INFO: renamed from: LJIIJJI, reason: merged with bridge method [inline-methods] */
    public final Integer getStart() {
        return Integer.valueOf(this.LL);
    }

    @Override // X.C1846520y9S
    public final boolean isEmpty() {
        return this.LL > this.LLILLJJLI;
    }

    @Override // X.C1846520y9S
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.LL * 31) + this.LLILLJJLI;
    }

    @Override // X.C1846520y9S
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append("..");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C13LX
    public final /* bridge */ /* synthetic */ boolean LIZJ(Comparable comparable) {
        return LJLJL(((Number) comparable).intValue());
    }

    public final boolean LJLJL(int i) {
        if (this.LL <= i && i <= this.LLILLJJLI) {
            return true;
        }
        return false;
    }

    @Override // X.C1846520y9S
    public final boolean equals(Object obj) {
        if (obj instanceof IntRange) {
            if (!isEmpty() || !((C1846520y9S) obj).isEmpty()) {
                C1846520y9S c1846520y9S = (C1846520y9S) obj;
                if (this.LL == c1846520y9S.LL && this.LLILLJJLI == c1846520y9S.LLILLJJLI) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public IntRange(int i, int i2) {
        super(i, i2, 1);
    }
}
