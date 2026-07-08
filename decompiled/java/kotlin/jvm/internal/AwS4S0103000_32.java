package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public class AwS4S0103000_32 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public int i2;
    public int i3;
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

    public static final Object invoke$0(AwS4S0103000_32 awS4S0103000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scrollInternal dy=");
        sbLIZ.append(awS4S0103000_32.i1);
        sbLIZ.append(" offset=");
        sbLIZ.append(awS4S0103000_32.i2);
        sbLIZ.append(", range=");
        sbLIZ.append(awS4S0103000_32.i3);
        sbLIZ.append(", consumed=");
        sbLIZ.append(((int[]) awS4S0103000_32.l0)[1]);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS4S0103000_32 awS4S0103000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scrollInternal dy=");
        sbLIZ.append(awS4S0103000_32.i1);
        sbLIZ.append(" offset=");
        sbLIZ.append(awS4S0103000_32.i2);
        sbLIZ.append(", range=");
        sbLIZ.append(awS4S0103000_32.i3);
        sbLIZ.append(", consumed=");
        sbLIZ.append(((int[]) awS4S0103000_32.l0)[1]);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0103000_32(int i, int i2, int i3, int[] iArr, int i4) {
        super(0);
        this.$t = i4;
        this.i1 = i;
        this.i2 = i2;
        this.i3 = i3;
        this.l0 = iArr;
    }
}
