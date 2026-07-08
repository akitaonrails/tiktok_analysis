package kotlin.jvm.internal;

import X.C09AY;
import X.C1527670prB;
import X.C1534750q2b;
import X.C2188811AlT;
import com.bytedance.geckox.model.UpdatePackage;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes24.dex */
public class AwS71S0100100_23 extends C09AY implements Function0 {
    public final int $t;
    public long j1;
    public Object l0;

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

    public static final Object invoke$0(AwS71S0100100_23 awS71S0100100_23) {
        return ((C1527670prB) awS71S0100100_23.l0).LJJZ().LIZJ(awS71S0100100_23.j1);
    }

    public static final Object invoke$1(AwS71S0100100_23 awS71S0100100_23) {
        String channel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("channel:");
        UpdatePackage updatePackage = (UpdatePackage) awS71S0100100_23.l0;
        if (updatePackage != null) {
            channel = updatePackage.getChannel();
        } else {
            channel = null;
        }
        sbLIZ.append(channel);
        sbLIZ.append(" version:");
        sbLIZ.append(awS71S0100100_23.j1);
        return new C1534750q2b("GeckoUtils", "onUpdateSuccess", C2188811AlT.LIZIZ(sbLIZ), 24);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS71S0100100_23(long j, UpdatePackage updatePackage, int i) {
        super(0);
        this.$t = i;
        this.l0 = updatePackage;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS71S0100100_23(C1527670prB c1527670prB, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1527670prB;
        this.j1 = j;
    }
}
