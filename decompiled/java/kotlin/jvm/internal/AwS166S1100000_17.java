package kotlin.jvm.internal;

import X.C09AY;
import X.C1078210eAF;
import X.C1093030eY9;
import X.C1135920ffK;
import X.C823050WQl;
import X.InterfaceC1092770eXj;
import Y.ARunnableS22S1100000_17;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public class AwS166S1100000_17 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS166S1100000_17 awS166S1100000_17) {
        ((C1078210eAF) awS166S1100000_17.l1).LIZLLL(awS166S1100000_17.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS166S1100000_17 awS166S1100000_17) {
        ((C1078210eAF) awS166S1100000_17.l1).LIZLLL(awS166S1100000_17.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS166S1100000_17 awS166S1100000_17) {
        ((C1135920ffK) awS166S1100000_17.l1).LJIILIIL.remove(awS166S1100000_17.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS166S1100000_17 awS166S1100000_17) {
        C823050WQl.LIZJ().execute(new ARunnableS22S1100000_17((InterfaceC1092770eXj) awS166S1100000_17.l1, awS166S1100000_17.s0, 10));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS166S1100000_17 awS166S1100000_17) {
        C823050WQl.LIZJ().execute(new ARunnableS22S1100000_17((InterfaceC1092770eXj) awS166S1100000_17.l1, awS166S1100000_17.s0, 11));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS166S1100000_17(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS166S1100000_17(C1078210eAF c1078210eAF, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1078210eAF;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS166S1100000_17(C1135920ffK c1135920ffK, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1135920ffK;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS166S1100000_17(String str, C1093030eY9 c1093030eY9, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1093030eY9;
    }
}
