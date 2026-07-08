package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import X.EnumC20542015Zq;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS122S0110000_2 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS122S0110000_2 awS122S0110000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStateChange: ");
        sbLIZ.append(((EnumC20542015Zq) awS122S0110000_2.l0).name());
        sbLIZ.append(' ');
        sbLIZ.append(awS122S0110000_2.z1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS122S0110000_2 awS122S0110000_2) {
        ((Function1) awS122S0110000_2.l0).invoke(Boolean.valueOf(!awS122S0110000_2.z1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS122S0110000_2 awS122S0110000_2) {
        int size;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerFirstScreenItemsIfNeeded hasSparkBody=");
        sbLIZ.append(awS122S0110000_2.z1);
        sbLIZ.append(" mynaIds=");
        List list = (List) awS122S0110000_2.l0;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        sbLIZ.append(size);
        sbLIZ.append(" ids=");
        sbLIZ.append((List) awS122S0110000_2.l0);
        sbLIZ.append(" ts=");
        sbLIZ.append(System.currentTimeMillis());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S0110000_2(EnumC20542015Zq enumC20542015Zq, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = enumC20542015Zq;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS122S0110000_2(Function1 function1, Function1<? super Boolean, Unit> function12, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = function1;
        this.z1 = function12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS122S0110000_2(boolean z, boolean z2, List<String> list) {
        super(0);
        this.$t = list;
        this.z1 = z;
        this.l0 = z2;
    }
}
