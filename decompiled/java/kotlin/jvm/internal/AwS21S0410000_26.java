package kotlin.jvm.internal;

import X.C09AY;
import X.C1712450ufD;
import com.ss.android.ugc.aweme.pipo.cashier.common.address.Region;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS21S0410000_26 extends C09AY implements Function0 {
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

    public static final Object invoke$0(AwS21S0410000_26 awS21S0410000_26) {
        ((C1712450ufD) awS21S0410000_26.l0).LIZ((Region) awS21S0410000_26.l1, awS21S0410000_26.z4, (Function1) awS21S0410000_26.l2, (Function1) awS21S0410000_26.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS21S0410000_26 awS21S0410000_26) {
        ((C1712450ufD) awS21S0410000_26.l0).LIZ((Region) awS21S0410000_26.l1, awS21S0410000_26.z4, (Function1) awS21S0410000_26.l2, (Function1) awS21S0410000_26.l3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS21S0410000_26(C1712450ufD c1712450ufD, C1712450ufD c1712450ufD2, Region region, boolean z, Function1<? super String, Unit> function1, Function1<? super List<Region>, Unit> function12) {
        super(0);
        this.$t = function12;
        this.l0 = c1712450ufD;
        this.l1 = c1712450ufD2;
        this.z4 = region;
        this.l2 = z;
        this.l3 = function1;
    }
}
