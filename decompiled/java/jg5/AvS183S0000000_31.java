package jg5;

import X.AbstractC20611515l3;
import X.C1DRG;
import X.C204642155s;
import X.C204645155v;

/* JADX INFO: loaded from: classes32.dex */
public class AvS183S0000000_31 extends AbstractC20611515l3 {
    public final int $t;

    @Override // X.AbstractC20611515l3
    public final Object LIZIZ(C1DRG c1drg) {
        switch (this.$t) {
            case 0:
                return LIZIZ$0(this, c1drg);
            case 1:
                return LIZIZ$1(this, c1drg);
            default:
                return super.LIZIZ(c1drg);
        }
    }

    public AvS183S0000000_31(int i) {
        this.$t = i;
    }

    public static final Object LIZIZ$0(AvS183S0000000_31 avS183S0000000_31, C1DRG c1drg) {
        return new C204642155s(c1drg);
    }

    public static final Object LIZIZ$1(AvS183S0000000_31 avS183S0000000_31, C1DRG c1drg) {
        return new C204645155v(c1drg);
    }
}
