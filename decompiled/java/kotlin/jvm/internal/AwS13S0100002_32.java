package kotlin.jvm.internal;

import X.C09AY;
import X.C19I8;
import X.C19IB;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public class AwS13S0100002_32 extends C09AY implements Function0 {
    public final int $t;
    public float f1;
    public float f2;
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

    public static final Object invoke$0(AwS13S0100002_32 awS13S0100002_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ACTION_MOVE: isBeingDragged=");
        sbLIZ.append(((C19IB) awS13S0100002_32.l0).LLJJJJLIIL);
        sbLIZ.append(", xDistance=");
        sbLIZ.append(awS13S0100002_32.f1);
        sbLIZ.append(", yDistance=");
        sbLIZ.append(awS13S0100002_32.f2);
        sbLIZ.append(", point=");
        sbLIZ.append(((C19IB) awS13S0100002_32.l0).LLJJJJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS13S0100002_32 awS13S0100002_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ACTION_MOVE: isBeingDragged=");
        sbLIZ.append(((C19I8) awS13S0100002_32.l0).LLJLL);
        sbLIZ.append(", xDistance=");
        sbLIZ.append(awS13S0100002_32.f1);
        sbLIZ.append(", yDistance=");
        sbLIZ.append(awS13S0100002_32.f2);
        sbLIZ.append(", point=");
        sbLIZ.append(((C19I8) awS13S0100002_32.l0).LLJLIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S0100002_32(C19I8 c19i8, float f, float f2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19i8;
        this.f1 = f;
        this.f2 = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S0100002_32(C19IB c19ib, float f, float f2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19ib;
        this.f1 = f;
        this.f2 = f2;
    }
}
