package kotlin.jvm.internal;

import X.C09AY;
import X.C0CHQ;
import X.C1633850scR;
import X.C2097908Jt;
import X.InterfaceC1635410sex;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public class AwS49S0010000_3 extends C09AY implements Function0 {
    public final int $t;
    public boolean z0;

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

    public static final Object invoke$0(AwS49S0010000_3 awS49S0010000_3) {
        InterfaceC1635410sex interfaceC1635410sexLIZ = C1633850scR.LIZ(C0CHQ.LIZ, null);
        interfaceC1635410sexLIZ.ug(C2097908Jt.LIZJ(new Pair("is_story", Integer.valueOf(awS49S0010000_3.z0 ? 1 : 0))));
        return interfaceC1635410sexLIZ;
    }

    public static final Object invoke$1(AwS49S0010000_3 awS49S0010000_3) {
        InterfaceC1635410sex interfaceC1635410sexLIZ = C1633850scR.LIZ(C0CHQ.LIZ, null);
        interfaceC1635410sexLIZ.ug(C2097908Jt.LIZJ(new Pair("is_story", Integer.valueOf(awS49S0010000_3.z0 ? 1 : 0))));
        return interfaceC1635410sexLIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS49S0010000_3(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
