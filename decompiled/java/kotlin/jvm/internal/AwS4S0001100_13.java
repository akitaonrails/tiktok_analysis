package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public class AwS4S0001100_13 extends C09AY implements Function0 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1007i0;
    public long j1;

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

    public static final Object invoke$0(AwS4S0001100_13 awS4S0001100_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[S1] signal expired deltaMs=");
        sbLIZ.append(awS4S0001100_13.j1);
        sbLIZ.append(" windowSec=");
        sbLIZ.append(awS4S0001100_13.f1007i0);
        sbLIZ.append(", skip schedule");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS4S0001100_13 awS4S0001100_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[S2] signal expired deltaMs=");
        sbLIZ.append(awS4S0001100_13.j1);
        sbLIZ.append(" windowSec=");
        sbLIZ.append(awS4S0001100_13.f1007i0);
        sbLIZ.append(", skip schedule");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0001100_13(long j, int i, int i2) {
        super(0);
        this.$t = i2;
        this.j1 = j;
        this.f1007i0 = i;
    }
}
