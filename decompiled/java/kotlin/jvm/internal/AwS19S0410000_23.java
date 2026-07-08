package kotlin.jvm.internal;

import X.C09AY;
import X.C1533790q13;
import X.C1533900q1E;
import X.C1533910q1F;
import com.bytedance.forest.Forest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public class AwS19S0410000_23 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS19S0410000_23 awS19S0410000_23) {
        ((Forest) awS19S0410000_23.l0).finishWithCallback$forest_release((C1533790q13) awS19S0410000_23.l1, awS19S0410000_23.z4, (C1533910q1F) awS19S0410000_23.l2, (Function1) awS19S0410000_23.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS19S0410000_23 awS19S0410000_23) {
        ((C1533900q1E) awS19S0410000_23.l0).LIZ.finishWithCallback$forest_release((C1533790q13) awS19S0410000_23.l1, awS19S0410000_23.z4, (C1533910q1F) awS19S0410000_23.l2, (Function1) awS19S0410000_23.l3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS19S0410000_23(C1533900q1E c1533900q1E, C1533900q1E c1533900q1E2, C1533790q13 c1533790q13, boolean z, C1533910q1F c1533910q1F, Function1<? super C1533790q13, Unit> function1) {
        super(0);
        this.$t = function1;
        this.l0 = c1533900q1E;
        this.l1 = c1533900q1E2;
        this.z4 = c1533790q13;
        this.l2 = z;
        this.l3 = c1533910q1F;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS19S0410000_23(Forest forest, Forest forest2, C1533790q13 c1533790q13, boolean z, C1533910q1F c1533910q1F, Function1<? super C1533790q13, Unit> function1) {
        super(0);
        this.$t = function1;
        this.l0 = forest;
        this.l1 = forest2;
        this.z4 = c1533790q13;
        this.l2 = z;
        this.l3 = c1533910q1F;
    }
}
