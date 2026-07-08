package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import X.EnumC993730bxz;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public class AwS14S0111000_2 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
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

    public static final Object invoke$0(AwS14S0111000_2 awS14S0111000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assembleBody entry responseType=");
        sbLIZ.append((Integer) awS14S0111000_2.l0);
        sbLIZ.append(" bodyComponentsSize=");
        sbLIZ.append(awS14S0111000_2.i2);
        sbLIZ.append(" isRefresh=");
        sbLIZ.append(awS14S0111000_2.z1);
        sbLIZ.append(" ts=");
        sbLIZ.append(System.currentTimeMillis());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS14S0111000_2 awS14S0111000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performInsert plain insert complete responseSessionId=");
        sbLIZ.append(awS14S0111000_2.i2);
        sbLIZ.append(" resumedLeakedContinuation=");
        sbLIZ.append(awS14S0111000_2.z1);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS14S0111000_2.l0).fT(Integer.valueOf(awS14S0111000_2.i2)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS14S0111000_2 awS14S0111000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("childrenAllReported: ");
        sbLIZ.append(awS14S0111000_2.z1);
        sbLIZ.append("; waitModuleCheckResult: ");
        sbLIZ.append((EnumC993730bxz) awS14S0111000_2.l0);
        sbLIZ.append("; loopCnt: ");
        sbLIZ.append(awS14S0111000_2.i2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S0111000_2(int i, RavenFragment ravenFragment, boolean z, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.z1 = z;
        this.l0 = ravenFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S0111000_2(int i, boolean z, Integer num, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = num;
        this.i2 = i;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S0111000_2(boolean z, EnumC993730bxz enumC993730bxz, int i, int i2) {
        super(0);
        this.$t = i2;
        this.z1 = z;
        this.l0 = enumC993730bxz;
        this.i2 = i;
    }
}
