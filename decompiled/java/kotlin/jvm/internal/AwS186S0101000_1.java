package kotlin.jvm.internal;

import X.C03JD;
import X.C03JE;
import X.C09AY;
import X.InterfaceC1631620sYq;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public class AwS186S0101000_1 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS186S0101000_1(C03JD c03jd, int i, int i2) {
        super(3);
        this.$t = i2;
        this.l0 = c03jd;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS186S0101000_1(C03JE c03je, int i, int i2) {
        super(3);
        this.$t = i2;
        this.l0 = c03je;
        this.i1 = i;
    }

    public static final Object invoke$0(AwS186S0101000_1 awS186S0101000_1, Object obj, Object obj2, Object obj3) {
        C03JE c03je = (C03JE) awS186S0101000_1.l0;
        c03je.LL.X1(awS186S0101000_1.i1, c03je.itemView, (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS186S0101000_1 awS186S0101000_1, Object obj, Object obj2, Object obj3) {
        C03JD c03jd = (C03JD) awS186S0101000_1.l0;
        c03jd.LL.X1(awS186S0101000_1.i1, c03jd.itemView, (String) obj2);
        return Unit.LIZ;
    }
}
