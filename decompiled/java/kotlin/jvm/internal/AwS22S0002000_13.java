package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public class AwS22S0002000_13 extends C09AY implements Function0 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f973i0;
    public int i1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS22S0002000_13 awS22S0002000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fling: velocityX=");
        sbLIZ.append(awS22S0002000_13.f973i0);
        sbLIZ.append(", velocityY=");
        sbLIZ.append(awS22S0002000_13.i1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS22S0002000_13 awS22S0002000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fling: velocityX=");
        sbLIZ.append(awS22S0002000_13.f973i0);
        sbLIZ.append(", velocityY=");
        sbLIZ.append(awS22S0002000_13.i1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS22S0002000_13 awS22S0002000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startNestedScroll: axes=");
        sbLIZ.append(awS22S0002000_13.f973i0);
        sbLIZ.append(", type=");
        sbLIZ.append(awS22S0002000_13.i1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS22S0002000_13 awS22S0002000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fling: velocityX=");
        sbLIZ.append(awS22S0002000_13.f973i0);
        sbLIZ.append(", velocityY=");
        sbLIZ.append(awS22S0002000_13.i1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S0002000_13(int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.f973i0 = i;
        this.i1 = i2;
    }
}
