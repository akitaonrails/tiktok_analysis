package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public class AwS0S0010001_3 extends C09AY implements Function0 {
    public final int $t;
    public float f1;
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

    public static final Object invoke$0(AwS0S0010001_3 awS0S0010001_3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scrollToGrade: targetProgress= ");
        sbLIZ.append(awS0S0010001_3.f1);
        sbLIZ.append(", isSmooth=");
        sbLIZ.append(awS0S0010001_3.z0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS0S0010001_3 awS0S0010001_3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scrollToGrade: targetProgress= ");
        sbLIZ.append(awS0S0010001_3.f1);
        sbLIZ.append(", isSmooth=");
        sbLIZ.append(awS0S0010001_3.z0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0010001_3(float f, boolean z, int i) {
        super(0);
        this.$t = i;
        this.f1 = f;
        this.z0 = z;
    }
}
