package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public class AwS3S0000002_32 extends C09AY implements Function0 {
    public final int $t;
    public float f0;
    public float f1;

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

    public static final Object invoke$0(AwS3S0000002_32 awS3S0000002_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ACTION_MOVE: x=");
        sbLIZ.append(awS3S0000002_32.f0);
        sbLIZ.append(", y=");
        sbLIZ.append(awS3S0000002_32.f1);
        sbLIZ.append(", onTouchEvent: false");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS3S0000002_32 awS3S0000002_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ACTION_MOVE: x=");
        sbLIZ.append(awS3S0000002_32.f0);
        sbLIZ.append(", y=");
        sbLIZ.append(awS3S0000002_32.f1);
        sbLIZ.append(", onTouchEvent: false");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0000002_32(float f, float f2, int i) {
        super(0);
        this.$t = i;
        this.f0 = f;
        this.f1 = f2;
    }
}
