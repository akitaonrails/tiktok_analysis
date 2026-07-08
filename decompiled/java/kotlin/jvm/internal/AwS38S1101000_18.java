package kotlin.jvm.internal;

import X.C09AY;
import X.C1202800hPC;
import X.C2188811AlT;
import X.C2191831AqL;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AwS38S1101000_18 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

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

    public static final Object invoke$0(AwS38S1101000_18 awS38S1101000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("render from ");
        sbLIZ.append(awS38S1101000_18.s0);
        sbLIZ.append(": ");
        sbLIZ.append(awS38S1101000_18.i2);
        sbLIZ.append(' ');
        sbLIZ.append((C1202800hPC) awS38S1101000_18.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS38S1101000_18 awS38S1101000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((C2191831AqL) awS38S1101000_18.l1);
        sbLIZ.append(" onEvent: ");
        sbLIZ.append(awS38S1101000_18.s0);
        sbLIZ.append(" -> ");
        sbLIZ.append(awS38S1101000_18.i2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S1101000_18(C2191831AqL c2191831AqL, String str, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = c2191831AqL;
        this.s0 = str;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S1101000_18(String str, int i, C1202800hPC c1202800hPC, int i2) {
        super(0);
        this.$t = i2;
        this.s0 = str;
        this.i2 = i;
        this.l1 = c1202800hPC;
    }
}
